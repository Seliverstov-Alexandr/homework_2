package task2;
import java.time.LocalDate;
public class Pet extends AbstractAnimal {
    public Pet(String breed, String name, Double cost, String character, LocalDate birthDate) {
        super(breed, name, cost, character, birthDate);
    }

    @Override
    public String getBreed() {
        return "";
    }

    @Override
    public String getName() {
        return "";
    }

    @Override
    public Double getCost() {
        return 0.0;
    }

    @Override
    public String getCharacter() {
        return "";
    }
}

