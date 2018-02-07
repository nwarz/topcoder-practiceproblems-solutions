/*
https://arena.topcoder.com/#/u/practiceCode/1548/4399/4766/2/1548

You will be given rSquare, the square of the radius of a circle. You are to return the number of
lattice points (points with integer coordinates) that lie on the circumference of a circle with this
 radius centered at the origin of the (cartesian) coordinate system.
 */
public class GridPointsOnCircle {

    public static int countPoints(int rSquare) {
        int integerRadius = (int) Math.sqrt(rSquare);
        int numLatticePoints = 0;

        // from (-r,0) to (0,r) to (r,0) check each whole-numbered x for lattice points
        for(int x = -integerRadius; x <= integerRadius; ++x) {
            for(int y = 0; y <= integerRadius; ++y) {
                if(rSquare == x*x + y*y) {
                    if(y == 0) {
                        // don't double-count (x,0)
                        ++numLatticePoints;
                    } else {
                        // count lattice point for (x,+y) and (x,-y)
                        numLatticePoints += 2;
                    }
                }
            }
        }
        return numLatticePoints;
    }
}
