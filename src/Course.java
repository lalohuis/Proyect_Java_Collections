public class Course{
    private String name;
    private String id;
    private int credits;

    public Course( String name, String id, int credits ){
        this.name = name;
        this.id = id;
        this.credits = credits;
    }//Constructor

    
    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public int getCredits() {
        return credits;
    }
    
    
    @Override
    public String toString() {
        return "Course{" + "name='" + name + '\'' + ", id='" + id + '\'' + ", credits=" + credits + '}';
    }//toString
}// ClassCourse
