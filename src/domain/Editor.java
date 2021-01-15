package domain;
/**
 * Class extends from the class {@link Class Artist}
 * @author Kyshynets Vlad
 */
public class Editor extends Artist {
/**
 * rites information about an editor
 * @param electronicEditing boolean parameter to check if the editor has this skill
 * @param skiils which the editor has
 * @param name of editor
 * @param jobTitle which the editor took
 * @param level which the editor has
 * @param dept in which the editor works
 */
    public Editor(boolean electronicEditing, String[] skiils, String name, String jobTitle, int level, String dept) {
        super(skiils, name, jobTitle, level, dept);
        this.electronicEditing = electronicEditing;
    }
/**
 * Records the skill level of the editor and check if the editor has skill in electronic editing
 * @param electronicEditing boolean parameter to check if the editor has this skill
 * @param skiils which the editor has
 */
    public Editor(boolean electronicEditing, String[] skiils) {
        super(skiils);
        this.electronicEditing = electronicEditing;
    }
/**
 * Boolean parameter to check if the editor has electronic editing skills
 * @param electronicEditing skill which editor either has or not
 */
    public Editor(boolean electronicEditing) {
        super();
        this.electronicEditing = electronicEditing;
    }
    /**
     * Boolean parameter to check if the editor has electronic editing skills
     * In standard condition true
     */
    public Editor() {
        super();
        this.electronicEditing = true;
    }
/**
 * Method for getting electronic editing skills in editor 
 * @return s
 */
    @Override
    public String toString() {
        String s=super.toString()+"\nEditing preferences= "; 
        if (electronicEditing)
            s=s+"electronic";
        else
            s=s+"paper";
        return s;
            
    }
    
    private boolean electronicEditing;
/**
 * The method performs a logical
 * @return electronicEditing
 */
    public boolean getPreferences() {
        return electronicEditing;
    }
/**
 * The method performs a logical check of the editor's ability in electronic editing
 * @param electronic assigned to the editor
 */
    public void setPreferences(boolean electronic) {
        this.electronicEditing=electronic;
    }
}
