import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

//3. Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями.
//        Вывести название каждой планеты и количество его повторений в списке.
//        Collections.frequency(list, 2)
public class test3_3 {
    public static void main(String[] args) {
        String[] planet = new String[]{"Меркурий", "Венера", "Земля", "Марс", "Юпитер",
                "Сатурн", "Уран", "Нептун", "Плутон"};
        calculationRepeat(planet);

    }

    static List generationPlanet(String[] planet) {
        List<String> planetList = new ArrayList<String>();
        for (int i = 0; i < 25; i++) {
            planetList.add(planet[ThreadLocalRandom.current().nextInt(0, planet.length)]);


        }
        return (planetList);
    }

    static void calculationRepeat(String[] planet) {
        Collection<String> collection = generationPlanet(planet);
        System.out.println(collection);
        for (int i = 0; i < planet.length; i++) {
            System.out.print(planet[i] + ": ");
            System.out.println(Collections.frequency(collection, planet[i]));
        }
    }
}
