package courses;
import university.Department;

public class Course extends Department {
    String courseTitle;
    int creditHours;
    int enrolledStudents;

    public Course(String departmentName, int facultyCount, int studentCount,
                  String courseTitle, int creditHours, int enrolledStudents) {
        super(departmentName, facultyCount, studentCount);
        this.courseTitle = courseTitle;
        this.creditHours = creditHours;
        this.enrolledStudents = enrolledStudents;
    }

    public void displayCourseInfo() {

        showDepartmentInfo();

        System.out.println("\n--- Course Information ---");
        System.out.println("Course Title: " + courseTitle);
        System.out.println("Credit Hours: " + creditHours);
        System.out.println("Enrolled Students in Course: " + enrolledStudents);

        if (facultyCount > 0) {
            double ratio = (double) studentCount / facultyCount;
            System.out.printf("Student-to-Faculty Ratio: "+ratio+" students per faculty\n");
        } else {
            System.out.println("Faculty count is zero, cannot calculate ratio.");
        }
    }
}
