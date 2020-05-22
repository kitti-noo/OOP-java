
public class Extractlt {
    private String URL;
    private String STR;
    public Extractlt (){
    }
    public String extractIt(String url) {
      this.URL = url;
      String []  text  = URL.split("/");
      for (int i = 0; i < text.length; i++) {
        if (i == text.length-1){
          String newtext = text[i].replace('*','_');
          this.STR = newtext;
        }
      }
      return STR;
   }
}
    