package main.Service;

import main.model.User;


public interface UserService {
    User registerUser(String name,String email,String password,String phone,String address);
    User getUser(String userId);

}
