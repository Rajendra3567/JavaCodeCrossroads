package Miscellanous;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class M2_Java8SqlQueriesQuesEmployee {
    public static void main(String[] args) {

        List<Student> studentList = Stream.of(
                new Student(1, "Rohit", 30, "Male", "Mechanical Engineering", "Mumbai", 122, Arrays.asList("95234959342", "9524938954", "9883425833")),
                new Student(2, "Pulkit", 56, "Male", "Computer Engineering", "Delhi", 67, Arrays.asList("95234959342", "9524938954", "9883425833")),
                new Student(3, "Ankit", 25, "Female", "Mechanical Engineering", "Kerala", 164, Arrays.asList("95234959342", "9524938954", "9883425833")),
                new Student(4, "Satish Rai", 30, "Male", "Mechanical Engineering", "Kerala", 26, Arrays.asList("95234959342", "9524938954", "9883425833")),
                new Student(5, "Roshan", 23, "Male", "Biotech Engineering", "Mumbai", 12, Arrays.asList("95234959342", "9524938954", "9883425833")),
                new Student(6, "Chetan", 24, "Male", "Mechanical Engineering", "Karnataka", 90, Arrays.asList("95234959342", "9524938954", "9883425833")),
                new Student(7, "Arun", 26, "Male", "Electronics Engineering", "Karnataka", 324, Arrays.asList("95234959342", "9524938954", "9883425833")),
                new Student(8, "Nam", 31, "Female", "Computer Engineering", "Karnataka", 433, Arrays.asList("95234959342", "9524938954", "9883425833")),
                new Student(9, "Sonu", 27, "Male", "Computer Engineering", "Karnataka", 7, Arrays.asList("95234959342", "9524938954", "9883425833")),
                new Student(10, "Shubham", 30, "Male", "Instrumentation Engineering", "Mumbai", 98, Arrays.asList("95234959342", "9524938954", "9883425833"))
        ).collect(Collectors.toList());

//        find the list of students whose rank is between 50 to 100
        List<Student> resultList = studentList.stream().filter(stud -> stud.getRank() > 50 && stud.getRank() < 100)
                .collect(Collectors.toList());
        System.out.println(resultList);

//        Find the student who stays in Karnataka and sort them by their names
        List<Student> studentByCity =
                studentList.stream().filter(
                        student -> student.getCity().equals("Karnataka")
                ).sorted(Comparator.comparing(Student::getName, Comparator.reverseOrder())).collect(Collectors.toList());
        System.out.println(studentByCity);

//      find all the departments name
        Set<String> deptList = studentList.stream()
                .map(Student::getName).collect(Collectors.toSet());
        System.out.println("Dept List : " + deptList);

        //  find all the contact numbers
        List<List<String>> contactList = studentList.stream().map(Student::getContacts).collect(Collectors.toList());
        System.out.println(contactList);
        List<String> flattenContactList = studentList.stream().flatMap(student -> student.getContacts().stream()).collect(Collectors.toList());
        System.out.println("Flatten : " + flattenContactList);

//     Group the student by Department Names
        Map<String, List<Student>> groupingList =
                studentList.stream().collect(
                        Collectors.groupingBy(Student::getDept)
                );
        System.out.println(groupingList);

//     Group the student by Department Names
        Map<String, Long> studentMapCount =
                studentList.stream().collect(
                        Collectors.groupingBy(Student::getDept, Collectors.counting())
                );
        System.out.println(studentMapCount);

//      find the maximum count of dept in above grouped student by dept names

        Map.Entry<String, Long> studentMapCountSort = studentList.stream().collect(
                        Collectors.groupingBy(Student::getDept, Collectors.counting()))
                .entrySet().stream().max(Map.Entry.comparingByValue()).get();
        System.out.println(studentMapCountSort);

//     Find the average age of male and female student
        Map<String, Double> avgStudentAge = studentList.stream().collect(
                Collectors.groupingBy(Student::getGender, Collectors.averagingInt(Student::getAge)
                ));
        System.out.println("Average age of Students : " + avgStudentAge);

//        find the highest rank in each department
        Map<String, Optional<Student>> deptRankList = studentList.stream().collect(
                Collectors.groupingBy(Student::getDept, Collectors.minBy(Comparator.comparing(Student::getRank))));
        System.out.println(deptRankList);

//  Find the student who has second rank
    List<Student> secondHighest = studentList.stream()
                                    .sorted(Comparator.comparing(Student::getRank))
                                    .skip(1).findFirst().stream().collect(Collectors.toList());
        System.out.println("Second Highest Rank student : " +secondHighest);
    }
}

