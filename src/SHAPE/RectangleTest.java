package SHAPE;

public class RectangleTest {
    public static void main(String[] args) {
        Rectacngle rectacngle = new Rectacngle();
        System.out.println(rectacngle);

        rectacngle = new Rectacngle(2.3,5.8);
        System.out.println(rectacngle);

        rectacngle=new Rectacngle("orange",true,2.5,3.8);
        System.out.println(rectacngle);
    }
}
