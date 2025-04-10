package Ex1_1_Jihan;

public class Jihan {
    public static void main(String[] args) {

        int checkCoin;
        int totalAmount = 0;

        for (String arg : args) {
            checkCoin = Integer.parseInt(arg);

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
        System.out.println("ただいまの投入金額は" + totalAmount + "円です");
    }
}
