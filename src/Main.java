public class Main {
    public static void main(String[] args) {
        String product = "Coffee";
        int quantity = 3;
        double price = 1250.0;
        double discountPercent = 10.0;
        double a = quantity * price;
        double b = a * (discountPercent / 100);
        double c = a - b;
        System.out.println("Товар: " + product);
        System.out.println("Количество: " + quantity);
        System.out.println("Стоимость без скидки: " + a);
        System.out.println("Сумма скидки: " + b);
        System.out.println("Итоговая стоимость: " + c);
    }
}