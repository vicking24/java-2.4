import java.util.Scanner;

class GuessingGame {
    public static void main (String[]args) {
        Scanner sc = new Scanner (System.in);
        int num= (int)(Math.random()*100+1);
        int guess =0;
        int times=0;

        System.out.println ("Try to guess my number between 1 and 100! ");
        while (guess!=num) {
            System.out.print ("Your guess: ");
            guess= sc.nextInt();
            times++;

            if (guess>num) {
                System.out.println ("Too high");

            } else if (guess<num) {
                System.out.println ("Too low");
            }

        } 
        System.out.println ("That's the number! It took you "+times+ " tries.");
    }
}