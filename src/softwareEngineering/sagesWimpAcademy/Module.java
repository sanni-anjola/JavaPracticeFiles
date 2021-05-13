package softwareEngineering.sagesWimpAcademy;

public class Module {

    private String name;
    private String courseName;
    private int point;
    private int numberOfAssessment;
    private int numberOfProject;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public int getNumberOfAssessment() {
        return numberOfAssessment;
    }

    public void setNumberOfAssessment(int numberOfAssessment) {
        this.numberOfAssessment = numberOfAssessment;
    }

    public int getNumberOfProject() {
        return numberOfProject;
    }

    public void setNumberOfProject(int numberOfProject) {
        this.numberOfProject = numberOfProject;
    }
}
