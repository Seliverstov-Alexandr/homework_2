package task2;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        CreateAnimalServiceImpl service = new CreateAnimalServiceImpl();

        // Вызов метода create10Animals с циклом while
        System.out.println("Creating 10 animals using while:");
        service.create10Animals();

        // Вызов перегруженного метода с циклом for
        System.out.println("\nCreating 5 animals using for:");
        service.createAnimals(5);

        // Вызов переопределенного метода с циклом do-while
        System.out.println("\nCreating 10 animals using do-while:");
        service.create10Animals();
    }
}

