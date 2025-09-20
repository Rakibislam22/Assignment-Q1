package university;

public class Department {
    protected String departmentName;
    protected int facultyCount;
    protected int studentCount;

    public Department(String departmentName, int facultyCount, int studentCount) {
        this.departmentName = departmentName;
        this.facultyCount = facultyCount;
        this.studentCount = studentCount;
    }

    protected void showDepartmentInfo() {
        System.out.println("Department Name: " + departmentName);
        System.out.println("Number of Faculty Members: " + facultyCount);
        System.out.println("Total Students Enrolled: " + studentCount);
    }
}
