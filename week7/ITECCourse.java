package week7;

import java.util.ArrayList;
import java.util.List;

public class ITECCourse

private String name;
private int code;
private List<String> students;

public ITECCourse(String courseName, int courseCode, int courseMaxStudents) {
    name = courseName;
    code = courseCode;
    maxStudents = courseMaxStudents;
    students = new ArrayList<>();
}

public void addStudent(String studentName) {
    if (students.size() == maxStudents) {
        System.out.println("Course is full, can't add " + studentName);
    } else {
        students.add(studentName) ;
    }
}
}
