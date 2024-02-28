package l31;


@FunctionalInterface
public interface FunctionalInterfaces {
    int operate (int a, int b);
}

class Calculator{
    public static void main(String[] args) {
       /* FunctionalInterfaces add = new FunctionalInterfaces() {
            @Override
            public int operate(int a, int b) {
                return a + b;
            }
        };*/
        FunctionalInterfaces add = (a, b) -> a + b;
        FunctionalInterfaces subt = new FunctionalInterfaces() {
            @Override
            public int operate(int a, int b) {
                return a - b;
            }
        };
        FunctionalInterfaces mult = new FunctionalInterfaces() {
            @Override
            public int operate(int a, int b) {
                return a*b;
            }
        };
        FunctionalInterfaces del = new FunctionalInterfaces() {
            @Override
            public int operate(int a, int b) {
                return a/b;
            }
        };

        System.out.println("Welcome to simple calculator!\n"
                + "You can + , - , * and /\n"
                + "Have fun!");
        System.out.println("2 + 2 = " + add.operate(2, 2));
        System.out.println("2 - 2 = " + subt.operate(2, 2));
        System.out.println("2 * 2 = " + mult.operate(2, 2));
        System.out.println("2 / 2 = " + del.operate(2, 2));
    }
}
