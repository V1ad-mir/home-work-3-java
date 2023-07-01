import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

//1. Пусть дан произвольный список целых чисел, удалить из него четные числа
public class task1_3 {
    public static void main(String[] args) {
        ArrayList<Integer> integerList = new ArrayList<>(numberList());
        System.out.println(integerList);
        System.out.println(removeNumber(integerList));
    }

    static List numberList() {
        List list = new ArrayList();
        for (int i = 0; i < 10; i++) {
            list.add(ThreadLocalRandom.current().nextInt(0, 10));

        }
        return (list);
    }

    static ArrayList<Integer> removeNumber(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                list.remove(i);
                i--;
            }
        }
        return (list);
    }


}
