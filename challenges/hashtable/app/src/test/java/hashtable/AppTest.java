/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package hashtable;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    private HashTable<String, Integer> test = new HashTable<>();
    @Test
    public void addTest(){
    test.add("Layana1",1);
    test.add("Layana2",2);
    test.add("Layana3",3);
    test.add("Layana4",4);
    }

    @Test
    public void addAssertTest(){
        test.add("Layana5",5);
        assertEquals(test.get("Layana5"), 5);
    }

    @Test
    public void nullTest(){
        assertNull(test.get("Layana"));
    }

    @Test
    public void containTest(){
        test.add("Layana1",1);
        test.add("Layana2",2);

        assertTrue(test.contain("Layana1"));
    }

    @Test
    public void uncontainedTest(){
        test.add("Layana1",1);
        test.add("Layana2",2);

        assertFalse(test.contain("Layana"));
    }

    @Test
    public void sizeTest(){
        test.add("Layana1",1);
        test.add("Layana2",2);

        assertEquals(2,test.getSize());
    }

    @Test
    public void removeTest(){
        test.add("Layana1",1);
        test.add("Layana2",2);

        assertEquals(2,test.getSize());

        test.remove("Layana1");

        assertEquals(1,test.getSize());
    }
}
