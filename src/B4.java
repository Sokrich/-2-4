public class B4 {
    public static void main(String[] args) {
        System.out.println("СОЗДАНИЕ СТУДЕНТОВ:");
        B1 student1 = new B1("Тазабай Касым", "S001", 4.2);
        B1 student2 = new B1("Конилкос Жусып", "S002", 4.8);
        student1.printInfo();
        student2.printInfo();

        System.out.println("СОЗДАНИЕ КУРСОВ");
        B2 course1 = new B2("Программирование 2", "OOP101", 5);
        B2 course2 = new B2("Алгоритмы и структуры данных", "ASD202", 4);
        course1.printInfo();
        course2.printInfo();

        System.out.println("СОЗДАНИЕ ЗАЧИСЛЕНИЙ (ENROLLMENT) И НАЗНАЧЕНИЕ ОЦЕНОК");
        B3 enrollment1 = new B3(student1, course1);
        B3 enrollment2 = new B3(student2, course1);
        B3 enrollment3 = new B3(student1, course2);

        enrollment1.assignGrade(90.0);
        enrollment2.assignGrade(95.5);
        enrollment3.assignGrade(78.0);

        enrollment1.printSummary();
        enrollment2.printSummary();
        enrollment3.printSummary();

        System.out.println("СТАТИСТИКА КУРСОВ:");
        System.out.println("Общее количество созданных курсов: " + B2.getCourseCount());

        System.out.println("ПРОВЕРКА НЕКОРРЕКТНОЙ ОЦЕНКИ");
        try {
            System.out.println("Попытка установить оценку 120 для студента Касым");
            enrollment1.assignGrade(120);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка успешно перехвачена: " + e.getMessage());
        }
    }
}