class Shape{
	private String color;
	private boolean filled;

	public Shape(){
	}

	public Shape(String color, boolean filled){
		this.color = color;
		this.filled = filled;
	}

	public String getColor(){
		return color;
	}

	public void setColor(String color){
		this.color = color;
	}

	public boolean getFilled(){
		return filled;
	}

	public void setFilled(boolean filled){
		this.filled = filled;
	}

	public String toString(){
		return "Color = " + color + "\nFilled = " + filled;
	}
}

class Circle extends Shape{
	private double radius;

	public Circle(){
	}

	public Circle(double radius){
		this.radius = check_rad(radius);
	}

	public Circle(double radius, String color, boolean filled){
		this.radius = check_rad(radius);
		setColor(color);
		setFilled(filled);
	}

	public double check_rad(double radius){
		if(radius < 0){
			radius = 0;
		}
		return radius;
	}

	public void setRadius(double radius){
		this.radius = check_rad(radius);
	}

	public double getRadius(){
		return radius;
	}

	public double getArea(){
		return 3.14 * radius * radius;
	}

	public double getPeri(){
		return 3.14 * radius * 2;
	}

	public String toString(){
		return "Color = " + getColor() + "\nFilled = " + getFilled() + "\nRadius = " + radius + "\nArea = " + getArea() + "\nPerimeter = " + getPeri();
	}
}

class Rectangle extends Shape{
	private double width;
	private double length;

	public Rectangle(){
	}

	public Rectangle(double width, double length){
		this.width = check_width(width);
		this.length = check_length(length);
	}

	public Rectangle(double width, double length, String color, boolean filled){
		this.width = check_width(width);
		this.length = check_length(length);
		setColor(color);
		setFilled(filled);
	}

	public double check_length(double length){
		if(length < 0){
			length = 0;
		}
		return length;
	}

	public double check_width(double width){
		if(width < 0){
			width = 0;
		}
		return width;
	}

	public double getWidth(){
		return width;
	}

	public void setWidth(double width){
		this.width = check_width(width); 
	}

	public double getLength(){
		return length;
	}

	public void setLength(double length){
		this.length = check_length(length);
	}

	public double getArea(){
		return length * width;
	}

	public double getPeri(){
		return 2 * (length + width);
	}

	public String toString(){
		return "Color = " + getColor() + "\nFilled = " + getFilled() + "\nLength = " + length + "\nWidth = " + width + "\nArea = " + getArea() + "\nPerimeter = " + getPeri();
	}
}

class Square extends Rectangle{
	private double side;

	public Square(){
	}

	public Square(double side, String color, boolean filled){
		this.side = check_side(side);
		setColor(color);
		setFilled(filled);
	}

	public double getSide(){
		return side;
	}

	public void setSide(double Side){
		this.side = check_side(side);
	}

	public double check_side(double side){
		if(side < 0){
			side = 0;
		}
		return side;
	}

	public String toString(){
		return "Color = " + getColor() + "\nFilled = " + getFilled() + "\nSide = " + side;
	} 	
}

class TestShape{
	public static void main(String []args){
		Circle c = new Circle(3,"Black",true);
		System.out.println("\nCircle\n" + c);

		Rectangle r = new Rectangle(5,2,"Red",false);
		System.out.println("\nRectangle\n" + r);

		Square s = new Square(6,"Blue",true);
		System.out.println("\nSquare\n" + s);

	}
}
