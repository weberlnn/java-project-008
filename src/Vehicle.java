/**
 * Created by lin on 2016/8/25.
 */
public class Vehicle {
    // 下面将Vehicle的实例变量设置为私有。
    private int passengers; // 的乘客数量
    private int fuelcap; // 加仑燃料能力
    private int mpg; // 英里每加仑的燃料消耗
    // 这是一个汽车的构造函数。
    Vehicle(int p, int f, int m) {
        passengers = p;
        fuelcap = f;
        mpg = m;
    }
    // 返回范围
    int range() {
        return mpg * fuelcap;
    }
    // 给定距离计算所需的燃料
    double fuelneeded(int miles) {
        return (double) miles / mpg;
    }
    // 实例变量的访问方法。
    int getPassengers() { return passengers; }
    void setPassengers(int p) { passengers = p; }
    int getFuelcap() { return fuelcap; }
    void setFuelcap(int f) { fuelcap = f; }
    int getMpg() { return mpg; }
    void setMpg(int m) { mpg = m; }
}
//扩展工具创建一个卡车专业化。
class Truck extends Vehicle {
    private int cargocap;
    //这是一个构造函数为Truck。
    Truck (int p, int f, int m, int c){
        //使用汽车的构造函数初始化车辆成员。
        super(p, f, m);
        cargocap = c;
    }
    //访问器方法cargocap。
    int getCargo() { return cargocap; }
    void putCargo(int c) { cargocap = c; }
}// 这里，Truck继承Vehicle,并添加了cargocap、getCargo()和putCargo()。因此，Truck包含Vehicle
//  定义的所有基本的汽车属性。它只需要添加自己类的独有项就可以了。
class TruckDemo{
    public static void main(String args[]) {
        //制造一些卡车
        Truck semi = new Truck(2, 200, 7, 44000);
        Truck pickup = new Truck(3, 28, 15, 2000);
        double gallons;
        int dist = 252;
        gallons = semi.fuelneeded(dist);
        System.out.println("半挂车可以携带 " + semi.getCargo() + " 磅. ");
        System.out.println("去 " + dist + " 英里半挂车需要 " +
                           gallons + " 个加仑的燃料.\n");
        gallons = pickup.fuelneeded(dist);
        System.out.println("皮卡车可以携带 " + pickup.getCargo() + " 磅.");
        System.out.println("去 " + dist + " 英里半挂车需要 " +
                           gallons + " 个加仑的燃料。");
    }
}
