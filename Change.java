import java.util.Scanner;
/**
Consider the following incomplete method definition.

change is guaranteed to be a non-negative value in the range [0.00, 1.00). Your method should calculate and return the fewest number of coins required to form this amount. No typecasting allowed.
*/

Scanner input = new Scanner(System.in);
double change = input.nextDouble(); //user input for amount in cents; output should be least number of coins that makes up this amount
// change = 0.04; coins = pennies * 4
public class Change {
  public int coins(double change) {
    int coins = 0;
    int penny = 1;
    int nickel = 5;
    int dime = 10;
    int quarter = 25;
    if (change <= 0.05) {
      coins = penny *  
    }
  }
}



