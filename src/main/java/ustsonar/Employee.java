package ustsonar;

public class Employee {
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", noofyears=" + noofyears + ", salary=" + salary + "]";
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public int getNoofyears() {
		return noofyears;
	}

	public Double getSalary() {
		return salary;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setNoofyears(int noofyears) {
		this.noofyears = noofyears;
	}

	public void setSalary(double salary) {
		this.salary =  salary;
	}

	String name;
	int age;
	int noofyears;
	Double salary;

	public Employee(String name, int age, int noofyears, Double salary) {
		super();
		this.name = name;
		this.age = age;
		this.noofyears = noofyears;
		this.salary = salary;
	}

}
