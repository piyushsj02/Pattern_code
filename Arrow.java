/*  Pattern
                      *
                      * *
                      * * *
                      * * * *
                      * * * * *
                      * * * *
                      * * *
                      * *
                      *
 */


import java.io.*;

public class Arrow{
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter no of rows");
        int row = Integer.parseInt(br.readLine());

        for(int i=1;i<=row;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*  ");
            }
            System.out.println();   
        }
        for(int i=1;i<=row-1;i++){
            for(int j=1;j<row-i+1;j++){
                System.out.print("*  ");
            }
            System.out.println();
        }

    }
}
