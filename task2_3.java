import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

//2. Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое из этого списка.
//        Collections.max()
public class task2_3 {
    public static void main(String[] args) {
        ArrayList<Integer> integerList = new ArrayList<>(numberList());
        System.out.println(integerList);
        System.out.println("Максимальное число: "+ Collections.min(integerList));
        System.out.println("Минимальное число: "+ Collections.max(integerList));
        System.out.println("Среднее арифметическое: "+ average(integerList));
    }
    static List numberList() {
        List list = new ArrayList();
        for (int i = 0; i < 9; i++) {
            list.add(ThreadLocalRandom.current().nextInt(1, 10));

        }
        return (list);
    }

    static double average(ArrayList<Integer> listForSum){
        double sum = 0;
        for (int i = 0; i < listForSum.size(); i++) {
            sum+= listForSum.get(i);
        }
        sum=sum/listForSum.size();
        return (sum);
    }

}
