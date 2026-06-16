public class User{

    private String username;
    private String email;

    public User(String username, String email){
        this.username=username;
        this.email=email;
    }

    public String getUsername(){
        return username;
    }

    public String getEmail(){
        return email;
    }
}

public class EmailValidator {
    public static boolean isValid(String email){
        if(email!=null && email.contains("@")){
            return true;
        }

        System.out.println("Invalid email format.");
        return false;
    }
}
public class UserRepository {
    public void save(User user){
        System.out.println("connecting to database..");
        System.out.println(
            "Saving user"
            + user.getUsername()
            +"to the user table"
        );
    }
}

public class Main {
    public static void main(String[] args) {
        User user= new User("Iffath","Iffath222@gmail.com" );
        if(EmailValidator.isValid(user.getEmail())){
            UserRepository repository=new UserRepository();

            repository.save(user);
        }
    }
}

