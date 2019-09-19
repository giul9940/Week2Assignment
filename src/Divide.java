import java.util.Scanner;

public class Divide {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x, y, z = 0, r;
        System.out.print("Enter Number 1:");
        x = s.nextInt();
        System.out.println("Enter Number 2:");
        y = s.nextInt();
        
        if(x > y){
            z = x % y;
            r = x / y;
            System.out.println(x + " divided by " + y + " is " + r+"r"+z);
        }
        if(y > x){
            z = y % x;
            r = y / x;
            System.out.println(y + " divided by " + x + " is " + r+"r"+z);
        }
        
        
        
    }
    
}
