public class Student {
    int studentId;
    String studentName;
    double cgpa;
    String department; // Added the new field

    // Updated constructor
    public Student(int id, String name, double gpa, String dept) {
        this.studentId = id;
        this.studentName = name;
        this.cgpa = gpa;
        this.department = dept;
    }

    // Updated display method
    public void displayStudentInfo() {
        System.out.println("-------------------------");
        System.out.println("Student ID: " + studentId);
        System.out.println("Name: " + studentName);
        System.out.println("CGPA: " + cgpa);
        System.out.println("Department: " + department); 
        System.out.println("-------------------------");
    }

    public static void main(String[] args) {
        // Testing the updated program
        Student s1 = new Student(1, "Faisal Wahid", 3.8, "Software Engineering");
        Student s2 = new Student(2, "Muhammad Zain", 3.7, "Software Engineering");
        
        s1.displayStudentInfo();
        s2.displayStudentInfo();
    }
}