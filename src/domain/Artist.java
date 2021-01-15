package domain;
/**
 * Class extends from the main class {@link Class Employee}
 * @author Kyshynets Vlad
 */
public class Artist extends Employee {
/**
 * Writes information about an artist
 * @param skiils which the artist has
 * @param name of artist
 * @param jobTitle which the artist took
 * @param level which the artist has
 * @param dept in which the artist works
 */
    public Artist(String[] skiils, String name, String jobTitle, int level, String dept) {
        super(name, jobTitle, level, dept);
        this.skiils = skiils;
    }
/**
 * Records the skill level of the artist
 * @param skiils which the artist has
 */
    public Artist(String[] skiils) {
        super();
        this.skiils = skiils;
    }
    
    public Artist() {
        super();
        this.skiils = new String[10];
    }
/**
 * This method makes it possible to record data about the artist's skills and issue them
 * @return the recorded value of the artist's skill
 */
    @Override
    public String toString() {
        return super.toString()+"\nSkills: "+getSkills();
    }

    private String[] skiils;
    /**
     * Method for getting skills 
     * @return array(type: string) of skills
     */
    public String getSkills() {
        String s = "";
        for (String e : skiils) {
            s = s + e + ", ";
        }
       s=s.substring(0, s.length() - 2);
        return s;
    }
/**
 * Method for setting skills
 * @param skills data about skills artist
 */
    public void setSkills(String[] skills) {
        this.skiils=skills;
    }
/**
 * The method of getting artist skills
 * @return artist skills
 */
    public String[] getSkillsLSist() {
        return skiils;
    }
}
