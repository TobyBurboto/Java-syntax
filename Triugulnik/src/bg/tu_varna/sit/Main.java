package bg.tu_varna.sit;
//Напишете програма, която да проверява дали три реални числа са страни на
// триъгълник и ако да, дали той е правоъгълен.
public class Main {

    public static void main(String[] args) {
	// write your code here
        int a, b, c;
        a=3;
        b=4;
        c=5;
        if(a+b>c && a+c>b && b+c>a)
            System.out.println("Mozhe da se postroi triugulnik");
        else
            System.out.println("Ne moje da se postroi triugulnik");
        if(a*a+b*b==c*c)
            System.out.println("i toi shte e pravougulen");
    }
}
