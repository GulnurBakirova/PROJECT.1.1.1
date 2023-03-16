import impl.UserServiceImpl;
import model.Gender;
import model.User;

public class Main {
    public static void main(String[] args) throws MyException {




        User user1 = new User(1,"Gulnur",29, Gender.FEMALE);
        User user2 = new User(2,"Nurisa",22,Gender.FEMALE);
        User user3 = new User(3,"Aibek",18,Gender.MALE);

        UserServiceImpl userService = new UserServiceImpl();
        userService.addUsers(user1);
        userService.addUsers(user2);
        userService.addUsers(user3);

        try {
            userService.getAllUsers();
            System.out.println(" ");
            userService.deleteById(3);
            System.out.println(" ");
            userService.getAllUsers();
            System.out.println(" ");
            System.out.println(userService.findById(2));
        }
        catch (MyException myException){
            System.out.println(myException.getMessage());
        }
    }
}