package SingleLevelInheritance;

public class Animals extends Animal{
	
	public void characteristic() {
		System.out.println("The man can speak and dog can bark");
	}
	
	public static void main(String[] args) {
		Animals a= new Animals();
		a.man();
		a.dog();
		a.characteristic();
	}

}
