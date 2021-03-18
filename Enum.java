import java.util.Scanner;

enum choice{
    A,B,C;
        }

public class Enum {
    Scanner scan = new Scanner(System.in);
    choice cho;

    public Enum(choice cho) {
        this.cho = cho;
    }

    public void choose() {
        UserDetailImpl u = new UserDetailImpl();
        u.addUserDetails();
        Transaction t = new Transaction();

        int ch,ch1;
        switch (cho) {
            case A:
                System.out.println("Enter admin name");
                String name = scan.nextLine();
                System.out.println("Enter admin password");
                String pass = scan.nextLine();
                if(name.equalsIgnoreCase("admin") && pass.equalsIgnoreCase("admin"))
                {

                    do {
                    System.out.println("1. View all user details");
                    System.out.println("2. View user details with ID");
                    ch = scan.nextInt();

                        switch (ch) {
                            case 1:
                                u.display();
                                break;
                            case 2:
                                System.out.println("Enter the id to search");
                                int id = scan.nextInt();
                                u.show(id);
                                break;
                            default:
                                System.out.println("Invalid option");
                        }
                    }while(ch<=2);
                }
                else
                {
                    System.out.println("Wrong credentials");
                }
                break;
            case B:
                System.out.println("Enter user name");
                String uName = scan.nextLine();
                System.out.println("Enter user password");
                String uPass = scan.nextLine();
                int bal = u.check(uName,uPass);
                if(bal> 0) {
                    do {
                        System.out.println("1. Deposit");
                        System.out.println("2. Withdraw");
                        ch1 = scan.nextInt();

                        switch (ch1) {
                            case 1:
                                System.out.println("Enter the amount to be deposited");
                                int dep = scan.nextInt();
                                t.deposit(dep, bal);
                                break;
                            case 2:
                                System.out.println("Enter the amount to be withdrawn");
                                int wit = scan.nextInt();
                                t.withdraw(wit, bal);
                                break;
                            default:
                                System.out.println("Invalid option");
                        }

                    } while (ch1 <= 2);
                }
                break;
            case C:
                System.exit(0);
        }
    }
}
