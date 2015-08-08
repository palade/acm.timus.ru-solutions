package acm.timus.ru;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Andrei
 */
public class OneTenHundredThousand_1209 {

    public static boolean solve(String line) {
        double number = Double.parseDouble(line);
        double i = 1;
        while (number >= i) {
            number = number - i;
            i = i + 1;
        }
        
        return number == 1;
    }
    
    public static boolean solve2(String line) {
        double number = Double.parseDouble(line);
        return Math.sqrt(8*number - 7) % 1 == 0;
    }
    
    public static void main(String[] args) {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        
        try {
            int n = Integer.parseInt(in.readLine().trim());
            for (int i = 0; i < n; i++){
                String line = in.readLine();
                out.print(solve2(line)? 1 : 0);
                if(i != n-1)
                    out.print(" ");
            }
        } catch (IOException ex) {
            Logger.getLogger(OneTenHundredThousand_1209.class.getName()).log(Level.SEVERE, null, ex);
        }
        out.flush();
    }
}
