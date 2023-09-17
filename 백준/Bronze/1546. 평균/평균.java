import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int index = Integer.parseInt(reader.readLine());
        String input = reader.readLine();
        StringTokenizer stringTokenizer = new StringTokenizer(input);

        double arr[] = new double[index];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = Double.parseDouble(stringTokenizer.nextToken());
        }

        double max = arr[0];
        for(int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        double result = 0;
        for(int i = 0; i < arr.length; i++) {
            result += (arr[i] / max) * 100.0;
        }
        
        System.out.println(result/arr.length);

        reader.close();
    }
}