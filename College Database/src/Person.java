public class Person {

    private String first_name;
    private String last_name;
    private String address;
    private String zip_code;
    private String phone_number;

    public Person() {

    }

    public Person(String first, String last, String address, String zip, String phone) {
        this.first_name = first;
        this.last_name = last;
        this.address = address;
        this.zip_code = zip;
        this.phone_number = phone;
    }

    public String toString() {
        return "\nFirst Name: " + first_name + "\nLast Name: " + last_name + "\nAddress: " + address + "\nZip Code: "
                + zip_code + "\nPhone Number: " + phone_number;
    }

    public void setFirst(String first_name) {
        this.first_name = first_name;
    }

    public String getFirst() {
        return first_name;
    }

    public void setLast(String last_name) {
        this.last_name = last_name;
    }

    public String getLast() {
        return last_name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return getAddress();
    }

    public void setZip(String zip_code) {
        this.zip_code = zip_code;
    }

    public String getZip() {
        return zip_code;
    }

    public void setPhone(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getPhone() {
        return phone_number;
    }
}