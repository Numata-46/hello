import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        int targetNumber = (int) (Math.random() * 90) + 10; // 10から99の範囲でランダムな数を生成
        int attempts = 0;

        System.out.println("数当てゲームを開始します！");
        System.out.println("2桁の正の整数を予想して入力してください。");

        Scanner scanner = new Scanner(System.in);

        while (attempts < 5) {
            System.out.print("予想を入力してください: ");
            int guess = scanner.nextInt();
            attempts++;

            if (guess == targetNumber) {
                System.out.println("当たりです！");
                return; // 正解した場合はゲームを終了
            } else if (guess > targetNumber) {
                System.out.println("設定された数より大きいです。");
            } else {
                System.out.println("設定された数より小さいです。");
            }

            if (Math.abs(guess - targetNumber) >= 20) {
                System.out.println("20以上差があります！");
            }
        }

        System.out.println("ゲームオーバーです。正解は " + targetNumber + " でした。");
    }
}
