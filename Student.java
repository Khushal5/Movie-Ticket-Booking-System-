class Circle{
		private double radius;
		private String color;

		public Circle(){
		}

		public Circle(double radius){
			this.radius = check_rad(radius);
		}

		public double check_rad(double radius){
			if(radius < 0){
				radius = 0;
			}
			return radius;
		}

		public Circle(double radius, String color){
			this.radius = check_rad(radius);
			this.color = color;
		}

		public double getRadius(){
			return radius;
		}

		public void setRadius(double radius){
			this.radius = check_rad(radius);
		}

		public String getColor(){
			return color;
		}

		public void setColor(String color){
			this.color = color;
		}

		public double getArea(){
			double area = 3.14 * radius * radius;
			return area;
		}

		public String toString(){
			return "Radius = " + radius + "\nColor = " + color;
		}
}

class Cylinder extends Circle{
	private double height;

	public Cylinder(){
	}

	public Cylinder(double radius){
		setRadius(radius);
	}

	public Cylinder(double radius, double height){
		setRadius(radius);
		this.height = check_h(height);
	}

	public Cylinder(double radius, double height,String color){
		setRadius(radius);
		this.height = check_h(height);
		setColor(color);
	}	

	public double check_h(double height){
		if(height < 0){
			height = 0;
		}
		return height;
	}

	public double getHeight(){
		return height;
	}

	public void setHeight(double height){
		this.height = check_h(height);
	}

	public double volume(){
		double vol = 3.14 * getRadius() * getRadius() * height;
		return vol;
	}

	public String toString(){
			return "Radius = " + getRadius() + "\nColor = " + getColor() + "\nVolume = " + volume();
		}

}

class TestCylinder{
	public static void main(String []args){
		Cylinder c = new Cylinder(2,5,"Blue");
		System.out.println(c);
	}
}
