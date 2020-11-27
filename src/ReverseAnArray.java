public class ReverseAnArray {
    public static void main(String[] args) {
        String[] breakfast = {"Sausage", "Eggs", "Beans", "Bacon", "Tomatoes", "Mushrooms"};
        System.out.println(reverse(breakfast));
    }

    public static String reverse(String[] breakfast) {
        System.out.println("***Output***");
        String temp = new String();
        for (int i = 0; i < breakfast.length / 2; i++) {
            temp = breakfast[i];
            breakfast[i] = breakfast[breakfast.length - i - 1];
            breakfast[breakfast.length - i - 1] = temp;
        }

        for (int i = 0; i < breakfast.length; i++) {
            System.out.println(": " + breakfast[i]);
        }
        return ": Tails";
    }
}
