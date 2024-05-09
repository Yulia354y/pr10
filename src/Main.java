import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Lesson mondayLesson1 = new Lesson("Понеділок", 1, "Математичний аналіз", "Лекція");
        Lesson mondayLesson2 = new Lesson("Понеділок", 2, "Основи програмування", "Лекція");
        Lesson mondayLesson3 = new Lesson("Понеділок", 3, "Фізика", "Лекція");
        Lesson tuesdayLesson1 = new Lesson("Вівторок", 1, "Укр мова та культура", "Лекція");
        Lesson tuesdayLesson2 = new Lesson("Вівторок", 2, "Чисельні методи", "Практичне заняття");
        Lesson tuesdayLesson3 = new Lesson("Вівторок", 3, "Веб розробка", "Практичне заняття");
        Lesson tuesdayLesson4 = new Lesson("Вівторок", 4, "Веб розробка", "Практичне заняття");
        Lesson wednesdayLesson1 = new Lesson("Середа", 2, "Дискретна математика", "Лекція");
        Lesson wednesdayLesson2 = new Lesson("Середа", 3, "Основи програмування", "Лекція");
        Lesson wednesdayLesson3 = new Lesson("Середа", 4, "Фізика", "Лекція");

        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        do {
            System.out.println("Виберіть опцію:");
            System.out.println("1. Переглянути розклад");
            System.out.println("2. Розрахувати середню оцінку");
            System.out.println("3. Ввести інформацію про студента");
            System.out.println("4. Вибрати вибіркову дисципліну");
            System.out.println("5. Вийти");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Виберіть день тижня:");
                    System.out.println("1. Понеділок");
                    System.out.println("2. Вівторок");
                    System.out.println("3. Середа");
                    int dayChoice = scanner.nextInt();
                    scanner.nextLine();

                    switch (dayChoice) {
                        case 1:
                            mondayLesson1.displayLessonInfo();
                            mondayLesson2.displayLessonInfo();
                            mondayLesson3.displayLessonInfo();
                            break;
                        case 2:
                            tuesdayLesson1.displayLessonInfo();
                            tuesdayLesson2.displayLessonInfo();
                            tuesdayLesson3.displayLessonInfo();
                            tuesdayLesson4.displayLessonInfo();
                            break;
                        case 3:
                            wednesdayLesson1.displayLessonInfo();
                            wednesdayLesson2.displayLessonInfo();
                            wednesdayLesson3.displayLessonInfo();
                            break;
                        default:
                            System.out.println("Невірний вибір!");
                    }
                    break;
                case 2:
                    Marks marks = new Marks();
                    marks.inputMarks();
                    marks.displayMarks();
                    break;
                case 3:
                    Student student = new Student();
                    student.inputStudentInfo();

                    System.out.println("Введіть оцінку за іспит:");
                    int examGrade = scanner.nextInt();
                    System.out.println("Введіть оцінку за тест:");
                    int testGrade = scanner.nextInt();
                    System.out.println("Введіть оцінку за курсову роботу:");
                    int assignmentGrade = scanner.nextInt();

                    student.setMarks(examGrade, testGrade, assignmentGrade);
                    scanner.nextLine();

                    student.displayStudentInfo();
                    break;
                case 4:
                    // Вибрати вибіркову дисципліну
                    System.out.println("Оберіть вибіркову дисципліну:");
                    System.out.println("1. Волонтерська діяльність");
                    System.out.println("2. Риторика");
                    System.out.println("3. Критичне мислення");
                    System.out.println("4. Англійська мова");
                    int disciplineChoice = scanner.nextInt();
                    scanner.nextLine();


                    Elective elective = new Elective();

                    switch (disciplineChoice) {
                        case 1:
                            elective.selectVolunteering();
                            break;
                        case 2:
                            elective.selectRhetoric();
                            break;
                        case 3:
                            elective.selectCriticalThinking();
                            break;
                        case 4:
                            elective.selectEnglishLanguage();
                            break;
                        default:
                            System.out.println("Неправильний вибір дисципліни.");
                    }
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("Неправильний вибір опції.");
            }
        } while (!exit);

        scanner.close();
    }
}

