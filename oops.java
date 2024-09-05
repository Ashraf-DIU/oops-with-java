class Pen{
    String color;
    String type; //ballpoint,gel
    public void write(){
        System.out.println("\nWritting Something");
    }
    public void printColor() {
        System.out.println(this.color);
    }
    public void print_type() {
        System.out.println(this.type);
    }
}

class Student{
    String name;
    int age;
    public void printInfo(){
        System.out.println("Student Name : "+this.name);
        System.out.println("Age = "+this.age);
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class oops {
    public static void main(String[] args) {
        // Pen pen1 = new Pen();
        // pen1.color = "blue Pen";
        // pen1.type = "gel";
        // pen1.write();
        // pen1.printColor();
        // pen1.print_type();
        
        // Pen pen2 = new Pen();
        // pen2.color = "black Pen";
        // pen2.type = "ball point";
        // pen2.write();
        // pen2.printColor();
        // pen2.print_type();

        Student s1 = new Student("Ashraf", 21);
        s1.printInfo();
    }
}