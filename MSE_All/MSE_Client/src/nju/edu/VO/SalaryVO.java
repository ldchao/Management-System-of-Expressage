package nju.edu.VO;

import java.io.Serializable;

import State.SalaryModel;

public class SalaryVO implements Serializable{
	String typeOfStaff;
	double salary;
	SalaryModel typeOfStrategy;
	
	public SalaryVO(String typeOfStaff, double salary, SalaryModel typeOfStrategy) {
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

	public SalaryModel getTypeOfStrategy() {
		return typeOfStrategy;
	}
	
	
}
