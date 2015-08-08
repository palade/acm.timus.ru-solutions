package acm.timus.ru;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Andrei
 */
public class IsenbaevNumber_1837 {

    private static Map<String, List<String>> tempMap = new HashMap<>();
    private static Map<String, Integer> map = new HashMap<>();
    
    private static String PARENT = "Isenbaev";
    
    public static void main(String[] args) {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        
        try {
            int n = Integer.parseInt(in.readLine().trim());
            while(n != 0){
                String[] names = in.readLine().split(" ");
                
                Integer score = null;
                int found = 0;
                for(int i = 0; i < 3; i++){
                    
                    Integer tempScore = map.get(names[i]);
                    
                    if(tempScore!=null && tempScore < score) {
                        score = tempScore;
                        found = i;
                    }
                }
                
                if(score != null){
                    
                } else {
                    if(tempMap.get(names[0]) != null){
                        tempMap.get(names[0]).addAll(Arrays.asList(names[1], names[2]));
                    } else {
                        tempMap.put(names[0], Arrays.asList(names[1], names[2]));
                    }
                    
                    if(tempMap.get(names[1]) != null){
                        tempMap.get(names[1]).addAll(Arrays.asList(names[0], names[2]));
                    } else {
                        tempMap.put(names[1], Arrays.asList(names[0], names[2]));
                    }
                    
                    if(tempMap.get(names[2]) != null){
                        tempMap.get(names[2]).addAll(Arrays.asList(names[0], names[1]));
                    } else {
                        tempMap.put(names[2], Arrays.asList(names[0], names[1]));
                    }
                }
                n--;
            }
            
            //if(n == line.length){
            //    out.println(solve(line));
           // }
        } catch (IOException ex) {
            Logger.getLogger(IsenbaevNumber_1837.class.getName()).log(Level.SEVERE, null, ex);
        }
        out.flush();
    }
}
