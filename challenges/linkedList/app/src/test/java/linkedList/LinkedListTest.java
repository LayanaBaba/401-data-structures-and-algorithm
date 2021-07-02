package linkedList;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LinkedListTest {
@Test
    public void addLast(){
        var list= new LinkedList();

        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
    }

   @Test public void includesTest(){
        var list= new LinkedList();
       list.addLast(10);
       list.addLast(20);
       list.addLast(30);
       list.addLast(40);
       Assertions.assertTrue(list.includes(10),"Should return true");
       Assertions.assertFalse(list.includes(90),"Should return false");
    }

    @Test public void headTest(){
        var list= new LinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        Assertions.assertEquals(10, list.getFirst());
    }

    @Test
    public void toStringTest(){
    var list = new LinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);

        list.addFirst(0);
        list.addFirst(-10);
        list.addFirst(-20);
        list.addFirst(-30);
        Assertions.assertEquals("{ -30 } -> { -20 } -> { -10 } -> { 0 } -> { 10 } -> { 20 } -> { 30 } -> { 40 } -> NULL",list.toString());
    }
}
