package Score;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ScoreBoard1 obj1 = new ScoreBoard1();
        ScoreBoard2 obj2 = new ScoreBoard2();
        HeadQuater obj = new HeadQuater();              
        obj.register(obj1); 
        obj.register(obj2);                         
        while(true){
            System.out.print("Enter Score :");
            String str = input.nextLine();
            if(!str.isEmpty()){
                obj.setscore(str);
            }else return;
        } 
    
    }
}