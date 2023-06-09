import java.util.Random;

class DiceGame{
    public static void main(String args[]){
	Random rnd = new Random();

	int sum = 0;
	int dice = rnd.nextInt(5)+1;
	sum += dice;

	System.out.println("Rolling dice...");
	System.out.println("Die 1: "+dice);
	dice = rnd.nextInt(5)+1;
	sum += dice;
	System.out.println("Die 2: "+dice);
	System.out.println("Total value: "+sum);
    }
}
