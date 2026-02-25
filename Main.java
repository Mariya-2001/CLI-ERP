import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("1. Customer");
            System.out.println("2. Admin");
            System.out.println("3. Support Staff");
            System.out.println("4. Exit");
            System.out.println("Please choose an Option: ");

            if (!scanner.hasNextInt()){
                System.out.println("Invalid Input type");
                scanner.nextLine();
                continue;
            }

            int choice = scanner.nextInt();
            scanner.nextLine();

            if ( choice == 1 )
                System.out.println(" ");
            else if ( choice == 2 )
                System.out.println(" ");
            else if ( choice == 3 )
                System.out.println(" ");
            else if ( choice == 4 )
                break;
            else
                System.out.println("Invalid Number of Choice");
        }

        System.out.println("Bye!");
        scanner.close();

    }
}
