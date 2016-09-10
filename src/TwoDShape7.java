/**
 * Created by lin on 2016/8/27.
 */
/*如前所述。一个子类也可以是另一个子类的超类。例如，已知三个类名分别是A、B和C。C是B的子类，B是A的
子类。当这种情况出现时，每一个子类都继承它所有超类的所有属性。本例中，C就继承了B和A的所有成员。
在下面的程序中，子类Triangle作为超类创建了名为ColorTriangle的子类。ColorTriangle继承了Triangle
和TwoDShape的所有属性，并添加了一个名为color的域，该域用于存储三角形的颜色。*/

// 一个多级层次结构。
public class TwoDShape7 {
    private double width;
    private double height;
    //一个默认的构造函数。
    TwoDShape7() {
        width = height = 0.0;
    }
    // 参数化构造函数。
    TwoDShape7(double w, double h) {
        width = w;
        height = h;
    }
    // 构造对象一同样的宽度和高度。
    TwoDShape7(double x) {
        width = height = x;
    }
    // 宽度和高度的访问方法。
    double getWidth() { return width; }
    double getHeight() { return height; }
    //void setWidth(double w) { width = w; }
    //void setHeight(double h) { height = h; }
    void showDim() {
        System.out.println("宽度和高度是 " + width + " 和 " + height );
    }
}
// 延长TwoDShape7.
class Triangle7 extends TwoDShape7{
    private String style;
    // 一个默认的构造函数。
    Triangle7() {
        super();
        style = "none";
    }
    Triangle7(String s, double w, double h) {
        super(w, h);
        style = s;
    }
    // 一个参数的构造函数。
    Triangle7(double x) {
        super (x);  // 调用超类的构造函数。
        style = "filled";
    }
    double area() {
        return getWidth() * getHeight() / 2;
    }
    void showStyle() {
        System.out.println("三角形是 " + style);
    }
}
// 扩展三角形。
class ColorTriangle extends Triangle7{
    /*extends：ColorTriangle继承自Triangle，后者派生自TwoDShape，因此，ColorTriangle包含
    Triangle和TwoDShape的全部成员。 */
    private String color;
    ColorTriangle(String c, String s, double w, double h) {
        super (s, w, h);
        color = c;
    }
    //String getColor() { return color; }
    void showColor(){
        System.out.println("颜色是 " + color);
    }
}
class Shapes7 {
    public static void main(String args[]) {
        ColorTriangle t1 = new ColorTriangle("蓝色", "outlined", 8.0, 12.0);
        ColorTriangle t2 = new ColorTriangle("Red", "filled", 2.0, 2.0);
        System.out.println("信息为t1: ");
        t1.showStyle();
        t1.showDim();
        t1.showColor();
        System.out.println("面积是 " + t1.area());
        System.out.println();
        System.out.println("信息为t2: ");
        t2.showStyle();
        t2.showDim();          // ColorTriangle 对象可以调用自己及其超类定义的方法。
        t2.showColor();
        System.out.println("面积是 " +t2.area());
    }
}
/*由于继承的特性。ColorTriangle可以利用前面定义的Triangle和TwoDShape类，然后添加自己的特定应用
所需的附加信息。这就是继承的部分价值所在，它可以让我们进行代码重用。
该示例演示的另外一点也很重要即super()总是引用最靠近的超类的构造函数。ColorTriangle中的super()
调用Triangle中的构造函数。Triangle中的super()调用TwoDShape中的构造函数。在类层次结构中，如果
一个超类构造函数需要形参，那么无论类是否需要自己的形参，所有的子类都必须把这些形参传递上去。

 */

