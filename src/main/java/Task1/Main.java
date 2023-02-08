package Task1;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Task1Student> task1Students = Arrays.asList(
                new Task1Student("MArk", "Art", 3.5, 1234),
                new Task1Student("Kov", "Ser", 5.5, 4567),
                new Task1Student("MArk", "Art", 3.5, 12364),
                new Task1Student("Dova", "Per", 6.5, 44557),
                new Task1Student("Lowk", "Arte", 3.5, 123664),
                new Task1Student("Koval", "Zen", 5.5, 456667),
                new Task1Student("Koval", "Zen", 5.5, 456667),
                new Task1Student("Kozel", "Rof", 10, 45666667),
                new Task1Student("Mor", "Ar", 9, 456667777),
                new Task1Student("Low", "Qer", 9.6, 45677667)
        );
        PrinterStudent printerStudent = new PrinterStudent();
        for (Task1Student task1Student : task1Students) {
            printerStudent.printStudent(task1Student);
        }
        int count = 0;
        for (Task1Student task1Student : task1Students) {
            if (task1Student.getAvg() >= 9) {
                count++;
                printerStudent.printInfo(task1Student);
            }
        }
        System.out.println("Number of the best students " + count);
    }
}
