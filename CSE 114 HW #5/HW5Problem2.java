//Alan Huang 113443530 CSE114.02 HW# problem 2
public class HW5Problem2 {
    public static void main(String[] args) {
        Person person = new Person("Micheal", "New York", "7184949090", "micheal7743@gmail.com");
        Person student = new Student("Jennifer", "California", "9290299090", "jennifer.d@stonybrook.edu", 3);
        Person employee = new Employee("John Doe", "China", "92829822", "johndoe@doe.com", "A3", 100000);
        Person faculty = new Faculty("Janice", "Singapore", "8374839834", "jjncs928@gmail.com", "U2", 120000, "9.00am - 4.00pm","Manager");
        Person staff = new Staff("Jason", "Mexico", "2738323242", "jason373@yahoo.com", "B8", 50000, "Co-Founder");
        System.out.println(person.toString());
        System.out.println(student.toString());
        System.out.println(employee.toString());
        System.out.println(faculty.toString());
        System.out.println(staff.toString());
    }

}
