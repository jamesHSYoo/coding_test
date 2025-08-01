package BookProblem;

import java.util.StringTokenizer;
import java.io.*;

// 백준 10986번 문제 나머지 합
public class No005 {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stz = new StringTokenizer(br.readLine());

        int numOfNumbers = Integer.parseInt(stz.nextToken());
        int divNum = Integer.parseInt(stz.nextToken());
            
        long[] sums = new long[numOfNumbers+1];      // i 값 : 1~i번째 값들의 합
        long[] reminders = new long[divNum]; // i번째 값 : sum 중에서 divNum 으로 나눴을때 나머지가 i인 원소들의 갯수

        stz = new StringTokenizer(br.readLine());

        for(int i = 1; i <= numOfNumbers ; i++){
            sums[i] = sums[i-1] + Long.parseLong(stz.nextToken());
        }
        long answer = 0;
        for(int i = 1; i <= numOfNumbers ; i++){
            int reminder = (int) (sums[i] % divNum);
            if(reminder == 0){
                answer++;
            } 
            reminders[reminder]++;
        }

        /*
         * sums[i]%div == sum[j]%div = 1 이면 
         * (sum[i] - sum[j])%div = 0 이 되므로 
         * 구간 numOfNumbers[i]~numOfNumbers[j] 까지의 합이 div로 나눠떨어지는것이다.
         * (sum[i] - sum[j]) = numOfNumbers[i+1] + ... + numOfNumbers[j]
         * 
         * 그러므로 나머지가 똑같은 sums원소 중에서 2개를 픽하는 경우를 합쳐주면 된다.
         */

        for(int i =0 ; i < divNum ; i++){
            if(reminders[i] > 1){  // 0인 애들은 위해서 다 해결됨
                answer = answer +((reminders[i] * (reminders[i] -1 ) / 2));
            }
        }
        System.out.println(answer);
    }


}
