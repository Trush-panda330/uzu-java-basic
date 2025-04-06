package Ex1_11_1;
/*-< 演習：Ex1_11_1 >---------------------------------
セクション12の演習問題１

while文を使用して、6の目がでるまでサイコロを降り続けるプログラムを作成してください。
※1～6までのランダムなint型の値を取得する方法 ： 1 + (int)(Math.random() * 6.0)
※6の目が出たら「6が出たのでを終了します」と表示してください
----------------------------------------------------*/
public class Ex1_11_1 {
    public static void main(String[] args) {

        /** サイコロの目 */
        int diceValue = 0;

        diceValue = 1 + (int)(Math.random() * 6);
        System.out.println("サイコロを振った結果は" + diceValue + "でした。");

        while(diceValue != 6) {
            System.out.println("6が出るまで振り直します。");
            System.out.println();

            diceValue = 1 + (int)(Math.random() * 6);
            System.out.println("振り直した結果は、" + diceValue + "でした。");
        }
        System.out.println("6の目が出たので終了します。");
    }
}
