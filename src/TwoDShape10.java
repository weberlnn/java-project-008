/**
 * Created by lin on 2016/8/30.
 */
/*抽象方法是通过指定abstract类型修饰符来创建的。抽象方法没有内容，因此无须被超类实现。这样，子类
就必须重写它，因为超类中定义的方法是不能使用的。声明一个抽象方法的基本形式如下所示：
abstract 类型名称(参数列表)。      正如你所见，没有出现方法主体。abstract修饰符只能用于普通方法
，它不能用于static方法或构造函数。包含一个或多个抽象方法的类必须通过在其class声明前添加abstract
修饰符将其声明为抽象类。因为一个抽象类不定义完整的现实方式，所以抽象类也就没有自己的对象。因此，任
何使用new创建抽象类对象的尝试都会导致编译时错误。    当子类继承一个抽象类时，它必须实现超类中的所
有抽象方法。否则，也要定义子类为抽象类。因此，abstract属性被继承，直到有了完整的实现。
使用抽象类可以改进TwoDShape类。因为对于一个未定义的二维图形而言面积概念是没有意义的，所以上述程序
的下面这个改版将TwoDShape中的area()声明为abstract,并且也把TwoDShape声明为abstract。当然，这就
意味着所有从TwoDShape继承的类都必须重写area()。*/
// 创建一个抽象类
abstract class TwoDShape10 {  // TwoDShape现在是抽象类。
    private double width;
    private double height;
    private String name;
    // 一个默认的构造函数。
    TwoDShape10() {
        width = height = 0.0;
        name = "none";
    }
    // 参数化构造函数。
    TwoDShape10(double w, double h, String n) {
        width = w;
        height = h;
        name = n;
    }
    // 构造对象以同样的宽度和高度。
    TwoDShape10(double x, String n) {
        width = height = x;
        name = n;
    }
    // 构造一个对象的对象
    TwoDShape10(TwoDShape10 ob) {
        width = ob.width;
        height = ob.height;
        name = ob.name;
    }
    // 宽度和高度的访问方法。
    double getWidth() { return width; }
    double getHeight() { return height; }
    void setWidth(double w) { width = w; }
    void setHeight(double h) { height = h; }
    String getName() { return name; }
    void showDim() {
        System.out.println("宽度和高度是 " + width + " 和 " + height);
    }
    // 现在，这个area()是abstract的。
    abstract double area();  // 把area()声明为抽象方法。
}
// 子类Triangle10扩展了超类TwoDShape10。
class Triangle10 extends TwoDShape10 {
    private String style;
    // 一个默认的构造函数。
    Triangle10() {
        super();
        style = "none";
    }
    // 构造函数为Triangle
    Triangle10(String s, double w, double h) {
        super(w, h, "三角形");
        style = s;
    }
    // 一个参数的构造函数。
    Triangle10(double x) {
        super (x, "三角形");  // 调用超类的构造函数。
        style = "满的";
    }
    // 构造一个对象的对象
    Triangle10(Triangle10 ob) {
        super(ob);  // 将对象传递给TwoDShape构造函数。
        style = ob.style;
    }
    double area() {
        return getWidth() * getHeight() / 2;
    }
    void showStyle() {
        System.out.println("Triangle is " + style);
    }
}
// 子类Rectandle2扩展了超类TwoDShape10
class Rectangle2 extends TwoDShape10{
    // 一个默认的构造函数
    Rectangle2() {
        super();
    }
    //构造函数为矩形。
    Rectangle2(double w, double h) {
        super(w, h, "矩形");  // 调用超类的构造函数。
    }
    //构造函数一个正方形。
        Rectangle2(double x) {
            super(x, "矩形");  // 调用超类的构造函数。
    }
    // 构造一个对象的对象。
    Rectangle2(Rectangle2 ob) {
        super(ob);  // 将对象传递给TwoDShape构造函数。
    }
    boolean isSquare() {
        if(getWidth() == getHeight()) return true;
        return false;
    }
    double area() {
        return getWidth() * getHeight();
    }
}
class AbsShape {
    public static void main(String args[]) {
        TwoDShape10 shapes[] = new TwoDShape10[4];
        shapes[0] = new Triangle10("outlined", 8.0, 12.0);
        shapes[1] = new Rectangle2(10);
        shapes[2] = new Rectangle2(10, 4);
        shapes[3] = new Triangle10(7.0);
        for (int i = 0; i < shapes.length; i++) {
            System.out.println("对象是 " + shapes[i].getName());
            System.out.println("面积是 " + shapes[i].area());
            System.out.println();
        }
    }
}
