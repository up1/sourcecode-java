
public class WorkshopWithHeart {

    public static void main(String[] args) {
        int start = 9;
        // Line 1
        System.out.println(" **   **");
        // Line 2
        for(int i=0; i<9; i++) {
            if(i == start/2) {
                System.out.print(" ");
            } else {
                System.out.print("*");
            }
        }
        newLine();
        // Line 3-7
        for (int round = 0; round < 5; round++) {
            generateSpace(round);
            generateStar(start);
            newLine();
            start = start - 2; // Magic number
        }

    }

    private static void newLine() {
        System.out.println();
    }

    private static void generateStar(int start) {
        for (int i = 0; i < start; i++) {
            System.out.print("*");
        }
    }

    private static void generateSpace(int round) {
        for (int a=0; a<round; a++) {
            System.out.print(" ");
        }
    }

}
