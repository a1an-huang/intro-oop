//Alan Huang 113443530 CSE114.02 HW# problem 2
public class Faculty extends Employee {
    private String officeHours;
    private String rank;

    public Faculty(String name, String address, String phone, String email, String office, int salary, String offHours,
            String rank) {
        super(name, address, phone, email, office, salary);
        this.officeHours = offHours;
        this.rank = rank;

    }

    public String getOfficeHours() {
        return officeHours;
    }

    public void setOfficeHours(String officeHours) {
        this.officeHours = officeHours;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String toString() {
        return (super.toString() + " " + officeHours + " " + rank);
    }
}