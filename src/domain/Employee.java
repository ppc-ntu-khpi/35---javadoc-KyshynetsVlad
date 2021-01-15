package domain;
/**
 * Main class that represent a employee type
 * @author Vlad Kyshynets
 */
public class Employee {
/**
 * This method makes it possible to record information about an employee
 * @return parameters followed by information about the employee
 */
    @Override
    public String toString() {
        return "\nEmployee ID= " + ID + "\nName= " + name + "\nJobTitle= " + jobTitle + "\nLevel= " + level + "\nDept= " + dept;
    }

    private String name;
    private String jobTitle;
    private int ID;
    private int level;
    private String dept;

   // private static int employeesCount = 0;
/**
 * Writes information about an employee
 * @param name of employee
 * @param jobTitle of employee
 * @param level of empployee
 * @param dept in which the employee works
 */
    public Employee(String name, String jobTitle, int level, String dept) {
        this();
        setName(name);
        this.jobTitle = jobTitle;
        switch (level) {
            case 1:
            case 2:
            case 3:
                this.level = level;
                break;
            default:
                this.level = 1;
        }
        this.dept = dept;
    }
/**
 * The parameter responsible for recording the employee ID
 */
    public Employee() {
        ID = (int)(Math.random()*1000);
//        if (ID > 10000) {
//            throw new NumberFormatException("ERROR! Employee's ID cannot be greater than 10000. Employee is not created!");
//        }
    }
/**
 * Method that writes the type of work and does not return any data
 * @param job type name
 */
    public void setJobTitle(String job) {
        jobTitle = job;
    }

    /**
     * The method that gives the position to the employee
     * @return job title of employee
     */
    public String getJobTitle() {
        return jobTitle;
    }
    /**
     * The method that gives the name to the employee
     * @return name of employee
     */
    public String getName() {
        return name;
    }
/**
 * The constructor sets the employee level
 * @param level which is issued to an employee upon receipt of a position
 */
    public void setLevel(int level) {
        switch (level) {
            case 1:
            case 2:
            case 3:
                this.level = level;
                break;
            default:
                this.level = 1;
        }
    }
/**
 * The method that gives the level to the employee
 * @return level of employee
 */
    public int getLevel() {
        return level;
    }
    /**
     * The method that gives title dept to the employee
     * @return title dept to the employee
     */
    public String getDept() {
        return dept;
    }
/**
 * The method sets the dept to the employee depending on his position
 * @param dept issued to an employee
 */
    public void setDept(String dept) {
        this.dept = dept;
    }
/**
 * The method sets the employee's name and checks for valid characters when writing the name
 * @param name of the employee
 */
    public void setName(String name) {
//        boolean correctName = true;
//        for (int i = 0; i < name.length(); i++) {
//            char s = name.charAt(i);
//            if (Character.isDigit(s)) {
//                correctName = false;
//            }
//        }
//        if (correctName) {
//            this.name = name;
//        } else {
//            this.name = "John Doe";
//        }
        if (name.matches("^([a-zA-Z]+[\\'\\,\\.\\-]?[a-zA-Z ]*)+[ ]([a-zA-Z]+[\\'\\,\\.\\-]?[a-zA-Z ]+)+$")) {
            this.name = name;
        } else {
            this.name = "John Doe";
        }
    }
}
