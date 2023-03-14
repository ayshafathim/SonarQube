package UstBatch.sonarqubetest;

public class Employee {
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", no_of_years=" + no_of_years + ", salary=" + salary + "]";
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public int getNo_of_years() {
		return no_of_years;
	}

	public int getSalary() {
		return salary;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setNo_of_years(int no_of_years) {
		this.no_of_years = no_of_years;
	}

	public void setSalary(double d) {
		this.salary = salary;
	}

	String name;
	int age;
	int no_of_years;
	int salary;

	public Employee(String name, int age, int no_of_years, int salary) {
		super();
		this.name = name;
		this.age = age;
		this.no_of_years = no_of_years;
		this.salary = salary;
	}

}
