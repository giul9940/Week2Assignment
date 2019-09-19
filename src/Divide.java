
import java.util.Scanner;

public class Divide {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = 0, y = 0, z = 0, r;
        while(true){
        try {            
            System.out.print("Enter Number 1: ");
            x = s.nextInt();
            System.out.print("Enter Number 2: ");
            y = s.nextInt();
        } catch (Exception e) {
            System.out.println("Thats not a number! Try again.");
            s.nextLine();
            continue;
        }
        break;
        }
        if(x == y) {
            z = x % y;
            r = x / y;
            System.out.println(x + " divided by " + y + " is " + r + "r" + z);
        }
        if (x > y) {
            z = x % y;
            r = x / y;
            System.out.println(x + " divided by " + y + " is " + r + "r" + z);
        }
        if (y > x) {
            z = y % x;
            r = y / x;
            System.out.println(y + " divided by " + x + " is " + r + "r" + z);
        }

    }

}
