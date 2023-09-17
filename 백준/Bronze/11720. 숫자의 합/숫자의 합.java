import java.io.*;
import java.util.*;

public class Main {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int index = Integer.parseInt(reader.readLine());
        String input = reader.readLine();
        String inputList[] = input.split("");

        int arr[] = new int[index];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(inputList[i]);
        }

        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            result = result + arr[i];
        }
        
        System.out.println(result);
    }
}