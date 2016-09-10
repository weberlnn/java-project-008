/**
 * Created by lin on 2016/9/10.
 */
public class Score3 {
    public static void main(String args[]) {
        int score[] = new int[]{90,88,69};

        for(int i:score){
            System.out.println("成绩" + i +"分评价是"+ get(i));
        }
    }
    public static String get(int i){
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
        else {
            return "D";
        }
    }
}

