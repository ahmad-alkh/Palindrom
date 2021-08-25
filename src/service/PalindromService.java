/*
 * Intellinet Beratung und Technologie GmbH
 */

package service;

import vergleich.StringVergleicher;

/**
 * [TODO Insert description here.]
 * 
 * @author ahmalk
 *
 * @since 05.08.2019
 */
public class PalindromService {

    public void main(String[] args) {
        this.test();
    }

    public void test() {

        StringVergleicher vergleicher = new StringVergleicher();

        String a = "www.ahmad.com";
        String b = "www.ahmfad.com";

        boolean istGleich = vergleicher.vergleicheString(a, b);

        if (istGleich) {
            System.out.println("ok");
        } else {
            System.out.println("no");
        }

    }
  
/**
 * 
 * @param wort
 * @return
 */
    public boolean isPalindrom(String wort) {
        wort = wort.toLowerCase();
        int wortLaenge = wort.length();
        int letzteArrayPosition = wortLaenge - 1;

        for (int i = 0; i < wortLaenge; i++) {

            char anfangsBuchstabe = wort.charAt(i);
            char endBuchstabe = wort.charAt(letzteArrayPosition - i);

            if (anfangsBuchstabe == endBuchstabe) {
                continue;
            } else {
                return false;
            }
        }
        return true;
    }

    
    public void print(String wort) {
        for (int i = 0; i < wort.length(); i++) {

            char c = wort.charAt(i);
            System.out.println(c);

        }

    }
}
