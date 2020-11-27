public class PackDuplicates {
    public static void main(String[] args) {
        char[] letters = {'a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e'};

        pack(letters);
    }

    public static void pack(char[] letters) {
        System.out.println("***Output***");
        System.out.print(": ");
        for (int i = 0; i < letters.length; i++) {
            if (i != 0 && letters[i - 1] != letters[i]) {
                System.out.print(", " + letters[i]);
            } else {
                System.out.print(letters[i]);
            }
        }
    }
}
