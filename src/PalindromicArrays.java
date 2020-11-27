public class PalindromicArrays {
    public static void main(String[] args) {
        String[] palindromic = {"Sausage", "Eggs", "Beans", "Beans", "Eggs", "Sausage"};
        String[] breakfast = {"Sausage", "Eggs", "Beans", "Bacon", "Tomatoes", "Mushrooms"};

        System.out.println("***Output***");
        System.out.println(isPalindrome(palindromic));
        System.out.println(isPalindrome(breakfast));
    }

    public static String isPalindrome(String[] breakfast) {
        boolean ans = true;
        for (int i = 0; i < breakfast.length / 2; i++) {
            if (!breakfast[i].equals(breakfast[breakfast.length - i - 1])) {
                ans = false;
                break;
            }
        }
        return ans ? "True" : "False";
    }
}
