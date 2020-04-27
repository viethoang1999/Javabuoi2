package BaiTapMang_Chuôi;
import java.util.*;
public class Exercise3_4 {
    static final int N = 256;
    static char MaxOccuringChar(String str1) {
        int ctr[] = new int[N];
        int l = str1.length();
        for (int i = 0; i < l; i++)
            ctr[str1.charAt(i)]++;
        int max = -1;
        char result = ' ';

        for (int i = 0; i < l; i++) {
            if (max < ctr[str1.charAt(i)]) {
                max = ctr[str1.charAt(i)];
                result = str1.charAt(i);
            }
        }
        System.out.println("Occurring of  " + result + "   is : " + max);
        return result;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Mời bạn nhập chuỗi: ");
        String str1 = scanner.nextLine();
        System.out.println("The given string is: " + str1);
        MaxOccuringChar(str1);
        //System.out.println("Max occurring character in the given string is: " + MaxOccuringChar(str1));
        //System.out.println("Occurring  is: " + );
    }
}
