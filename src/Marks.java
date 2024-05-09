import java.util.Scanner;

public class Marks {
    private int examGrade;
    private int testGrade;
    private int assignmentGrade;

    public Marks() {
        this.examGrade = 0;
        this.testGrade = 0;
        this.assignmentGrade = 0;
    }

    public Marks(int examGrade, int testGrade, int assignmentGrade) {
        this.examGrade = examGrade;
        this.testGrade = testGrade;
        this.assignmentGrade = assignmentGrade;
    }

    public void inputMarks() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть оцінку за екзамен:");
        this.examGrade = scanner.nextInt();
        System.out.println("Введіть оцінку за тести:");
        this.testGrade = scanner.nextInt();
        System.out.println("Введіть оцінку за курсову роботу:");
        this.assignmentGrade = scanner.nextInt();
        scanner.close();
    }

    public double calculateAverageGrade() {
        if (this.assignmentGrade == 2) {
            System.out.println("Низька оцінку за курсову роботу");
            return 2;
        } else {
            return (this.examGrade + this.testGrade + this.assignmentGrade) / 3.0;
        }
    }

    public void displayMarks() {
        System.out.println("Оцінка за екзамен: " + this.examGrade);
        System.out.println("Оцінка за тести: " + this.testGrade);
        System.out.println("Оцінка за курсову роботу: " + this.assignmentGrade);
        double averageGrade = calculateAverageGrade();
        if (averageGrade < 3) {
            System.out.println("Старайтесь краще. Вас скоро виженуть!");
        } else if (averageGrade > 3 && averageGrade < 4) {
            System.out.println("Старайтесь краще");
        } else if (averageGrade >= 4 && averageGrade <= 5) {
            System.out.println("Ви молодець!");
        } else {
            System.out.println("Невідомий статус оцінки.");
        }
    }
}
