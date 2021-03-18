public class User {
    String name;
    int accId;
    String password;
    int bal;

    public User(String name, int accId, String password,int bal)
    {
        this.name = name;
        this.accId = accId;
        this.password = password;
        this.bal = bal;
    }


    public String getName() {
        return name;
    }



    public int getAccId() {
        return accId;
    }


    public String getPassword() {
        return password;
    }


    public int getBal() {
        return bal;
    }
}
