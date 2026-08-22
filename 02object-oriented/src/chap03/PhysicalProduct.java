package chap03;

public class PhysicalProduct extends Product {
    public double getWeight() {
        return weight;
    }

    public PhysicalProduct(String name,double price,double weight) {
        super(name, price);//Java中隐含调用父辈
        this.weight = weight;
//        System.out.println("PhysicalProduct()");
    }
    public String displayInfo()
    {
        return super.displayInfo()+",重量:"+weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }

    private double weight;

    public void sendProduct(){
        System.out.println("发送实体商品：" + super.getName());

    }
}
