package Task1;

public class Task1Student {
    private String sureName;
    private String lastName;
    private double avg;
    private int groupID;

    public Task1Student(String sureName, String lastName, double avg, int groupID) {
        this.sureName = sureName;
        this.lastName = lastName;
        this.avg = avg;
        this.groupID = groupID;
    }

    public String getSureName() {
        return sureName;
    }

    public void setSureName(String sureName) {
        this.sureName = sureName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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
