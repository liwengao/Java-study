package chap04;

import chap03.DigitalProduct;
import chap03.PhysicalProduct;
import chap03.Product;

import java.text.DecimalFormat;

public class StaticFactoryMethodDemo3 {
    static void main(String[] args) {
        PhysicalProduct p = Product.createPhysicalProduct("Book", 19.99, 0.5);
        DigitalProduct d = Product.createDigitalProduct("Movie", 4.99, "123456");

    }
}
