package leetcode.Pattern;

public class AlphaNumeric {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 0; i < n; i++) {
            char c = 'A';
            if(i % 2 == 0) {
                for (int j = 0; j <= i; j++) {
                    System.out.print(c + " ");
                    c++;
                }
            }else{
                for(int k=0;k<=i;k++){
                    System.out.print(k+1+" ");
                }
            }
            System.out.println();
        }
    }
}
//        A
//        1 2
//        A B C
//        1 2 3 4
//        A B C D E
