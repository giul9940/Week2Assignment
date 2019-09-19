import java.util.Scanner;

public class PowersChart {
   
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       int x, y;
       while(true){
            System.out.print("Enter a value from 1 to 10: ");
            x = s.nextInt();
            if(x < 0 || x > 10) System.out.println("Error - 0 to 10 numbers only.");
            else break;
       }        
        System.out.println("X\t\t2^X");
        for (int i = 0; i <= x; i++) {            
            y = (int) Math.pow(2, i);
            System.out.println(i +"\t\t"+"2^"+i+" = "+y);           
        }
    }
    
}
