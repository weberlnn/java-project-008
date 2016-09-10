/**
 * Created by lin on 2016/8/25.
 */
/*super的第二种形式的工作方式与this相似，只不过它引用的是子类的超类。这种用法的基本形式如下所示：
super.member        这里，member是方法或实例变量。
这种形式多用于子类的成员名隐藏了超类中的同名成员的情况。考虑下面这个简单的类层次结构：*/
 //使用super克服名称隐藏。
public class A {
    int i;
}
// 创建一个子类通过扩展类A.
class B extends A{
    int i;
    B(int a, int b) {
        super.i = a;
        i = b;
    }
    void show() {
        System.out.println("i in superclass: " + super.i);
        System.out.println("i in subclass: " + i);
    }
}
class UseSuper {
    public static void main(String args[]) {
        B subOb = new B(1, 2);
        subOb.show();
    }
}
/*尽管B中的实例变量i隐藏了A中的i，但是super允许访问定义于超类中的i。另外，super还可以用于调用
被子类隐藏的方法。*/
