
public class SalaryTable {
    
    public static void main(String[] args) {          
        int currentsalary = 40000;               
        int newsalary;
        System.out.println("YEAR\t\tOLD SALARY\t\tRAISE\t\tNEW SALARY");
        System.out.println("----\t\t----------\t\t-----\t\t----------");
        for (int year = 1; year <= 10; year++) {            
            System.out.format("%d%20d", year, currentsalary);
            newsalary = (int) (0.03 * currentsalary);
            currentsalary+=newsalary;
            System.out.format("%2d%16d\n", newsalary, currentsalary); 
        }
               
    }
    
}
//year+"\t\t"+currentsalary+"\t\t\t"+raiseincrease+"\t\t"+newsalary