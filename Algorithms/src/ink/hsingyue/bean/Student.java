package ink.hsingyue.bean;

public class Student implements Comparable<Student> {
    private String name;
    private double score;

    public Student() {
    }

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }


    @Override
    public int compareTo(Student o) {
        int t = new Double(this.score).compareTo(new Double(o.score));
        return t == 0 ? this.name.compareTo(o.name) : t;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}
