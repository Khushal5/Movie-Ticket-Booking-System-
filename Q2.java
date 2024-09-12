import java.util.*;
import java.io.*;

class Hondaengine{
	void start(){
		System.out.println("Engine is about to start!!");
	}

	void stop(){
		System.out.println("Engine has stopped!!");
	}
}

class Bike{
	private String color;
	private int wheels;

	Bike(){
	}

	Bike(String color,int wheels){
		this.color = color;
		this.wheels = wheels;
	}

	void setColor(String color){
		this.color = color;
	}

	void setWheels(int wheels){
		this.wheels = wheels;
	}

	String getColor(){
		return color;
	}

	int getWheels(){
		return wheels;
	}

	public String toString(){
		return "Bike: color = " + color + ", wheels = " + wheels;
	}
}

class Honda extends Bike{

	private Hondaengine hondaengine = new Hondaengine();

	Honda(){
	}

	Honda(String color, int wheels){
		setColor(color);
		setWheels(wheels);
	}

	void setStart(){
		hondaengine.start();
	}
}

class Q2{
	public static void main(String []args){
		Honda h1 = new Honda("Black",2);
		System.out.println(h1);
		h1.setStart();
	}
}