package com.crio.codingame.services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.crio.codingame.dtos.UserRegistrationDto;
import com.crio.codingame.entities.Contest;
import com.crio.codingame.entities.ContestStatus;
import com.crio.codingame.entities.RegisterationStatus;
import com.crio.codingame.entities.ScoreOrder;
import com.crio.codingame.entities.User;
import com.crio.codingame.exceptions.ContestNotFoundException;
import com.crio.codingame.exceptions.InvalidOperationException;
import com.crio.codingame.exceptions.UserNotFoundException;
import com.crio.codingame.repositories.IContestRepository;
import com.crio.codingame.repositories.IUserRepository;
//import com.crio.codingame.repositories.UserRepository;

public class UserService implements IUserService {

    private final IUserRepository userRepository;
    private final IContestRepository contestRepository;
    private String f_id = "1";
    private Integer m_score = 0;

    public UserService(IUserRepository userRepository, IContestRepository contestRepository) {
        this.userRepository = userRepository;
        this.contestRepository = contestRepository;
    }

    // TODO: CRIO_TASK_MODULE_SERVICES
    // Create and store User into the repository.
    @Override
    public User create(String name) {
    
        User newUser = new User(f_id, name, m_score);
        userRepository.save(newUser);
        return newUser;
    }

    // TODO: CRIO_TASK_MODULE_SERVICES
    // Get All Users in Ascending Order w.r.t scores if ScoreOrder ASC.
    // Or
    // Get All Users in Descending Order w.r.t scores if ScoreOrder DESC.

    @Override
    public List<User> getAllUserScoreOrderWise(ScoreOrder scoreOrder) {
        List<User> res = new ArrayList<>(userRepository.findAll());
        if(scoreOrder == ScoreOrder.ASC )
        {
            Collections.sort(res,(a,b)->a.getScore() - b.getScore());
        }
        else
        {
            Collections.sort(res,(a,b)->b.getScore() - a.getScore());

        }
        return res;
    }

    @Override
    public UserRegistrationDto attendContest(String contestId, String userName)
            throws ContestNotFoundException, UserNotFoundException, InvalidOperationException {
        Contest contest = contestRepository.findById(contestId).orElseThrow(
                () -> new ContestNotFoundException("Cannot Attend Contest. Contest for given id:"
                        + contestId + " not found!"));
        User user = userRepository.findByName(userName).orElseThrow(() -> new UserNotFoundException(
                "Cannot Attend Contest. User for given name:" + userName + " not found!"));
        if (contest.getContestStatus().equals(ContestStatus.IN_PROGRESS)) {
            throw new InvalidOperationException("Cannot Attend Contest. Contest for given id:"
                    + contestId + " is in progress!");
        }
        if (contest.getContestStatus().equals(ContestStatus.ENDED)) {
            throw new InvalidOperationException(
                    "Cannot Attend Contest. Contest for given id:" + contestId + " is ended!");
        }
        if (user.checkIfContestExists(contest)) {
            throw new InvalidOperationException("Cannot Attend Contest. Contest for given id:"
                    + contestId + " is already registered!");
        }
        user.addContest(contest);
        userRepository.save(user);
        return new UserRegistrationDto(contest.getName(), user.getName(),
                RegisterationStatus.REGISTERED);
    }

    // TODO: CRIO_TASK_MODULE_SERVICES
    // Withdraw the user from the contest
    // Hint :- Refer Unit Testcases withdrawContest method

    @Override
    public UserRegistrationDto withdrawContest(String contestId, String userName)
            throws ContestNotFoundException, UserNotFoundException, InvalidOperationException {

                RegisterationStatus withdraw = RegisterationStatus.NOT_REGISTERED;
                
           Contest contest = contestRepository.findById(contestId).orElseThrow(()->new ContestNotFoundException("CanNot attend contest"));
           User myUser = userRepository.findByName(userName).orElseThrow(()->new UserNotFoundException("User not exist"));
           if(contest.getContestStatus()==ContestStatus.ENDED || contest.getContestStatus()== ContestStatus.IN_PROGRESS)
           {
            throw new InvalidOperationException("Contest is already started/ended");
           }
           if(myUser.getName()==contest.getCreator().getName())
           {
            throw new InvalidOperationException("Contest creator can't withdraw");
           }
           if(!myUser.checkIfContestExists(contest))
           {
            throw new InvalidOperationException("contest for given id not found");
           }
           myUser.deleteContest(contest);
           contestRepository.save(contest);
           userRepository.save(myUser);

           UserRegistrationDto result = new UserRegistrationDto(contest.getName(), userName, withdraw);
           return result;

    }

}
