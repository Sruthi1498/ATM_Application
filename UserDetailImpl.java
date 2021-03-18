import java.util.ArrayList;

public class UserDetailImpl implements UserDetails{

    ArrayList<User> arr = new ArrayList<>();
    private User user1;

    @Override
    public void addUserDetails() {
        arr.add(new User("Sruthi",123,"qwerty",90000));
        arr.add(new User("alice",234,"qwert",800000));
        arr.add(new User("bob",456,"qwer",76540));
        arr.add(new User("jack",765,"awsed",60000));
        arr.add(new User("joe",876,"bhtgn",670000));
    }

    @Override
    public void display() {
        for(User user: arr)
        {
            System.out.println(user.getName() + " " + user.getAccId() + " " + user.getPassword() + " " + user.getBal());
        }
    }

    @Override
    public User show(int id) {
        for(User u: arr)
        {
            if(u.getAccId() == id)
                user1 = u;
        }
        return user1;
    }

    public int check(String name, String pass) {
        for(User user: arr) {
            if (name.equalsIgnoreCase(user.getName()) && pass.equalsIgnoreCase(user.getPassword()))
                return user.getBal();
            else
                System.out.println("Wrong credentials");
            break;
        }
        return 0;
    }
}
