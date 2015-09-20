package id.ac.uad.tif.mtp;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * [TODO: Documentation]
 *
 * @author Deny Prasetyo.
 */

public class PointTest {

    @Test
    public void setter_Should_Receive_IntMoreThanEqualsZero() {
        final Point p = new Point();
        p.setX(12);
        p.setY(32);
        assertEquals(p.getX(), 12);
        assertEquals(p.getY(), 32);

        final Point p2 = new Point(3, 4);
        assertEquals(p2.getX(), 3);
        assertEquals(p2.getY(), 4);

    }

    @Test(expected = IllegalArgumentException.class)
    public void setX_Should_Throw_When_IntLessThanZero() {
        final Point p = new Point();
        p.setX(-1);
        assertTrue(p.getX() == -1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void setY_Should_Throw_When_IntLessThanZero() {
        final Point p = new Point();
        p.setY(-1);
        assertTrue(p.getY() == -1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void constructor_Should_Throw_When_IntLessThanZero() {
        final Point p = new Point(-2, -1);
        assertTrue(p.getY() == -1);
    }

    @Test
    public void distance_Should_Return_CorrectValue() {
        final Point p = new Point(3, 4);
        final double correctValue = Math.sqrt((3 * 3) + (4 * 4));
        assertEquals(p.distance(), correctValue, 3);
    }

    @Test
    public void distance_x_y_Should_Return_CorrectValue() {
        final Point p = new Point(3, 4);
        final int otherX = 5;
        final int otherY = 6;
        final double correctValue = Math.sqrt(((3 - otherX) * (3 - otherX)) + ((4 - otherY) * (4 - otherY)));
        assertEquals(p.distance(otherX, otherY), correctValue, 3);
    }

    @Test
    public void distance_From_Point_Should_Return_CorrectValue() {
        final Point p = new Point(3, 4);
        final Point other = new Point(6, 7);
        final double correctValue = Math.sqrt(((3 - other.getX()) * (3 - other.getX())) + ((4 - other.getY()) * (4 - other.getY())));
        assertEquals(p.distance(other), correctValue, 3);
    }
}