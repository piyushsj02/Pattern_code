import java.util.*;

public class SquarePattern {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no--> ");
        int n=sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print(n+" ");
            }
            System.out.println();
        }
         
    }
}
