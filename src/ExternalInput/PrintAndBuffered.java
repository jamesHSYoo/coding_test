package ExternalInput;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class PrintAndBuffered {
    public static void main(String[] agrs) throws IOException{

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(a);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String num = br.readLine();
        int b = Integer.parseInt(num);
        bw.write(String.valueOf(b));
        bw.flush();
    }
}
