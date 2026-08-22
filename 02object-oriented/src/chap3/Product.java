package chap3;

public class Product extends Grandpa{
    private String name;
    private double price;
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
        System.out.println("Product()");
    }
    public String displayInfo()
    {
        return "商品名称：" + name + "，价格：" + price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
