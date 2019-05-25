import java.util.Scanner;

/**
 * Created by OUT-Akopyan-SR on 24.05.2019.
 */
public class Program {
    public static void main(String[] args) {
        System.out.println("Введите текст с пробелами");
        Scanner in = new Scanner(System.in);
        String word = in.nextLine();


        System.out.println(word.replaceAll("\\s", ""));
    }

}
