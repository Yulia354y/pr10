public class Lesson {
    private String dayOfWeek;
    private int lessonNumber;
    private String subject;
    private String lessonType;

    public Lesson(String dayOfWeek, int lessonNumber, String subject, String lessonType) {
        this.dayOfWeek = dayOfWeek;
        this.lessonNumber = lessonNumber;
        this.subject = subject;
        this.lessonType = lessonType;
    }

    public void displayLessonInfo() {
        System.out.println(dayOfWeek + ", Пара " + lessonNumber + ": " + subject + " (" + lessonType + ")");
    }
}
