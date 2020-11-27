public class PowersOf2 {
    public static void main(String[] args) {
        powers(8);
    }

    public static void powers(int n) {
        System.out.println("***Output***");
        for (int i = 1, val = 2; i <= n; i++) {
            System.out.println(val);
            val *= 2;
        }
    }
}
