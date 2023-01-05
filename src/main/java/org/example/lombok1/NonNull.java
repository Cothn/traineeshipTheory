package org.example.lombok1;

import java.util.StringJoiner;

public class NonNull {
    public static String NonNullExample(@lombok.NonNull User user) {

        return user.getNickname();
    }
    public static void main(String[] args) {

        User user = new User(0,"","mail","123","123");

        user = new User();
        System.out.println(NonNullExample(user));
    }
}