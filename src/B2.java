public class B2 {
    private String title;
    private String code;
    private int credits;

    private static int courseCount = 0;

    public B2(String title, String code, int credits) {
        this.title = title;
        this.code = code;
        this.credits = credits;
        courseCount++;
    }

    // Геттеры
    public String getTitle() {
        return title;
    }

    public String getCode() {
        return code;
    }

    public int getCredits() {
        return credits;
    }

    public static int getCourseCount() {
        return courseCount;
    }

    public void printInfo() {
        System.out.println("Курс: " + title + " | Код: " + code + " | Кредиты: " + credits);
    }

    public static void main(String[] args) {
        // Создаем объекты курсов
        B2 course1 = new B2("Программирование 1", "OOP101", 5);
        B2 course2 = new B2("Программирование 2", "ASD202", 5);

        course1.printInfo();
        course2.printInfo();

        System.out.println("Всего создано курсов: " + B2.getCourseCount());
    }
}