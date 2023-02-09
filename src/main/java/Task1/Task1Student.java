package Task1;

public class Task1Student {
    private String sureName;
    private String firstName;
    private double avg;
    private int groupID;

    public Task1Student(String sureName, String firstName, double avg, int groupID) {
        this.sureName = sureName;
        this.firstName = firstName;
        this.avg = avg;
        this.groupID = groupID;
    }

    public String getSureName() {
        return sureName;
    }

    public void setSureName(String sureName) {
        this.sureName = sureName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public double getAvg() {
        return avg;
    }

    public void setAvg(double avg) {
        this.avg = avg;
    }

    public int getGroupID() {
        return groupID;
    }

    public void setGroupID(int groupID) {
        this.groupID = groupID;
    }
}
