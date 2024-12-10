package task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CreateAnimalServiceImpl implements CreateAnimalService {

    @Override
    public AbstractAnimal createRandomAnimal() {
        Random random = new Random();
        int type = random.nextInt(4);

        return switch (type) {
            case 0 -> new Wolf();
            case 1 -> new Shark();
            case 2 -> new Dog();
            default -> new Cat();
        };
    }

    // Перегруженный метод для создания N животных
    public List<AbstractAnimal> createAnimals(int n) {
        List<AbstractAnimal> animals = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            animals.add(createRandomAnimal());
            System.out.println("Created: " + animals.get(i).getName());
        }
        return animals;
    }

    // Переопределенный метод с использованием do-while
    @Override
    public List<AbstractAnimal> create10Animals() {
        List<AbstractAnimal> animals = new ArrayList<>();
        int count = 0;
        do {
            animals.add(createRandomAnimal());
            System.out.println("Created: " + animals.get(count).getName());
            count++;
        } while (count < 10);
        return animals;
    }
}
