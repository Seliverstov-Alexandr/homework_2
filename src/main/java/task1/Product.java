/**
 * Класс Product описывает товар, содержащий количество, цену и скидку.
 * Позволяет рассчитывать общую стоимость покупки без учета скидки
 * и со скидкой.
 */
public class Product {
    private int quantity;      // Количество товаров
    private double price;      // Цена за единицу товара
    private double discount;   // Скидка на товар в процентах (0–100)

    /**
     * Конструктор класса Product.
     * параметр quantity Количество товаров (должно быть больше 0)
     * параметр price Цена товара за единицу (должна быть больше 0)
     * параметр discount Скидка на товар в процентах (0–100)
     */
    public Product(int quantity, double price, double discount) {
        if (quantity <= 0 || price <= 0 || discount < 0 || discount > 100) {
            throw new IllegalArgumentException("Недопустимые значения параметров.");
        }
        this.quantity = quantity;
        this.price = price;
        this.discount = discount;
    }

    // Геттеры для доступа к полям
    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public double getDiscount() {
        return discount;
    }
}

