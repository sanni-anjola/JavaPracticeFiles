package africa.semicolon.leetcode.digicore;

import java.util.Arrays;

public class AddStringsAsNumber {

    // 1
    public static String addStrings(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        int i = num1.length() - 1;
        int j = num2.length() - 1;

        while (i > -1 || j > -1) {
            int sum = carry + (i < 0 ? 0 : num1.charAt(i--) - 48);
            sum += j < 0 ? 0 : num2.charAt(j--) - 48;
            sb.append(sum % 10);
            carry = sum / 10;
        }
        return sb.append(carry == 1 ? "1" : "").reverse().toString();
    }

    // 2
    public static int[] tableWinner(int[] player1Points, int[] player2Points){
        int[] res = {0, 0};
        for (int i = 0; i < player1Points.length; i++) {
            if(player1Points[i] > player2Points[i]) res[0]++;
            if(player1Points[i] < player2Points[i]) res[1]++;
        }


        return res;
    }
    public static void main(String[] args) {
        System.out.println(addStrings("3", "9"));
        System.out.println(Arrays.toString(tableWinner(new int[]{1, 4, 7, 2, 4}, new int[]{3, 4, 2, 4, 4})));
    }

}
