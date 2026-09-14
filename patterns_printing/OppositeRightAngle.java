
import java.util.Scanner;

class OppositeRightAngle {

    // * * * * * 
    // * * * * 
    // * * * 
    // * * 
    // * 
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows to print opposite right angle triangle :");
        int rows = sc.nextInt();

        for (int i = 0; i < rows; i++) {

            for (int j=0;j<rows-i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
