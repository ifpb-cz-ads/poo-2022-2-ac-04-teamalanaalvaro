public class BMExercicio07 {
    public static void main(String[] args) {
        int x = 187;
        int y;
        while (x > 1) {
            if (x % 2 == 0) {
                y = x / 2;
            } else {
                y = 3 * x + 1;
            }
            System.out.print(" -> " + y);
            x = y;
        }
    }
}
