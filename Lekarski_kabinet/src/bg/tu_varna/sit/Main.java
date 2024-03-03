package bg.tu_varna.sit;

//Лекарски кабинет работи през понеделник, сряда и петък от 13:30 до 18:00 часа,
// а във вторник и четвъртък – от 8:00 до 12:30 часа. Събота и неделя са почивни дни.
// Създайте програма, при която при подаден пореден ден от седмицата да изведе
// дали е работен и в кой часови диапазон е работното време.

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Изберете ден от седмицата:");
        System.out.println("1.Понеделник");
        System.out.println("2.Вторник");
        System.out.println("3.Сряда");
        System.out.println("4.Четвъртък");
        System.out.println("5.Петък");
        System.out.println("6.Събота");
        System.out.println("7.Неделя");
        System.out.println(" ");
        int i=2;
        switch(i)
        {
            case 1:
                System.out.println("Понделник: Отворено от 13:30 до 18:00 часа");
                break;
            case 2:
                System.out.println("Вторник: Отворено от 8:00 до 12:30 часа ");
                break;
            case 3:
                System.out.println("Сряда: Отворено от 13:30 до 18:00 часа ");
                break;
            case 4:
                System.out.println("Четвъртък: Отворено от 8:00 до 12:30 часа");
                break;
            case 5:
                System.out.println("Петък: от 13:30 до 18:00 часа ");
                break;
            case 6:
                System.out.println("Събота: Почивен ден ");
                break;
            case 7:
                System.out.println("Неделя: Почивен ден ");
                break;
            default:
                System.out.println("Default ");
        }
    }
}
