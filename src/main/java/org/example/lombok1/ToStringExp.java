package org.example.lombok1;

import java.util.StringJoiner;

public class ToStringExp {
    public static void main(String[] args) {

        User user = new User(0,"1234");

        user.setNickname("nick2");
        user.setPasswordConfirm("1234");
        user.setEmail("mail");

        System.out.println(user);
    }
}