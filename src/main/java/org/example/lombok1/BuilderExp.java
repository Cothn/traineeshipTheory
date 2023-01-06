package org.example.lombok1;

public class BuilderExp {
    public static void main(String[] args) {

        UserCln user = UserCln.helloWorld().roleCln("user").execute();

        user.setNickname("nick2");
        user.setPasswordConfirm("1234");
        user.setEmail("mail");

        System.out.println(user);
    }
}