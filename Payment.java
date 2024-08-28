import java.util.Arrays;

public class Payment {
  private int id;
  private String name;
  private int roomNumber;
  private double amount;

  public Payment(int id, String name, int roomNumber, double amount) {
    this.id = id;
    this.name = name;
    this.roomNumber = roomNumber;
    this.amount = amount;
  }


  public int getId() {
    return id;
  }
  public String getname() {
    return name;
  }
  public int getRoomNumber() {
    return roomNumber;
  }
  public double getamount() {
    return amount;
  }


  public void setID( int id) {
    this.id = id;
  }
  public void setname(String name) {
    this.name = name;
  }
  public void setroonNumber(int roomNumber) {
    this.roomNumber = roomNumber;
  }
  public void setamount(double amount) {
    this.amount = amount;
  }





  public void printPaymentDetails() {
    System.out.println(Arrays.toString(new Object[] { id,     name,    roomNumber,    amount }));
  }
}
