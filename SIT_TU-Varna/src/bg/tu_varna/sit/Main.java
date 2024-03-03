package bg.tu_varna.sit;
//Създайте програма, която да извежда съдържанието на масива
// {'s', 'i', 't', ' ', 't', 'u', '-', 'v', 'A', 'R', 'N', 'A'},
// така че всички големи букви да се изобразят като малки, а всички малки – като големи.
public class Main {

    public static void main(String[] args) {
	// write your code here
        char array[]= {'s', 'i', 't', ' ', 't', 'u', '-', 'v', 'A', 'R', 'N', 'A'};

        for (int i = 0; i < array.length; i++) {
            char currentChar = array[i];

           if (Character.isUpperCase(currentChar)) {
                    currentChar = Character.toLowerCase(currentChar);
           }
           else {
                    currentChar = Character.toUpperCase(currentChar);
           }

            System.out.print(currentChar);
        }
    }
}
