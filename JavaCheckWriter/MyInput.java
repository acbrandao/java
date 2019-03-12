import java.io.*;
import java.util.*;

public class MyInput
{ 
  static private StringTokenizer stok;
  static private BufferedReader br
    = new BufferedReader(new InputStreamReader(System.in), 1);

  public static int readInt()
  { 
    int i = 0;
    try
    { 
      String str = br.readLine();
      StringTokenizer stok = new StringTokenizer(str);
      i = new Integer(stok.nextToken()).intValue();
    }
    catch (IOException ex)
    { 
      System.out.println(ex); 
    }
    return i;
  }

  public static double readDouble()
  { 
    double d = 0;
    try
    { 
      String str = br.readLine();
      stok = new StringTokenizer(str);
      d = new Double(stok.nextToken()).doubleValue();
    }
    catch (IOException ex)
    { 
      System.out.println(ex); 
    }
    return d;
  }
}


