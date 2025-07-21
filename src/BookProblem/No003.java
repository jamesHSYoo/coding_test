package BookProblem;

import java.util.*;

public class No003 {
    /*
     * 백준 P11659 구간 합 구하기4
     * 주어진 배열 A가 주어졌을 때
     * S[i] = S[i-1] + A[i] 라는 사실을 이용해서 
     * 구간 a,b 의 합(이문제에서의 인덱스틑 1부터 시작하므로 그걸 조절 해줄 필요 있음)
     *  = S[b-1] - S[a-2] 
     */
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        
        int length = sc.nextInt();
        int question = sc.nextInt();

        int[] partialSum = new int[length];
        for(int i = 0 ; i < length ; i++){
            if(i == 0){
                partialSum[i] = sc.nextInt();
            }
            else{
                partialSum[i] = partialSum[i-1] + sc.nextInt();
            }
        }
        int[] result = new int[question];

        for(int i = 0 ; i < question ; i++){
            int start = sc.nextInt();
            int end = sc.nextInt();
            result[i] = partialSum[end-1]-(start == 1 ? 0 : partialSum[start - 2]);
        }
        for(int sum : result){
            System.out.println(sum);
        }


    }

}
