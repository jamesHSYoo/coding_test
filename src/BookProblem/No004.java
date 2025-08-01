package BookProblem;

import java.io.*;
import java.util.StringTokenizer;

// 백준 11660번 문제 구간 합 구하기 5
public class No004 {

    public static void main(String[] agrs) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer stz = new StringTokenizer(br.readLine());

        int matSize = Integer.parseInt(stz.nextToken());
        int questionSize = Integer.parseInt(stz.nextToken());

        int[][] matrix = new int[matSize + 1][matSize + 1];

        for(int i = 1 ; i <= matSize; i++){
            stz = new StringTokenizer(br.readLine());
            for(int j = 1 ; j <= matSize ; j++){
                matrix[i][j] = Integer.parseInt(stz.nextToken());
            }
        }
        // sumFromOrigin 정의 -> (1,1)에서 (X, Y)까지의 합
        int[][] sumFromOrigin = new int[matSize+1][matSize+1];
        for(int i = 1 ; i <= matSize; i++){
            for(int j = 1 ; j <= matSize; j++){
                sumFromOrigin[i][j] = sumFromOrigin[i-1][j] + sumFromOrigin[i][j-1] - sumFromOrigin[i-1][j-1] + matrix[i][j];
            }
        }
        for(int i = 0 ; i < questionSize ; i++){
            stz = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(stz.nextToken());
            int y1 = Integer.parseInt(stz.nextToken());
            int x2 = Integer.parseInt(stz.nextToken());
            int y2 = Integer.parseInt(stz.nextToken());

            System.out.println(sumFromOrigin[x2][y2] - sumFromOrigin[x1-1][y2] - sumFromOrigin[x2][y1-1] + sumFromOrigin[x1-1][y1-1]);
        }
    }

}
