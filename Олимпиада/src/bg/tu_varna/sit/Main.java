package bg.tu_varna.sit;
//Предвидете масив, в който да се включват факултетните номера (7-цифрено число) на всички 10
//студенти, заявили участие в университетска олимпиада по програмиране. Разпишете алгоритъм,
//който да изброи и изведе колко от студентите в кой курс се обучават. Приемаме, че ФН на
//първокурсниците започват с 22, втори курс – 21, трети – 20 и четвърти - 19. Ако ФН започва с
//други цифри, да се добави към група „неидентифицирани“.

public class Main {

    public static void main(String[] args) {
	// write your code here

        String[] fakNo = { "22622614", "22622515", "22622616", "21621610", "21621511", "20620615", "20620516", "19019016",
                "18018024", "18018025" };
        int firstyear = 0, secondYear = 0, thirdYear = 0, forthYear = 0, dnYear = 0;
        for (int i = 0; i < fakNo.length; i++) {
            char[] numbers =  fakNo[i].toCharArray();
            int year = (numbers[0] - '0')* 10 + (numbers[1] - '0');
            switch (year) {
                case 22:
                    firstyear++;
                    break;
                case 21:
                    secondYear++;
                    break;
                case 20:
                    thirdYear++;
                    break;
                case 19:
                    forthYear++;
                    break;
                default:
                    dnYear++;
                    break;
            }
        }
        System.out.println("Студенти първа година: " + firstyear + "\nСтуденти втора година: " + secondYear
        + "\nСтуденти трета година: " + thirdYear + "\nСтуденти четвърта година: " + forthYear +
        "\nНеидентифицирани: " + dnYear);
    }
}
