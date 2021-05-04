package exercise44;

import java.util.Scanner;

public class GreenApple extends Apple {//subclass of apple-inherits state and behavior from superclass
	Scanner scan = new Scanner(System.in);
	String uses,placeOfOrigin,seasons;
	double weight,protein,price,total;
	int unit;
	public GreenApple(String name,String colour,String u,String po,String s,double weight,double protein,double price) {
		super(name,colour);
		this.weight = weight;
		this.protein = protein;
		this.price = price;
		this.uses = u;
		this.placeOfOrigin = po;
		this.seasons = s;
		System.out.print("\n\nEnter number of apple :  ");
		this.unit = scan.nextInt();
		
	}

	public String placeProduce(){
		return placeOfOrigin;
	}
	
	public String seasons(){
		return seasons;
	}
	
	public double weight(){
		return weight;
	}
	
	public double price(){
		return price;
	}
	
	public int getquantity(){
		return this.unit;
	}
	
	public void calctotal() {//overriding method
		total = unit*price;
		System.out.println("\nTotal price of "+ unit +" "+ name +" "+" : RM" + total);
	}

	
	public String toString() { //overriding method-dif classes
		return "Apple name      :" + super.getName() +
			   "\n" + "Colour          :" + super.colour() +
		       "\nProduce made      :" + this.placeOfOrigin +
		       "\nSeasons Harvest :" + this.seasons +
		       "\nAverage Weight  :" + this.weight + "g per apple" +
		       "\nPrice per apple : RM" + this.price;
		
	}
	
}



