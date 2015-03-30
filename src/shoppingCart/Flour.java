package shoppingCart;

import java.util.Scanner;

public class Flour {
	public void flourType(){
		System.out.println("Which sort of flour do you want? Enter 1 for Maize flour or 2 For Baking flour");
		Scanner scan = new Scanner(System.in);
		
		int flourType = scan.nextInt();
		
		if(flourType==1){
			System.out.println("Enter 1 for Jogoo or 2 for Soko");
			int maizeBrand = scan.nextInt();
			if(maizeBrand==1){
				System.out.println("Jogoo costs 67/- for 2kg");
			}
			else if(maizeBrand==2){
				System.out.println("Soko ugali costs 65/- for 2kg");
			}
			else{
				System.out.println("Invalid Selection exiting...");
			}
		}
		else if(flourType==2){
			System.out.println("Enter 1 for Exe or 2 for Golden");
			int bakeBrand = scan.nextInt();
			if(bakeBrand==1){
				System.out.println("Exe costs 89/- for 2kg");
			}
			else if(bakeBrand==2){
				System.out.println("Golden costs 79/- for 2kg");
			}
			else{
				System.out.println("Invalid Selection exiting...");
			}
		}
		else{
			System.out.println("Invalid Selection exiting...");
		}
	}

}
