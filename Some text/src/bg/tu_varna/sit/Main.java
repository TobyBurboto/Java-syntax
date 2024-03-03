package bg.tu_varna.sit;

//Създайте програма, която да извежда съдържанието на масива {'S', 'o', 'm', 'e', ' ', 't', 'e', 'x', 't'},
//така че всеки символ да е на отделен ред.
//Нека решението да бъде изпълнено с помощта на while или do-while цикъл.

public class Main {

    public static void main(String[] args) {
	// write your code here
        char arr[]= {'S', 'o', 'm', 'e', ' ', 't', 'e', 'x', 't'};
        //i starts with 0 as array index starts with 0
        int i=0;

        do{
            System.out.println(arr[i]);
            i++;
        }while(arr.length>i);
    }
}
