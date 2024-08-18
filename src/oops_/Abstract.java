package oops_;

abstract class Sunstar {
	abstract void printInfo();
	abstract void Gets();
}

class Employee extends Sunstar {
	String name;
	int age;
	float salary;
	void printInfo()
	{
		name = "sai infosys";
		age = 21;
		salary = 222.2F;
	}
	void Gets()
	{
		System.out.println(name);
		System.out.println(age);
		System.out.println(salary);
	}
}

class Abstrs{
	public static void main(String args[])
	{
		Sunstar s = new Employee();
		s.printInfo();
		s.Gets();
	}
}