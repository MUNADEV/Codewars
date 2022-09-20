package main;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test1() {
        assertEquals(23, new Solution().solution(10));
    }

    @Test
    public void test2(){
        assertEquals(0,new Solution().solution(0));
    }

}