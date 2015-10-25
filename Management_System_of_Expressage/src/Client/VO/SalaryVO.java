package Client.VO;

public class SalaryVO {
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
