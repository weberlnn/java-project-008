/**
 * Created by lin on 2016/8/24.
 */
/*java通过允许在一个类的声明中加入另一个类来实现继承，这需要使用关键字extends。这样子类就扩展了超类
下面的程序创建了一个名为TwoDShape的超类，它存储了一个二维物体的长度和宽度。同时，程序还创建一个名为
Triangle的子类。注意，如何使用关键字extends创建子类。 */
// 一个简单的类层次结构。
// 二维对象的类。
public class TwoDShape {
    double width;
    double height;
    void showDim() {
        System.out.println("Width and height are " + width + " and " + height);
    }
}
// 一个子类的TwoShape三角形
class Triangle extends TwoDShape{  // Triangle继承了TwoDShape.
    String style;
    double area() {
        return width * height/2;//Triangle可以引用TwoDShape的成员，就像它们是Triangle自己一样
    }
    void showStyle() {
        System.out.println("Triangle is " + style);
    }
}
class Shapes {
    public static void main(String args[]){
        Triangle t1 = new Triangle();
        Triangle t2 = new Triangle();
        t1.width = 4.0;
        t1.height = 4.0;//Triangle的所有成员都可用于Triangle对象，即使它吗是从TwoDShape继承的。
        t1.style = "filled";
        t2.width = 8.0;
        t2.height = 12.0;
        t2.style = "outlined";
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
/*本例中，TwoDShape定义了如正方形、长方形、三角形等的“一般”二维图形的属性。Triangle类创建了
TwoDShape的一个具体类型，本例中为三角形。Triangle类包括了TwoDObject的所有成员，并添加了style域、
area()方法和showStyle()方法。style存储三角形的描述，例如“filled”、“outlined”、“transparent”，
甚至“warning symbol”、“isosceles”或“rounded”。area()用于计算并返回三角形的面积，showStyle()
用于显示三角形的类型。
因为Triangle包含其超类TwoDShape的所有成员，因此，它可以在area()中访问width和height。而且在main()
中，对象t1和t2可以直接引用width和height，就好像他们是Triangle的一部分。
 */
