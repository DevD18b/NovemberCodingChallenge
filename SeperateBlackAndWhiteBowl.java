public class SeperateBlackAndWhiteBowl {

    public static int swap(String str) {

        // is problem meh simple saa intition hai
        // kii agar meh white bowls left meh laane ki koshis
        // karunga toh automatically
        // mere black bowl right meh aah jayenge
        // now the thing is one pattern recognition.

        // str = 101.
        // at zero i will check how many ones i have seen from left.
        // because meh left seh traverse krte krte aah raha hoon
        // and number of ones in the path will obviously.
        // be discovered. so we will be simply not gonna swap
        // instead hum utne number of ones swaps meh add kr denge
        // jis seh kiii
        // we will be simplyy able to get the number of swaps
        // needed to club all ones together to the right.
        // and the zeros at left.
        int countOnes = 0;
        int ans = 0;
        // int n = str.length();
        for (char ch : str.toCharArray()) {
            if (ch == '0') {
                ans += countOnes;
            } else {
                countOnes++;
            }
        }
        return ans;

    }
}
