package Client.VO;

import java.io.Serializable;

public class SalaryVO implements Serializable{
	String typeOfStaff;
	double salary;
	int typeOfStrategy;
	
	public SalaryVO(String typeOfStaff, double salary, int typeOfStrategy) {
		super();
		this.typeOfStaff = typeOfStaff;
		this.salary = salary;
		this.typeOfStrategy = typeOfStrategy;
	}

	public String getTypeOfStaff() {
		return typeOfStaff;
	}

	public double getSalary() {
		return salary;
	}

	public int getTypeOfStrategy() {
		return typeOfStrategy;
	}
	
	
}
