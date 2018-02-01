import java.util.ArrayList;
import java.util.List;
import java.util.function.IntConsumer;
import java.util.stream.IntStream;

/*
https://arena.topcoder.com/#/u/practiceCode/1461/3248/3506/1/1461

Given an image as a , scale it up by factor. That is, if the original image is M x N, the scaled
image should be M*factor x N*factor. Each character in the input should be represented by factor x
factor of the same character in the output (see examples).
 */
public class ImageEnlarger {

    public static String[] enlarge(String[] image, int factor) {
        int newWidth = factor * image[0].length();
        int newHeight = factor * image.length;
        List<String> newImage = new ArrayList<>();

        StringBuilder stringBuilder = new StringBuilder(newWidth);
        for(String string : image) {
            stringBuilder.setLength(0);

            // duplicate by factor horizontally
            string.chars().forEach(c -> nTimes(factor, (nothing -> stringBuilder.append((char)c))));

            // duplicate by factor vertically
            nTimes(factor, (nothing -> newImage.add(stringBuilder.toString())));
        }

        return newImage.toArray(new String[newHeight]);
    }

    private static void nTimes(int n, IntConsumer lambda) {
        IntStream.range(0,n).forEach(lambda);
    }
}
