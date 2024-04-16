public class Employee implements IEmployee {
    private int id;
    private String fullname;
    private String birthday;
    private String phone;
    private String email;
    private String employee_type;
    public static int employee_count = 0;
    public Employee(int id, String fullname, String birthday, String phone, String email, String employee_type) {
        this.id = id;
        this.fullname = fullname;
        this.birthday = birthday;
        this.phone = phone;
        this.email = email;
        this.employee_type = employee_type;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getFullname() {
        return fullname;
    }
    public void setFullname(String fullname) {
        this.fullname = fullname;
    }
    public String getBirthday() {
        return birthday;
    }
    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmployee_type() {
        return employee_type;
    }
    public void setEmployee_type(String employee_type) {
        this.employee_type = employee_type;
    }
    public String ShowInfo() {
        return "Employee [id=" + id + ", fullname=" + fullname + ", birthday=" + birthday + ", phone=" + phone
                + ", email=" + email + ", employee_type=" + employee_type + "]";
    }
    
}