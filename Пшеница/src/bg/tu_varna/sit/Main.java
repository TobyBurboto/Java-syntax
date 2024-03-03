package bg.tu_varna.sit;

/*Създайте масив, който да съхранява средните борсови цени на пшеницата през последните 9
месеца (от началото на 2022 г.): {670.50, 687.22, 691.05, 710.56, 750.82, 788.44, 765.97, 698.36,
778,78}. Напишете програма, която да извежда номерата на месеците, през които цената е била
над средната за периода. */

public class Main {

    public static void main(String[] args) {
	// write your code here
        double[] пшеница={670.50, 687.22, 691.05, 710.56, 750.82, 788.44, 765.97, 698.36,
                778.78};
        double total = 0;

        for(int i=0; i<пшеница.length; i++){
            total = total + пшеница[i];
        }

        double average = total / пшеница.length;
        System.out.print("Цена над средната за Периода");
        for (int i = 0; i < пшеница.length; i++)
            if (пшеница[i] > average)
                System.out.println(i + " месец");
    }
}
