package SingleLevelInheritance;

public class Village2 extends Village1{
	
	public void maleVillage2() {
		System.out.println("Number of males in village2: 590 ");
	
}
	public void femaleVillage2() {
		
		System.out.println("Number of females in Village2: 410");
	}
	
	public void toatalPopulationVillage2() {
		
		System.out.println("Total population of village 2= 1000");
	}
	
	
	public static void main(String[] args) {
		
		Village2 v=new Village2();
		v.male();
		v.female();
		v.tatalPopulation();
		v.maleVillage2();
		v.femaleVillage2();
		v.toatalPopulationVillage2();
		
	}
	
}
