package Client.PO;
import java.io.Serializable;


public class SalaryPO implements Serializable{
	//п╫к╝пео╒
	String typeOfStaff;
	double salary;
	int typeOfStrategy;
	
	public SalaryPO(String typeOfStaff, double salary, int typeOfStrategy) {
	
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

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void setTypeOfStrategy(int typeOfStrategy) {
		this.typeOfStrategy = typeOfStrategy;
	}
	
	
}
