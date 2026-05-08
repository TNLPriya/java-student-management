import java.util.*;

public class MainApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<>();

        int ch;

        do {
            System.out.println("\n--- Student System ---");
            System.out.println("1. Add");
            System.out.println("2. View");
            System.out.println("3. Exit");

            System.out.print("Enter choice: ");
            ch = sc.nextInt();
            sc.nextLine();

            if (ch == 1) {

                System.out.print("Enter id: ");
                int id = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter name: ");
                String name = sc.nextLine();

                System.out.print("Enter age: ");
                int age = sc.nextInt();

                Student s = new Student(id, name, age);
                list.add(s);

                System.out.println("Added");

            } else if (ch == 2) {

                if (list.size() == 0) {
                    System.out.println("No data");
                } else {
                    for (Student s : list) {
                        s.display();
                    }
                }

            } else if (ch != 3) {
                System.out.println("Wrong choice");
            }

        } while (ch != 3);

        System.out.println("End");

        sc.close();
    }
}
