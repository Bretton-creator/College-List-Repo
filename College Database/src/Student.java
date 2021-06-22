public class Student extends Person {
    public String major;
    private String gpa;

    public Student() {

    }

    public Student(String first_name, String last_name, String address, String zip_code, String phone_number,
            String major, String gpa) {
        super(first_name, last_name, address, zip_code, phone_number);
        this.major = major;
        this.gpa = gpa;
    }

    public String toString() {
        return super.toString() + "\nMajor: " + major + "\n GPA: " + gpa;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getMajor() {
        return major;
    }

    public void setGPA(String gpa) {

        this.gpa = gpa;
    }

    public String getGPA() {
        return gpa;
    }
}
