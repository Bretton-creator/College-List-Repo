import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CollegeList {

    public static void AddStudent() {

        final int MAX = 7;
        int count = 0;

        Student[] studentArray = new Student[MAX];
        for (int i = 0; i < MAX; i++) {
            studentArray[i] = new Student();
        }

        JTextField firstField = new JTextField(10);
        JTextField lastField = new JTextField(10);
        JTextField addressField = new JTextField(10);
        JTextField zipField = new JTextField(10);
        JTextField phoneField = new JTextField(10);
        JTextField majorField = new JTextField(10);
        JTextField gpaField = new JTextField(10);

        while (count < MAX) {
            JPanel studentPanel = new JPanel();
            studentPanel.add(new JLabel("First Name:"));
            studentPanel.add(firstField);
            studentPanel.add(new JLabel("Last Name:"));
            studentPanel.add(lastField);
            studentPanel.add(new JLabel("Address"));
            studentPanel.add(addressField);
            studentPanel.add(new JLabel("Zip Code:"));
            studentPanel.add(zipField);
            studentPanel.add(new JLabel("Phone Number:"));
            studentPanel.add(phoneField);
            studentPanel.add(new JLabel("Major:"));
            studentPanel.add(majorField);
            studentPanel.add(new JLabel("GPA:"));
            studentPanel.add(gpaField);

            int result = JOptionPane.showConfirmDialog(null, studentPanel, "Enter data", JOptionPane.OK_CANCEL_OPTION);
            if (result == JOptionPane.OK_OPTION) {
                studentArray[count].setFirst(firstField.getText());
                studentArray[count].setLast(lastField.getText());
                studentArray[count].setAddress(addressField.getText());
                studentArray[count].setZip(zipField.getText());
                studentArray[count].setPhone(phoneField.getText());
                studentArray[count].setMajor(majorField.getText());
                studentArray[count].setGPA(gpaField.getText());

            } else {
                break;
            }
            count += 1;
        }
        for (int i = 0; i < count; i++) {
            JOptionPane.showMessageDialog(null, studentArray[i].toString(), "Added Students",
                    JOptionPane.INFORMATION_MESSAGE);
        }

    }

    public static void AddEmployee() {
        final int MAX = 4;
        int count = 0;

        CollegeEmployee[] employeeArray = new CollegeEmployee[MAX];
        for (int i = 0; i < MAX; i++) {
            employeeArray[i] = new CollegeEmployee();
        }

        JTextField firstField = new JTextField(10);
        JTextField lastField = new JTextField(10);
        JTextField addressField = new JTextField(10);
        JTextField zipField = new JTextField(10);
        JTextField phoneField = new JTextField(10);
        JTextField ssField = new JTextField(10);
        JTextField salaryField = new JTextField(10);
        JTextField departmentField = new JTextField(10);

        while (count < MAX) {
            JPanel employeePanel = new JPanel();
            employeePanel.add(new JLabel("First Name:"));
            employeePanel.add(firstField);
            employeePanel.add(new JLabel("Last Name:"));
            employeePanel.add(lastField);
            employeePanel.add(new JLabel("Address"));
            employeePanel.add(addressField);
            employeePanel.add(new JLabel("Zip Code:"));
            employeePanel.add(zipField);
            employeePanel.add(new JLabel("Phone Number:"));
            employeePanel.add(phoneField);
            employeePanel.add(new JLabel("SS Number:"));
            employeePanel.add(ssField);
            employeePanel.add(new JLabel("Salary:"));
            employeePanel.add(salaryField);
            employeePanel.add(new JLabel("Department:"));
            employeePanel.add(departmentField);

            int result = JOptionPane.showConfirmDialog(null, employeePanel, "Enter data", JOptionPane.OK_CANCEL_OPTION);
            if (result == JOptionPane.OK_OPTION) {
                employeeArray[count].setFirst(firstField.getText());
                employeeArray[count].setLast(lastField.getText());
                employeeArray[count].setAddress(addressField.getText());
                employeeArray[count].setZip(zipField.getText());
                employeeArray[count].setPhone(phoneField.getText());
                employeeArray[count].setSS(ssField.getText());
                employeeArray[count].setSalary(salaryField.getText());
                employeeArray[count].setDepartment(departmentField.getText());

            } else {
                break;
            }
            count += 1;
        }
        for (int i = 0; i < count; i++) {
            JOptionPane.showMessageDialog(null, employeeArray[i].toString(), "Added Employees",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public static void AddFaculty() {
        final int MAX = 3;
        int count = 0;

        Faculty[] facultyArray = new Faculty[MAX];
        for (int i = 0; i < MAX; i++) {
            facultyArray[i] = new Faculty();
        }

        JTextField firstField = new JTextField(10);
        JTextField lastField = new JTextField(10);
        JTextField addressField = new JTextField(10);
        JTextField zipField = new JTextField(10);
        JTextField phoneField = new JTextField(10);
        JTextField ssField = new JTextField(10);
        JTextField salaryField = new JTextField(10);
        JTextField departmentField = new JTextField(10);
        JTextField tenuredField = new JTextField(10);

        while (count < MAX) {
            JPanel facultyPanel = new JPanel();
            facultyPanel.add(new JLabel("First Name:"));
            facultyPanel.add(firstField);
            facultyPanel.add(new JLabel("Last Name:"));
            facultyPanel.add(lastField);
            facultyPanel.add(new JLabel("Address"));
            facultyPanel.add(addressField);
            facultyPanel.add(new JLabel("Zip Code:"));
            facultyPanel.add(zipField);
            facultyPanel.add(new JLabel("Phone Number:"));
            facultyPanel.add(phoneField);
            facultyPanel.add(new JLabel("SS Number:"));
            facultyPanel.add(ssField);
            facultyPanel.add(new JLabel("Salary:"));
            facultyPanel.add(salaryField);
            facultyPanel.add(new JLabel("Department:"));
            facultyPanel.add(departmentField);
            facultyPanel.add(new JLabel("Tenured?"));
            facultyPanel.add(tenuredField);

            int result = JOptionPane.showConfirmDialog(null, facultyPanel, "Enter data", JOptionPane.OK_CANCEL_OPTION);
            if (result == JOptionPane.OK_OPTION) {
                facultyArray[count].setFirst(firstField.getText());
                facultyArray[count].setLast(lastField.getText());
                facultyArray[count].setAddress(addressField.getText());
                facultyArray[count].setZip(zipField.getText());
                facultyArray[count].setPhone(phoneField.getText());
                facultyArray[count].setSS(ssField.getText());
                facultyArray[count].setSalary(salaryField.getText());
                facultyArray[count].setDepartment(departmentField.getText());

            } else {
                break;
            }
            count += 1;
        }
        for (int i = 0; i < count; i++) {
            JOptionPane.showMessageDialog(null, facultyArray[i].toString(), "Added Employees",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public static void main(String[] args) throws Exception {
        Object[] options = { "Student", "Employee", "Faculty" };
        int choice = JOptionPane.showOptionDialog(null, "Select a person to add", "College", JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE, null, options, options);

        switch (choice) {
            case 0:
                AddStudent();
                break;
            case 1:
                AddEmployee();
                break;
            case 2:
                AddFaculty();
                break;
        }
    }
}
