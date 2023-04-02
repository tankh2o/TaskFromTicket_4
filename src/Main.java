import java.lang.reflect.Array;
import java.util.Arrays;

import java.util.Arrays;
import java.util.Collections;

public class Main {
    /*Дан массив строк:
    а) необходимо удалить из него все дубли;
    б) оставшиеся строки объединить в одну в порядке следования в массиве.*/
    public static void main(String[] args) {
        //tusk1();
        //tusk2();
        String[] strings = {"заяц", "волк", "заяц", "волк", "волк", "крот", "заяц", "дрофа"};
        removeDuplicates5(strings);
        System.out.println(strings);

    }
    /*public static void tusk1() {
        String[] strings = {"заяц", "волк", "волк", "заяц", "заяц", "волк", "крот"};
        int deleteDouble;
        deleteDouble = removeDuplicates3(strings);
        System.out.println(strings + " ");
    }
    public static String[] removeDuplicates1(String[] strings) {
        Arrays.sort(strings);
        int deleteDouble = 0;
        for (int i = 0; i < strings.length; i++) {
            if (i == 0 || strings[i] != strings[i++]) {
                strings[deleteDouble++] = strings[i+1];
                System.out.println(strings[deleteDouble++]);
            }
        }
        return Arrays.copyOf(strings, deleteDouble);
    }
    public static String[] removeDuplicates2(String[] strings) {
        int deleteDouble = 0;
        for (int i = 0; i < strings.length - 1; i++) {
            if (strings[i] != strings[i + 1]) {
                strings[deleteDouble++] = strings[i];
                //strings[deleteDouble++] = strings[strings.length - i];
                System.out.println(Arrays.toString(strings));
            }
        }
        return strings;
    }
    public static String[] removeDuplicates3(String[] strings) {
        int deleteDouble = 0;
        for (int i = 0; i < strings.length; i++) {
            if (strings[i] != strings[i+1]) {
                strings[deleteDouble++] = strings[i-1];
            }
        }
        return deleteDouble;
    }*/
    //Дан массив строк, необходимо
    // a) удалить из него все дубли,
    // б) оставшиеся строки объединить в одну в порядке следования в массиве.
    public static void tusk2() {
       /* String[] strings = {"заяц", "волк", "заяц", "волк", "волк", "крот", "заяц", "дрофа"};
        int deleteDouble;
        deleteDouble = removeDuplicates(strings);
        for (int i = 0; i < strings.length; i++)
            System.out.println("2 попыт " + strings[i] + " ");*/
        String[] strings = {"заяц", "волк", "заяц", "волк", "волк", "крот", "заяц", "дрофа"};
        int deleteDouble;
        //deleteDouble = removeDuplicates5(strings);
        for (int i = 0; i < strings.length; i++)
            System.out.println("2 попыт " + strings[i] + " ");
    }
    public static int removeDuplicates4(String[] strings) {
        //создан метод для нахождения дублей в строке с параметрами из метода main
        //if (arrayLength == 0 || arrayLength == 1) { return arrayLength; }
        int deletedDouble = 0;
        //объявили переменную
        for (int i = 0; i < strings.length; i++) {
            //создали цикл, который должен останавливаться со значением i на единицу ниже
            // последнего индекса
            if (strings[i] != strings[i++]) {
                System.out.println("результат после 1 ЕСЛИ = " + strings[i]);
                //далее условный оператор "говорит" ява, что если ячейка strings[0] будет
                // не равна ячейке strings[0+1], то strings[0+1] станет strings[1]
                strings[deletedDouble++] = strings[i];

                //return deletedDouble;
            }
        }
        strings[deletedDouble++] = strings[strings.length - 1];
        //далее ячейка с увеличивающейся переменной deletedDouble,
        // которая идя по длине массива будет равна ячейке массива,
        // останавливающейся на 1 меньше
        System.out.println("результат 2 = " + strings[deletedDouble]);
        return deletedDouble;


        //повторить данный метод, пока все дубли не будут убраны
    }
    public static StringBuilder removeDuplicates5(String[] strings) {
        for (int i = 0; i < strings.length; i++) {
            for (int k = 1; k < strings.length; k++) {
                if (strings[i].equals(strings[k]) && i != k) {
                    strings[k] = null;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (String s: strings) {
         sb.append(s);
        }
        return sb;
    }
    /*public static int removeDuplicates6(String[] strings) {
        for (int i = 0; i < strings.length; i++) {
            for (int k = i + 1; k < strings.length; k++) {
                if (strings[i] != strings[k]) continue;

            }
        }
        return;
    }*/
}

