/**
 * Created by lin on 2016/8/24.
 */
/*public class TwoDShape2 {
    private double width;
    private double height2;
    void showDim() {
    System.out.println("Width and height are " + width + " and " + height);
    }
}
class Triangle2 extends TwoDShape2{
    String style;
    double area() {
        return width *height / 2;  //不能访问超类的private成员
    }
    void showStyle() {
        System.out.println("Triangle is " + style);
    }
}
/*这里Triangle类无法编译，因为对area()方法内部的width和height的引用导致了非法访问。因为width和
height被声明为private，所以他们只能被自己类中的其他成员访问。子类是无权访问它们的。
切记，被声明为private的类成员会保持对它的类的私有特性，而类以外的任何代码，包括子类在内都无权访
问这些私有成员。          你开始可能会认为子类无权访问超类的私有成员这一事实是一个过于严格的限制，
会在许多情况下妨碍私有成员的使用，然而情况并非如此。java程序员通常使用访问器方法来访问类的私有成员。
*/

