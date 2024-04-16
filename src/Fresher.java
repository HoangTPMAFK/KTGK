public class Fresher extends Employee {
    private Employee employee;
    private String Graduation_date;
    private String Graduation_rank;
    private String Education;
    public Fresher(int id, String fullname, String birthday, String phone, String email, String employee_type, String Graduation_date, String Graduation_rank, String Education) {
        super(id, fullname, birthday, phone, email, employee_type);
        this.employee = new Employee(id, fullname, birthday, phone, email, employee_type);
        this.Graduation_date = Graduation_date;
        this.Graduation_rank = Graduation_rank;
        this.Education = Education;
        Employee.employee_count++;
    }
    public Employee getEmployee() {
        return employee;
    }
    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
    public String getGraduation_date() {
        return Graduation_date;
    }
    public void setGraduation_date(String graduation_date) {
        Graduation_date = graduation_date;
    }
    public String getGraduation_rank() {
        return Graduation_rank;
    }
    public void setGraduation_rank(String graduation_rank) {
        Graduation_rank = graduation_rank;
    }
    public String getEducation() {
        return Education;
    }
    public void setEducation(String education) {
        Education = education;
    }
    public String ShowInfo() {
        return "Fresher [employee=" + employee.ShowInfo() + ", Graduation_date=" + Graduation_date + ", Graduation_rank="
                + Graduation_rank + ", Education=" + Education + "]";
    }
    
}
