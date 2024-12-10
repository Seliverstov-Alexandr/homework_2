package task2;

import java.util.List;

/**
 * Интерфейс для поиска животных.
 */
public interface SearchService {
    /**
     * Найти животных, рожденных в високосный год.
     */
    List<String> findLeapYearNames(AbstractAnimal[] animals);

    /**
     * Найти животных старше определенного возраста.
     */
    List<AbstractAnimal> findOlderAnimal(AbstractAnimal[] animals, int years);

    /**
     * Найти и вывести дубликаты животных.
     */
    void findDuplicate(AbstractAnimal[] animals);
}
