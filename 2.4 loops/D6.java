import java.util.Scanner;

class D6 {
    public static void main (String[] args){
        Scanner sc= new Scanner(System.in);
        int r=0;
        int tot=0;
        int d=0;
        boolean again=true;
        String yn;

        while (again){

            System.out.println ("How many D6's? ");
            d= sc.nextInt();

            System.out.println ("You got: ");

            for (int i=0; i<d; i++){
                r=(int)(Math.random()*6+1);
                System.out.print (r + " ");
                tot= tot+r;
           
            }
            System.out.println("");
            System.out.println ("Total: "+tot);
            System.out.println("");
            System.out.print("Again? (yes or no) ");
            yn= sc.next();
            System.out.println ("");
            
            if (yn.equals ("yes")) {
            again=true;
            tot=0;
            } else {
            again=false;
            System.out.println ("Bye!");
            }
            
           
        }
    }
}