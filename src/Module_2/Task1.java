package Module_2;

        /*
        *
        *
            Дан массив [3, 22, 1, 13, 4, 6, 16, 5], состоящий из целых чисел.
            1.Напишите программу, которая выводит (через пробел) те элементы массива, которые являются чётными числами.
            2.Напишите программу, которая выводит все двузначные числа массива.
            3.Напишите программу, которая выводит на экран наибольшее целое число этого массива.
            4.Напишите программу, которая считает сумму элементов массива и выводит её на экран.
            5.***Напишите программу, которая переворачивает массив в обратном порядке.
        *
        *
        *
        *
        *
        * */

public class Task1 {

    static int[] arr = {3, 22, 1, 13, 4, 6, 16, 5};


    public static void singleParityArray() {

        int max = arr[0];
        int acc = 0;
        int[] reverseArr = new int[8];
        StringBuilder result1 = new StringBuilder();
        StringBuilder result2 = new StringBuilder();
        StringBuilder result5 = new StringBuilder();
        StringBuilder originalArr = new StringBuilder();

        for (int el : arr){
            originalArr.append(el);
            originalArr.append(" ");
        }

        System.out.printf("Оригинальный массив: [%s];\n\n", originalArr.toString().trim());

        // 1.Напишите программу, которая выводит (через пробел) те элементы массива, которые являются чётными числами.
        for (int el : arr){
            if (el % 2 == 0){
                result1.append(el);
                result1.append(" ");
            }
        }

        System.out.printf("Четные элементы массива: %s;\n", result1.toString().trim());

        // 2.Напишите программу, которая выводит все двузначные числа массива.
        for (int el : arr){
            if (el >= 10 && el <= 99){
                result2.append(el);
                result2.append(" ");
            }
        }

        System.out.printf("Двузначные элементы массива: %s;\n", result2.toString().trim());

        // 3.Напишите программу, которая выводит на экран наибольшее целое число этого массива.
        for (int el : arr){
            if (el > max){
                max = el;
            }
        }

        System.out.printf("Наибольшее число массива: %d;\n", max);

        //4.Напишите программу, которая считает сумму элементов массива и выводит её на экран.
        for (int el : arr){
            acc +=el;
        }

        System.out.printf("Сумма всех элементов массива: %d;\n", acc);

        //5.***Напишите программу, которая переворачивает массив в обратном порядке.
        for (int i = arr.length - 1; i >= 0;i--){
            int reverseIdx = arr.length - i - 1;
            reverseArr[reverseIdx] = arr[i];
        }

        for (int el : reverseArr){
            result5.append(el);
            result5.append(" ");
        }

        System.out.printf("Перевернутый массив: [%s];\n", result5.toString().trim());
    }
}
