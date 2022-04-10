import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Converter
{
  public static void main(String args[])
  {

    System.out.println("Input 0 if convert from decimal number system to hex number \nInput 1 if convert from decimal number system to binary number \nInput 2 if convert from binary number to decimal number system");
    Scanner scanner = new Scanner(System.in);
    try
    {
      int conv = scanner.nextInt();
      if(conv==0)
      {
        System.out.println("From decimal to hex");
        System.out.print("Input decimal number: ");
        int dec = scanner.nextInt();
        System.out.println(dec+" in hex "+Integer.toHexString(dec));
      }
      else if(conv==1)
      {
        System.out.println("From decimal to binary");
        System.out.print("Input decimal number: ");
        int dec = scanner.nextInt();
        System.out.println(dec+" in binary "+Integer.toBinaryString(dec));
      }
      else if(conv==2) {
        System.out.println("From binary to decimal");
        System.out.print("Input bin number: ");
        String bin = scanner.next();
        System.out.println(bin+" in decemal "+Integer.parseInt(bin,2));
      }else {
        throw new EOFException("Wrong conv number");
      }
    }
    catch(Exception ex)
    {
      System.out.println(ex.toString()); 
    }
  }
}

