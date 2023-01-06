package org.example.lombok1;

public class WithExp {
    public static void main(String[] args) {

        User user = new User(0,"1234");

        user.setNickname("nick2");
        user.setPasswordConfirm("1234");
        user.setEmail("mail");

        System.out.println(user);


        User user1 = user.withId(1);
        System.out.println(user1);

        user1.setNickname("withId(1)");
        System.out.println(user);
        System.out.println(user1);
    }
}