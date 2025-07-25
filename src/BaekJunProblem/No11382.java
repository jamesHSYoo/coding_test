package BaekJunProblem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No11382 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stz = new StringTokenizer(br.readLine());
        long a = Long.parseLong(stz.nextToken());
        long b = Long.parseLong(stz.nextToken());
        long c = Long.parseLong(stz.nextToken());

        System.out.println(a+b+c);
    }
}
