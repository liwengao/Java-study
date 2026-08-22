package chap03;

public class ExtendDemo {
    static void main(String[] args) {
        PhysicalProduct p = new PhysicalProduct("Book", 19.99, 0.5);
        System.out.println(p.displayInfo()+"，重量"+p.getWeight());
        DigitalProduct d = new DigitalProduct("Movie", 4.99, "123456");
        System.out.println(d.displayInfo()+"，密钥"+d.getSecretkey());
    }
}
