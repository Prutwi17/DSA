package leetcode.Pattern;

public class Butterfly {
    public static void main(String[] args) {
        int n = 5;

        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            for(int l=1;l<2*(n-i);l++){
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n-1;i>=0;i--){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            for(int l=1;l<2*(n-i);l++){
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
//        *         *
//        **       **
//        ***     ***
//        ****   ****
//        ***** *****
//        ***** *****
//        ****   ****
//        ***     ***
//        **       **
//        *         *
