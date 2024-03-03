package bg.tu_varna.sit;
/*Създайте програма, която да намира трите най-големи четни елементи от предварително
създаден масив, съдържащ 10 реални числа. */
public class Main {

    public static void main(String[] args) {
	// write your code here
        float[] numbers = {2.64f,3.54f,0.71f,2.56f,4.39f,6.18f,3.21f,3.85f,7.09f,4.78f};
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
