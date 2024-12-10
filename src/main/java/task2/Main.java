package task2;

import java.util.List;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        CreateAnimalServiceImpl createService = new CreateAnimalServiceImpl();
        SearchService searchService = new SearchServiceImpl();

        // Создание массива животных
        AbstractAnimal[] animals = createService.createAnimals();

        // Вывод всех животных
        System.out.println("Spisok vseh jivotnih:");
        for (AbstractAnimal animal : animals) {
            System.out.println(animal);
        }

        // Поиск животных, родившихся в високосный год
        List<String> leapYearAnimals = searchService.findLeapYearNames(animals);
        System.out.println("\nJivotnie, rojdennie v visokos:");
        System.out.println(leapYearAnimals);

        // Поиск животных старше 5 лет
        List<AbstractAnimal> olderAnimals = searchService.findOlderAnimal(animals, 5);
        System.out.println("\nJivotnie starshe 5 let:");
        olderAnimals.forEach(System.out::println);

        // Поиск дубликатов
        System.out.println("\nDublikati jivotnih");
        searchService.findDuplicate(animals);
    }
}

