/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package ch13;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }

    @Test void testbracket(){
        Validatebrackets testBracket=new Validatebrackets();
        String testString1="{}";
        assertEquals(true,testBracket.brackets((testString1)));
        String testEmpty="";
        assertEquals(true,testBracket.brackets((testEmpty)));

        String testFalse="( { ( { } ] }";
        assertEquals(false,testBracket.brackets((testFalse)));

        String test5="[( Molhammed)] [ Mosleh ]";
        assertEquals(true,testBracket.brackets((test5)));











    }
}
