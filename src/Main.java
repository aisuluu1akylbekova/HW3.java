public class Main {

    public static void main(String[] args) {

        double[] numbers = {
                4.5, 2.3, -1.2, -3.4, 5.6, 7.8, -6.1,
                2.4, 3.3, -2.5, 1.1, 0.5, -0.8, 4.9, 3.3
        };


        boolean foundNegative = false;
        double sum = 0;
        int count = 0;

        for (double num : numbers) {
            if (num < 0) {
                foundNegative = true;
            } else if (foundNegative) {
                sum += num;
                count++;
            }
        }


        if (count > 0) {
            double average = sum / count;
            System.out.println("Среднее арифметическое положительных чисел после первого отрицательного: " + average);
        } else {
            System.out.println("После первого отрицательного числа нет положительных чисел.");
        }
    }
}
