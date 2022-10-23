import java.util.*;
public class Replace {
    public static void main(String[] args) {
        String str="bbadbbababb";
        char c='t';
        HashMap<Character,Integer>hm=new HashMap<>();
        for(int i=0;i<str.length();i++){
            hm.put(str.charAt(i),hm.getOrDefault(str.charAt(i),0)+1);
        }
        int max=0;
        for(Map.Entry<Integer,Integer>entry:hm.entrySet()){
            if(entry.getValue()>max){
                max=entry.getValue();
            }
        }
        for()
    }
}
