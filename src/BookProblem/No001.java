package BookProblem;

import java.util.Scanner;

// 백준 P11720 숫자의 합 구하기
public class No001 {
    public static void main(String[] args[]){

        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();

        String numbers = sc.next();

        long sum = 0;
        for(String num : numbers.split("")){
            sum += Integer.parseInt(num);
        }
        System.out.println(sum);

    }
}
