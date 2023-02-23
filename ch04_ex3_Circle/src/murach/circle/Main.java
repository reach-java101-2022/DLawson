package murach.circle;
/*dylaw
11:47:45 AM*/

import java.util.Scanner;

public class Main {
	
	public static void main (String[] args) {
		System.out.println("Welcome to Circle Calculator");
        System.out.println();
        
        Scanner sc = new Scanner(System.in);
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
        	
        	System.out.print("Enter radius: ");
            double radius = Double.parseDouble(sc.nextLine());
            Circle c = new Circle(radius);
            
           String message = 
                "Diameter:              " + c.getDiameterNumberFormat() + "\n" +
           		"Circumference:         " + c.getCircumferenceNumberFormat() + "\n" +
                "Area:                  " + c.getAreaNumberFormat() + "\n";
           System.out.println(message);
           
           System.out.print("Continue? (y/n): ");
           choice = sc.nextLine();
           System.out.println();
        }
        
        sc.close();
        System.out.println("Bye!");
	}
}


