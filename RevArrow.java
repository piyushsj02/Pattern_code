import java.io.*;

public class RevArrow{
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter no of rows");
        int row = Integer.parseInt(br.readLine());

        for(int i=1;i<=row;i++){
            for(int k=1;k<=row-i;k++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();   
        }
        
        
        for(int i=1;i<=row;i++){
            for(int k=1;k<i+1;k++){
                System.out.print("  ");
            }
            for(int j=row-i;j>=1;j--){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
