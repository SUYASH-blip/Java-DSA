package Strings;

public class compareTo {
    public static void main(String[] args) {
        //very important method

        String a = "abc";
        String x = "fgh";
        System.out.println(a.compareTo(x));

        /*Process :-

          1.Checks character by character :- here in the example first it will compare
            a and f both are diff so it will calculate the difference in the ascii value
            here a = 97, and f = 102 so ans = 97-102 = -5.

          2.Now again checks b with g and c with h but the answer is same -5.

          3.in case of same characters it will simple skip them and compare next set of characters.

          4.The final output will be the maximum difference obtained from the different characters
            in ascii values.

         */

        String b = "abc";
        String c = "abcggg";
        System.out.println(b.compareTo(c));

        /*If the length of both strings is not same there are two cases:-

          1.CASE 1 :- Upto the length both strings are same

            like in the written example abc and abcgggg upto the length both are same
            so it will simply increment 1 for each extra value .So, if we do b.copmareTo(c) the output
            will be -3 and for c.compareTo(b) the output will be 3.

          2.CASE 2 :- Strings are not same upto the length :-

            in this case simply the normal procedure will follow.


         */

        String y = "axz";
        String z = "sty";
        System.out.println(y.compareTo(z));

    }
}
