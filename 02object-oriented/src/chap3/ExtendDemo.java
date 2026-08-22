package chap3;

public class ExtendDemo {
    static void main(String[] args) {
        PhysicalProduct p = new PhysicalProduct("Book", 19.99, 0.5);
        System.out.println(p.displayInfo()+"，重量"+p.getWeight());
        p.show();
    }
}
