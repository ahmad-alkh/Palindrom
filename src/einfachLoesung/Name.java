package einfachLoesung;
import java.util.Scanner;                                                                 // Diese Zeile muss immer vor der Klasse vorkommen, wenn Sie Scanner verwenden

public class Name {
    
    public static void main(String[] args) {
        String a, b = "";
        Scanner s = new Scanner(System.in);                                              // Den Scanner s erstellen
        System.out.print("Geben Sie das Wort ein, das Sie �berpr�fen m�chten: ");         // Nach einer Name fragen
        a = s.nextLine();
        int n = a.length();                                                                //Eine Name einlesen
        for(int i = n - 1; i >= 0; i--) 
        {
            b = b + a.charAt(i);                                                            //char=character=zeichen
        }
        if(a.equalsIgnoreCase(b))
        {
            System.out.println("das Wort ist palindrome.");
        }
        else
        {
            System.out.println("das Wort ist nicht palindrome.");
        }
        
    }
}
