package service;

import model.User;

public interface UserServiceable {

 void addUsers(User users);
 User findById(int id);
 void deleteById(int id);
 void getAllUsers();




    }

