package Task1;

public class PrinterStudent {

    public void printStudent(Task1Student task1Student) {
        System.out.println(task1Student.getFirstName() + " " + task1Student.getSureName());
    }

    public void printInfo(Task1Student task1Student) {
        System.out.println(task1Student.getSureName().subSequence(0, 1) +
                "." + task1Student.getFirstName().subSequence(0, 1) + " grede =" + task1Student.getAvg() + "/ groupID = " +
                task1Student.getGroupID());
    }
}
