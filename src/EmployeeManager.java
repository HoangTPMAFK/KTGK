import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class EmployeeManager {
    private List<Employee> employeeList;
    private File newFile;
    private File oldFile;

    public EmployeeManager() {
        this.employeeList = new ArrayList<>();
        newFile = new File(Paths.get("").toAbsolutePath() + "\\data_temp.txt");
        oldFile = new File(Paths.get("").toAbsolutePath() + "\\data.txt");
    }
    
    public void addEmployee(Employee newEmployee) {
        employeeList.add(newEmployee);
    }
    public void removeEmployee(int id) {
        for (Employee item : employeeList) {
            if (item.getId() == id) {
                employeeList.remove(item);
                break;
            }
        }
    }
    public void updateEmployee(int id, Employee employee) {
        for (Employee item : employeeList) {
            if (item.getId() == id) {
                item = employee;
                break;
            }
        }
    }
    public void showEmployees() {
        for (Employee item : employeeList) {
            System.out.println(item.ShowInfo());
        }
    }
    public void writeToFile() {
        try {
            FileWriter fileWriter = new FileWriter(newFile);
            for (Employee item : employeeList) {
                fileWriter.write(item.ShowInfo() + "\n");
                System.out.println(item.ShowInfo());
            }
            fileWriter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void saveSession() {
        if (newFile.exists()) {
            oldFile.delete();
            Path newFile 
                = Paths.get(Paths.get("").toAbsolutePath() + "\\data_temp.txt"); 
    
            try { 
                Files.move(newFile, newFile.resolveSibling( 
                                        Paths.get("").toAbsolutePath() + "\\data.txt"));
            } 
            catch (IOException e) { 
                e.printStackTrace();
            } 
        }
    }
}
