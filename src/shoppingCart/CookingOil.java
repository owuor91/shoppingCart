package shoppingCart;
import java.util.Scanner;

public class CookingOil {
	public void oilType(){
		System.out.println("Which type of oil do you want? Enter 1 for Elianto or 2 For Kimbo");
		Scanner scan = new Scanner(System.in);
		
		int oilType = scan.nextInt();
		
		if(oilType==1){
			System.out.println("Elianto costs 112/- per litre");
		}
		else if(oilType==2){
			System.out.println("Kimbo costs 140/- per Kg");
		}
		else{
			System.out.println("Invalid Selection exiting...");
		}
	}

}
