// class dollar will takes anumeric input and covert it into a string of text..
// REQUIRES:  keybd.java for numeric input..
//
//    Revision:     Date:       Created by:         Notes:
//    ---------     -----       -----------         ------
//    .8            12/12/2000  acb                 limited to 100,000

public class dollar {
//NOTE: for numbers greater than 100,000 this can be done but the code would just
// repeat itself, ufor purposes of this example onyl numbers below
// 100,00 will be produced
  public static final int MAXVAL = 100000;  //upper maximum


  public static void main(String[] args) {
  //my vairables need to keep
  int in=0,d;
  int amt=0;

  String th="thousand", hu="hundred";
  String thisword="";
  String words="";   //will hold the final outputted string

   //prompt for input
   System.out.print("Enter dollar value?");
   in=keybd.readInt();
   amt =in;
     //amt=1000;

   if (amt < MAXVAL)
   {
   // Get the text for numbers less than a 100 thousand.//////////////////
    if (amt < 100000 )
    {
     d = amt / 10000;    //divide by a ten
     if (d >= 2)       //now see how many tens we have , teens need a soicail case
        {
         switch (d)
          {
          case 2 :   thisword="twenty";break;
          case 3 :   thisword="thirty";break;
          case 4 :   thisword="forty";break;
          case 5 :   thisword="fifty";break;
          case 6 :   thisword="sixty";break;
          case 7 :   thisword="seventy";break;
          case 8 :   thisword="eighty";break;
          case 9 :   thisword="ninety";break;
         } //end of swith
        words = words +" "+ thisword+" ";   //keep a running count of the text string
        //here's the key subtract d * 1000 to get the hundreds value
        amt = amt - (d * 10000);
        } //end of if

// Get any numbers from 19 to 0 on down just use a simple switch statement
//since all these numbers have unique words..
    if (amt < 20000)       //for less than a thousand.
    {
     d = amt / 1000;    //divide by a hundred
      if (d > 0)       //now see how many tens we have , teens need a soicail case
      {
        switch (d) {
          case 19 :   thisword="nineteen";break;
          case 18 :   thisword="eighteen";break;
          case 17 :   thisword="seventeen";break;
          case 16 :   thisword="sixteen";break;
          case 15 :   thisword="fifteen";break;
          case 14 :   thisword="fourteen";break;
          case 13 :   thisword="thirteen";break;
          case 12 :   thisword="tweleve";break;
          case 11 :   thisword="eleven";break;
          case 10 :   thisword="ten";break;
          case 9 :   thisword="nine";break;
          case 8 :   thisword="eight";break;
          case 7 :   thisword="seven";break;
          case 6 :   thisword="six";break;
          case 5 :   thisword="five";break;
          case 4 :   thisword="four";break;
          case 3 :   thisword="three";break;
          case 2 :   thisword="two";break;
          case 1 :   thisword="one";break;
         } //end of swith
        words = words +" "+ thisword+" " + th;   //keep a running count of the text string
         amt = amt - (d * 1000);
         }
        } //end of if
       }



// Get the text for numbers less than a 1 thousand.//////////////////
    if (amt < 1000)       //for less than a thousand.
    {
    d = amt / 100;    //divide by a hundred
     if (d > 0)       //now see how many thousands we have
        {
         switch (d) {
          case 1 :   thisword="one";break;
          case 2 :   thisword="two";break;
          case 3 :   thisword="three";break;
          case 4 :   thisword="four";break;
          case 5 :   thisword="five";break;
          case 6 :   thisword="six";break;
          case 7 :   thisword="seven";break;
          case 8 :   thisword="eight";break;
          case 9 :   thisword="nine";break;
         } //end of swith
        words = words +" "+ thisword+" "+ hu +" ";   //keep a running count of the text string
        //here's the key subtract d * 1000 to get the hundreds value
        amt = amt - (d * 100);
        } //end of if
    } //end of if  <10000



// Get the text for numbers less than a 100 .//////////////////
    if (amt < 100)       //for less than a thousand.
    {
     d = amt / 10;    //divide by a ten
     if (d >= 2)       //now see how many tens we have , teens need a soicail case
        {
         switch (d) {
          case 2 :   thisword="twenty";break;
          case 3 :   thisword="thirty";break;
          case 4 :   thisword="forty";break;
          case 5 :   thisword="fifty";break;
          case 6 :   thisword="sixty";break;
          case 7 :   thisword="seventy";break;
          case 8 :   thisword="eighty";break;
          case 9 :   thisword="ninety";break;
         } //end of swith
        words = words +" "+ thisword+" ";   //keep a running count of the text string
        //here's the key subtract d * 1000 to get the hundreds value
        amt = amt - (d * 10);
        } //end of if
    } //end of if  <10000

// Get any numbers from 19 to 0 on down just use a simple switch statement
//since all these numbers have unique words..
    if (amt <= 19)       //for less than a thousand.
    {
        switch (amt) {
          case 19 :   thisword="nineteen";break;
          case 18 :   thisword="eighteen";break;
          case 17 :   thisword="seventeen";break;
          case 16 :   thisword="sixteen";break;
          case 15 :   thisword="fifteen";break;
          case 14 :   thisword="fourteen";break;
          case 13 :   thisword="thirteen";break;
          case 12 :   thisword="tweleve";break;
          case 11 :   thisword="eleven";break;
          case 10 :   thisword="ten";break;
          case 9 :   thisword="nine";break;
          case 8 :   thisword="eight";break;
          case 7 :   thisword="seven";break;
          case 6 :   thisword="six";break;
          case 5 :   thisword="five";break;
          case 4 :   thisword="four";break;
          case 3 :   thisword="three";break;
          case 2 :   thisword="two";break;
          case 1 :   thisword="one";break;
          default:
           thisword="";
         } //end of swith
        words = words +" "+ thisword+" ";   //keep a running count of the text string
          } //end of if

       /// finally print out the entire string
       System.out.println(words + " dollars");
    }
   else
   {
    System.out.println(" Number is too large try a number less than "+MAXVAL);
   }


  } //end of main

} //end of clss