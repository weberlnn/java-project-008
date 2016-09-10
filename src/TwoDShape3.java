/**
 * Created by lin on 2016/8/24.
 */
// 使用访问器来方法来设置和获取私有成员。
    //二维对象的类。
public class TwoDShape3 {
    private double width; // 这些都是。
    private double height; // 现在私有的。
    //宽度和高度的访问方法。
    double getWidth() { return width; } // width和height的访问器方法。
    double getHeight() { return height; }
    void setWidth(double w) {width = w; }
    void setHeight(double h) {height = h; }
    void showDim() {
        System.out.println(" 宽度和高度是 " + width + " 和 " + height);
    }
}
// 一个子类的TwoDShape三角形。
class Triangle3 extends TwoDShape3{
   String style;
    double area() {
        return getWidth() * getHeight() / 2;// 使用超类提供的访问器方法。
    }
        void showStyle() {
            System.out.println("三角形是 " + style);
    }
}
class Shapes3{
    public static void main(String args[]) {
        Triangle3 t1 = new Triangle3();
        Triangle3 t2 = new Triangle3();

        t1.setWidth(4.0);
        t1.setHeight(4.0);
        t1.style = "filled";

        t2.setWidth(8.0);
        t2.setHeight(12.0);
        t2.style = "outlined";

        System.out.println("信息为t1: ");
        t1.showStyle();
        t1.showDim();
        System.out.println(" 面积是 " + t1.area());
        System.out.println();
        System.out.println(" 信息为t2: ");
        t2.showStyle();
        t2.showDim();
        System.out.println(" 面积是 " +t2.area());
    }
}
