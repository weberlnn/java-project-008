/**
 * Created by lin on 2016/8/28.
 */
/*为更好的理解方法重写的功能，我们将在TwoDShape9类中使用它。在前面的实例中，从TwoDShape9派生的
每一个类都定义一个名为area()的方法。这就意味着方法area()如果作为TwoDShape类的一部分可能更合适，
因为这样就可以让每一个子类重写它，然后定义如何计算这些类封装的形状的面积。下面的程序完成了以上工作。
为了方便起见，TwoDShape添加了一个名称域（一求更方便地演示程序）。*/
// 使用动态调度方法。
public class TwoDShape9 {
    private double width;
    private double height;
    private String name;
    //
    TwoDShape9() {
        width = height = 0.0;
        name = "none";
    }
    //参数化构造函数。
    TwoDShape9(double w, double h, String n) {
        width = w;
        height = h;
        name = n;
    }
    // 构造对象以同样的宽度和高度。
    TwoDShape9(double x, String n) {
        width = height = x;
        name = n;
    }
    // 构造一个对象的对象。
    TwoDShape9(TwoDShape9 ob) {
        width = ob.width;
        height = ob.height;
        name = ob.name;
    }
    // 宽度和高度的访问方法
    double getWidth() { return width; }
    double getHeight() { return height; }
    void setWidth(double w) { width = w; }
    void setHeight(double h) { height = h; }
    String getName() { return name; }
    void showDim() {
        System.out.println("Width and height are " + width + " and " + height);
    }
    double area() { // TwoDShape定义的area()方法。
        System.out.println("area() must be overridden");
        return 0.0;
    }
}
// 一个子类的TwoDShape9的三角形
class Triangle9 extends TwoDShape9 {
    private String style;
    // 一个默认的构造函数。
    Triangle9() {
        super();
        style = "none";
    }
    // 构造函数为三角形。
    Triangle9(String s, double w, double h) {
        super(w, h, "triangle");
        style = s;
    }
    // 一个参数的构造函数
    Triangle9(double x) {
        super(x, "triangle");
        style = "filled";
    }
    // 构造一个对象的对象。
    Triangle9(Triangle9 ob) {
        super(ob);
        style = ob.style;
    }
    //覆盖area()三角形。
    double area() { // 为Triangle重写area()方法。
        return getWidth() * getHeight() / 2;
    }
    void showStyle() {
        System.out.println("Triangle9 is " + style);
    }
}
// TwoDShape为矩形的一个子类。
class Rectangle extends TwoDShape9 {
    // 一个默认的构造函数。
    Rectangle() {
        super();
    }
    // 构造函数为矩形。
    Rectangle(double w, double h) {
        super(w, h, "rectangle");
    }
    // 构造函数为正方形
    Rectangle(double x) {
        super(x, "rectangle");
    }
    // 构造一个对象的对象。
    Rectangle(Rectangle ob) {
        super(ob);
    }
    boolean isSquare() {
        if(getWidth() == getHeight()) return true;
        return false;
    }

    double area() { // 为Rectangle重写area()方法。
        return getWidth() * getHeight();
    }
}
class DynShapes{
    public static void main(String args[]) {
        TwoDShape9 shapes[] = new TwoDShape9[5];

        shapes[0] = new Triangle9("outlined", 8.0, 12.0);
        shapes[1] = new Rectangle(10);
        shapes[2] = new Rectangle(10, 4);
        shapes[3] = new Triangle9(7.0);
        shapes[4] = new TwoDShape9(10, 20,"generic");

        for (int i=0; i < shapes.length; i++) {
            System.out.println("object is " + shapes[i].getName());
            // 为每一种形状调用正确的area()版本。
            System.out.println("Area is " + shapes[i].area());
            System.out.println();
        }
    }
}
/*首先，如前所述，area()现在是TwoDShape9类的一部分，被Triangle9和Rectangle9重写。在TwoDS中，
area()是一个占位符实现方式，只是告知用户该方法必须被子类重写。area()的每一次重写都提供了一个适合
于子类封装的对象类型的实现方式。因此，如果要实现一个椭圆类，那么area()就需要计算椭圆的area()。
上述程序中还有一个重要功能。注意，在main()中，shape被声明为TwoDShape9对象的一个数组。然而，这个
数组的元素被赋值了Triangle9、Rectangle和TwoDShape9引用。这是有效的，因为如前所述，一个超类引用
可以引用一个子类对象，程序将循环迭代数组，显示每个对象的信息。尽管程序非常简单，但却说明了继承和方法
重写的强大功能。由超类引用变量引用的对象类型是在运行时被确定的，并做相应操作。如果一个对象是从
TwoDShape9派生的，那么可以通过调用area()来得到它的面积。无论使用的形状的类型如何，这项操作的接
口都是相同的。*/