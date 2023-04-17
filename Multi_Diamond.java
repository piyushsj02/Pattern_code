import java.util.*;

public class Multi_Diamond {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("no of rows");
        int x = sc.nextInt();
        System.out.println("Enter no of Diamond you want to print");
        int dd = sc.nextInt();
         
        for (int i = 1; i <= x; i++) {
            int d=dd;
            for (int j = 1; j <= x - i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            while(d>1){
            for (int j = 1; j <= x - i; j++) {
                System.out.print("  ");
            }

            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }  
            d--;      
        }    
                System.out.println();    
            
        
    }
        for (int i = 1; i <= x - 1; i++) {
            int d=dd;
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }

            for (int k = x - i; k >= 1; k--) {
                System.out.print("* ");

            }
            while(d>1){
            for (int j = 1; j <= i; j++) {
                System.out.print("  ");
            }

            for (int k = x - i; k >= 1; k--) {
                System.out.print("* ");

            }
            d--;
        }
            System.out.println();
        
    }

    }
}