package curriculum_i;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String []args) {
		List<Employee>employeeList=new ArrayList<>();
		employeeList.add(new FullTimeEmployee("F001","田中"));
		employeeList.add(new ContractEmployee("C001","佐藤"));
		employeeList.add(new FullTimeEmployee("F002","鈴木"));
		employeeList.add(new ContractEmployee("C002","高橋"));
		
		int hoursWorked=10;
		for (Employee emp:employeeList) {
			int wage=emp.calculateDailyWage(hoursWorked);
			System.out.println(emp.name+"の日給は"+wage+"円です。");
		}
	}

	
}
