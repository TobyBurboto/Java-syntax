package bg.tu_varna.sit;
/*Създайте програма, която да намира трите най-големи четни елементи от предварително
създаден масив, съдържащ 10 реални числа. */
public class Main {

    public static void main(String[] args) {
	// write your code here
        float[] numbers = {1.23f, 2.45f, 4.67f, 3.89f, 6.01f, 9.34f, 8.56f, 5.78f, 7.90f, 10.12f};
        float[] biggestEven = { 0f, 0f, 0f };
        int maxEven = 0;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 1; j < (numbers.length - i); j++) {
                if (numbers[j - 1] < numbers[j]) {
                    float temp = numbers[j - 1];
                    numbers[j - 1] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            if  (isEven(numbers[i]) == true) {
                biggestEven[maxEven] = numbers[i];
                maxEven++;
                if (maxEven == 3) {
                    break;
                }
            }
        }

        for (int i = 0; i < maxEven; i++) {
            System.out.println(biggestEven[i] + " ");
        }
    }

    public static boolean isEven(float a) {
        int multiplier = 100;
        int intValue = (int) (a * multiplier);
        return intValue % 2 == 0;
    }

}
