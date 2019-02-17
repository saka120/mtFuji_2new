package BaseBallteam2;

//import probaseball.BaseBallTeam;
//import BaseBallTeam;

public class BaseBallResult {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ

        // オブジェクトの生成

        //   Name name1 = new Name ("広島東洋カープ",88,51,4) ;
        BaseBallTeam baseballteam1 = new BaseBallTeam("広島東洋カープ", 88, 51, 4);

        BaseBallTeam baseballteam2 = new BaseBallTeam("阪神タイガース", 78, 61, 4);
        BaseBallTeam baseballteam3 = new BaseBallTeam("横浜DeNAベイスターズ", 73, 65, 5);
        BaseBallTeam baseballteam4 = new BaseBallTeam("読売ジャイアンツ", 72, 68, 3);
        BaseBallTeam baseballteam5 = new BaseBallTeam("中日ドラゴンズ", 59, 79, 5);
        BaseBallTeam baseballteam6 = new BaseBallTeam("東京ヤクルトスワローズ", 45, 96, 2);

        // 試合結果表示
        //  name1.result() ;
        baseballteam1.result();
        baseballteam2.result();
        baseballteam3.result();
        baseballteam4.result();
        baseballteam5.result();
        baseballteam6.result();

        //            student1.hello();
        //            student2.hello();
        //            student3.hello();

        //  rate = win / (win+lose)

    }

}
