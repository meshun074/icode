package com.fdmgroup.icode.library.user;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {

    private List<User> userList = new ArrayList<>();
    
    public UserRepository(@Qualifier("starterUserList")List<User> users) {
        super();
        this.userList = users;
    }

    public User addUser(User user) {
        User userToAdd = new User(user.getName(), user.getPassword(), user.getEmail(), user.getPatronCategory(), user.getGender());
        userList.add(userToAdd);
        return userToAdd;
    }

}
