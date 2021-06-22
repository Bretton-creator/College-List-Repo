public class CollegeEmployee extends Person {
    private String SS_number;
    private String salary;
    public String department;

    public CollegeEmployee() {
        // Do Nothing
    }

    public CollegeEmployee(String first_name, String last_name, String address, String zip_code, String phone_number,
            String ss, String salary, String department) {
        super(first_name, last_name, address, zip_code, phone_number);
        this.SS_number = ss;
        this.salary = salary;
        this.department = department;

    }

    public String toString() {
        return super.toString() + "\nSS Number:  " + SS_number + "\nSalary: " + salary + "\n Department: " + department;
    }

    public void setSS(String SS_number) {
        this.SS_number = SS_number;
    }

    public String getSS() {
        return SS_number;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getSalary() {
        return salary;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }
}
