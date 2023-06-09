import java.util.Random;
import java.util.Scanner;

class DiceGame{
    public static void main(String args[]){
	Scanner s = new Scanner(System.in);
	Random rnd = new Random();

	int sum = 0;
	int dice = rnd.nextInt(5)+1;
	sum += dice;

	System.out.println("What is your name?");
	String name = s.nextLine();
	System.out.println("Hello, "+name+"!");

	System.out.println("Rolling dice...");
	System.out.println("Die 1: "+dice);
	dice = rnd.nextInt(5)+1;
	sum += dice;
	System.out.println("Die 2: "+dice);
	System.out.println("Total value: "+sum);
	if(sum > 7)System.out.println(name+" won!");
	else System.out.println(name+" lost");
    }
}
