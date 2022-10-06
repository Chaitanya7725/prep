/**
 * LibraryFine
 */
public class LibraryFine {

    public static int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) {
        if (y1 < y2) {
            return 0;
        } else {
            if (y1 <= y2 && m1 <= m2 && d1 <= d2)
                return 0;
            else if (d1 > d2 && m1 == m2 && y1 <= y2)
                return 15 * (d1 - d2);
            else if (m1 > m2 && y1 <= y2)
                return 500 * (m1 - m2);
            else if (y1 > y2)
                return 10000;
        }
        return 0;
    }

    public static void main(String[] args) {
        // int d1 = 1;
        // int m1 = 1;
        // int y1 = 2001;
        // int d2 = 1;
        // int m2 = 1;
        // int y2 = 2000;
        int d1 = 15;
        int m1 = 7;
        int y1 = 2014;
        int d2 = 1;
        int m2 = 7;
        int y2 = 2015;
        int fine = libraryFine(d1, m1, y1, d2, m2, y2);
        System.out.println(fine);

    }
}