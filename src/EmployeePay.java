import java.util.Scanner;

public class EmployeePay {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);        
        double regulartotalpay=0, overtimetotalpay=0;
        double totalpay;
        double hours = 0;        
                
            for (int i = 1; i <= 5; i++) {
                while(true){
                    System.out.print("Enter hours worked for Employee " + i +": ");
                    if(s.hasNextInt()){
                        hours = s.nextInt();
                        if(hours > 0 && hours < 71) break; 
                        else System.out.println("Error, hours must be from 0 to 70");
                        }
                        else{                         
                        s.nextLine();
                        continue;
            }
            
            }
            if(hours <=40)regulartotalpay = hours * 15;
            if(hours >40) {
                overtimetotalpay = (hours-40) * 22.50;
                regulartotalpay = 40 * 15;
            }
            else overtimetotalpay=0;
            totalpay = regulartotalpay + overtimetotalpay;
            System.out.println("Regular Pay: $"+regulartotalpay);
            System.out.println("Overtime Pay: $"+overtimetotalpay);
            System.out.println("Total Pay: $"+totalpay);
            System.out.println("---------------------------");
            totalpay=0;
            overtimetotalpay=0;
            regulartotalpay=0;
            }
    }
    
}
