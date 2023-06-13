package S8_N3_E1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Student> students = Arrays.asList(
                new Student("Lara", 25, "PHP", 6.5),
                new Student("Sara", 45, "Java", 2.5),
                new Student("Juana", 55, "PHP", 5.5),
                new Student("Ariel", 43, "Java", 7.5),
                new Student("Roser", 18, "PHP", 6.5),
                new Student("Nicole", 14, "Java", 3.5),
                new Student("Mariona", 35, "PHP", 6.5),
                new Student("Carlota", 65, "Java", 4.5),
                new Student("Alegría", 33, "PHP", 6.5),
                new Student("Laia", 45, "Java", 7.5)
                );

        System.out.println("\n**** Show students ****");
        students.stream()
                .map(student -> "Name: " + student.getName() + ", Age: " + student.getAge())
                .forEach(System.out::println);

        System.out.println("\n**** Show students whose name starts with 'A' ****");
        List<Student> studentsNameStartsA = students.stream()
                .filter(student -> student.getName().toLowerCase().startsWith("a"))
                .collect(Collectors.toList());

        studentsNameStartsA.forEach(System.out::println);

        System.out.println("\n**** Show students whose grades are >= 5 ****");
        students.stream()
                .filter(student -> student.getGrade() >= 5)
                .forEach(System.out::println);

        System.out.println("\n**** Show students whose grades are >= 5 and course is not 'PHP'****");
        students.stream()
                .filter(student -> student.getGrade() >=5 && !(student.getCourse().equalsIgnoreCase("PHP")))
                .forEach(System.out::println);

        System.out.println("\n**** Show students studying 'JAVA' and older than 17****");
        students.stream()
                .filter(student -> student.getCourse().equalsIgnoreCase("Java") && student.getAge() >= 18)
                .forEach(System.out::println);

    }
}
