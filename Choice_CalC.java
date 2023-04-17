import java.io.*;
import java.util.*;

public class Choice_CalC {

    static void add(int a,int b){
        int ans=a+b;
        System.out.println("Addition = "+ans);
    }
    static void sub(int a,int b){
        int ans=a-b;
        System.out.println("Substraction = "+ans);
    }
    static void multi(int a,int b){
        int ans=a*b;
        System.out.println("Multiplication = "+ans);
    }
    static void div(int a,int b){
        int ans=a/b;
        System.out.println("Division = "+ans);
    }
    public static void main(String[] args) throws IOException {
        
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        System.out.println("enter INT 1 & INT 2");
        String str=br.readLine();

        StringTokenizer stn= new StringTokenizer(str," ");
        int a=Integer.parseInt(stn.nextToken());
        int b=Integer.parseInt(stn.nextToken());

        System.out.println("Enter choice of what you want to do....");
        System.out.println("1.Addition");
        System.out.println("2.substraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        
        int choice=Integer.parseInt(br.readLine());

        switch(choice){

            case 1 :
                    add(a,b);
                    break;
            case 2 : 
                    sub(a,b); 
                    break;
            case 3 : 
                    multi(a,b); 
                    break;
            case 4 : 
                    div(a,b);    
                    break;  
            default:
                    System.out.println("Please select correct Option !");

        }



    }
    

}
