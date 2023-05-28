package Package3;
import java.util.Scanner;

public class SpaceCounter {
    public static void main(String args[]) {
        System.out.println("Программа будет считать количество введеных пробелов");
        System.out.println("Введите символы, чтобы завершить ввод нажмите точку (.)");

        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        int spaceCounter = 0;

        while (string.charAt(0) != '.') {
            for (int i = 0; i < string.length(); i++) {
                if (string.charAt(i) == ' ') {
                    spaceCounter++; // spaceCounter = spaceCounter + 1
                }
            }
            string = sc.nextLine();
        }

        System.out.println("Количество пробелов = " + spaceCounter);
    }
}
