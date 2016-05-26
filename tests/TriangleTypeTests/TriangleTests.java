package TriangleTypeTests;

import TriangleTypeKata.Triangle;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TriangleTests {
    @Test
    public void when_isnt_a_triangle_shouldnt_work() {
        assertEquals(Triangle.triangleType(7, 3, 2), 0);
        assertEquals(Triangle.triangleType(2, 4, 6), 0);
    }

    @Test
    public void when_is_acute_should_return_1() {
        assertEquals(Triangle.triangleType(8, 5, 7), 1);
    }

    @Test
    public void when_is_right_should_return_2() {
        assertEquals(Triangle.triangleType(3, 4, 5), 2);
    }
    @Test
    public void when_is_obtuse_should_return_3(){
        assertEquals(Triangle.triangleType(7,12,8), 3);
    }
}
