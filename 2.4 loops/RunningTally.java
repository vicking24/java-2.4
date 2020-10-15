import java.util.Scanner;

class RunningTally {
    public static void main (String[] args) {
        Scanner sc= new Scanner(System.in);
        double num=0;
        double tot=0;

        System.out.println ("Adding #'s, type negative to stop");
        System.out.println ("");
        
       
        while (num>=0) {
            num=sc.nextDouble();
         
            if (num>=0) {
            tot=tot+num;
        }
    
        }
        System.out.println ("Your total is: "+tot);

    }

}