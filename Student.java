public class Student {
    int studentId;
    String studentName;
    double cgpa;

    // Constructor to initialize the student
    public Student(int id, String name, double gpa) {
        this.studentId = id;
        this.studentName = name;
        this.cgpa = gpa;
    }

    // Method to display the information
    public void displayStudentInfo() {
        System.out.println("-------------------------");
        System.out.println("Student ID: " + studentId);
        System.out.println("Name: " + studentName);
        System.out.println("CGPA: " + cgpa);
        System.out.println("-------------------------");
    }

    public static void main(String[] args) {
        // Testing the initial program
        Student s1 = new Student(1, "Faisal Wahid", 3.8);
        Student s2 = new Student(2, "Muhammad Zain", 3.7);
        
        s1.displayStudentInfo();
        s2.displayStudentInfo();
    }
}