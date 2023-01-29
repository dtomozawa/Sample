
public class Smallkadai {
    public static void main(String[] args) {
        int num1 = 500;
        int num2 = 10;
        int[] result = new int[5];
        result[0] = num1 + num2;
        result[1] = num1 - num2;
        result[2] = num1 * num2;
        result[3] = num1 / num2;
        result[4] = num1 % num2;

        System.out.println("num1 + num2 = " + result[0]);
        System.out.println("num1 - num2 = " + result[1]);
        System.out.println("num1 * num2 = " + result[2]);
        System.out.println("num1 / num2 = " + result[3]);
        System.out.println("num1 % num2 = " + result[4]);
    }
}
