package softwareEngineering.sagesWimpAcademy;

public class Course {
    private String name;
    private String title;
    private double length;
    private String content;
    private int numberOfProject;
    private int numberOfAssessment;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getNumberOfProject() {
        return numberOfProject;
    }

    public void setNumberOfProject(int numberOfProject) {
        this.numberOfProject = numberOfProject;
    }

    public int getNumberOfAssessment() {
        return numberOfAssessment;
    }

    public void setNumberOfAssessment(int numberOfAssessment) {
        this.numberOfAssessment = numberOfAssessment;
    }

    public boolean findModule(){
        return false;
    }

    public boolean findAssessment(){
        return false;
    }

    public boolean assignAssessment(){
        return false;
    }

    public boolean findProject(){
        return false;
    }

    public boolean assignProject(){
        return false;
    }
}
