public class Main {
    public static void main(String[] args) {
        // Создаем три объекта Product с различными скидками
        Product product1 = new Product(10, 50.0, 0.75);       // 0.75%
        Product product2 = new Product(5, 100.0, 42.575);     // 42.575%
        Product product3 = new Product(20, 30.0, 59.1);       // 59.1%

        // Вызываем метод calculateAndPrint для каждого объекта
        System.out.println("Рассчет для product1:");
        ProductCalculator.calculateAndPrint(product1);

        System.out.println("\nРассчет для product2:");
        ProductCalculator.calculateAndPrint(product2);

        System.out.println("\nРассчет для product3:");
        ProductCalculator.calculateAndPrint(product3);
    }
}
