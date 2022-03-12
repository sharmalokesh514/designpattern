package designPattern.facotry_method.model;

public class BugzilaIssueModel implements IssueModel {

    private String issue;
    private String description;

    public String getIssue() {
        return issue;
    }

    public void setIssue(String issue) {
        this.issue = issue;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
