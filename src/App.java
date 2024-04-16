import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        EmployeeManager employeeManager = new EmployeeManager();
        int choice = 0, choice2 = 0;
        int id;
        String fullname;
        int oldId;
        String birthday;
        String phone;
        String email;
        String employee_type;
        int ExplnYear;
        String ProSkill;
        String Graduation_date;
        String Graduation_rank;
        String Education;
        String Major;
        String Semester;
        String University_name;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("=======================MENU=======================");
            System.out.println("1. Add new employee");
            System.out.println("2. Update employee");
            System.out.println("3. Show employees");
            System.out.println("4. Delete employee");
            System.out.println("5. Save session");
            System.out.println("6. Exit");
            System.out.print("> ");
            choice = sc.nextInt();
            if (choice == 6) break;
            switch (choice) {
                case 1:
                    System.out.print("ID: ");
                    id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Fullname: ");
                    fullname = sc.nextLine();
                    System.out.print("Birthday: ");
                    birthday = sc.nextLine();
                    System.out.print("Phone: ");
                    phone = sc.nextLine();
                    System.out.print("Email: ");
                    email = sc.nextLine();
                    System.out.println("Choose employee type: ");
                    System.out.println("1. Experience");
                    System.out.println("2. Fresher");
                    System.out.println("3. Intern");
                    System.out.print("> ");
                    choice2 = sc.nextInt();
                    sc.nextLine();
                    switch (choice2) {
                        case 1:
                            employee_type = "experience";
                            System.out.print("Experience years: ");
                            ExplnYear = sc.nextInt();
                            sc.nextLine();
                            System.out.print("Professional skill: ");
                            ProSkill = sc.nextLine();
                            Employee employee = new Experience(id, fullname, birthday, phone, email, employee_type, ExplnYear, ProSkill);
                            employeeManager.addEmployee(employee);
                            break;
                        case 2:
                            employee_type = "fresher";
                            System.out.print("Graduation date: ");
                            Graduation_date = sc.nextLine();
                            System.out.print("Graduation rank: ");
                            Graduation_rank = sc.nextLine();
                            System.out.print("Education: ");
                            Education = sc.nextLine();
                            Employee employee2 = new Fresher(id, fullname, birthday, phone, email, employee_type, Graduation_date, Graduation_rank, Education);
                            employeeManager.addEmployee(employee2);
                            break;
                        case 3:
                            employee_type = "intern";
                            System.out.print("Major: ");
                            Major = sc.nextLine();
                            System.out.print("Semester: ");
                            Semester = sc.nextLine();
                            System.out.print("University name: ");
                            University_name = sc.nextLine();
                            Employee employee3 = new Intern(id, fullname, birthday, phone, email, employee_type, Major, Semester, University_name);
                            employeeManager.addEmployee(employee3);
                            break;
                    }
                    break;
                case 2:
                    System.out.print("Id: ");
                    id = sc.nextInt();
                    employeeManager.removeEmployee(id);
                    break;
                case 3:
                    employeeManager.showEmployees();
                    break;
                case 4:
                    System.out.print("Old id: ");
                    oldId = sc.nextInt();
                    System.out.print("ID: ");
                    id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Fullname: ");
                    fullname = sc.nextLine();
                    System.out.print("Birthday: ");
                    birthday = sc.nextLine();
                    System.out.print("Phone: ");
                    phone = sc.nextLine();
                    System.out.print("Email: ");
                    email = sc.nextLine();
                    System.out.println("Choose employee type: ");
                    System.out.println("1. Experience");
                    System.out.println("2. Fresher");
                    System.out.println("3. Intern");
                    System.out.print("> ");
                    choice2 = sc.nextInt();
                    sc.nextLine();
                    switch (choice2) {
                        case 1:
                            employee_type = "experience";
                            System.out.print("Experience years: ");
                            ExplnYear = sc.nextInt();
                            sc.nextLine();
                            System.out.print("Professional skill: ");
                            ProSkill = sc.nextLine();
                            Employee employee = new Experience(id, fullname, birthday, phone, email, employee_type, ExplnYear, ProSkill);
                            employeeManager.updateEmployee(oldId, employee);
                            break;
                        case 2:
                            employee_type = "fresher";
                            System.out.print("Graduation date: ");
                            Graduation_date = sc.nextLine();
                            System.out.print("Graduation rank: ");
                            Graduation_rank = sc.nextLine();
                            System.out.print("Education: ");
                            Education = sc.nextLine();
                            Employee employee2 = new Fresher(id, fullname, birthday, phone, email, employee_type, Graduation_date, Graduation_rank, Education);
                            employeeManager.updateEmployee(oldId, employee2);
                            break;
                        case 3:
                            employee_type = "intern";
                            System.out.print("Major: ");
                            Major = sc.nextLine();
                            System.out.print("Semester: ");
                            Semester = sc.nextLine();
                            System.out.print("University name: ");
                            University_name = sc.nextLine();
                            Employee employee3 = new Intern(id, fullname, birthday, phone, email, employee_type, Major, Semester, University_name);
                            employeeManager.updateEmployee(oldId, employee3);
                            break;
                    }
                    break;
                case 5:
                    employeeManager.writeToFile();
                    employeeManager.saveSession();
                    break;
                default:
                    break;
            }
        }
        sc.close();
    }
}
