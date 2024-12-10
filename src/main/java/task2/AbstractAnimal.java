package task2;

public abstract class AbstractAnimal implements Animal {
    protected String breed;      // Порода
    protected String name;       // Имя
    protected Double cost;       // Цена в магазине
    protected String character;  // Характер

    // Конструктор для установки полей
    public AbstractAnimal(String breed, String name, Double cost, String character) {
        this.breed = breed;
        this.name = name;
        this.cost = cost;
        this.character = character;
    }

    @Override
    public String getBreed() {
        return breed;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Double getCost() {
        return cost;
    }

    @Override
    public String getCharacter() {
        return character;
    }
}
