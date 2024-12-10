package task2;
import java.time.LocalDate;
import java.util.concurrent.ThreadLocalRandom;

public class CreateAnimalService {
    public static LocalDate generateRandomDate() {
        long start = LocalDate.of(2000, 1, 1).toEpochDay();
        long end = LocalDate.of(2023, 12, 31).toEpochDay();
        long randomEpochDay = ThreadLocalRandom.current().nextLong(start, end);
        return LocalDate.ofEpochDay(randomEpochDay);
    }
}
