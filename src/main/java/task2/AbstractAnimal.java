package task2;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;
public abstract class AbstractAnimal implements Animal {
    protected String breed;      // Порода
    protected String name;       // Имя
    protected Double cost;       // Цена в магазине
    protected String character;  // Характер
    protected LocalDate birthDate; // День рождения
    // Конструктор для установки полей
    public AbstractAnimal(String breed, String name, Double cost, String character, LocalDate birthDate) {
        this.breed = breed;
        this.name = name;
        this.cost = cost;
        this.character = character;
        this.birthDate = birthDate;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        AbstractAnimal that = (AbstractAnimal) obj;
        return Objects.equals(breed, that.breed) &&
                Objects.equals(name, that.name) &&
                Objects.equals(cost, that.cost) &&
                Objects.equals(character, that.character) &&
                Objects.equals(birthDate, that.birthDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(breed, name, cost, character, birthDate);
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return "Имя: " + name + ", Порода: " + breed + ", Цена: " + cost +
                ", Характер: " + character + ", Дата рождения: " + birthDate.format(formatter);
    }
}

