public class B1 {
    private String name;
    private String studentId;
    private double gpa;

    public B1(String name, String studentId, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public String getStudentId() {
        return studentId;
    }

    public double getGpa() {
        return gpa;
    }

    public void improveGpa(double delta) {
        if (delta > 0) {
            this.gpa += delta;
        }
    }

    public void printInfo() {
        System.out.println("Студент: " + name + " | ID: " + studentId + " | GPA: " + gpa);
    }

    public static void main(String[] args) {
        B1 student = new B1("Алексей", "S12345", 4.2);

        System.out.println("--- До изменения GPA ---");
        student.printInfo();

        student.improveGpa(0.5);

        System.out.println("--- После улучшения GPA ---");
        student.printInfo();
    }
}