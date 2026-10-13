package leetcode.Pattern;

public class Alphabet {
    public static void main(String[] args) {

        int n = 5;

        for (int i = 0; i < n; i++) {
            char c = 'A';
            for(int j=0;j<=i;j++) {
                System.out.print(c+" ");
                c++;
            }
            System.out.println();
        }
    }
}
//        A
//        A B
//        A B C
//        A B C D
//        A B C D E
