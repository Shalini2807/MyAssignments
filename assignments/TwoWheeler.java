package week1.assignments;

public class TwoWheeler {
	
	public int noOfWheels (int num1,int num2) {     //Initiated noofwheels(int)
		int count=num1+num2;
		return count;           
	}
	public short noOfMirrors(int num3){            //Initiated noOfMirrors(short)
		short Mirror=2;
		return Mirror;          
	}
	public long chassisNumber() {         //Initiated chassisNumber(long)
		long Number=654329076L;
		return Number;
	}
	public boolean isPunctured() {               //Initated ispunctured(boolean)
		boolean type=true;
		return type;
		
	}
	public String bikeName() {                  //Initated bikeName(String)
		String name="Royal enfield";
		return name;
	}
	public double runningKM() {                //Initated runningKM(double)
		double runKM=235879.4675758;
		return runKM;
	}
	public static void main(String[] args) {   //create object for TwoWheeler and call all the variables inside main method and print the values.
		TwoWheeler car=new TwoWheeler();
		int count=car.noOfWheels(3,4);
		System.out.println(count);
		short Mirror=car.noOfMirrors(1);
		System.out.println(Mirror);
		long number=car.chassisNumber();
		System.out.println(number);
		boolean type=car.isPunctured();
		System.out.println(type);
		String name=car.bikeName();
		System.out.println(name);
		double runKM=car.runningKM();
		System.out.println(runKM);
	}







}
