package com.ua.getgit.service;

import com.ua.getgit.entities.User;
import com.ua.getgit.exceptions.UserException;
import com.ua.getgit.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

     void saveUser(User user) throws UserException;
     User getUserById(Integer id);
     User getUserByUsername(String username);
     List<User> getAllUsers();
     boolean validate(User user) throws UserException;
     Integer getCurrentCoins(String username);


}
