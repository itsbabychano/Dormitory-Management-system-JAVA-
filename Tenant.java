import java.io.*;


public class Tenant{
    public String name;
    public int age;
    public int term;
    public int roomNumber;
    public double monthlyRent;
    //public int studentID;
    public static int tenantCount;
    //number of tenant created
    //private static int tenantCount = 0;

    public Tenant(String a, int b, int c, int d, double e){
        name = a;
        age = b;
        term = c;
        roomNumber = d;
        monthlyRent = e;
    }



    // Accessor method
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }


    public int getRoomNumber(){
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber){
        this.roomNumber = roomNumber;
    }

    public int getTerm(){
        return term;
    }


    public void setTerm(int term){
        this.term = term;
    }

    public double getMonthlyRent(){
        return monthlyRent;
    }

    public void setMonthlyRent(double monthlyRent){
        this.monthlyRent = monthlyRent;
    }

    //method to get static count value
    public int getCount(){ 
        return tenantCount; 
   } 

   //total fees to be paid based on the contract
   public double getTermPay(){
        double termPay = term * monthlyRent;
        return termPay; 
   }

   public void displayValues(){
        System.out.println("\n\n List of Tenant" + 
            "\nName          : "    + getName() + 
            "\nAge           : "    + getAge() +
            "\nTerm Period   : "    + getTerm() +
            "\nRoom Number   : "    + getRoomNumber() +
            "\nRent          : "    + getMonthlyRent() +
            "\nTerm Pay      : "    + getTermPay() +
            "\nNumberOfTenant: "    + getCount());
    }



}   

