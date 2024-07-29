/*package main.java.com.example.virtualclassroom.entities;

import main.java.com.example.virtualclassroom.exceptions.StudentNotFoundException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Classroom {
    private final String name;
    private final Map<String, Student> students;
    private final List<Assignment> assignments;

    public Classroom(String name) {
        this.name = name;
        this.students = new HashMap<>();
        this.assignments = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addStudent(Student student) {
        students.put(student.getId(), student);
    }

    public boolean hasStudent(String studentId) {
        return students.containsKey(studentId);
    }

    public Student getStudent(String studentId) throws StudentNotFoundException {
        Student student = students.get(studentId);
        if (student == null) {
            throw new StudentNotFoundException("Student not found: " + studentId);
        }
        return student;
    }

    public void addAssignment(Assignment assignment) {
        assignments.add(assignment);
    }

    public Assignment getAssignment(String details) {
        for (Assignment assignment : assignments) {
            if (assignment.getDetails().equals(details)) {
                return assignment;
            }
        }
        return null;
    }
}
*/

package main.java.com.example.virtualclassroom.entities;

import main.java.com.example.virtualclassroom.exceptions.StudentNotFoundException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Classroom {
    private final String name;
    private final Map<String, Student> students;
    private final List<Assignment> assignments;

    public Classroom(String name) {
        this.name = name;
        this.students = new HashMap<>();
        this.assignments = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addStudent(Student student) {
        students.put(student.getId(), student);
    }

    public boolean hasStudent(String studentId) {
        return students.containsKey(studentId);
    }

    public Student getStudent(String studentId) throws StudentNotFoundException {
        Student student = students.get(studentId);
        if (student == null) {
            throw new StudentNotFoundException("Student not found: " + studentId);
        }
        return student;
    }
    /*public void listStudents() {
        if (students.isEmpty()) {
            System.out.println("No students in this classroom.");
        } else {
            students.forEach((id, student) -> System.out.println(id + ": " + student.getName()));
        }
    }
        */

        public void listAllStudents() {
            if (students.isEmpty()) {
                System.out.println("No students enrolled.");
                return;
            }
            System.out.println("List of Students in " + name + ":");
            for (Student student : students.values()) {
                System.out.println(student);
            }
        }
        public void listStudents() {
            if (students.isEmpty()) {
                System.out.println("No students enrolled in " + name + ".");
                return;
            }
            System.out.println("List of Students in " + name + ":");
            for (String studentId : students.keySet()) {
                System.out.println(studentId);
            }
        }
    public void addAssignment(Assignment assignment) {
        assignments.add(assignment);
    }

    public Assignment getAssignment(String details) {
        for (Assignment assignment : assignments) {
            if (assignment.getDetails().equals(details)) {
                return assignment;
            }
        }
        return null;
    }
    
}
