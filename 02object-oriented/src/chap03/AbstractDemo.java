package chap03;

public class AbstractDemo {
    public static void main(String[] args) {
        PhysicalProduct p = new PhysicalProduct("Book", 9.99, 0.5);
        DigitalProduct d = new DigitalProduct("Movie", 6.99, "123456");
        sendProduct(p, d);
//        Product[] products = {p, d}={p,d};
    }
    public static  void sendProduct(Product ... p){
        for (int i = 0; i < p.length; i++) {
            Product product = p[i];
            product.sendProduct();
        }
    }
}
