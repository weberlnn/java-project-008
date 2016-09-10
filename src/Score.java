/**
 * Created by lin on 2016/9/8.
 */
public class Score {
    private int score;
    public Score(int score){
        this .score=score;
    }
    public int getScore(){
        return score;
    }
    public void setScore(int score){
        this.score = score;
    }
}
class Get{
    public String get(int i) {
        if (i >= 90) {
            return "A";
        }
        else if (i >= 80) {
            return "B";
        }
        else if (i >= 70) {
            return "C";
        }
        else if (i >= 60) {
            return "D";
        }
        else{
            return "D";
        }
    }
    public static void main(String args[]){
        Score t1 = new Score(90);
        Score t2 = new Score(88);
        Score t3 = new Score(77);
        Score t4 = new Score(51);
        Score[] t={t1,t2,t3,t4};
        Get R = new Get();
        for(Score score:t){
            System.out.println("成绩" + score.getScore()+"分评价是"+R.get(score.getScore()));
        }
    }
}
