
import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;


public class DormMenu {
    static Scanner input = new Scanner(System.in);

    public static void menuOption() {
      System.out.println("");
      System.out.println("----- Dormitory Management System Menu -----");
      System.out.println("          1. View tenants");
      System.out.println("          2. View rooms");
      System.out.println("          3. Make a payment");
      System.out.println("          4. Apply for a new occupancy");
      System.out.println("          5. Quit");
      System.out.println("");
      System.out.print("Enter Command: ");
      System.out.print("");
    }
   
  public static void viewTenants() {
    Tenant t1 = new Tenant("Christian", 22, 3, 1, 503.0);
    Tenant t2 = new Tenant("Alyssa", 20, 4, 2, 700.0);
    Tenant t3 = new Tenant("Anne", 23, 1, 3, 600.0);

    System.out.println("---------------- LIST OF TENANTS ---------------------");
    System.out.println("NAME       AGE        TERM       ROOM Number      RENT");
    System.out.println(t1.name + "   " + t1.age + "         "  + t1.term + "              " + t1.roomNumber + "            " + t1.monthlyRent);
    System.out.println(t2.name + "      " + t2.age + "         "  + t2.term + "              " + t2.roomNumber + "            " + t2.monthlyRent);
    System.out.println(t3.name + "        " + t3.age + "         "  + t3.term + "              " + t3.roomNumber + "            " + t3.monthlyRent);
    System.out.println("");
  }

  public static void viewRooms() {
    Room r1 = new Room(3, 5, 3);
    System.out.println("---------------- VIEW ROOMS ---------------------");
    System.out.println("NUMBER OF OCCUPIED ROOMS:  " + r1.occupiedRooms);
    System.out.println("NUMBER OF AVAILABLE ROOMS: " + r1.availableRooms);
    System.out.println("NUMBER OF TENANTS:         " + r1.tenants);
  }

  public static void makePayment() {
    // Create a list of payments
    List<Payment> payments = new ArrayList<>();
    payments.add(new Payment(12345, "Christian", 1, 503.0));
    payments.add(new Payment(12346, "Alyssa", 2, 700.0));
    payments.add(new Payment(12347, "Anne", 3, 600.0));

    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter your ID: ");
    int id = scanner.nextInt();

    for (Payment payment : payments) {
      if (payment.getId() == id) {
        System.out.println(" ID NUMBER     NAME      ROOM NUMBER     PAYMENT");
        payment.printPaymentDetails();
        break;
      }
    }

  }
  
  public static void applyForOccupancy() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("");
    System.out.println("----Please input details for your Applying occupancy----");

    System.out.print("Enter your name: ");
    String name = scanner.nextLine();

    System.out.print("Enter your student ID: ");
    String studentId = scanner.nextLine();

    System.out.print("Enter your Mobile Number: ");
    String number = scanner.nextLine();

    System.out.print("Enter the starting date (mm/dd/yyyy): ");
    String startDate = scanner.nextLine();

    System.out.print("Enter the ending date (mm/dd/yyyy): ");
    String endDate = scanner.nextLine();

    ApplyForOccupancy application = new ApplyForOccupancy(name, studentId, number, startDate, endDate);

    System.out.println("");
    System.out.println("");
    System.out.println("Thank You for Applying, will contact you after 2 working days.");
    System.out.println("Thank You!");
    System.out.println("");
  }


  public static void main(String[] args) {
    int option = -1;

    do{
      menuOption();
      option = input.nextInt();

      switch (option) {
          case 1:
              viewTenants();
              break;
          case 2:
              viewRooms();
              break;
          case 3:
              makePayment();
              break;
          case 4:
              applyForOccupancy();
              break;
          case 5:
              System.out.println("Thank you");
              System.exit(0);
              break;
          default:
              System.out.println("Invalid option");
              break;
      }

    }while(option !=0);
  }
}  


 
   