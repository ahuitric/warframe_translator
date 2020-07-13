import java.util.Scanner;
/**
 * Write a description of class Driver here.
 *
 * @author Alana Huitric
 * @version 1.0
 */
public class Driver
{
    public static void main(String[] args)
    {
        System.out.print('\u000C');
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Grineer, Corpus or Both");
        String langChoice = scan.nextLine();
        System.out.println("Input or File?");
        String inputChoice = scan.nextLine();
        Translator t = new Translator();
        String text;
        if (inputChoice.equals("Input"))
        {
            System.out.println("Input english in all lowercase below");
            text = scan.nextLine();
        }
        else if (inputChoice.equals("File"))
        {
            System.out.println("Input file name");
            String fileName = scan.nextLine();
            text = t.readFileAsString(fileName);
        }
        else
        {
            text = null;
            System.out.println("Invalid Format");
        }
        
        if (langChoice.equals("Grineer"))
        {
            System.out.println(t.translateToGrineer(text));
        }
        else if (langChoice.equals("Corpus"))
        {
            System.out.println(t.translateToCorpus(text));
        }
        else if (langChoice.equals("Both"))
        {
            System.out.println();
            System.out.println("Grineer: ");
            System.out.println(t.translateToGrineer(text));
            System.out.println("Corpus: ");
            System.out.println(t.translateToCorpus(text));
        }
        else
        {
            System.out.println("Invalid choice");
        }
    }
}
