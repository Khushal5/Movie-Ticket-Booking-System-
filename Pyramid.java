
	interface Draw{
	public void display(int rows);
}

class Pyramid implements Draw{
	@Override
	public void display(int rows){
	int k = 0;

    for (int i = 1; i <= rows; ++i, k = 0) {
      for (int space = 1; space <= rows - i; ++space) {
        System.out.print("  ");
      }

      while (k != 2 * i - 1) {
        System.out.print("* ");
        ++k;
      }

      System.out.println();
    }
  }
}

class Pyramid{
	public static void main(String []args){
		Pyramid p = new Pyramid();
		System.out.println("Pyramid of length 3:");
		p.display(3);
		System.out.println("Pyramid of length 5:");
		p.display(5);
		System.out.println("Pyramid of length 7:");
		p.display(7);
	}
}

