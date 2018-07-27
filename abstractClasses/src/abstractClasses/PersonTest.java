package abstractClasses;

public class PersonTest
{
	public static void main(String[] args)
	{
		Person[] people = new Person[2];
		
		people[0] = new Employee("E1", 5000, 1990, 12, 13);
		people[1] = new Student("s1", "Electronic&Economics");
		
		for (Person p : people)
			System.out.println(p.getName() + "," + p.getDescription());
	}
}