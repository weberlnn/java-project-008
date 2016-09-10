/**
 * Created by lin on 2016/8/27.
 */
/*在类的层次结构中，构造函数的调用是是按照继承的顺序，从超类到子类来进行的。不仅如此，因为super()
必须是子类构造构造函数中执行的第一条语句，因此无论是否使用super()，构造函数的调用顺序都是相同的。如
果没有使用super()，那么就会执行每个超类的默认(无形参)构造函数。下面的程序说明了何时执行构造函数：*/
    // 创建一个超类。
public class A1 {
    A1() {
     System.out.println("构造 A1.");
    }
}
//创建一个子类通过扩展类A1。
class B1 extends A1 {
    B1() {
        System.out.println("构造 B1.");
    }
}
//创建另一个子类通过扩展B1
class C1 extends B1{
    C1() {
        System.out.println("构造 C1.");
    }
}
class OrderOfConsturction {
    public static void main(String args[]) {
        C1 c = new C1();
    }
}
/*如果你考虑一下，就会发现按照继承顺序来执行是很合理的。因为超类不知道任何子类，他需要执行的任何初始
化与任何子类执行的初始化是相分离的，这可能也是子类执行的初始化的先决条件。因此，必须首先执行超类的初
始化。 */
