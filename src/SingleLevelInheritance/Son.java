package SingleLevelInheritance;

public class Son extends Father {

	public void newBike() {
		System.out.println("New Bike");
	}

public static void main(String[] args) {
	Son s= new Son();
	s.money();
	s.car();
	s.home();
	s.newBike();
}

}