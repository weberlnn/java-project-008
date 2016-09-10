/**
 * Created by lin on 2016/8/28.
 */
/* 方法重写只在两个方法的签名一致时才发生。如果有不一致的地方，那么两个方法就只是重载而已。*/
public class A3 { //不同签名方法重载和覆盖
    int i, j;
    A3(int a, int b) {
        i = a;
        j = b;
    }
    //显示i和j。
    void show() {
        System.out.println("i and j: " + i + " " +j);
    }
}
// 创建一个子类通过扩展类A3。
class B3 extends A3 {
    int k;

    B3(int a, int b, int c) {
        super(a, b);
        k = c;
    }
    // 过载show()。
    void show(String msg)  {  // 由于签名不同，这个show()只是重载了超类A3中的show()。
        System.out.println(msg + k);
    }
}
class Overload {
    public static void main(String args[]) {
        B3 subOb = new B3(1, 2, 3);
        subOb.show("This is k: "); // 这个调用show()在B3
        subOb.show(); // 这个调用show()在A3
    }
}
/*B3中的show()有一个字符串形参。这使得它的类型签名与没有形参的A3中的show()不同。因此，不会有重写
（或名称隐藏）发生。
 */


