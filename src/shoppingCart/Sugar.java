package shoppingCart;

import java.util.Scanner;

public class Sugar {
	public void sugarType(){
		System.out.println("Which brand of sugar do you want? Enter 1 for Mumias or 2 For Nzoia");
		Scanner scan = new Scanner(System.in);
		
		int sugarType = scan.nextInt();
		
		if(sugarType==1){
			System.out.println("Mumias sugar costs 215/- per Kg");
		}
		else if(sugarType==2){
			System.out.println("Nzoia sugar costs 187/- per Kg");
		}
		else{
			System.out.println("Invalid Selection exiting...");
		}
	}

}
