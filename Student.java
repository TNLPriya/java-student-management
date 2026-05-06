public class Student {

    int id;
    String name;
    int age;

    public Student(int i, String n, int a) {
        id = i;
        name = n;
        age = a;
    }

    public void display() {
        System.out.println(id + " " + name + " " + age);
    }
}
