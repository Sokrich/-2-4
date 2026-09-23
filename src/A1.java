public class A1 {
    public static void main(String[] args) {
        int[] scores = {78, 91, 65, 88, 73, 95, 54, 82, 69, 91};

        System.out.println("Список баллов студентов:");
        for (int i = 0; i < scores.length; i++) {
            System.out.println("Индекс " + i + ": " + scores[i]);
        }

        int min = scores[0];
        int max = scores[0];
        int sum = 0;
        int countAbove80 = 0;
        int countEven = 0;

        for (int i = 0; i < scores.length; i++) {
            int score = scores[i];

            if (score < min) {
                min = score;
            }

            if (score > max) {
                max = score;
            }

            sum += score;

            if (score >= 80) {
                countAbove80++;
            }

            if (score % 2 == 0) {
                countEven++;
            }
        }

        double average = (double) sum / scores.length;

        System.out.println("Результаты анализа:");
        System.out.println("Минимальный балл: " + min);
        System.out.println("Максимальный балл: " + max);
        System.out.println("Сумма баллов: " + sum);
        System.out.println("Среднее значение: " + average);
        System.out.println("Количество студентов с баллом 80 и выше: " + countAbove80);
        System.out.println("Количество чётных значений: " + countEven);
    }
}