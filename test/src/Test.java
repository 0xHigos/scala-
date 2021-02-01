import java.util.*;

public class Test {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] res = s.fairCandySwap(new int[]{1, 1}, new int[]{2, 2});
        for (int re : res) {
            System.out.print(re+"\t");
        }
    }
}
class Solution {
    public int[] fairCandySwap(int[] A, int[] B) {
        int[] res = new int[2];
        int sumA = sum(A),sumB = sum(B);
        Arrays.sort(A);
        Arrays.sort(B);
        int temp = sumA - ((sumA + sumB) >> 1);
        int i = 0, j = 0;
        while(i < A.length && j < B.length){
            if(A[i] - B[j] == temp){
                res[0] = A[i];
                res[1] = B[j];
                break;
            }else if(A[i] - B[j] > temp){
                j++;
            }else{
                i++;
            }
        }
        return res;
    }

    private int sum(int[] res){
        int sum = 0;
        for (int i : res) {
            sum += i;
        }
        return sum;
    }
}