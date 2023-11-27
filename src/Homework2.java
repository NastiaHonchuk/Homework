public class Homework2 {

    /* Task 1
    -Cоздать массив строк fruits (фрукты) из 4 элементов: Orange,Apple,Banana,Mango.
    -Вывести созданный массив на экран используя цикл for.
    -Заменить в созданном массиве значение первого элемента на Kiwi (т.е. присвоить первому элементу значение Kiwi)
    -Вывести измененный массив на экран используя цикл for.
     Задание можно выполнить непосредственно в методе main, не создавая отдельный метод.
     */
    public static void main(String[] args) {

        String[] fruits = {"Orange", "Apple", "Banana", "Mango"};
        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]);
        }

        System.out.println();

        fruits[fruits.length - 4] = "Kiwi";
        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]);
        }

        System.out.println();

        /* Task 2
            Используя цикл for вывести на экран все четные элементы массива fruits из первой задачи.
            Задание можно выполнить непосредственно в методе main либо создать отдельный метод.
             */


        for (int i = 0; i < fruits.length; i = i + 2) {
            System.out.println(fruits[i]);
        }


    }

    /*
    Дан массив целых чисел. Написать метод, возвращающий наименьший элемент массива.
     */

}

