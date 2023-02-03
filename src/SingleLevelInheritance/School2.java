package SingleLevelInheritance;

public class School2 extends School1 {

	public void furniture() {
		
		System.out.println("School 2 has sufficient furniture");
	}
	public static void main(String[] args) {
	 School2 s=new School2();
	 s.boys();
	 s.girls();
	 s.totalStud();
	 s.furniture();
	
	}
}
