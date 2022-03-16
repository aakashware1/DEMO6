package Basic;
import java.util.Scanner;
public class Employee {

	public static void main(String[] args) {
		
		String name;
		
		  Scanner s = new Scanner(System.in);
		
		       System.out.println("Enter your name : ");
		
		            name = s.next();
	
		int age;
		
		  Scanner a = new Scanner(System.in);
		
		       System.out.println("Enter your age : ");
		
		           age = a.nextInt();
		
		float salary;
		
		  Scanner y = new Scanner(System.in);
		
		       System.out.println("Enter your salary : ");
		
		            salary = y.nextFloat();
		            
		            
		       System.out.println("Your data is here :");
		       
		       System.out.println("NAME : " + name  );
		       System.out.println("AGE : " + age + "Yrs");
		       System.out.println("SALARY : " + salary);
		       
		
	
		
		// TODO Auto-generated method stub

	}

}
