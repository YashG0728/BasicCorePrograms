import java.util.Scanner;

public class CheckPowerOf2 {

	public static void main(String[] args)
	{
		 checkNumber();
    }

    private static void checkNumber()
    {
        System.out.println("Enter a number (between 0 and 32 767) to check if it's a power of 2.");
        Scanner s= new Scanner(System.in);
        short inNumber = s.nextShort();

        do {
        if(inNumber%2==0)
        {
            inNumber=(short)(inNumber/2);
        }
        else
            System.out.println ("This number is odd,");
        }
        while(inNumber%2==0);

        if (inNumber==1){
        System.out.println("power of two");}

        else{
        System.out.println("not a power of two");}

        while (true)
        checkNumber();	
	}

}
