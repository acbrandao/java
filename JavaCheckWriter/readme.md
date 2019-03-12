# JavaCheckWriter 

A simple java school  example of how to convert numeric input like 1234 into written text like one thousand two hundred  thirty  four  dollars
 
 # Requirements
 
 * Java JDK to be able to compile the java code
  
 # Build
 
 Issue the command to compile the the java code , it uses some older style Standard input routines.
 
```bash
javac  -Xlint:deprecation  dollar.java
```
 
 # Run
 Ru nusing the command :
 ```bash 
 java dollar
 ```
 
Program out will be like:
```shell
java dollar
Enter dollar value?5
 five  dollars
root@XPS15# java dollar
Enter dollar value?500
 five hundred    dollars
root@XPS15# java dollar
Enter dollar value?1234
 one thousand two hundred  thirty  four  dollars
root@XPS15# java dollar
Enter dollar value?9332
 nine thousand three hundred  thirty  two  dollars
root@XPS15# java dollar
Enter dollar value?123456
 Number is too large try a number less than 100000
 ```
