package chap3;

public class PhysicalProduct extends Product {
    public double getWeight() {
        return weight;
    }

    public PhysicalProduct(String name,double price,double weight) {
        super(name, price);//Java中隐含调用父辈
        this.weight = weight;
        System.out.println("PhysicalProduct()");
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    private double weight;

}
