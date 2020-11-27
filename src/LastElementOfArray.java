public class LastElementOfArray {
    public static void main(String[] args) {
        String[] breakfast = {"Sausage", "Eggs", "Beans", "Bacon", "Tomatoes", "Mushrooms"};
        System.out.println(lastElement(breakfast));
    }

    public static String lastElement(String[] breakfast) {
        return breakfast[breakfast.length - 1];
    }
}
