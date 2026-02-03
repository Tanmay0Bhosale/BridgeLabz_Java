class RethrowExample {

    static int performDivision(int numerator, int denominator) {
        return numerator / denominator;
    }

    static int calculate(int numerator, int denominator) {
        try {
            return performDivision(numerator, denominator);
        } catch (ArithmeticException e) {
            throw new ArithmeticException(
                    "Error during division: Denominator cannot be zero"
            );
        }
    }

    public static void main(String[] args) {
        try {
            int result = calculate(10, 0);
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
