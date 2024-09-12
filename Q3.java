interface GeometricObject{
	double getPerimeter();
	double getArea();
}

interface Resizable{
	void resize(int percent);
}

class Circle implements GeometricObject{
	protected double radius= 1.0;

	Circle(){
	}

	Circle(double radius){
		this.radius = radius;
	}

	@Override
		public double getPerimeter(){
		return 2 * 3.14 * radius;
	}

	@Override
	public double getArea(){
		return 3.14 * radius * radius;
	}
}

class ResizableCircle extends Circle implements Resizable{
	ResizableCircle(){
	}

	ResizableCircle(double radius){
		this.radius = radius;
	}

	@Override
	public void resize(int percent){
		radius += radius * (percent / 100);
	}
}

class Q3{
	public static void main(String [] args){
		Circle c = new Circle(5);
		System.out.println("Perimeter = " + c.getPerimeter());
		System.out.println("Area = " + c.getArea());

		ResizableCircle r = new ResizableCircle();
		r.resize(5);
		System.out.println("Circle after resize: Perimeter = " + r.getPerimeter() + ", Area = " + r.getArea());
	}
}