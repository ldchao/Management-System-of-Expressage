package PO;
import java.io.Serializable;

import State.SalaryModel;


public class SalaryPO implements Serializable{
	//п╫к╝пео╒
	String typeOfStaff;
	double salary;
	SalaryModel typeOfStrategy;
	
	public SalaryPO(String typeOfStaff, double salary, SalaryModel typeOfStrategy) {
	
		this.typeOfStaff = typeOfStaff;
		this.salary = salary;
		this.typeOfStrategy = typeOfStrategy;
	}

	public String getTypeOfStaff() {
		return typeOfStaff;
	}

	public void setTypeOfStaff(String typeOfStaff) {
		this.typeOfStaff = typeOfStaff;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public SalaryModel getTypeOfStrategy() {
		return typeOfStrategy;
	}

	public void setTypeOfStrategy(SalaryModel typeOfStrategy) {
		this.typeOfStrategy = typeOfStrategy;
	}
	
	
}
