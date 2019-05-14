import java.util.regex.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Slova {
    public static void main(String [] args){
        palindrome pn = new palindrome();
        BufferedReader inputStream = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Vvedite slovo: ");
            String input = inputStream.readLine();
            System.out.print("");
            System.out.print(pn.isPalindrome(input));
        }catch (IOException exception) {
            System.err.println("Input error");
        }}
    public boolean isPalindrome(String input){
        int i = input.length()-1;
        int j=0;
        while(i > j) {
            if(input.charAt(i) != input.charAt(j)) {
                return false;
            }
            i--;
            j++;
        }
        return true;
    }}
