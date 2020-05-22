import java.util.Scanner;
public class MainExtractlt {

    public static void main(String[] args) {
        Scanner reader = new Scanner (System.in);
        System.out.print("Enter URL : ");
        String URL = reader.nextLine();
        //System.out.println(URL);
       Extractlt st = new Extractlt(); // create Object
       System.out.println("String : "+ st.extractIt(URL));
   }
}