
import java.util.Scanner;
public class Laptop extends  LaptopBase{

public static  void find(){

    Scanner sc=new Scanner(System.in);
    System.out.print("Name:");
    String name=sc.nextLine();
    System.out.print("Ram:");
    sc=new Scanner(System.in);
    int ram=sc.nextInt();
    System.out.print("Price:");
    double price=sc.nextDouble();
    Laptop l =new Laptop(name,ram,price);
}
    Laptop(String name,int ram,double price){
        super(name,ram,price);
    }
}