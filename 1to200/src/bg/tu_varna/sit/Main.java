package bg.tu_varna.sit;

//Напишете програма, която намира частното от: (1) сумата на всички четни числа в диапазона [1;200] и
//(2) сумата от всички числа, кратни на 7, намиращи се в същия диапазон.

public class Main {

    public static void main(String[] args) {
	// write your code here
        int sum = 0;
        int sum2 = 0;

        for(int i = 1; i <= 200; i++){
            if(i % 2 == 0) {
                sum += i;
            }
        }
        for(int i = 1; i <= 200; i++){
            if(i % 7 == 0) {
                sum2 += i;
            }
        }
        System.out.println("Сумата на всички четни числа в диапазона [1;200]= "+ sum + "\n" + "Сумата от всички числа, кратни на 7 в диапазона [1;200] = " + sum2);
    }
}
