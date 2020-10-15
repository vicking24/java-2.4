import java.util.Scanner;

class Bar {
    public static void main (String[] args) {
    Scanner sc= new Scanner(System.in);
    int l=0;
    String c;
    
  
    System.out.print ("Character you would like:" );
    c=sc.nextLine();
    
    System.out.print ("How long?");
    l=sc.nextInt();
    
    for (int i=0; i<l; i++) {
        System.out.print (c);
    
    
    }
    
    
    }


}