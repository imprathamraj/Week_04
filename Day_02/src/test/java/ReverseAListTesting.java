import com.collection.list.reversealist.ReverseArrayList;
import com.collection.list.reversealist.ReverseLinkedList;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class ReverseAListTesting {
    @Test
    public void reverseTestingForInteger(){
        //Testing for ArrayList
        ArrayList<Integer> arraylist = new ArrayList<>(Arrays.asList(7,4,8,8,4,6));

        //Expected reverse output
        ArrayList<Integer> expectedreverse = new ArrayList<>(Arrays.asList(6,4,8,8,4,7));

        //Calling reverse method
        ArrayList<Integer> actualreverse = new ArrayList<>(ReverseArrayList.reverse(new ArrayList<>(arraylist)));

        //Assert the result
        assertEquals(expectedreverse,actualreverse);
        System.out.println("Test passed for Arraylist.");
    }
    @Test
    public void reverseTestingForLinkedList(){
        //Testing for LinkedList
        LinkedList<Integer> linkedlist = new LinkedList<>(Arrays.asList(7,4,8,4,6));

        //Expected reverse output
        LinkedList<Integer> expectedreverse = new LinkedList<>(Arrays.asList(6,4,8,4,7));

        //Calling reverse method
        LinkedList<Integer> actualreverse = new LinkedList<>(ReverseLinkedList.reverse(new LinkedList<>(linkedlist)));

        //Assert the result
        assertEquals(expectedreverse,actualreverse);
        System.out.println("Test passed for LinkedList.");
    }
}
