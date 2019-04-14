package pl.grak.java.podsawy.j001;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestowanieTest {

    Testowanie test1 = new Testowanie();


    @Test
    void dodawanie() {
        int a = 2;
        int b = 2;

        assertEquals(4,test1.dodawanie(a,b));

    }
}