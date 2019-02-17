package BaseBallteam2;

public class BaseBallTeam {

    // フィールド (メンバ変数）
//  private

    private String name; // チーム名
    private int win; // 勝ち
    private int lose; // 負け
    private int draw; // 引き分け

    // コンストラクタ

    public BaseBallTeam(String n, int a, int b, int c) {
        name = n;

        setWin(a);
        setLose(b);
        setDraw(c);

    }
    //      win =  a ;
    //      lose = b ;
    //      draw = c ;

    public void setWin(int a) {

        win = a;
    }

    public int getWin() {
        return win;

    }

    public void setLose(int b) {

        lose = b;

    }

    public int getLose() {
        return lose;

    }

    public void setDraw(int c) {

        draw = c;
    }

    public int getDraw() {
        return draw;

    }

    // double rate = int ( a / (a + b));

    public double getRate() {

        double rate = (double) win / (double) (win + lose);

        return rate;

        //     System.out.println( rate + "です。");

    }

    //メソッドの定義
    void result() {
        System.out.println(name + " の2017年の成績は " + win + "勝" + lose + "敗"
                + draw + "分、勝率は "
                + getRate() + "です。");

    }
}
