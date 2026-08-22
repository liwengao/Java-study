package chap03;

public abstract class Product {
    private String name;
    private double price;
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
//        System.out.println("Product()");
    }
    public static PhysicalProduct createPhysicalProduct(String name, double price, double weight) {
        return new PhysicalProduct(name, price, weight);
    }
    public static DigitalProduct createDigitalProduct(String name, double price, String secretkey) {
        return new DigitalProduct(name, price, secretkey);
    }
    public String displayInfo()
    {
        return "商品名称：" + name + "，价格：" + price;

    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public abstract void sendProduct();

}
