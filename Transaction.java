public class Transaction extends UserDetailImpl{

    public void withdraw(int amt,int bal) {
        int total = bal - amt;
        System.out.println(amt + " withdrawn");
        System.out.println("Available balance: "+total);
    }

    public void deposit(int amt,int bal) {
        int total = bal + amt;
        System.out.println(amt + " deposited");
        System.out.println("Available balance: "+total);
    }



}
