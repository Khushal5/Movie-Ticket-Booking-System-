import java.util.*;
import java.io.*;

abstract class Cake{
	protected String name;
	protected double rate;
	public Cake(){
	}

	public Cake(String name,double rate){
		this.name = name;
		this.rate = rate;
	}

	public abstract double calcPrice();

	public String toString(){
		return "name = " + name + "\t" + ", rate = " + rate;
	}
}

class OrderCake extends Cake{
	protected double weight;

	public OrderCake(){
	}

	public OrderCake(double weight,String name, double rate){
		this.name = name;
		this.rate = rate;
		this.weight = weight;
	}

	@Override
	public double calcPrice(){
		return rate * weight;
	}
}

class ReadyMadecake extends Cake{
	protected int quantity;

	public ReadyMadecake(){
	}

	public ReadyMadecake(int quantity,String name, double rate){
		this.name = name;
		this.rate = rate;
		this.quantity = quantity;
	}
	
	@Override
	public double calcPrice(){
		return rate * quantity;
	}
}

class Q4{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Cake cake[] = new Cake[5];
		double totalPrice = 0.0,readyPrice = 0.0,maxPrice = 0.0;
		int max_i = 0,totalQuant = 0;

		for(int i = 0;i < 5;i++){
			System.out.print("\nEnter type of cake: ");
			int type = sc.nextInt();

			if(type == 1){
				sc.nextLine();
				System.out.print("Enter name of cake: ");
				String name = sc.nextLine();
				System.out.print("Enter weight of cake: ");
				double weight = sc.nextDouble();
				System.out.print("Enter rate of cake: ");
				double rate = sc.nextDouble();
				cake[i] = new OrderCake(weight,name,rate);
				totalPrice += cake[i].calcPrice();

				if(maxPrice < cake[i].calcPrice()){
					maxPrice = cake[i].calcPrice();
					max_i = i;
				}
			}

			else if(type == 2){
				sc.nextLine();
				System.out.print("Enter name of cake: ");
				String name = sc.nextLine();
				System.out.print("Enter quantity of cake: ");
				int quantity = sc.nextInt();
				System.out.print("Enter rate of cake: ");
				double rate = sc.nextDouble();
				cake[i] = new ReadyMadecake(quantity,name,rate);
				totalPrice += cake[i].calcPrice();
				readyPrice += cake[i].calcPrice();
				totalQuant += quantity;

				if(maxPrice < cake[i].calcPrice()){
					maxPrice = cake[i].calcPrice();
					max_i = i;
				}
			}
		}
		System.out.println("Total price cakes = Rs " + totalPrice);
		System.out.println("Total price of Ready made cakes = Rs " + readyPrice);		
		System.out.println("Total quantity of readymade cakes = " + totalQuant);
		System.out.println("Highest selling cake: " + cake[max_i]);
	}
}