package BookProblem;

import java.util.Scanner;
/* 백준 P11720 숫자의 합 구하기
 * 점수를 조작 하기 위해 자신의 점수 최대값 MAX 를 고른 후 
 * 모든 점수를 점수/MAX * 100 으로 고쳤다. 
 * 그 후 평균을 구한다. 
 */ 
public class No002 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        double sum = 0;
        int totalNum = sc.nextInt();
        long[] numbers = new long[totalNum];
        for(int i = 0 ; i < totalNum ; i++){
            numbers[i] = sc.nextInt();
        }
        long maxNum = numbers[0];

        for(long num : numbers){
            if(maxNum < num){
                maxNum = num;
            }
            sum += num;
        }


        System.out.println((sum/maxNum*100)/totalNum);
    }
}
