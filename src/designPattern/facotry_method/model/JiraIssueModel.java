package designPattern.facotry_method.model;

public class JiraIssueModel implements IssueModel {

    private String bug;
    private String description;

    public String getBug() {
        return bug;
    }

    public void setBug(String bug) {
        this.bug = bug;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
