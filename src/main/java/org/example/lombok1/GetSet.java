package org.example.lombok1;

import java.util.StringJoiner;

public class GetSet {
    public static void main(String[] args) {

        User user =  //new User();
                new User(0,"","mail","123","");

        user.setNickname("nick");
        user.setPasswordConfirm("123");

        StringJoiner joiner = new StringJoiner("/");

        joiner.add(user.getId().toString()).add(user.getEmail()).add(user.getNickname()).add(user.getPassword()).add(user.getPasswordConfirm());

        System.out.println(joiner);
    }
}