package chap03;

public class PolymorphismDemo{
    public static void main(String[] args) {
        PhysicalProduct p = new PhysicalProduct("Book", 19.99, 0.5);
        DigitalProduct d = new DigitalProduct("Moviekey", 4.99, "123456");
        createOrder(p);
        createOrder(d);
    }
    public static void createOrder(Product p){
        //由于向上转型，子类转为父类，p为父类类型，因此调用的是父类的方法，而不是子类的方法
        //如果要调用子类的方法，需要将p转为子类类型，即向下转型要做类型检查
//        if (p instanceof PhysicalProduct) {
//            PhysicalProduct pp = (PhysicalProduct) p;
//            pp.setWeight(0.68);
//        }
        System.out.println(p.displayInfo());
        System.out.println("订单已创建");

    }
}
