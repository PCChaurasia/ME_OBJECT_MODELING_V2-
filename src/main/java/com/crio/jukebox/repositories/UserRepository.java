package com.crio.jukebox.repositories;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import com.crio.jukebox.entities.User;

public class UserRepository implements IUserRepository {
    private final Map<String, User> userMap;
    private Integer autoIncrement = 0;

    public UserRepository() {
        userMap = new HashMap<String, User>();
    }

    public UserRepository(Map<String, User> userMap) {
        this.userMap = userMap;
        this.autoIncrement = userMap.size();
    }

    @Override
    public User save(User entity) {
        // TODO Auto-generated method stub
        if (entity.getId() == null) {
            autoIncrement++;
            User c = new User(Integer.toString(autoIncrement), entity.getName(),
                    entity.getPlayLists());
            userMap.put(c.getId(), c);
            return c;
        }
        userMap.put(entity.getId(), entity);
        return entity;

    }

    @Override
    public List<User> findAll() {
        // TODO Auto-generated method stub
        return userMap.values().stream().collect(Collectors.toList());
    }

    @Override
    public Optional<User> findById(String id) {
        // TODO Auto-generated method stub
        return Optional.ofNullable(userMap.get(id));
    }

    @Override
    public boolean existsById(String id) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void delete(User entity) {
        // TODO Auto-generated method stub

    }

    @Override
    public void deleteById(String id) {
        // TODO Auto-generated method stub

    }

    @Override
    public long count() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void add(User newUser) {
        // TODO Auto-generated method stub

    }

    @Override
    public Optional<User> findByName(String name) {
        // TODO Auto-generated method stub
        List<User> listUsers = new ArrayList<>(userMap.values());
        for (User row : listUsers) {
            if (row.getName() == name) {
                return Optional.ofNullable(row);

            }

        }
        return Optional.empty();
    }
}