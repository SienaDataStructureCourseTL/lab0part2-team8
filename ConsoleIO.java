import java.util.Scanner;
/**
* Console I/O example
*
* @author YOUR NAME
*/
public class ConsoleIO
{
 public static void main(String args[])
 {
Scanner keyboard = new Scanner(System.in);
System.out.println("What is your name?");
String name = keyboard.nextLine();
keyboard.close();
System.out.println(name + " says Java is fun.");
 }
}