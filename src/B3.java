public class B3 {
    private B1 student;
    private B2 course;
    private Double grade;

    public B3(B1 student, B2 course) {
        this.student = student;
        this.course = course;
        this.grade = null;
    }

    public void assignGrade(double grade) {
        if (grade >= 0 && grade <= 100) {
            this.grade = grade;
        } else {
            throw new IllegalArgumentException("Ошибка: Оценка должна быть в диапазоне от 0 до 100! Передано: " + grade);
        }
    }

    public void printSummary() {
        String gradeInfo = (grade != null) ? String.valueOf(grade) : "Не выставлена";
        System.out.println("Студент: " + student.getName() + " | Курс: " + course.getTitle() + " | Оценка: " + gradeInfo);
    }

    public static void main(String[] args) {
        B1 student = new B1("Касым", "S12345", 4.3);
        B2 course = new B2("Программирование 2", "OOP101", 5);

        B3 enrollment = new B3(student, course);

        System.out.println("Тест корректной оценки:");
        enrollment.assignGrade(95);
        enrollment.printSummary();

        System.out.println("Тест некорректной оценки:");
        try {
            enrollment.assignGrade(120);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}