package shoppingCart;

import java.util.Scanner;

public class Cart {

	public static void main(String[] args) {
		int stocked =0;
		
		//instantiate classes
		Flour unga = new Flour();
		CookingOil mafuta = new CookingOil();
		Sugar sukari = new Sugar();
		Vegetables mboga = new Vegetables(); 
		
		String categories[] = {"flour","cooking oil","sugar","vegetables"};
		
		System.out.println("Hi, welcome to our shop. What is your order?");
		
		Scanner scan = new Scanner(System.in);
		String order = scan.nextLine();
		order = order.trim().toLowerCase();
		
		for(int i = 0; i<categories.length; i++){
			if(order.equals(categories[i])) {
				stocked = 1;
				break;
			}
			else{
				stocked = 0;
			}
		}
		
		if(stocked == 1){
			if(order.equals("flour")){
				unga.flourType();
			}
			else if(order.equals("cooking oil")){
				mafuta.oilType();
			}
			else if(order.equals("sugar")){
				sukari.sugarType();
			}
			else{
				mboga.vegeType();
			}
		}
		else{
		System.out.println("Sorry we do not have " + order + " but we have \n 1. Flour \n 2. Cooking Oil \n 3. Sugar \n 4. Vegetables ");
		
		System.out.println("Enter respective number for either item ");
		int catselect = scan.nextInt();
		
		switch (catselect){
			case 1 :
				unga.flourType();
				break;
			case 2 :
				mafuta.oilType();
				break;
			case 3 :
				sukari.sugarType();
				break;
			case 4 :
				mboga.vegeType();
				break;
			default:
				System.out.println("You must only enter 1,2,3 or 4");
				break;
			}
		}
		
		
		
		
		
		
	}

}
