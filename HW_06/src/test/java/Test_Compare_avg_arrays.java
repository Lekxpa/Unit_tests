import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;
import static org.assertj.core.api.Assertions.*;



public class Test_Compare_avg_arrays {

    @Test
    public void test_FirstArrIsMore(){
        int[] array1 = new int[]{1, 3, 5, 9};
        int[] array2 = new int[]{7, 5, 3, 2};
        assertThat(Comparison_averages.averageValueOfArray(array1, array2))
                .isEqualTo("Первый список имеет большее среднее значение");
    }


    @Test
    public void test_SecondArrIsMore(){
        int[] array1 = new int[]{1, 3, 5, 7};
        int[] array2 = new int[]{7, 5, 3, 2};

        assertThat(Comparison_averages.averageValueOfArray(array1, array2))
                .isEqualTo("Второй список имеет большее среднее значение");
    }


    @Test
    public void test_EqualsArrays(){
        int[] array1 = new int[]{1, 3, 5, 7};
        int[] array2 = new int[]{7, 5, 3, 1};

        assertThat(Comparison_averages.averageValueOfArray(array1, array2))
                .isEqualTo("Средние значения равны");
    }

    @Test
    public void test_EmptyFirstArray(){
        int[] array1 = new int[]{};
        int[] array2 = new int[]{7, 5, 3, 1};

        assertThat(Comparison_averages.averageValueOfArray(array1, array2))
                .isEqualTo("Второй список имеет большее среднее значение");
    }

    @Test
    public void test_EmptySecondArray(){
        int[] array1 = new int[]{7, 5, 3, 1};
        int[] array2 = new int[]{};

        assertThat(Comparison_averages.averageValueOfArray(array1, array2))
                .isEqualTo("Первый список имеет большее среднее значение");
    }

}
