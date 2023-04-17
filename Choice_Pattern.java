import java.util.*;

public class Choice_Pattern {

    // for daimond
    static void dai(int x) {
        for (int i = 1; i <= x; i++) {

            for (int j = 1; j <= x - i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= i; k++) {
                System.out.print("* ");

            }
            System.out.println();
        }

        for (int i = 1; i <= x - 1; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }

            for (int k = x - i; k >= 1; k--) {
                System.out.print("* ");

            }
            System.out.println();
        }

    }
    //Douvble Daimond
    static void DouDai(int x){
    for (int i = 1; i <= x; i++) {

        for (int j = 1; j <= x - i; j++) {
            System.out.print(" ");
        }

        for (int k = 1; k <= i; k++) {
            System.out.print("* ");
        }
        for (int j = 1; j <= x - i; j++) {
            System.out.print("  ");
        }
    
        for (int k = 1; k <= i; k++) {
            System.out.print("* ");
        }
        System.out.println();
    }

    for (int i = 1; i <= x - 1; i++) {

        for (int j = 1; j <= i; j++) {
            System.out.print(" ");
        }

        for (int k = x - i; k >= 1; k--) {
            System.out.print("* ");

        }
        for (int j = 1; j <= i; j++) {
            System.out.print("  ");
        }

        for (int k = x - i; k >= 1; k--) {
            System.out.print("* ");

        }
        System.out.println();
    }
    }


    // for Triangle
    static void Tri(int x) {
        for (int i = 1; i <= x; i++) {

            for (int j = 1; j <= x - i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= i; k++) {
                System.out.print("* ");

            }
            System.out.println();
        }

    }

    // for Rev Triangle
    static void RevTri(int x) {
        for (int i = 1; i <= x; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }

            for (int k = x - i + 1; k >= 1; k--) {
                System.out.print("* ");

            }
            System.out.println();
        }
    }

    // for Ladder
    static void Lad(int x) {
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // for Rev Ladder
    static void RevLad(int x) {
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= x - i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void sqr(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Choose what you want to print....");
        System.out.println("1.Daimond" + "\n" + "2.Triangle" + "\n" +
                "3.Reverse Triangle" + "\n" + "4.Ladder" +
                "\n" + "5.Reversev Ladder" + "\n" + "6.Square"+ "\n" + "7.Double Daimond");

        int a = sc.nextInt();

        System.out.println("No of ROW's for your Pattern");
        int x = sc.nextInt();

        switch (a) {
            case 1:
                dai(x);
                break;
            case 2:
                Tri(x);
                break;
            case 3:
                RevTri(x);
                break;
            case 4:
                Lad(x);
                break;
            case 5:
                RevLad(x);
                break;
            case 6:
                sqr(x);
                break;
            case 7:
                DouDai(x);
                break;
            default:
                System.out.println("Please select correct Option !");
        }
    }
}
