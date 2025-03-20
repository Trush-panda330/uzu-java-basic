package ex1_04_2;

import java.util.Scanner;

/*
-----------<Ex1_04_2>-------
勝手にやってみたくてやりました。Ex1_04_1のリファクタ版です。
コマンドラインから数値を受け取るのはIntelliJだと実行環境変更するのが面倒くさいと思ったので
標準入力で受け取る形でリファクタしてみました。
完全に個人勉強用なのでコメントマシマシですが
----------------------------
*/
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userInput = 0;
        boolean showAll = false;

        while (true) {
            System.out.println("表示させる段を{1~9}で入力してください（入力せずにEnterを押した場合は九九全て表示）");
            //入力がないかどうかを確認したいためintではなくStringを採用（下記参照）
            //strip()はtrim()の強力版。trim()では削除できないUnicodeの空白も削除してくれる。
            String input = scanner.nextLine().strip();

            //もしもinputがint型だった場合isEmpty()が使えない。
            //つまり、String型のinputに対しisEmpty()で空だった場合
            // showAllをtrueにして全て表示させるという処理に繋げさせる
            if (input.isEmpty()) {

                showAll = true;
                break;
            }

            try {
                //userInputはint型なのでInteger.parseIntでStringのinputの型をintとして扱う
                userInput = Integer.parseInt(input);
                //入力が１〜９の数値ならループ処理を抜ける
                if (userInput >= 1 && userInput <= 9) {
                    break;
                } else {
                    System.out.println("1から9の数値で入力してください。");
                }
            } catch (NumberFormatException e) {
                System.out.println("数値を入力してください。");
            }
        }
        scanner.close();

        //元々コメントアウトした部分のように書いてみたが
        //StringBuilderを使えとIntelliJに注意された。
        //Stringに + を使うたびインスタンスを生成するためメモリを無駄に使うかららしい。
//        for (int i = 1; i <= 9; i++) {
//            String resultRow = ""; // 九九の1行を格納
//            for (int j = 1; j <= 9; j++) {
//                resultRow = resultRow + i * j + " ";
//            }
//            if (showAll || i == userInput) {
//                System.out.println(resultRow);
//            }
//        }
//
        for (int i = 1; i <= 9; i++) {
            StringBuilder resultRow = new StringBuilder();
            for (int j = 1; j <= 9; j++) {
                resultRow.append(i * j).append(" ");
            }
            if (showAll || i == userInput) {
                System.out.println(resultRow);
            }
        }

    }
}
