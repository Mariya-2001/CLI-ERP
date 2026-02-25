package customer;

import java.util.ArrayList;
import java.util.Scanner;

public class customerModule {

    private static ArrayList<Complaint> complaints = new ArrayList<>();

    public static void CustomerMenu(Scanner scanner){



        System.out.println("Enter The complaint ID: ");
        while (!scanner.hasNextInt()){
            System.out.println("Invalic input");
            scanner.next();
        }

        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter Description: ");
        String desc = scanner.nextLine();

        System.out.println("Select a Priority , 1)Low 2) Medium 3) High");
        String priorityInp = scanner.nextLine();
        String priority;

        // Default Priority is Medium
        if (priorityInp.equals("1")){
            priority = "Low";
        }
        else if (priorityInp.equals("2")){
            priority = "High";
        } else {
            priority = "Medium";
        }

        Complaint newComplaint = new Complaint(id, desc, priority);
        complaints.add(newComplaint);

        System.out.println("Complaint Successfully Created");
        System.out.println(newComplaint);

    }
}
