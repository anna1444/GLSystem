package com.ua.getgit.service.impl;

import com.ua.getgit.entities.User;
import com.ua.getgit.exceptions.UserErrors;
import com.ua.getgit.exceptions.UserException;
import com.ua.getgit.repository.UserRepository;
import com.ua.getgit.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepo;

    @Override
    public void saveUser(User user) throws UserException {
       for(User u: userRepo.findAll()){
           if(u.getUsername().equals(user.getUsername())){
               throw new UserException(UserErrors.INVALID_REGISTRATION);
           }
       }
        userRepo.save(user);
    }


    @Override
    public User getUserById(Integer id) {
        return null;
    }

    @Override
    public User getUserByUsername(String username) {
        return null;
    }

    @Override
    public List<User> getAllUsers() {
        return (List<User>) userRepo.findAll();
    }

    @Override
    public boolean validate(User user) throws UserException {
        for(User u: getAllUsers()){
            if(user.equals(u)) return true;
        }
         throw new UserException("not validate in login");
    }

    @Override
    public Integer getCurrentCoins(String username) {
        List<User> users = getAllUsers();
        for(User u: users){
            if(u.getUsername().equals(username)){
                return u.getCurrentCoins();
            }
        }
        return null;
    }
}
