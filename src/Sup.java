/**
 * Created by lin on 2016/8/28.
 */
/*方法重写组成了java最为强大的概念之一：动态方法分配(dynamic method dispatch)。动态方法分配是一
种机制，通过该机制对一个被重写方法的调用会在运行时解析，而不是在编译时解析。动态方法分配是十分重要
的，因为这就是java实现运行时多态的机制。
我们再从超类引用变量可以引用子类对象这一重要原理开始讨论。java利用这一事实解决了运行时对被重写方法
的调用。其办法如下：当通过超类引用调用一个被重写方法时，java会根据在调用发生时引用的对象的类型来判断
所要执行的方法。因此，这种判断发生在运行时。当引用不同类型的对象时，将调用被重写方法的不同版本。换
言之，是被引用对象的类型（而不是引用变量的类型）决定了所要执行的被重写方法。因此，如果一个超类包含一
个被子类重写的方法，那么当通过超类引用变量引用不同的对象类型时，就会执行不同版本的方法。*/
// 演示动态调度方法。
public class Sup {
    void who() {
        System.out.println("who() in Sup");
    }
}
class Sub1 extends Sup{
    void who() {
        System.out.println("who() in Sub1");
    }
}
class Sub2 extends Sup {
    void who() {
        System.out.println("who() in Sub2");
    }
}
class DynDispDemo {
    public static void main(String args[]) {
        Sup superOb = new Sup();
        Sub1 subOb1 = new Sub1();
        Sub2 subOb2 = new Sub2();

        Sup supRef;

        supRef = superOb;
        supRef.who();
        supRef = subOb1;
        supRef.who();
        supRef = subOb2;
        supRef.who();
        // 在每一种情况下，要调用的who()的版本都在运行时由引用的对象类型决定。
    }
}
/*程序创建了一个名为Sup的超类和它的两子类Sub1和Sub2。Sup声明了一个名为who()的方法，而子类则重写了
该方法。在main()方法中，声明了Sup、Sub1和Sub2类型的对象，而且声明了一个名为supRef的Sup类型的引用
然后程序把对每种类型的对象的引用赋给SupRef，并使用该引用调用who()。正如输出所示，要执行的who()的版
本由调用时被引用的对象的类型决定，而不是由supRef的类类型决定。
 */

