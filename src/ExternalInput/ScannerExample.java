package ExternalInput;

import java.util.*;

public class ScannerExample {

    public static void main(String[] agrs){

        Scanner sc = new Scanner(System.in);
        // 토큰(공백, 개행, 탭)을 기준으로 데이터를 입력받는다.
        /*
         * next() : String 을 읽음 토큰(Token)을 기준으로 읽음.
         * nextLine() : 개행(Enter)을 기준으로 읽음
         * nextInt() : int 를 읽음
         * nextBoolean() : boolean 을 읽음
         * nextByte() : byte 를 읽음
         * nextShort() : short 를 읽음
         * nextLong() : long 를 읽음
         * nextFloat() : float 를 읽음
         * nextDouble() : double 를 읽음
         */

        // 기본 타입
        // byte a = sc.nextByte();
        // short b = sc.nextShort();
        // int c = sc.nextInt();
        // long d = sc.nextLong();

        // float e = sc.nextFloat();
        // double f = sc.nextDouble();

        // boolean g = sc.nextBoolean();

        /*
         * abc def 라고 입력하면
         * 다음과 같이 출력됨
         * abc 
         *  def -> i 에 " def" 가 입력됨
         * 
         * 만약 abcdef 를 입력하고 엔터를 치면
         * 다음과 같이 출력됨
         * abcdef
         * 
         * 바로 위에 abcdef이후 엔터로 인하여 i 빈 문자열이 입력된다.(디버깅으로 확인 가능)
         */
        String h = sc.next();
        String i = sc.nextLine();

        // System.out.println(a);
        // System.out.println(b);
        // System.out.println(c);
        // System.out.println(d);
        // System.out.println(e);
        // System.out.println(f);
        // System.out.println(g);
        System.out.println("h : " + h);
        System.out.println("i : " + i);
    }

}
