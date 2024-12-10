package task2;

import java.util.List;
import java.util.ArrayList;
public interface CreateAnimalService {
    default List<AbstractAnimal> create10Animals() {
        List<AbstractAnimal> animals = new ArrayList<>();
        int count = 0;
        while (count < 10) {
            animals.add(createRandomAnimal());
            System.out.println("Created: " + animals.get(count).getName());
            count++;
        }
        return animals;
    }

    AbstractAnimal createRandomAnimal(); // Метод для создания случайного животного
}

