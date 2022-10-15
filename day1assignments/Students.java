package week3.day1assignments;

public class Students {
	public void getStudentInfo(int id) {
		System.out.println("id-"+id);
	}
	public void getStudentInfo(String name) {
		System.out.println("Name-"+name);
		
	}
	public void getStudentInfo(String email,int phonenumber) {
		System.out.println("email-"+email);
		System.out.println("phonenumber-"+phonenumber);
	}
	public static void main(String[] args) {
		Students details=new Students();
		details.getStudentInfo(140);
		details.getStudentInfo("Shalini");
		details.getStudentInfo("test@yahoo.com", 234589768);
	}

}
