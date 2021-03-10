package com.k21d.projects.user.service;

import com.k21d.projects.user.domain.User;
import com.k21d.projects.user.repository.UserRepository;

import javax.annotation.Resource;
import javax.validation.Validator;
import java.util.Collection;

public class UserServiceImpl implements UserService{
    @Resource(name = "bean/UserRepository")
    private UserRepository userRepository;

    @Resource(name = "bean/DelegatingValidator")
    private Validator validator;


    @Override
    public boolean register(User user) {
        return userRepository.save(user);
    }

    @Override
    public boolean deregister(User user) {
        return false;
    }

    @Override
    public boolean update(User user) {
        return false;
    }

    @Override
    public User queryUserById(Long id) {
        return null;
    }

    @Override
    public User queryUserByNameAndPassword(String name, String password) {
        return null;
    }

    @Override
    public Collection<User> queryAllUser() {
        return userRepository.getAll();
    }
}
