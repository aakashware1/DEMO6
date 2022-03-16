package Basic;
import java.util.Scanner;

public class Discount {

	public static void main(String[] args) {
		
		String productName;
		Scanner s = new Scanner(System.in);
		 System.out.println("Enter product name :");
		 productName=s.next();
		 
		 int productPrice;
		 Scanner p= new Scanner(System.in);
		 System.out.println("Enter price of product : ");
		 productPrice = p.nextInt();
		 float dis;
		  if (productPrice>2000)
			  
			  dis=productPrice * .10f;
		  else
			  dis= productPrice *.07f;
		  
		  System.out.println(productName + "  " + productPrice + "  " + dis    );
		  System.out.println("discount is " + (productPrice-dis));
		
		      
		      
		    	  
		    	  
		    	  
		 
		 
		
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
