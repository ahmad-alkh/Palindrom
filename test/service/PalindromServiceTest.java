
package service;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class PalindromServiceTest {

    PalindromService service = new PalindromService();

    @Test
    void test() {

        assertTrue(service.isPalindrom("Ma,,dam"));
        assertFalse(service.isPalindrom("ahmad"));

    }

    @Test
    void testausgabe() {

        service.print("Madam");
        service.print("ahmad");

    }

}
