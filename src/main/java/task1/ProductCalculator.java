import java.math.BigDecimal;
import java.math.RoundingMode;

public class ProductCalculator {
    /**
     * Метод для подсчета и вывода стоимости покупки.
     *
     * параметр product Объект класса Product
     */
    public static void calculateAndPrint(Product product) {
        // Общая сумма без скидки
        double totalWithoutDiscount = product.getQuantity() * product.getPrice();

        // Общая сумма со скидкой
        double totalWithDiscount = totalWithoutDiscount * (1 - product.getDiscount() / 100);

        // Округляем значения до 2 знаков после запятой
        totalWithoutDiscount = round(totalWithoutDiscount, 2);
        totalWithDiscount = round(totalWithDiscount, 2);

        // Вывод результата
        System.out.println("Общая сумма без скидки: " + totalWithoutDiscount);
        System.out.println("Общая сумма со скидкой: " + totalWithDiscount);
    }

    /**
     * Утилитарный метод для округления значений до указанного количества знаков после запятой.
     *
     * параметр value Значение для округления
     * параметр places Количество знаков после запятой
     * параметр Округленное значение
     */
    private static double round(double value, int places) {
        BigDecimal bd = BigDecimal.valueOf(value);
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
}
