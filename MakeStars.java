import java.util.*;
public class MakeStars{
  public static void main( String[]args ){
      Scanner n = new Scanner(System.in);
      while (n.hasNextLine()){
        Scanner l= new Scanner (n.nextLine());
        while (l.hasNext()) {
          Scanner w=new Scanner(l.next());
          while (w.hasNext()) {
            for (int i=0; i<w.next().length(); i++){
              System.out.println("*");
            }
          }
          if (l.hasNext()) System.out.println(" ");
        }
        if (n.hasNext()) System.out.println();
      }
  }
}
