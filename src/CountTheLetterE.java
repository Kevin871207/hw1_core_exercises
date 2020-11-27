public class CountTheLetterE {
    public static void main(String[] args) {
        String s = "I never saw a purple cow";

        System.out.println(countEs(s));
    }

    public static int countEs(String s) {
        System.out.println("***Output***");
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'e') {
                ans++;
            }
        }
        return ans;
    }


}
