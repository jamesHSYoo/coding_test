package BookProblem;

import java.io.*;
import java.util.StringTokenizer;

public class No003BookAnswer {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer stz = new StringTokenizer(br.readLine());
        int numArray = Integer.parseInt(stz.nextToken());
        int questions = Integer.parseInt(stz.nextToken());

        stz = new StringTokenizer(br.readLine());
        int[] partialSum = new int[numArray + 1];
        for(int i = 1 ; i <= numArray ; i++){
            partialSum[i] = partialSum[i-1] + Integer.parseInt(stz.nextToken());
        }
        for(int i = 0 ; i < questions ; i++){
            stz = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(stz.nextToken());
            int end = Integer.parseInt(stz.nextToken());
            System.out.println(partialSum[end] - partialSum[start-1]);
        }
    }
}
