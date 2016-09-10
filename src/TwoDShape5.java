/**
 * Created by lin on 2016/8/25.
 */
/*子类可以使用旁边形式的super来调用一个由超类定义的构造函数：super(parameter-list);
这里，parameter-list指定了超类中构造函数所需的任何形参。super()必须是在子类中执行的第一个语句。
为了解如何使用super()，考虑下面程序中的TwoDShape。它定义了一个构造函数用来初始width和height。*/
    //TwoDShape5添加构造函数。
public class TwoDShape5 {
    private double width;
    private double height;
    // 参数化构造函数
    TwoDShape5(double w, double h){ // TwoDShape5的构造函数
        width = w;
        height = h;
    }
    // 宽度和高度的访问方法。
    double getWidth() { return width; }
    double getHeight() { return height; }
    void setWidth(double w) { width = w; }
    void setHeight(double h) {height = h; }
    void showDim() {
        System.out.println("宽度和高度是 " + width + " 和 " + height);
    }
}
// 一个子类的TowDShape5三角形
class Triangle5 extends TwoDShape5{
    private String style;
    Triangle5 (String s, double w, double h ){
        super(w, h); // 调用超类的构造函数
        // 使用super()执行TwoDShape构造函数。
        style = s;
    }
    double area() {
        return getWidth() * getHeight() / 2;
    }
    void showStyle() {
        System.out.println("Triangle5 is " + style);
    }
}
class Shapes5{
    public static void main(String args[]) {
        Triangle5 t1 = new Triangle5("filled", 4.0, 4.0);
        Triangle5 t2 = new Triangle5("outlined", 8.0, 12.0);
        System.out.println("Info for t1: ");
        t1.showStyle();
        t1.showDim();
        System.out.println("Area is " + t1.area());
        System.out.println();
        System.out.println("Info for t2: ");
        t2.showStyle();
        t2.showDim();
        System.out.println("面积是 " + t2.area());
    }
}
/*这里，Triangle()使用形参w和h调用super()。这样就会调用TwoDShape的构造函数，以使用这些值来初始化
width和height。而Triangle不再自己初始化这些值。它只需要初始化自己的值style。这样TwoDShape可以自由
地用自己选择的方式来构造子对象，而且TwoDShape可以添加已有子类未知的功能，从而防止已有代码中断。
 */