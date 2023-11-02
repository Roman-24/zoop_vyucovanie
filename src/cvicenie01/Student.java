package cvicenie01;

import java.util.ArrayList;
import java.util.List;

public class Student {
  int id;
  String firstName;
  String middleName;
  String lastName;
  int birthYear, birthMonth, birthDay;

  boolean isBirthDay() {
    //vráti true ak má narodeniny
    return false;
  }

  int numberOfFriends() {
    //vráti počet priateľov
    return 0;
  }

  void giveWarning() {
    //mal by sa viac snažiť
  }

  // main funkcia celého programu
  public static void main(String[] args) {

    List<Student> listOfStudents = new ArrayList<>();

    // creating student objects in loop
    for (int i = 0; i < 10; i++) {

      Student student = new Student();

      student.id = i;
      student.firstName = "Name" + i;

      // add new student to list of students
      listOfStudents.add(student);
    }

    // print students from list
    for (int i = 0; i < listOfStudents.size(); i++) {
      Student studentToPrint = listOfStudents.get(i);

      studentToPrint.giveWarning();

      System.out.println(studentToPrint.id);
      System.out.println(studentToPrint.firstName);
      // System.out.println(studentToPrint);
      System.out.println("\n");
    }

  }
}
