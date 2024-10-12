import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter your number");
        int number = new Scanner(System.in).nextInt();
        if(number % 2==0 || number% 5 ==0|| number % 173 == 0|| number % 821 == 0){
            System.out.println("Vova it's right number");
        }else {
            System.out.println("vova isn't right");
        }
    }
}
