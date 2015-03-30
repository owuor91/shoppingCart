package shoppingCart;

import java.util.Scanner;

public class Vegetables {
	public void vegeType(){
		System.out.println("Which type of vegetable do you want? Enter 1 for Tomatoes, 2 For Kales or 3 for Cabbages");
		Scanner scan = new Scanner(System.in);
		
		int vegeType = scan.nextInt();
		
		if(vegeType==1){
			System.out.println("Tomatoes cost 10/- each");
		}
		else if(vegeType==2){
			System.out.println("Kales cost 20/- per bunch");
		}
		else if(vegeType==3){
			System.out.println("Cabbages cost 30/- each");
		}
		else{
			System.out.println("Invalid Selection exiting...");
		}
	}
}
