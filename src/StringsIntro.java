import java.util.Scanner;

public class StringsIntro {
    public static void main(String[] args) {
        solution();
    }

    public static void solution() {
        Scanner scanner = new Scanner(System.in);

        String first = scanner.nextLine();
        String second = scanner.nextLine();

        scanner.close();

        System.out.println(first.length() + second.length());
        System.out.println(first.compareTo(second) > 0 ? "Yes" : "No");
        System.out.println(first.substring(0, 1).toUpperCase() + first.substring(1) + " " + second.substring(0, 1).toUpperCase() + second.substring(1));
    }
}
