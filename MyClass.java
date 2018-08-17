/* Java level 1. HomeWork 2


@autor Kraynov Oleg
@version 17.08.2018
 */
public class MyClass {
    public static void main(String[] args) {

        task1();
        task2();
        task3();
        task4();
        task5();
    }

    static void task1() {
        //1. Задать целочисленный массив, состоящий из элементов 0 и 1.
        // Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
        // С помощью цикла и условия заменить 0 на 1, 1 на 0;
        System.out.println("Task1");
        int arr[] = {0,1,0,1,1,0,0,1,0,1};
        printArray(arr);
        for(int i=0;i<arr.length;i++) {
            arr[i] = 1 - arr[i];
        }
        printArray(arr);
    }

    static void task2() {
        //2. Задать пустой целочисленный массив размером 8.
        // С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
        System.out.println("Task2");
        int arr[] = new int[8];
        for(int i=0;i<arr.length;i++) {
            arr[i] = i*3;
        }
        printArray(arr);
    }

    static void task3() {
        //3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом,
        // и числа меньшие 6 умножить на 2;
        System.out.println("Task3");
        int arr[] = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for(int i=0;i<arr.length;i++) {
            if (arr[i]<6) {
                arr[i] *= 2;
            }
        }
        printArray(arr);
    }

    static void task4() {
        //4. Создать квадратный двумерный целочисленный массив
        // (количество строк и столбцов одинаковое), и с помощью цикла(-ов)
        // заполнить его диагональные элементы единицами;
        System.out.println("Task4");
        int arr[][] = new int[10][10];
        for (int i=0;i<arr.length;i++) {
            for (int j=0;j<arr[i].length;j++) {
                if ((i==j) || (i==arr[i].length-1-j)) {
                    arr[i][j] = 1;
                }
            }
        }
        printArray(arr);
    }

    static void task5() {
        //5. ** Задать одномерный массив и найти в нем
        // минимальный и максимальный элементы (без помощи интернета);
        System.out.println("Task5");
        int arr[] = {58,74,8,44,6,88,32,46,52,7,83,62,5,24,11,27,55,522,52,47,869,92,45};
        int min = arr[0];
        int max = arr[0];
        for (int val : arr) {
            if (min > val) {
                min = val;
            }
            if (max < val) {
                max = val;
            }
        }
        System.out.println("Max: "+max+"  Min: "+min);
    }
