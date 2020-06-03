import java.util.Scanner;

public class NumberGame {
    public static void main (String [] args){
        //generating a random number
         int random_number= (int) (Math.random()*100);
         boolean hasWon = false;
          // telling the user that computer chose a number ask him to guess that number.
         System.out.println("i have chosen a random number between 1 to 100.");
         System.out.println("Try to guess it.");

         //taking the guessed input from the user
        Scanner s = new Scanner(System.in);

        for (int i =10; i>0; i--){
            System.out.println("you have "+i+" guesses remaining");
            int guessed_num = s.nextInt();

            if (guessed_num == random_number ){
                hasWon = true ;
                break;
            }
            else if (guessed_num > random_number){
                System.out.println(" It's smaller than "+guessed_num+".");
            }
            else{
                System.out.println("It's larger than "+guessed_num+".");
            }
        }

        if (hasWon){
            System.out.println("You've won");
            System.out.println("You've made the correct guess");
        }
        else {
            System.out.println("You've lost");
            System.out.println("You could'nt make a correct guess");
            System.out.println("You ran out of chances to guess");
        }


    }
}
