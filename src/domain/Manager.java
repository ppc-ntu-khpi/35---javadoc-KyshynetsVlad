package domain;
/**
 * Class extends from the main class {@link Class Employee}
 * @author Kyshynets Vlad
 */
public class Manager extends Employee {
/**
 * Writes information about an manager
 * @param employees Array of employees as part of managers
 * @param name manager
 * @param jobTitle which the manager took
 * @param level which the manager has
 * @param dept in which the manager works
 */
    public Manager(Employee[] employees, String name, String jobTitle, int level, String dept) {
        super(name, jobTitle, level, dept);
        this.employees = employees;
    }
/**
 * This method makes it possible to record data about employees as part of managers
 * @return data about employees as part of managers
 */
    @Override
    public String toString() {
        return super.toString()+"\nEmployees: "+getEmployees(); 
    }
/**
 * Method for setting employees
 * @param employees is data about employees
 */
    public Manager(Employee[] employees) {
        super();
        this.employees = employees;
    }
/**
 * Array for the Manager object
 */
    public Manager() {
        super();
        employees = new Employee[10];
    }

    private Employee[] employees;
/**
 * Method for getting list of employees
 * @return s
 */
    public String getEmployees() {
        String s = "";
        for (Employee e : employees) {
            s = s + e.getName() + ", ";
        }
        s=s.substring(0, s.length() - 2);
        return s;
    }
/**
 * Method for setting list of employees
 * @param employees one position in employee's list
 */
    public void setEmployees(Employee[] employees) {
        this.employees=employees;
    }
/**
 * Method for getting employees list
 * @return employees
 */
    public Employee[] getEmployeesList() {
        return employees;
    }

    
}
