package chap01;

public class Girl {
    String name;
    int height;
    int weight;
    int caluculaBMI() {
        double getheight = height / 100.0;
        return (int)(weight / (getheight * getheight));
    }
}
