import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Numbers {
    public static void main(String[] args) throws NumberFormatException, IOException {
        int count=0;
        int limit;
        System.out.println("Vvedite chislo:");
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        limit = Integer.parseInt(in.readLine());
        for(int i=1; i < limit; i++) {
            boolean isPrime = true;
            for(int j=2; j < i ; j++) {

                if(i % j == 0) {
                    isPrime = false;
                    break;
          }}
            if(isPrime) {
                System.out.print(i + " ");
                count++;
      }}}}
