package week3.day1;

public class LearnOverLoading {
	public void add(int a,int b) {
		System.out.println(a+b);
	}
	public void add(int a,int b,int c) {
		System.out.println(a+b+c);
	}
	public void add(float a,float b) {
		System.out.println(a+b);
	}
	public void add(float a ,int b) {
		System.out.println(a+b);
			
	}
	public static void main(String[] args) {
		LearnOverLoading add=new LearnOverLoading();
		add.add(4, 4);
		add.add(3, 2, 5);
		add.add(3.6f, 2.3f);
		add.add(2.2f, 5);
	}

}
