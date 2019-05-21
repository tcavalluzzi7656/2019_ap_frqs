import java.util.ArrayList;

public class Delimiters {

    private String openDel;
    private String closeDel;

    public Delimiters(String open, String close){
        openDel = open;
        closeDel = close;
    }

    public ArrayList<String> getDelimitersList(String[] tokens){
        ArrayList<String> delims = new ArrayList<>();
        for(int i = 0; i < tokens.length; i++){
            if(tokens[i].equals(openDel) || tokens[i].equals(closeDel)){
                delims.add(tokens[i]);
            }
        }
        return delims;
    }

    public boolean isBalanced(ArrayList<String> delimiters){
        int opencount = 0;
        int closecount = 0;
        for(int i = 0; i < delimiters.size(); i++){
            if(opencount >= closecount){
                if(delimiters.get(i).equals(openDel)){
                    opencount++;
                } else {
                    closecount++;
                }
            } else {
                return false;
            }
        }
        if(opencount == closecount){
            return  true;
        }
        return false;
    }
}
