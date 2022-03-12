package designPattern.creational.factorymethod.entity;

public class AccessibilityBugEntity {

    private int id;
    private String bugName;
    private String bugDetails;
    private boolean isPushed;

    private static int ID;

    public AccessibilityBugEntity() {
        setId();
    }

    public int getId() {
        return id;
    }

    private void setId() {
        synchronized(AccessibilityBugEntity.class) {
            this.id = ID;
            ID = ID + 1;
        }
    }

    public String getBugName() {
        return bugName;
    }

    public void setBugName(String bugName) {
        this.bugName = bugName;
    }

    public String getBugDetails() {
        return bugDetails;
    }

    public void setBugDetails(String bugDetails) {
        this.bugDetails = bugDetails;
    }

    public boolean isPushed() {
        return isPushed;
    }

    public void setPushed(boolean pushed) {
        isPushed = pushed;
    }
}
