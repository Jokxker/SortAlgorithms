import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class StartAlgorithms {
    public static void main(String[] args) {
        SortChoice sortChoice = new SortChoice();
        int[] arrSortChoice = new int[100];
        final long start = System.nanoTime();
        sortChoice.sort(arrSortChoice);
        final long end = System.nanoTime();
        System.out.println("Input numbers ");
        String[] str = new String[0];
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            str = reader.readLine().split(" ");
            arrSortChoice = new int[str.length];
            for (int i = 0; i < arrSortChoice.length; i++) {
                arrSortChoice[i] = Integer.parseInt(str[i]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(Arrays.toString(sortChoice.sort(arrSortChoice)));

        SortConfluence sortConfluence = new SortConfluence();
        int[] arrSortConfluence = new int[100];
        final long start2 = System.nanoTime();
        sortConfluence.sort(arrSortConfluence);
        final long end2 = System.nanoTime();
        arrSortConfluence = new int[str.length];
        for (int i = 0; i < arrSortConfluence.length; i++) {
            arrSortConfluence[i] = Integer.parseInt(str[i]);
        }
        System.out.println(Arrays.toString(sortConfluence.sort(arrSortConfluence)));

        System.out.println((end - start < end2 - start2) ? "Sort choice fast" : "Sort confluence fast");
    }
}
