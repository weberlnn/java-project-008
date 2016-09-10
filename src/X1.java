/**
 * Created by lin on 2016/8/27.
 */
/*然而，java的严格类型却有一个例外，即可以把对超类派生的子类的对象的引用赋给一个超类的引用变量。
换句话说，超类引用可以引用子类对象。如下所示：*/
    // 父类的引用可以指向子类对象。
public class X1 {
    int a;
    X1(int i) { a = i; }
}
class Y1 extends X1{
    int b;
    Y1(int i, int j) {
        super(j);
        b = i;
    }
}
class SupSubRef {
    public static void main(String args[]) {
        X1 x = new X1(10);
        X1 x2;
        Y1 y = new Y1(5, 6);
        x2 = x;  // 两个相同类型的。
        System.out.println("x2.a: " + x2.a);
        x2 = y;  // 因为Y是X的子类，所以x2可以引用y。
        System.out.println("x2.a: " + x2.a);
        // X引用只知道关于X成员。
        x2.a = 19;
     // x2.b = 27;  //错误，X没有b成员。
    }
}
/*这里，X派生了Y，所以允许赋给x2一个对Y对象的引用。
哪些成员可以访问是由引用变量的类型（而不是它引用的对象类型）决定的，理解这一点十分重要。也就是说，
当一个子类对象的引用被赋给一个超类引用变量时，只有权访问对象的那些超类定义的部分。这就是为什么即
使在x2引用了一个对象Y后，还不能访问b的原因。考虑一下就会发现这是合理的，因为超类不知道子类增加了
什么。这也就是程序代码的最后一行被注释掉的原因。
 */