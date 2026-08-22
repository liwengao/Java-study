package chap04;

public class MathUtil {

    final static double PI = 3.1415926;
    final static double STRAIGHT_ANGLE = 180;
    final static double DEGREES_TO_RADIANS = PI / STRAIGHT_ANGLE;

    public static  double toRadians(double degrees)
    {
        return degrees * DEGREES_TO_RADIANS;
    }
    public static double degrees(double toRadians)
    {
        return toRadians * DEGREES_TO_RADIANS;
    }
}
