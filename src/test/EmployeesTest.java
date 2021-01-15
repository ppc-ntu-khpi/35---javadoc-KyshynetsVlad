package test;

import domain.*;
/**
 * Main class in test package
 * @author Kyshynets Vlad
 */
public class EmployeesTest {
/**
 * A method that records all information about employees and returns nothing
 * @param args all recorded employee data
 */
    public static void main(String args[]) {

        String[] skills = {"Microsoft Word", "TeX", "OpenOffice", "Markdown"};
        Editor ed = new Editor(true, skills, "Phil Coulson", "Chief Editor", 3, "Publishing");
        Employee em = new Employee("Melinda May", "Assistant", 1, "Publishing");

        Artist art = new Artist(skills);
        Employee[] people = {ed, em, art};
        Manager man = new Manager(people, "Steve Ballmer", "CEO", 3, "Publishing");

        System.out.println(man);

    }
}
