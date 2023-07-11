import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        double[] numbers = {8, -2, -4, 2, 3, 6, -7};
        double sum = 0;
        int count = 0;
        boolean foundNegative = false;


        for (double number : numbers) {
            if (!foundNegative) { // ищем первое отрицательное число
                if (number < 0) {
                    foundNegative = true;
                }
            } else { // считаем среднее арифметическое положительных чисел
                if (number > 0) {
                    sum += number;
                    count++;
                }
            }
        }

        double average = sum / count;
        System.out.println("Среднее арифметическое положительных чисел после первого отрицательного: " + average);


        System.out.println("дз на сообразительность");



        for (double number : numbers) {
            if (foundNegative) {
                if (number > 0) {
                    sum += number;
                    count++;
                }
            } else {
                if (number < 0) {
                    foundNegative = true;
                }
            }
        }
        System.out.println("Среднее арифметическое положительных чисел после первого отрицательного: " + average);

        // Сортировка массива по возрастанию
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] < numbers[i]) {
                    double temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }

            // Вывод текущего состояния массива
            System.out.print("Итерация " + (i + 1) + ": ");
            for (double number : numbers) {
                System.out.print(number + " ");
            }
            System.out.println();

        }
    }
}
