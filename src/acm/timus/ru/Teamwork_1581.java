package acm.timus.ru;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 * Problem 1581
 * 
 * http://acm.timus.ru/problem.aspx?space=1&num=1581
 * 
 * @author Andrei Palade
 */

public class Teamwork_1581 {
    
    public static String solve(String[] line) {
        String result = "";
        int size = 1;
        for (int i = 0; i < line.length; i++) {
            if (i == line.length - 1) {
                result += size + " " + line[i];
            } else if (line[i].equals(line[i + 1])) {
                size++;
            } else {
                result += size + " " + line[i] + " ";
                size = 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        
        try {
            int n = Integer.parseInt(in.readLine().trim());
            String[] line = in.readLine().split(" ");
            if(n == line.length){
                out.println(solve(line));
            }
        } catch (IOException ex) {
            Logger.getLogger(Teamwork_1581.class.getName()).log(Level.SEVERE, null, ex);
        }
        out.flush();
    }

}
