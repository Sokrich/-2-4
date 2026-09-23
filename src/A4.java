public class A4 {
    public static void main(String[] args) {
        int[] scores = {78, 91, 65, 88, 73, 95, 54, 82, 69, 91};

        int count = scores.length;
        int sum = 0;
        int max = scores[0];
        int min = scores[0];
        int countAbove80 = 0;

        for (int i = 0; i < scores.length; i++) {
            int score = scores[i];
            sum += score;

            if (score > max) {
                max = score;
            }
            if (score < min) {
                min = score;
            }
            if (score >= 80) {
                countAbove80++;
            }
        }

        double average = (double) sum / count;

        StringBuilder reportBuilder = new StringBuilder();

        reportBuilder.append("ОТЧЁТ ПО ГРУППЕ\n");
        reportBuilder.append("Количество: ").append(count).append("\n");
        reportBuilder.append("Средний балл: ").append(average).append("\n");
        reportBuilder.append("Максимум: ").append(max).append("\n");
        reportBuilder.append("Минимум: ").append(min).append("\n");
        reportBuilder.append("Студенты 80+: ").append(countAbove80);

        String finalReport = reportBuilder.toString();

        System.out.println(finalReport);
    }
}