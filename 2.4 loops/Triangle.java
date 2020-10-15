import java.util.Scanner;

class Triangle {
    public static void main (String[] args) {
        Scanner sc= new Scanner (System.in);

        int lay;
        String c;

        System.out.print ("Character you would like: " );
        c=sc.nextLine();

        System.out.print ("How many layers? ");
        lay=sc.nextInt();
       

        for (int i=1; i<=lay; i++) {
            for (int k=0; k<i; k++){
                System.out.print (c);
                
            }
            System.out.println ("");
        }

    }

}