
/*
https://arena.topcoder.com/#/u/practiceCode/10882/6824/7602/1/265822

A new library was founded in our city. The books were labeled 1, 2, 3, 4, etc., with no leading
zeroes. A total of usedDigits digits were used to create the labels. Return the total number of
books in the library, or -1 if usedDigits does not correspond to a valid solution.
 */
public class BooksNumbering {

    public static int numberOfBooks(int usedDigits) {
        int totalBooks = 0;

        for(int currDigitStep = 1; usedDigits > 0; ++currDigitStep) {
            for(    int i = totalBooks;
                    (i < Math.pow(10,currDigitStep) - 1) && (usedDigits > 0);
                    ++i, usedDigits -= currDigitStep) {

                ++totalBooks;
            }
        }

        if(usedDigits < 0) {
            return -1;
        } else {
            return totalBooks;
        }
    }
}
