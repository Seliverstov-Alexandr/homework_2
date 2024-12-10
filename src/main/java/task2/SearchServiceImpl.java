package task2;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class SearchServiceImpl implements SearchService {

    @Override
    public List<String> findLeapYearNames(AbstractAnimal[] animals) {
        List<String> names = new ArrayList<>();
        for (AbstractAnimal animal : animals) {
            if (animal.birthDate.isLeapYear()) {
                names.add(animal.name);
            }
        }
        return names;
    }

    @Override
    public List<AbstractAnimal> findOlderAnimal(AbstractAnimal[] animals, int years) {
        List<AbstractAnimal> result = new ArrayList<>();
        LocalDate currentDate = LocalDate.now();
        for (AbstractAnimal animal : animals) {
            if (currentDate.minusYears(years).isAfter(animal.birthDate)) {
                result.add(animal);
            }
        }
        return result;
    }

    @Override
    public void findDuplicate(AbstractAnimal[] animals) {
        for (int i = 0; i < animals.length; i++) {
            for (int j = i + 1; j < animals.length; j++) {
                if (animals[i].equals(animals[j])) {
                    System.out.println("Дубликат: " + animals[i]);
                }
            }
        }
    }
}

