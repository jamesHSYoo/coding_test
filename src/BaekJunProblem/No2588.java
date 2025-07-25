package BaekJunProblem;
import java.util.StringTokenizer;
import java.io.*;

public class No2588{
    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stz = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(stz.nextToken());
        stz = new StringTokenizer(br.readLine());
        int b = Integer.parseInt(stz.nextToken());
        
        int b1 = b%10;
        int b2 = (b/10)%10;
        int b3 = b/100;
        
        System.out.println(a * b1);
        System.out.println(a * b2);
        System.out.println(a * b3);
        System.out.println(a * b);
        
        
        
        
    }
    
}
