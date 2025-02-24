package main.Service;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import main.model.User;
import main.model.UserRole;

public class UserServiceImpl implements UserService {
    
    public final Map<String,User> userDatabase=new HashMap<>();

    @Override
    public User registerUser(String name, String email, String password, String phone, String address) {
        String userId= UUID.randomUUID().toString();
        User user=new User(userId,name,email,password,phone,address, UserRole.GUEST);
        userDatabase.put(userId,user);
        return user;
    }

    @Override
    public User getUser(String userId) {
        return userDatabase.get(userId);
    }
    
}
