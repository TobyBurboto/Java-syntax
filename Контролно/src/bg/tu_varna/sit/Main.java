package bg.tu_varna.sit;

/*Създайте програма, която да определя получената оценка на ученици от контролно по
математика. Верните отговори на теста са {'a','b','a','c','a','c','c','b','a','c'}. Скалата за оценяване е
следната:
• до 2 т. вкл. – слаб 2;
• 3-4 – среден 3;
• 5-6 – добър 4;
• 7-8 – мн. добър 5;
• 9-10 – отличен 6.
За тестването на програмата ползвайте следните отговори, дадени от ученик:
{'a','a','b','c','a','c','a','b','a','b'}.*/

public class Main {

    public static void main(String[] args) {
	// write your code here
        char[] answers = {'a','a','b','c','a','c','a','b','a','b'};
        char[] test = {'a','b','a','c','a','c','c','b','a','c'};

        int right = 0;
        String[] marks = { "слаб 2", "среден 3", "добър 4", "много добър 5", "отличен 6" };
        int mark_index = 0;
        for (int i = 0; i < test.length; i++) {
            if (answers[i] == test[i]) {
                right++;
            }
        }
        switch (right) {
            case 10:
            case 9:
                mark_index = 4;
                break;
            case 8:
            case 7:
                mark_index = 3;
                break;
            case 6:
            case 5:
                mark_index = 2;
                break;
            case 4:
            case 3:
                mark_index = 1;
                break;
            default:
                mark_index = 0;
                break;
        }
        System.out.println("Оценката e: " + marks[mark_index]);
    }
}
