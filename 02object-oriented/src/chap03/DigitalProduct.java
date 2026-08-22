package chap03;

public class DigitalProduct extends Product {
    private String secretkey;

    public String getSecretkey() {
        return secretkey;
    }

    public void setSecretkey(String secretkey) {
        this.secretkey = secretkey;
    }

    public DigitalProduct(String name, double price, String secretkey) {
        super(name, price);
        this.secretkey = secretkey;
//        System.out.println("DigitalProduct()");
    }

    @Override
    public String displayInfo() {
        return super.displayInfo()+",密钥:"+secretkey;
    }

    @Override
    public void sendProduct() {
            System.out.println("发送数字商品：" + super.getName());

    }

}
