import com.collection.list.findfrequencyofelements.CountingFrequency;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import java.util.Map;
import java.util.ArrayList;
import java.util.Arrays;

public class FrequencyOfElementsTesting {
    @Test
    public void countTesting() {
        //Testing
        ArrayList<String> list = new ArrayList<>(Arrays.asList("car", "bike", "car", "truck", "bike", "car", "bike", "truck"));

        //Expected output
        Map<String, Integer> expectedMap = Map.of("car",3,"bike",3,"truck",2);

        //Calling counting method
        Map<String, Integer> actualMap = CountingFrequency.count(list);
        //Assert the result
        assertEquals(expectedMap,actualMap);
        System.out.println("Test passed for counting.");
    }
}
