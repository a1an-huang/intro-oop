//Alan Huang 113443530 CSE114.02 HW# problem 2
public class Staff extends Employee {
    private String title;
    public Staff(String name, String address, String phone, String email, String office, int salary, String title) {
        super(name, address, phone, email, office, salary);
        this.title = title;

    }
    public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
    public String toString() {
        return (super.toString() + " " + title);
    }
}