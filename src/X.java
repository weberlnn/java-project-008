/**
 * Created by lin on 2016/8/27.
 */
/*
java是一种类型严格的语言。除了应用于基本类型的标准转换和自动升级，类型兼容也是被；严格执行的。
因此，一个类类型的引用变量通常不能引用一个其他类类型的对象。例如，考虑下面的程序。
public static void main(String args[]) {
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
        Score[] t={t1,t2};
        Get R = new Get();
        for(Score score:t){
            System.out.println("成绩" + score.getScore()+"分评价是"+R.get(score.getScore()));
        }
    }
}
    public class X {
    int a;

    X(int i) { a = i;}
    }
    class Y {
        int a;
        Y(int i) { a = i; }
    }
class IncompatibleRef {
        public static void main(String args[]) {
            X x = new X(10);
            X x2;
            Y y = new Y(5);
            x2 = x;
            x2 = y;
    }  // 这里尽管X类和Y类本质上是一样的，但是不能把一个Y对象赋值给一个X引用，因为它们的类型不同。
}      // 总之，一个对象引用变量只能引用自己类型的对象。
int[] a=new int{34,67,77};
for(int i=0; i<a.lenght; i++){
}
*/