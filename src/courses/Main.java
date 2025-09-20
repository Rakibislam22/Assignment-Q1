package courses;

public class Main {
    public static void main(String[] args) {
        Course course = new Course(
                "Computer Science",
                25,
                500,
                "Advance Programming",
                3,
                120
        );

        course.displayCourseInfo();
    }
}
