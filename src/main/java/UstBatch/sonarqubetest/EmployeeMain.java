package UstBatch.sonarqubetest;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class EmployeeMain {

	public static void main(String[] args) {
		
		Employee e1=new Employee("Anuja Ajay",27,7,100000);
		Employee e2=new Employee("Meera Javad",25,2,45000);
		Employee e3=new Employee("Aysha Fathima",29,5,50000);
		Employee e4=new Employee("Finla Andrews",35,10,200000);
		Employee e5=new Employee("Sagar Saji",30,8,75000);
		List<Employee>list=Arrays.asList(e1,e2,e3,e4,e5);
		List<Employee> lis = list.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
				.peek(k->{
				if((k.getNo_of_years()>=1)&&(k.getNo_of_years()<=3))
					k.setSalary( (k.getSalary()+(0.25)*k.getSalary()));
				else if(k.getNo_of_years()>=3 && (k.getNo_of_years()<=6))
					k.setSalary((k.getSalary()+(0.05)*k.getSalary()));
		        else if(k.getNo_of_years()>=6 && (k.getNo_of_years()<=10))
				k.setSalary( (k.getSalary()+(0.10)*k.getSalary()));
				else if(k.getNo_of_years()>=10)
				k.setSalary( (k.getSalary()+(0.10)*k.getSalary()));}
			      ).toList();
		lis.forEach(t->System.out.println(t));
	}
}
		