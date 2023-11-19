public class maximizeXorProduct {

    // this problem was very straight forward
    // mujhe a diya hai
    // mujhe b diya hai
    // and mujhe x ko kuch aise choose krna hai
    // such that (a^x)*(b^x) --> comes out to be maximum;
    // so x ki range keh baareh meh thoda idea smjhaa deta hai
    // aapko jo ki hai kiii
    // 0<=x<=2^n.
    // tends from 0 to 50.
    // hum kisi bhi tarah brute force nhi soch sakte hai.
    // ab thoda saa aapko xor ki property smjhaa dete hai.
    // kya hota hai kii
    // xor kisi two bits ka set tab hota hai
    // jab woh values different ho. right.
    // a * b ki baat kre toh two numbers ka product toh tab hi maximum ata hoga.
    // jab hum two values kaa bich ka difference bahot kam kr sak paa rahe honge.
    // now the thing is kese kareh yeh chij.

    // so there are some cases right

    // case 1 when a and b have both the set bits as same.

    public int maximumXorProduct(long a, long b, int n) {
        int mod = (int) 1e9 + 7;
        for (int i = n - 1; i >= 0; i--) {
            long mask = (1 << i);
            if ((a ^ mask) != 0 && (b ^ mask) != 0) {
                continue;
            } else if ((a ^ mask) != 0) {
                if ((a > b)) {
                    a ^= mask;
                    b |= mask;
                } else {
                    // yaha pr hum isliye kuch nhi krte kyuki hum chaahte hai ki difference has to
                    // minimum
                    // agar a chota hai b seh toh probably sambhawna yeh hai kii
                    // a xor krne seh aur chota ho jayega.
                    // and b or krne seh bada is seh humara product overall decrease kr jayegaa.
                    continue;
                }
            } else if ((b ^ mask) != 0) {
                if (b > a) {
                    b ^= mask;
                    a |= mask;
                }

            } else {
                a ^= mask;
                b ^= mask;
            }
        }
        a %= mod;
        b %= mod;
        return (int) ((1L * a * b)) % mod;
    }
}
