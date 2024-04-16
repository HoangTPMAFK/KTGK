public class Intern extends Employee {
    private Employee employee;
    private String Major;
    private String Semester;
    private String University_name;
    public Intern(int id, String fullname, String birthday, String phone, String email, String employee_type, String major, String semester, String university_name) {
        super(id, fullname, birthday, phone, email, employee_type);
        this.employee = new Employee(id, fullname, birthday, phone, email, employee_type);
        Major = major;
        Semester = semester;
        University_name = university_name;
        Employee.employee_count++;
    }
    public Employee getEmployee() {
        return employee;
    }
    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
    public String getMajor() {
        return Major;
    }
    public void setMajor(String major) {
        Major = major;
    }
    public String getSemester() {
        return Semester;
    }
    public void setSemester(String semester) {
        Semester = semester;
    }
    public String getUniversity_name() {
        return University_name;
    }
    public void setUniversity_name(String university_name) {
        University_name = university_name;
    }
    public String ShowInfo() {
        return "Intern [employee=" + employee.ShowInfo() + ", Major=" + Major + ", Semester=" + Semester + ", University_name="
                + University_name + "]";
    }
    
}
