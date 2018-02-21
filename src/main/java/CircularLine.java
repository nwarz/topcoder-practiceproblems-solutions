/*
https://arena.topcoder.com/#/u/practiceCode/12231/7838/8761/2/269928

There's a circular subway line that contains n stations numbered 0 through n-1. The time to travel
between stations 0 and 1 is t[0], the time to travel between stations 1 and 2 is t[1], ..., the time
 to travel between stations n-1 and 0 is t[n-1]. You can travel between stations in either
 direction, so there are always two ways to get from one station to another without visiting the
 same station more than once. For example, if there are 4 stations, the two ways of getting from
 station 1 to station 3 are 1-2-3 and 1-0-3. The total travel time in the first case is t[1] + t[2],
  and in the second case, it is t[0] + t[3]. When a person needs to get from one station to another,
   she always chooses the faster of the two ways.

You are given a t. Find two stations such that the fastest travel time between them is the maximal
possible. Return this time.
 */
public class CircularLine {

    public static int longestTravel(int[] t ) {
        int maxTravelTime = 0;

        for(int a = 0; a < t.length - 1; ++a) {
            for(int b = a+1; b < t.length; ++b) {
                int rightwardDistance = findTravelTime(t,a,b);
                int leftwardDistance = findTravelTime(t,b,a);
                int travelTime = Math.min(leftwardDistance, rightwardDistance);
                if(travelTime > maxTravelTime) {
                    maxTravelTime = travelTime;
                }
            }
        }

        return maxTravelTime;
    }

    private static int findTravelTime(int[] t, int a, int b) {
        int distance = 0;
        if(b > a) {
            for(int i = a; i < b; ++i) {
                distance += t[i];
            }
        } else {
            // loop past the array end
            for(int i = a; i < t.length; ++i) {
                distance += t[i];
            }
            for(int i = 0; i < b; ++i) {
                distance += t[i];
            }
        }
        return distance;
    }
}
