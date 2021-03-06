/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package hashmap.repeated;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }

    @Test void repeatedTringTest(){
        RepeatedString repeatedString=new RepeatedString();

        String testString="Be happy for this moment this moment is your lisfe";
        String returnedVAlue=repeatedString.repeatedWord(testString);
        assertEquals("this",returnedVAlue);

        ///if i have commas
        String testString2="Be, happy for ,this moment this moment is ,your lisfe";
        String returnedVAlue2=repeatedString.repeatedWord(testString2);
        assertEquals("this",returnedVAlue);

        // if their is no repeated word

        String testString3="Be happy for this moment is your lisfe";
        String returnedVAlue3=repeatedString.repeatedWord(testString3);
        assertEquals(null,returnedVAlue3);




    }

}
