import java.util.LinkedList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class DateNextDateOkTest {
    private int yearOrigin;
    private int monthOrigin;
    private int dayOrigin;
    private int yearNext;
    private int monthNext;
    private int dayNext;
    public DateNextDateOkTest(int yearO, int monthO, int dayO, int yearN, int monthN, int dayN) {
        this.yearOrigin = yearO;
        this.monthOrigin = monthO;
        this.dayOrigin = dayO;
        this.yearNext = yearN;
        this.monthNext = monthN;
        this.dayNext = dayN;
    }
    @Parameters 
    public static List<Object[]> data() {
        List<Object[]> parameters = new LinkedList<>();
        parameters.add(new Object[] { 1700, 6, 20, 1700, 6, 21 });
        parameters.add(new Object[] { 2005, 4, 15, 2005, 4, 16 }); 
        parameters.add(new Object[] { 1901, 7, 20, 1901, 7, 21 }); 
        parameters.add(new Object[] { 3456, 3, 27, 3456, 3, 28 }); 
        parameters.add(new Object[] { 1500, 2, 17, 1500, 2, 18 }); 
        parameters.add(new Object[] { 1700, 6, 29, 1700, 6, 30 }); 
        parameters.add(new Object[] { 1800, 11, 29, 1800, 11, 30 }); 
        parameters.add(new Object[] { 3453, 1, 29, 3453, 1, 30 }); 
        parameters.add(new Object[] { 444, 2, 29, 444, 3, 1 }); 
        parameters.add(new Object[] { 2005, 4, 30, 2005, 5, 1 }); 
        parameters.add(new Object[] { 3453, 1, 30, 3453, 1, 31 }); 
        parameters.add(new Object[] { 3456, 3, 30, 3456, 3, 31 }); 
        parameters.add(new Object[] { 1901, 7, 31, 1901, 8, 1 }); 
        parameters.add(new Object[] { 3453, 1, 31, 3453, 2, 1 }); 
        parameters.add(new Object[] { 3456, 12, 31, 3457, 1, 1 }); 
        return parameters;
    }
    @Test
    public void testNextDate() {
        Date date = new Date(yearOrigin, monthOrigin, dayOrigin);
        Date newDate = date.nextDate();
        Assert.assertEquals(yearNext, newDate.getYear());
        Assert.assertEquals(monthNext, newDate.getMonth());
        Assert.assertEquals(dayNext, newDate.getDay());
    }
}