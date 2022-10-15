package week3.day1assignments;

public class AxisBank extends BankInfo {
	public void deposit() {
		System.out.println("Amount deposited =40000");
	}
	public static void main(String[] args) {
		AxisBank bankdeposit=new AxisBank();
		bankdeposit.saving();
		bankdeposit.fixed();
		bankdeposit.deposit();     //override deposit()of child class
		BankInfo bankdeposit1=new BankInfo();
		bankdeposit1.deposit();     //override deposit() of parent class
	}

}
