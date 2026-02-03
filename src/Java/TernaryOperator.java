package Java;

public class TernaryOperator {
    public static void main(String[] args) {
        int Number = 5;
        String result = Number > 0 ? "Positive" : "Negative";
        System.out.println(result);
        int Number1 = -5;
        String result1 = Number1 > 0 ? "Positive" : "Negative";
        System.out.println(result1);
        System.out.println(Math.min(Number, Number1));
        System.out.println(Math.max(Number, Number1));
    }
}
