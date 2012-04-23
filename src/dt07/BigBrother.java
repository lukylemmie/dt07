package dt07;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Hashtable;

/**
 * Created with IntelliJ IDEA.
 * User: Andrew
 * Date: 23/04/12
 * Time: 11:24 AM
 * To change this template use File | Settings | File Templates.
 */
public class BigBrother {
    private Hashtable<String, String> censor = new Hashtable<String, String>();
    private TextFileReader reader = new TextFileReader();
    private ArrayList<String> censorWordSub;

    public BigBrother(){
        String wordPair[];

        try {
            censorWordSub = reader.OpenFile("censorWordList.txt");
        } catch (IOException e) {
            System.out.println("Failed to open censorWordList.txt file.  Please make sure it is in active directory");
        }

        for(String line : censorWordSub){
            wordPair = line.split("=");
            censor.put(wordPair[0], wordPair[1]);
        }
    }

    public String CensorText(String input){
        String output = "";
        String[] words;
        String temp;

        words = input.split(" ");

        for(String word : words){
            temp = word.replaceAll("[^a-zA-Z0-9]","");
            temp = censor.get(temp.toLowerCase());
            if(temp != null){
                output += temp + " ";
            } else {
                output += word + " ";
            }
        }

        return output;
    }
}
