package leetcode.Pattern;

public class Rumbhous {
    public static void main(String[] args) {
        int n =5;
        for (int i=n;i>0;i--){
            for(int k=i-1;k>0;k--){
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
//            * * * * *
//           * * * * *
//          * * * * *
//         * * * * *
//        * * * * *
