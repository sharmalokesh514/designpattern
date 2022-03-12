package designPattern.abstractFacotry2.httpreq.bugModel;

public class BugzilaModel {

    private String bugName;
    private String Description;
    private String bugType;

    public String getBugName() {
        return bugName;
    }

    public void setBugName(String bugName) {
        this.bugName = bugName;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getBugType() {
        return bugType;
    }

    public void setBugType(String bugType) {
        this.bugType = bugType;
    }

}
