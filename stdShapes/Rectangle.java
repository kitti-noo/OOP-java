public class Rectangle {
    public static void main(String[] args)
    {
      if (args.length != 1)
        System.out.println("Usage: java Rectangle <number>");
      else {
        int n = Integer.parseInt(args[0]);
        if (n > 0)
          draw(n, 0.5, 0.5, 0.5,0.5);
        else
          System.out.println("Depth of recursion should exceed 0.");
      }
    }  // end of main()
  
    private static void draw(int n, double x, double y, double hw,double hh)
    {
      if (n > 0) {
        drawRectangle(x, y, hw, hh);

        double ratio = 2.5;  
        draw(n-1, x-hw/2, y-hh/2, hw/ratio,hh/ratio);   
        draw(n-1, x-hw/2, y+hh/2, hw/ratio,hh/ratio);   
        draw(n-1, x+hw/2, y-hh/2, hw/ratio,hh/ratio);  
        draw(n-1, x+hw/2, y+hh/2, hw/ratio,hh/ratio);
        draw(n-1, x, y, hw/ratio,hh/ratio);
      //  draw(n-1, x-hw/1.5, y, hw/ratio,hh/ratio);  
      //  draw(n-1, x-hw/1.5, y, hw/ratio,hh/ratio);  
      }
    }  // end of draw()
  
    private static void drawRectangle(double x, double y, double hw ,double hh)
    // draw a shaded Rectangle using a filled light blue square 
    // and an unfilled blue Rectangle
    {
      StdDraw.setPenColor(StdDraw.BOOK_LIGHT_BLUE);
      StdDraw.filledRectangle(x, y, hw/1.5, hh/2);
      StdDraw.setPenColor(StdDraw.BOOK_BLUE);
      StdDraw.rectangle(x, y, hw/1.5, hh/2);
    }  /// end of drawRectangle
  
  
  }  // end of Rectangle class
  
  
