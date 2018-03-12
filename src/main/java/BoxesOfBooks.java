/*
You are packing a stack of books into some boxes, packing as many books as you can into each box
without exceeding a given weight limit. Once you have packed as many books into a box as you can,
you close and seal that box, and then begin filling the next one. You take the books off the stack
in order, packing each one before picking up the next.

The weights of the books will be given as a weights, where the first element is the weight of the
book on top of the stack and the last element is the weight of the book on the bottom of the stack.
The maximum weight that can fit into each box will be given as an maxWeight. Return the minimum
number of boxes you will need.
 */
public class BoxesOfBooks {

    public static int boxes(int[] weights, int maxWeight) {
        if(weights.length == 0) {
            return 0;
        }

        int numBoxes = 1;

        int currWeight = 0;
        for(int weight : weights) {
            if((currWeight + weight) <= maxWeight) {
                // put another book in the book
                currWeight += weight;
            } else {
                // box overflowed, get a new one
                ++numBoxes;
                currWeight = weight;
            }
        }

        return numBoxes;
    }
}
