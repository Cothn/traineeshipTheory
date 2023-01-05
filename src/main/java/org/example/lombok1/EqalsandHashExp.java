package org.example.lombok1;

public class EqalsandHashExp {
    public static void main(String[] args) {

        User user = new User(0,"1234");

        user.setNickname("nick2");
        user.setPasswordConfirm("1234");
        user.setEmail("mail");

        User user2 = new User(1,"1234");

        user2.setNickname("nick");
        user2.setPasswordConfirm("1234");
        user2.setEmail("mail");

        System.out.println(user.equals(new User(user)));
        System.out.println(user.hashCode());
        System.out.println(user2.hashCode());
        System.out.println(user.equals(user2));

        UserExt userExt = new UserExt("Admin");
        System.out.println(userExt);
        System.out.println(userExt.hashCode());
    }
}