package impl;

import dao.UserDao;
import model.User;
import service.UserServiceable;
public class UserServiceImpl implements UserServiceable {
    private UserDao userDao = new UserDao();
    @Override
    public void addUsers(User user1) {
        userDao.getUsers().add(user1);
        System.out.println(" ");
    }
    @Override
    public User findById(int id) {
        for (User u : userDao.getUsers()) {
            if (u.getId() == id) {
                return u;
            }
        }
        throw new RuntimeException("Mynday id jok");
    }



    @Override
    public void deleteById(int id) {
        for (int i = 0; i < userDao.getUsers().size(); i++) {
            if (userDao.getUsers().get(i).getId()==id){
                userDao.getUsers().remove(userDao.getUsers().get(i));
            }
        }
    }

    @Override
    public void getAllUsers() {
        for (User user:userDao.getUsers()){
            System.out.println(user);
        }
    }
}
