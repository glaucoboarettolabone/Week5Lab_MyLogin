package models;

/**
 *
 * @author 815000
 */
public class AccountService {
    private static final String USERNAME1 =  "abe";
    private static final String USERNAME2 =  "barb";
    private static final String PASSWORD =  "password";
    
    public AccountService() {
        
    }
    
    public User login(String username, String password) {
        User user = null;
        
        if ((username.equals(USERNAME1) || username.equals(USERNAME2)) && password.equals(PASSWORD)) {
            user = new User(username, password);
        } 
                
        return user;
    }
    
}
