import java.util.Scanner;
public class Measure {
  
public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  
  System.out.println("Enter number of inches.");
  double inches = input.nextDouble();
  
  Measure length = new Measure();
  length.mile = inches / 63360;
  length.yard = inches / 36;
  length.foot = inches / 12;
  
  input.close();
  }
  
  private static double mile;
  private static double yard;
  private static double foot;
  
public String inches(double inches) {
    mile = inches / 63360;
    yard = inches / 36;
    foot = inches / 12;
    System.out.println(mile + " miles, " + yard + " yards, and " + foot + " feet.");
  }
}
