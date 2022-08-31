package task2;


/** можно было бы просто двумя циклами for пробежаться и сравнивать
 * if( array[i] < array[J]) без всяких лишних bool переменных, но два цикла for без bool
 * переменной - это всегда гарантированные n*n итераций по массиву, даже если на
 * вход подан уже отсортированный массив - это худший вариант в смысле
 * производительности, который может произойти с этим алгоритмом, но работать все же будет.

 */

public class Task2 {

    public static void main(String[] params) {
        int[] array = new int[] {5, 6, 3, 2, 5, 1, 4, 9};
        bubbleSort(array);
        System.out.println(arrayToString(array));
    }

    public static void bubbleSort(int[] array) {
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < array.length; i++) {
                if (array[i - 1] > array[i]) {
                    int tmp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = tmp;
                    isSorted = false;
                }
            }
        }
    }

    private static String arrayToString(int[] array) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < array.length; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(array[i]);
        }
        sb.append("]");
        return sb.toString();
    }
}

/** Я хотела сделать поиск дубликатов перебором (хашсеты), но к сожалению пока не получается.
 *  В оставшееся время постараюсь разобраться и почитать подробнее об этом. Если не против, дополню решение, если
 *  приду к решению.

 **/