public class ParamTest {

	public static void main (String [] args) {

		System.out.print("Testing tripleValue:");
		double percent = 10;
		System.out.println("Before:percent=" + percent);
		tripleValue(percent);
		System.out.println("After:percent=" + percent);
        /*
         * Test2:Methods can change the state of object paraments
         */

		System.out.println("\nTesting tripleSalary:");
		Employee harry = new Employee("Harry ",50000);
		System.out.println("Before:salary=" + harry.getSalary());
		trpleSalary(harry);
		System.out.println("After:salary=" + harry.getSalary());

		/*
         *Test3:Methods can;t attach new objects to object paraments
         */

		System.out.println("\nTesting swap:");
		Employee a = new Employee("Alice", 70000);
		Employee b = new Employee("Bob",60000);
		System.out.println("Before a=" + a.getName());
		System.out.println("Before b=" + a.getName());
		swap(a,b);
		System.out.println("After a=" + a.getName());
		System.out.println("After b=" + a.getName());

	}

	public static void tripleValue(double x)//doesn't work
	{

		x=3*x;
		System.out.println("End of method:x=" + x);
	}

	public static void tripleSalary(Employee x)//works
	{

		x.raiseSalary(200);
		System.out.println("End of method: salary=" + x.getSalary());
	}

	public static void swap(Employee x,Employee y){

		Employee temp = x;
		x = y;
		y = temp;
		System.out.println("End of method:x=" + x.getName()):
		System.out.println("End of method:y=" + y.getName());

	}
}

class Employee {

	private String name;
	private double salary;

	public Employee(String n,double s){

		name = n;
		salary = s;

	}

	public String getName(){

		return name;
	}

	public double getSalary(){

		return salary;

	}

	public void raiseSalary(double percent){

		double raise = salary*bypercent/100;
		salary+=raise;
	}
}