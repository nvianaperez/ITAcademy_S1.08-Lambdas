package S8_N3_E1;

public class Student {
    private String name;
    private int age;
    private String course;
    private double grade;

    public Student(String name, int age, String course, double grade) {
        this.name = name;
        this.age = age;
        this.course = course;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", course='" + course + '\'' +
                ", grade=" + grade +
                '}';
    }
}
