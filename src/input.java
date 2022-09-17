
import java.io.Console;

public class input {
    public static void main(String[] args) {
        Console cns = System.console();
        String a = cns.readLine("Enter your name :");
        char[] pwd = cns.readPassword("Enter the secret code!!!");
        String s = new String(pwd);
        System.out.println(s);
    }
}
