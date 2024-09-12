class Circle1{
		private double radius;
		public Circle1(){
		}

		public Circle1(double radius){
			this.radius = check_rad(radius);
		}

		public double getRadius(){
			return radius;
		}

		public void setRadius(double radius){
			this.radius = check_rad(radius);
		}

		public double check_rad(double radius){
			if(radius < 0){
				radius = 0;
			}
			return radius;
		}

		public double getArea(){
			double area = 3.14 * radius * radius;
			return area;
		}

		public String toString(){
			return "Radius = " + radius + "\nArea = " + getArea();
		}
}

class Cylinder1 extends Circle1{
	private double height;
	public Cylinder1(){
	}

	public Cylinder1(double radius, double height){
		this.height = check_h(height);
		setRadius(radius);
	}

	public double check_h(double height){
		if(height < 0){
			height = 0;
		}
		return height;
	}

	public void setHeight(double height){
		this.height = check_h(height);
	}

	public double getArea(){
		return 2 * 3.14 * getRadius() * height + 2 * 3.14 * getRadius() * getRadius();
	}

	public double volume(){
		double vol = 3.14 * getRadius() * getRadius() * height;
		return vol;
	}

	public String toString(){
			return "Radius = " + getRadius() + "\nArea = " + getArea() + "\nVolume = " + volume();
		}

}

class TestShape{
	public static void main(String []args){
		Cylinder1 c = new Cylinder1(2,3);
		System.out.println(c);
	}
}
