public class Faculty extends CollegeEmployee {

    public String tenured;

    public Faculty() {

    }

    public Faculty(String first_name, String last_name, String address, String zip_code, String phone_number, String ss,
            String salary, String department, String tenured) {
        super(first_name, last_name, address, zip_code, phone_number, ss, salary, department);
        this.tenured = tenured;
    }

    public String toString() {
        return super.toString() + "\nTenured: " + tenured;
    }

    public void setTenure(String tenure) {
        this.tenured = tenure;
    }

    public String getTenure() {
        return tenured;
    }

}
