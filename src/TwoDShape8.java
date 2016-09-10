/**
 * Created by lin on 2016/8/27.
 */
/*下面的TwoDShape和Triangle。这两个类都添加了把对象作为形参的构造函数。*/
public class TwoDShape8 {
    private double width;
    private double height;
    // 一个默认的构造函数。
    TwoDShape8() {
        width = height = 0.0;
    }
    // 参数化构造函数。
    TwoDShape8(double w, double h) {
        width = w;
        height = h;
    }
    // 构造一个对象以同样的宽度和高度。
    TwoDShape8(double x) {
        width = height = x;
    }
    // 构造一个对象的对象。
    TwoDShape8(TwoDShape8 ob) {// 从一个对象构造对象
        width = ob.width;
        height = ob.height;
    }
    // 宽度和高度的访问方法。
    double getWidth() { return width; }
    double getHeight() { return height; }
    //void setWidth(double w) { width = w; }
    //void setHeight(double h) { height = h; }
    void showDim() {
        System.out.println("Width and heght are " + width + " and " + height);
    }
}
// 一个子类的TwoDShape8三角形
class Triangle8 extends TwoDShape8{
    private String style;
    // 一个默认的构造函数。
    Triangle8(){
        super();
        style = " none ";
    }
    // 构造函数为三角。
    Triangle8(String s, double w, double h) {
    super(w, h);
    style = s;
    }
    // 一个参数的构造函数。
    /*Triangle8(double x) {
        super (x);
        style = "filled";
    }*/
    // 构造一个对象形成一个对象
    Triangle8(Triangle8 ob) {
        super(ob); // 向TwoDShape的构造函数传递一个Triangle引用。
        style = ob.style;
    }
    double area() {
        return getWidth() * getHeight() / 2;
    }
    void showStyle() {
        System.out.println("Triangle8 is" + style);
    }
}
class Shapes8 {
    public static void main(String args[]) {
        Triangle8 t1 = new Triangle8("outlined", 8.0, 12.0);
        // 复制t1.
        Triangle8 t2 = new Triangle8(t1);
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