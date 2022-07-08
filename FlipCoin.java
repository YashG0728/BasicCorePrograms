import java.util.Random;
import java.util.Scanner;

public class coin {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a,head = 0,tail = 0,i;
		double tempflip=0.5;
		System.out.println("Num of time to flip coin :");
		a = s.nextInt();
		for( i=0;i<a;i++) {
		Random r = new Random();
		double dice = r.nextDouble(1);

		if (dice < tempflip) {
			tail +=1;
		} 
		else {
			head +=1;
		}


		}
		System.out.println("Num of Head is " +head);
		System.out.println("Num of Tail is " +tail);
		double perhead = (head*100)/a;
		double pertail=(tail*100)/a;

		System.out.println(perhead);
		System.out.println(pertail);
	}

}
