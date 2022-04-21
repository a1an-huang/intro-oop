//Alan Huang 113443530 CSE114.02 HW# problem 2
public class Employee extends Person {
    private String office;
    private double salary;
    java.util.Date dateHired;
    public Employee(String name, String address, String phone, String email, String office, double salary) {
        super(name, address, phone, email);
        this.office = office;
        this.salary = salary;
    }
    public String getOffice() {
		return office;
	}
    public double getSalary() {
		return salary;
	}
    public void setOffice(String office) {
		this.office = office;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
    public String toString() {
        return (super.toString() + " " + office + " $" + salary);
    }
}
