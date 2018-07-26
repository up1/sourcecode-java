import static org.junit.Assert.*;

import org.junit.Test;

public class SortTest {

    @Test
    public void case_01() {
        Sort sort = new Sort();
        int[] input = {1};
        int[] sorted = sort.of(input);
        assertArrayEquals(new int[]{1}, sorted);
    }
    
    @Test
    public void case_02() {
        Sort sort = new Sort();
        int[] input = {1, 2};
        int[] sorted = sort.of(input);
        assertArrayEquals(new int[]{1, 2}, sorted);
    }
    
    @Test
    public void case_03() {
        Sort sort = new Sort();
        int[] input = {2, 1};
        int[] sorted = sort.of(input);
        assertArrayEquals(new int[]{1, 2}, sorted);
    }
    
    @Test
    public void case_04() {
        Sort sort = new Sort();
        int[] input = {1, 2, 3};
        int[] sorted = sort.of(input);
        assertArrayEquals(new int[]{1, 2, 3}, sorted);
    }
    
    @Test
    public void case_05() {
        Sort sort = new Sort();
        int[] input = {2, 1, 3};
        int[] sorted = sort.of(input);
        assertArrayEquals(new int[]{1, 2, 3}, sorted);
    }
    
    @Test
    public void case_06() {
        Sort sort = new Sort();
        int[] input = {1, 3, 2};
        int[] sorted = sort.of(input);
        assertArrayEquals(new int[]{1, 2, 3}, sorted);
    }
    
    @Test
    public void case_07() {
        Sort sort = new Sort();
        int[] input = {3, 2, 1}; //231  213
        int[] sorted = sort.of(input);
        assertArrayEquals(new int[]{1, 2, 3}, sorted);
    }
    
    @Test
    public void case_08() {
        Sort sort = new Sort();
        int[] input = {5, 4, 3, 2, 1}; 
        int[] sorted = sort.of(input);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, sorted);
    }

}










