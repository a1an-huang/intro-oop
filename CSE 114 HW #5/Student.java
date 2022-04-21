//Alan Huang 113443530 CSE114.02 HW# problem 2
public class Student extends Person {
    private String grade = "freshman";
    private int status;
    public Student(String name, String address, String phone, String email, int status) {
        super(name, address, phone, email);
        if (status == 1) {
            grade = "Freshman";
        }
        if (status== 2) {
            grade = "Sophomore";
        }
        if (status == 3) {
            grade = "Junior";
        }
        if (status == 4) {
            grade = "Senior";
        }
    }
    
    /** 
     * @param status
     */
    public void setStatus(int status) {
		this.status = status; 
	}
    
    /** 
     * @return String
     */
    public String toString() {
        return super.toString() + " " + grade;
    }
}
