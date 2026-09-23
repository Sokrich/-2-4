public class A2 {
    public static void main(String[] args) {
        int[][] grades = {
                {78, 91, 88},
                {65, 72, 70},
                {90, 94, 89},
                {81, 76, 85}
        };

        System.out.println("Таблица оценок студентов (по дисциплинам):");
        System.out.println("Студент | Предмет 1 | Предмет 2 | Предмет 3");
        System.out.println("---------------------------------------");
        for (int i = 0; i < grades.length; i++) {
            System.out.print("Студент " + (i + 1) + " | ");
            for (int j = 0; j < grades[i].length; j++) {
                System.out.print(grades[i][j] + "       | ");
            }
            System.out.println();
        }
        System.out.println("---------------------------------------");

        int maxElement = grades[0][0];
        int maxRow = 0;
        int maxCol = 0;

        double highestAvgStudent = -1.0;
        int bestStudentIndex = -1;

        System.out.println("\nСредний балл каждого студента:");
        for (int i = 0; i < grades.length; i++) {
            int studentSum = 0;
            for (int j = 0; j < grades[i].length; j++) {
                studentSum += grades[i][j];

                if (grades[i][j] > maxElement) {
                    maxElement = grades[i][j];
                    maxRow = i;
                    maxCol = j;
                }
            }
            double studentAvg = (double) studentSum / grades[i].length;
            System.out.println("Студент " + (i + 1) + ": " + studentAvg);

            if (studentAvg > highestAvgStudent) {
                highestAvgStudent = studentAvg;
                bestStudentIndex = i;
            }
        }

        System.out.println("\nСредний балл по каждому предмету:");
        int rows = grades.length;
        int cols = grades[0].length;

        for (int j = 0; j < cols; j++) {
            int subjectSum = 0;
            for (int i = 0; i < rows; i++) {
                subjectSum += grades[i][j];
            }
            double subjectAvg = (double) subjectSum / rows;
            System.out.println("Предмет " + (j + 1) + ": " + subjectAvg);
        }

        System.out.println("\nМаксимальный элемент таблицы: " + maxElement);
        System.out.println("Его позиция: индекс строки = " + maxRow + ", индекс столбца = " + maxCol +
                " (Студент " + (maxRow + 1) + ", Предмет " + (maxCol + 1) + ")");

        System.out.println("\nСамый высокий средний балл у Студента " + (bestStudentIndex + 1) +
                " со значением: " + highestAvgStudent);
    }
}