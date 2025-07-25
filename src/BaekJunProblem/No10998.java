package BaekJunProblem;

import java.util.StringTokenizer;
import java.io.*;

public class No10998 {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stz = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(stz.nextToken());
        int b = Integer.parseInt(stz.nextToken());

        System.out.println(a*b);

    }

}
