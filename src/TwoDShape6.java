/**
 * Created by lin on 2016/8/25.
 */
/*超类定义的任何形式的构造函数都可以被super()调用。被执行的构造函数就是与实参相匹配的哪一个。
例如，下面是TwoDShape和Triangle的扩展版，引入了默认构造函数和带有一个实参的构造函数。 */
// 添加更多TwoDShape6构造函数。
public class TwoDShape6 {
    private double width;
    private double height;
    // 一个默认的构造函数。
    TwoDShape6(){
        width = height = 0.0;
    }
    // 参数化构造函数。
    TwoDShape6(double w, double h) {
        width = w;
        height = h;
    }
    // 构造对象以同样的宽度和高度。
        TwoDShape6(double x){
        width = height = x;
    }
    // 宽度和高度的访问方法。
    double getWidth() { return width; }
    double getHeight() { return height; }
    void setWidth(double w) {width = w; }
    void setHeight(double h) { height = h; }
    void showDim(){
        System.out.println("Width and height are " + width + " and " + height);
    }
}
// 一个子类的TwoDShape三角形。
class Triangle6 extends TwoDShape6 {
    private String style;
    // 一个默认的构造函数
    Triangle6() {
        super();                           // 使用super()调用各种形式的TwoDShape构造函数。
        style = "none";
    }
    Triangle6(String s, double w, double h) {  //构造函数
        super(w, h);// 调用超类的构造函数       使用super()调用各种形式的TwoDShape构造函数。
        style = s;
    }
    Triangle6(double x) {
        super(x);// 调用超类的构造函数          使用super()调用各种形式的TwoDShape构造函数。
        style = "filled";
    }
    double area() {
        return getWidth() * getHeight() / 2;
    }
    void showStyle() {
        System.out.println("Triangle is " + style);
    }
}
class Shapes6{
    public static void main(String args[]) {
        Triangle6 t1 = new Triangle6();
        Triangle6 t2 = new Triangle6("outlined", 8.0, 12.0);
        Triangle6 t3 = new Triangle6(4.0);
        t1 = t2;
        System.out.println("Info for t1：");
        t1.showStyle();
        t1.showDim();
        System.out.println("Area is " + t1.area());
        System.out.println();
        System.out.println("Info for t2: ");
        t2.showStyle();
        t2.showDim();
        System.out.println("Area is " + t2.area());
        System.out.println();
        System.out.println("Info for t3: ");
        t3.showStyle();
        t3.showDim();
        System.out.println("Area is " + t3.area());
        System.out.println();
    }
}
/*隐藏在super()幕后的关键概念。当一个子类调用super()时，就是在调用其直接超类的构造函数。因此，
super()总是引用调用类的直接超类。在多级层次结构中也是如此，而且super()必须是子类构造函数中执行
的第一个语句。*/
