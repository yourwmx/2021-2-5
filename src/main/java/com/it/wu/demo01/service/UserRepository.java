package com.it.wu.demo01.service;

import com.it.wu.demo01.model.User;

public interface UserRepository {
    void saveUser(User user);
    User findUserByUserName(String userName);
    long updateUser(User user);
    void deleteUserById(Long id);
}
