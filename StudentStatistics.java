
/**
 * Total Marks.
 *
 * @author Sweta Acharya
 * @version 10/01/2023
 */
import java.io.*;
import java.util.*;

class Student {

    double a3Mark;
    double totalMark;

    public Student(String lastName, String firstName, String studentID, double ass1Mark, double ass2Mark, double ass3Mark) {
    public Student(String lastName, String firstName, 
    String studentID, double ass1Mark, double ass2Mark, double ass3Mark) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.studentID = studentID;
        this.ass1Mark = ass1Mark;
        this.ass2Mark = ass2Mark;
        this.ass3Mark = ass3Mark;

        calculateTotalMark();

    }


}
    private void calculateTotalMark() {
        totalMark = ass1Mark + ass2Mark + ass3Mark;
    }

}
public class StudentStatistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
@@ -72,6 +76,23 @@ private static Student[] readStudentDataFromFile(String fileName) {
            e.printStackTrace();
            return null;
        }

    }

    private static void calculateTotalMarksAndPrint(Student[] students) {
        System.out.println("List of Students with Assessment Marks and Total Marks:");
        for (Student student : students) {
            if (student != null) { // Check if the student is not null
                double totalMark = student.ass1Mark + student.ass2Mark + student.ass3Mark;
                System.out.println("Name: " + student.firstName + " " + student.lastName +
                    ", Student ID: " + student.studentID +
                    ", ASS1 Mark: " + student.ass1Mark +
                    ", ASS2 Mark: " + student.ass2Mark +
                    ", ASS3 Mark: " + student.ass3Mark +
                    ", Total Mark: " + totalMark);
            }
        }
    }


}

