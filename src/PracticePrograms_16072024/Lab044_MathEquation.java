package PracticePrograms_16072024;

public class Lab044_MathEquation {
    public static void main(String[] args) {
        float f = 30843753849378563.45f;
        byte b = (byte) f;
        System.out.println(b);//------------ Output --> -1

        //Cube root of x2+y2-|z|
        int x=2;
        int y=4;
        int z=-5;
        float f1 = (float) Math.cbrt((Math.pow(x,2)+Math.pow(y,2))-Math.abs(z));
        System.out.println(f1);
        System.out.println(Math.abs(-5.5));

    }
}
