/**
 * Created by lin on 2016/8/24.
 */
/*超类的构造函数构造对象的超类部分，而子类的构造函数则构造子类部分。这是很自然的，因为超类并不知晓，
或无权访问子类的任何元素。因此，它们的构造必须分开。前面的示例依赖于java自动创建的默认的构造函数，
因此这并不是问题。然而，在实际引用当中，多数类都有显示构造函数。下面你将看到如何处理这种情况。 当只
有子类定义了构造函数时，过程很简单：只需构造子类对象即可。对象的超类部分使用默认构造函数来自动创建例
如下面是定义了一个构造函数的Triangle的改进版。因为它是由构造函数设置的，所以也把style声明为私有 */
// 添加一个构造函数三角形。
    //二维对象的类。
public class TwoDShape4 {
    private double width; // 这些都是
    private double height; // 现在是私有的
    //宽度和高度的访问方法
    double getWidth() { return width; }
    double getHeight() { return height; }
    void setWidth(double w) { width = w; }
    void setHeight(double h) { height = h; }
    void showDim() {
        System.out.println("Width and height are " + width + " and " + height);
    }
}
// 一个子类的TwoDShape三角形。
class Triangle4 extends TwoDShape4 {
    private String style;
    // 构造函数。
    Triangle4 (String s, double w, double h) {
        setWidth(w);
        setHeight(h);//  初始化对象的TwoDShape部分。
        style = s;
    }
    double area() {
        return getWidth() * getHeight() / 2;
    }
    void showStyle(){
        System.out.println("Triangle is " + style);
    }
}
class Shapes4 {
    public static void main(String args[]) {
        Triangle4 t1 = new Triangle4("filled", 4.0, 4.0);
        Triangle4 t2 = new Triangle4("outlined", 8.0, 12.0);
        System.out.println("Info for t1: ");
        t1.showStyle();
        t1.showDim();
        System.out.println("Area is " + t1.area());
        System.out.println();
        System.out.println("Info for t2: ");
        t2.showStyle();
        t2.showDim();
        System.out.println("Area is " + t2.area());
    }
}
/*这里，Triangle的构造函数初始化了从TwoDClass继承的成员和它自己的style域。
当出超类和子类都定义有构造函数时，这个过程就有些复杂了，因为超类和子类的构造函数都要执行。在这种
情况下，就必须使用另一个java关键字super。这个关键字有两种基本形式：第一种形式调用超类构造函数，
第二种形式用于访问被子类成员隐藏的超类成员。
 */