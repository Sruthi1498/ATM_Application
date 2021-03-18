import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int flag = 1;

        while (flag == 1) {
            System.out.println("A. Admin");
            System.out.println("B. User");
            System.out.println("C. Exit");

            String ch = scan.nextLine().toUpperCase();

            Enum n = new Enum(choice.valueOf(ch));
            n.choose();
        }
    }
}
