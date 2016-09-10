/**
 * Created by lin on 2016/8/28.
 */
/*在类层次结构中，当子类中的方法与其超类中的方法具有相同的返回类型和签名时，就称子类中的方法重写
(override)了超类的方法。当在一个子类中调用一个被重写的方法时，它总是引用子类中定义的方法，而超类
中定义的方法将被隐藏。*/
// 方法重写。
public class A2 {
    int i, j;
    A2(int a, int b){
        i = a;
        j = b;
    }
    void show() {
        System.out.println("i and j: " + i + " " + j);
    }
}
class B2 extends A2{
    int k;
    B2(int a, int b, int c){
        super (a, b);
        k = c;
    }
    void show () {// B2中的show()重写了A2中定义的show()
        System.out.println("k: " + k);
    }
}
class Override {
    public static void main(String args[]) {
        B2 subOb = new B2(1, 2, 3);
        subOb.show();
    }
}   // 当B类型的对象调用show()时，将使用B中定义的show()。即B中的show()重写了A中声明的show()。