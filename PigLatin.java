import java.util.*;
public class PigLatin{
  public static void main(String[] args){
    Scanner n = new Scanner(System.in);
    while (n.hasNextLine()){
      Scanner l= new Scanner (n.nextLine());
      while (l.hasNext()) {
        Scanner w=new Scanner(l.next());
        while (w.hasNext()) {
          System.out.print(pigLatinSimple(w.next()));
        }
        if (l.hasNext()) System.out.print(" ");
      }
      if (n.hasNext()) System.out.println();
    }
    System.out.println();
  }
  public static String pigLatinSimple(String s){
    char first=s.charAt(0);
    if (first == 'a' || first == 'e' || first == 'i' || first == 'o' || first == 'u'){
      return s+"hay";
    }
    else if (s.length()>1){
      return s.substring(1)+first+"ay";
    }
    else return s+"ay";
  }
}
