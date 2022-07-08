import java.util.Scanner;

public class Leapyear {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
           System.out.println("Enter your year here ");
           
        double input = sc.nextDouble();

        if (input % 4 == 0 && input % 400 == 0) {
        	
           System.out.println("Yes it is a leap year");}

        else if (input % 4 == 0  && input%100 != 0){
        	
            System.out.println("Yes it is a leap year"); }

        else System.out.println("No it is not a leap year");	
	}

}
