import java.util.Scanner;

public class PrimeNumber {public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    
    double kalan=0,a=2.0,ent,b=0;
    boolean ak=true;
    System.out.println("Please enter a number : ");
    ent=scanner.nextInt();
    for (int i = 2; i <=ent; i++) {
        for (int j = 2; j <i; j++) {
            if (i%j==0) {
                ak=false;
                break;
            } else {
                ak=true;
            }
        }if(ak){
            System.out.print(" "+i);
        }
        
    }
    
    
    
}
    
}
