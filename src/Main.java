import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
     /*   System.out.println("first random int is " + random.nextInt(10));
        System.out.println("first random double is " + random.nextDouble());

        int min = 25;
        int max = 38;
        int newRandom = random.nextInt((max - min) +1) + min;
        System.out.println(newRandom);

        System.out.println(Math.random());
        int rand = (int) (Math.random() * 10);
        System.out.println(rand );
         Math.

        System.out.println("how many numbers do you want?");
        int amount = input.nextInt();
        System.out.println("what is your minimum number?");
        int min = input.nextInt();
        System.out.println("what is your maximum number");
        int max = input.nextInt();

        for (int i = 0; i < amount; i++) {
            int randNum = (random.nextInt((max - min) + 1)) + min;
            System.out.println(randNum); */

        System.out.println("how many sides does your dice have?");
        int diceSide = input.nextInt();
        System.out.println("how many times do you want to throw the dice?");
        int throwNum = input.nextInt();

        HashMap<Integer, Integer> diceRolls = new HashMap<Integer, Integer>();

        for (int i = 1; i <= diceSide; i++) {
            diceRolls.put(i, 0);
        }
        System.out.println(diceRolls.keySet());

        for(int j = 1; j <= throwNum; j++){


        }
    }
}