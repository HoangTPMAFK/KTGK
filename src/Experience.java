public class Experience extends Employee  {
    private Employee employee;
    private int ExplnYear;
    private String ProSkill;
    public Experience(int id, String fullname, String birthday, String phone, String email, String employee_type, int ExplnYear, String ProSkill) {
        super(id, fullname, birthday, phone, email, employee_type);
        this.employee = new Employee(id, fullname, birthday, phone, email, employee_type);
        this.ExplnYear = ExplnYear;
        this.ProSkill = ProSkill;
        Employee.employee_count++;
    }
    public int getExplnYear() {
        return ExplnYear;
    }
    public void setExplnYear(int explnYear) {
        ExplnYear = explnYear;
    }
    public String getProSkill() {
        return ProSkill;
    }
    public void setProSkill(String proSkill) {
        ProSkill = proSkill;
    }
    public String ShowInfo() {
        return "Experience [employee=" + employee.ShowInfo() + ", ExplnYear=" + ExplnYear + ", ProSkill=" + ProSkill + "]";
    }
    
    
}
