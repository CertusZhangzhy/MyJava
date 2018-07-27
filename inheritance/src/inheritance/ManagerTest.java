package inheritance;

public class ManagerTest
{
	public static void main(String[] args)
	{
		Manager boss = new Manager("M1", 9000, 1988, 1, 1);
		boss.setBonus(5000);
		
		Empolyee[] staff = new Empolyee[3];
		
		staff[0] = boss;
		staff[1] = new Empolyee("E1", 5000, 1990, 3, 4);
		staff[2] = new Empolyee("E2", 4000, 1993, 11, 6);
		
		for (Empolyee e : staff)
			System.out.println("name:"+e.getName()+",salary="+e.getSalary()); 
	}
}