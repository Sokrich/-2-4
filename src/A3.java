public class A3 {
    public static void main(String[] args) {
        String text = " Java, Python, java, C++, Kotlin, JAVA, Python ";

        String trimmedText = text.trim();

        String[] words = trimmedText.split(",");

        System.out.println("Список слов, их длина и очистка:");
        int javaCount = 0;
        int longWordsCount = 0;

        StringBuilder longWordsBuilder = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            String word = words[i].trim();

            System.out.println("Слово: \"" + word + "\" | Длина: " + word.length());

            if (word.equalsIgnoreCase("Java")) {
                javaCount++;
            }

            if (word.length() > 4) {
                longWordsCount++;
            }

            if (word.length() >= 5) {
                if (longWordsBuilder.length() > 0) {
                    longWordsBuilder.append(", ");
                }
                longWordsBuilder.append(word);
            }
        }

        System.out.println("Результаты анализа текста:");
        System.out.println("Количество вхождений слова 'Java' (без учета регистра): " + javaCount);
        System.out.println("Количество слов длиной более 4 символов: " + longWordsCount);

        String resultString = longWordsBuilder.toString();
        System.out.println("Слова длиной 5 и более символов: " + resultString);
    }
}