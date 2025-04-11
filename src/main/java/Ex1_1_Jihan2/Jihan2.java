package Ex1_1_Jihan2;

/*
・コマンドライン引数に以下のルールを適用
  最後に入力されたコマンドライン引数：購入された商品の値段
  それ以外：投入された硬貨
・受け付ける硬貨は「10円玉」「50円玉」「100円玉」「500円玉」のみ
・「1円玉」「5円玉」が投入された場合は合計金額に含めず、「警告：1円玉は使えません」「警告：5円玉は使えません」と警告する
・硬貨としてふさわしくない値は合計金額に含めず、「警告：（入力された値）は硬貨として適切な値ではありません」と警告する
  例）入力値777 → 「警告：777は硬貨として適切な値ではありません」
・投入された硬貨の合計金額から購入された商品の値段を差し引いて以下のようにお釣りのメッセージを表示したい
  「（お釣りの金額）円のお釣りです。ありがとうございました。」
*/
public class Jihan2 {
    public static void main(String[] args) {
        /* チェック中の硬貨 */
        int checkCoin;

        /* 合計投入金額 */
        int totalAmount = 0;

        /*　商品の金額 */
        int price = Integer.parseInt(args[args.length - 1]);

        /* お釣り*/
        int change = 0;

        for (int i = 0; i < args.length - 1; i++) {
            checkCoin = Integer.parseInt(args[i]);

            switch (checkCoin) {
                case 10:
                case 50:
                case 100:
                case 500:
                    totalAmount += checkCoin;
                    break;

                case 1:
                case 5:
                    System.out.println("警告：" + checkCoin + "円玉は使えません");
                    break;

                default:
                    System.out.println("警告：" + checkCoin + "は硬貨として適切な値ではありません");
                    break;
            }
        }
        change = totalAmount - price;

        if(change > 0) {
            System.out.println(change + "円のお釣りです。ありがとうございました。");
        }else if(change == 0) {
            System.out.println("ちょうどのお預かりです。ありがとうございました。");
        }else {
            System.out.println("お金が足りないですね・・・");
        }
    }
}
