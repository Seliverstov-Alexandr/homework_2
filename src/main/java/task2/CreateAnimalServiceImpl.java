package task2;
import java.util.ArrayList;
import java.util.List;

public class CreateAnimalServiceImpl {
    public AbstractAnimal[] createAnimals() {
        List<AbstractAnimal> animals = new ArrayList<>();
        animals.add(new Wolf("Волк", "Серый", 1000.0, "Дикий", CreateAnimalService.generateRandomDate()));
        animals.add(new Dog("Собака", "Бобик", 500.0, "Добрый", CreateAnimalService.generateRandomDate()));
        animals.add(new Cat("Кошка", "Мурка", 300.0, "Ласковая", CreateAnimalService.generateRandomDate()));
        animals.add(new Shark("Акула", "Гроза", 5000.0, "Опасная", CreateAnimalService.generateRandomDate()));
        return animals.toArray(new AbstractAnimal[0]);
    }
}
