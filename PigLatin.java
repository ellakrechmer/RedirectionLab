import java.util.*;
public class PigLatin{
  public static void main(String[] args){
    Scanner n = new Scanner(System.in);
    while (n.hasNextLine()){
      Scanner l= new Scanner (n.nextLine());
      while (l.hasNext()) {
        Scanner w=new Scanner(l.next());
        while (w.hasNext()) {
          System.out.print(pigLatin(w.next()));
        }
        if (l.hasNext()) System.out.print(" ");
      }
      if (n.hasNext()) System.out.println();
    }
    System.out.println();
  }
  public static String pigLatinSimple(String s){
    s=s.toLowerCase();
    char first=s.charAt(0);
    if (s.length()==1){
      if (first == 'a' || first == 'e' || first == 'i' || first == 'o' || first == 'u'){
        return s+"hay";
      }
      return s+"ay";
    }
    if (first == 'a' || first == 'e' || first == 'i' || first == 'o' || first == 'u'){
      return s+"hay";
    }
    else return s.substring(1)+first+"ay";
  }
  public static String pigLatin(String s){
    ArrayList<String> digraphs = new ArrayList<>(Arrays.asList(new String[] {"bl", "br", "ch", "ck", "cl", "cr", "dr", "fl", "fr", "gh", "gl", "gr", "ng", "ph", "pl", "pr", "qu", "sc", "sh", "sk", "sl", "sm", "sn", "sp", "st", "sw", "th", "tr", "tw", "wh", "wr"}));
    s=s.toLowerCase();
    if (s.length()>1){
      if (digraphs.contains(s.substring(0,2))){
        return s.substring(2)+s.substring(0,2)+"ay";
      }
    }
    return pigLatinSimple(s);
  }
}
