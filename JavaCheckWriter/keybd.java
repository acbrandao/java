
import java.io.*;
import java.util.*;

/** Class keybd is designed to help your java programe read from the keyboard , simply use the 
methods listed below to into vaaroius java datatypes   

The ranges for the various datatypes are as follows
The largest byte value is 127
The largest short value is 32767
The largest integer value is 2147483647
The largest long value is 9223372036854775807
The largest float value is 3.4028235E38
The largest double value is 1.7976931348623157E308
The character S is upper case.
The value of aBoolean is true

 An example of use is:
     keybd kb = new keybd();
     int i = kb.readInt();   // reads an int from System.in
     float f = kb.readFloat();   // reads a float from System.in


*/


public class keybd {
/** Used internally to read directly from the keyboard */
    static InputStreamReader is = new InputStreamReader( System.in );
/** Used internally to read directly from the keyboard */
    static BufferedReader br = new BufferedReader( is );
    static StringTokenizer st;


    static StringTokenizer getToken() throws IOException {
       String s = br.readLine();
       return new StringTokenizer(s);
    }


/**
readBoolean : Use readBoolean when you wish to read a true or false answer, it will  return true when
the user enters true or 1 false otherwise

 * @return           true or false
 * @exception        Error Message indicating not of the right type
 */

public static   boolean readBoolean() {
       try {
          st = getToken();
          return new Boolean(st.nextToken()).booleanValue();
       } catch (IOException ioe) {
          System.err.println("IO Exception in EasyIn.readBoolean");
          return false;
       }
    }

/**
Use readbyt when you need to read a small  whole number no decimals
The largest byte value is 127
 * @return           the valid number as a byte
 * @exception        Error Message indicating not of the right type
 */


public static     byte readByte() {
       try {
         st = getToken();
         return Byte.parseByte(st.nextToken());
       } catch (IOException ioe) {
          System.err.println("IO Exception in EasyIn.readByte");
          return 0;
       }
    }


/**
readShort: Use  when you need to read a small whole numbers less than
The largest short value is 32767
 * @return           the valid number as a short
 * @exception        Error Message indicating not of the right type
 */
public static  short readShort() {
       try {
         st = getToken();
         return Short.parseShort(st.nextToken());
       } catch (IOException ioe) {
          System.err.println("IO Exception in EasyIn.readShort");
          return 0;
       }
    }


/**
readInt: Use  when you need to read a small whole numbers less than
The largest integer value is 2147483647

 * @return           the valid number as a int
 * @exception        Error Message indicating not of the right type
 */

public static    int readInt() {
       try {
         st = getToken();
         return Integer.parseInt(st.nextToken());
       } catch (IOException ioe) {
          System.err.println("IO Exception in EasyIn.readInt");
          return 0;
       }
    }



/**
readLong: Use  when you need to read a  whole numbers
The largest long value is 9223372036854775807

 * @return           the valid number 
 * @exception        Error Message indicating not of the right type
 */


public static    long readLong() {
       try {
         st = getToken();
         return Long.parseLong(st.nextToken());
       } catch (IOException ioe) {
          System.err.println("IO Exception in EasyIn.readLong");
          return 0L;
       }
    }



/**
readFloat: Use  when you need to read a  decimal numbers 
The largest float value is 3.4028235E38

 * @return           the valid number decime
 * @exception        Error Message indicating not of the right type
 */

public static    float readFloat() {
       try {
         st = getToken();
         return new Float(st.nextToken()).floatValue();
       } catch (IOException ioe) {
          System.err.println("IO Exception in EasyIn.readFloat");
          return 0.0F;
       }
    }

/**
readDouble: Use  when you need to read a  decimal numbers between
The largest double value is 1.7976931348623157E308

 * @return           the valid number decime
 * @exception        Error Message indicating not of the right type
 */
public static   double readDouble() {
       try {
         st = getToken();
         return new Double(st.nextToken()).doubleValue();
       } catch (IOException ioe) {
          System.err.println("IO Exception in EasyIn.readDouble");
          return 0.0;
       }
    }

/**
readChar: Use  when you need to read a c=single character such a one letter or number
 * @return           a single letter  or digit
 * @exception        Error Message indicating not of the right type
 */

public static    char readChar() {
       try {
         String s = br.readLine();
         return s.charAt(0);  
       } catch (IOException ioe) {
          System.err.println("IO Exception in EasyIn.readChar");
          return 0;
       }
    }

/**
readString(): Use  when you need to read a a string of letters or numbers, the string of letters
or numbers is terminated by the ENTER keypress

 * @return           a string letters numbers or mixed, straight keyboard input
 * @exception        Error Message indicating not of the right type
 */

public static    String readString() {
       try {
         return br.readLine(); 
       } catch (IOException ioe) {
          System.err.println("IO Exception in EasyIn.readString");
          return "";
       }
    }


}  //end of class
