package dao;

import model.Login;
import model.User;

import java.util.ArrayList;
import java.util.List;

public class UserDAO {
    private static List<User> users;

    static {
        users = new ArrayList<>();
        User u1 = new User();
        u1.setAge(20);
        u1.setName("Do Tien Thanh");
        u1.setAccount("thanhdt");
        u1.setEmail("thanhdt@codegym.vn");
        u1.setPassword("123456");
        users.add(u1);

        User u2 = new User();
        u2.setAge(20);
        u2.setName("Do Quoc Viet");
        u2.setAccount("vietdq");
        u2.setEmail("vietdq@codegym.vn");
        u2.setPassword("123456");
        users.add(u2);

        User u3 = new User();
        u3.setAge(16);
        u3.setName("Mike");
        u3.setAccount("mike");
        u3.setEmail("mike@codegym.vn");
        u3.setPassword("123456");
        users.add(u3);
    }

    public static User checkLogin(Login login) {
        for (User user : users) {
            if (user.getAccount().equals(login.getAccount()) && user.getPassword().equals(login.getPassword())) {
                return user;
            }
        }
        return null;
    }
}
