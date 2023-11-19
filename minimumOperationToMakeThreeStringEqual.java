public class minimumOperationToMakeThreeStringEqual {

    // we just need to find out the
    // biggest length of the common prefix.
    // that we can explore from this string.

    public static int solver(String a, String b, String c) {

        // sidhe sidhe har string meh longest
        // common prefix find out kr loo
        // that can be the minimum length.

        // since we are asked to find out minimum operation
        // isliye we will be simplyyy doing minimum of length.

        int length = Math.min(a.length(), Math.min(b.length(), c.length()));

        int totalCharacter = a.length() + b.length() + c.length();

        if (a.charAt(0) != b.charAt(0) || b.charAt(0) != c.charAt(0)) {
            return -1;
        }

        for (int i = 0; i < length; i++) {

            if (a.charAt(i) == b.charAt(i) && b.charAt(i) == c.charAt(i)) {
                totalCharacter -= 3;
            } else {
                break;
            }
        }
        return totalCharacter;
    }

    public static int method2(String a, String b, String c) {

        int ans = -1;
        int m = a.length();
        int n = b.length();
        int o = c.length();
        for (int i = 0; i < Math.min(m, Math.min(n, o)); i++) {
            String prefs1 = a.substring(0, i + 1);
            String prefs2 = b.substring(0, i + 1);
            String prefs3 = c.substring(0, i + 1);
            if (prefs1 == prefs2 && prefs2 == prefs3) {
                // part which i have to remove.
                // to find out the unmatched parts
                // coz these are probably the character
                // we need to remove to make the string equal.
                ans = m - (i + 1) + n - (i + 1) + o - (i + 1);
            } else {
                break;
            }
        }

        return ans;
    }
}