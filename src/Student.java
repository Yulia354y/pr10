import java.util.Scanner;

public class Student {
    private String name;
    private int course;
    private String specialty;
    private Marks marks;

    public Student() {
        this.name = "";
        this.course = 0;
        this.specialty = "";
        this.marks = new Marks();
    }

    public boolean setMarks(int examGrade, int testGrade, int assignmentGrade) {
        if (assignmentGrade == 2) {
            System.out.println("Студента не допущено через низьку оцінку за курсову роботу.");
            return false;
        } else {
            this.marks = new Marks(examGrade, testGrade, assignmentGrade);
            return true;
        }
}

    public void inputStudentInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть ім'я студента:");
        this.name = scanner.nextLine();
        System.out.println("Введіть курс студента:");
        this.course = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Введіть спеціальність студента:");
        this.specialty = scanner.nextLine();
    }

    public void displayStudentInfo() {
        System.out.println("Ім'я студента: " + this.name);
        System.out.println("Курс: " + this.course);
        System.out.println("Спеціальність: " + this.specialty);
        this.marks.displayMarks();

        double averageGrade = this.marks.calculateAverageGrade();
        if (averageGrade < 3) {
            System.out.println("Студента не допущено через низьку середню оцінку.");
        }
    }
}
