import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;

public class QueensPuzzle {
    ArrayList<String[][]> solutions;
    Hashtable<String, String> positionsMoved;
    String queenGrid[][];
    public QueensPuzzle(int grid) {
        queenGrid = new String[grid][grid];
        solutions = new ArrayList();

        positionsMoved = new Hashtable();
        for (int i = 0; i< grid; i++) {
            positionsMoved.put("Q1", "ghgh");
        }
    }

    private void markDiagonals(int row, int col) {
        for (int r = row, c = col; r < queenGrid.length && c < queenGrid[c].length; r++, c--) {
            queenGrid[r][c] = "x";
        }
        for (int r = row, c = col; r < queenGrid.length && c < queenGrid[c].length; r--, c++) {
            queenGrid[r][c] = "x";
        }

        for (int r = row, c = col; r > 0 && c < queenGrid[c].length; r--, c--) {
            queenGrid[r][c] = "x";
        }

        for (int r = row, c = col; r < queenGrid.length && c < queenGrid[c].length; r--, c++) {
            queenGrid[r][c] = "x";
        }
    }

    private void markHorizontals(int j, int k) {

    }

    private boolean freeSpaces() {
        for (int i = 0; i < queenGrid.length; i++) {
            if (Arrays.toString(queenGrid[i]).contains(null)) return true;
        }

        return false;
    }

    @Override
    public String toString() {
        String toReturn = "";

        for (int i = 0; i < solutions.size(); i++) {
            String currentAnswer[][] = solutions.get(i);

            for (int j = 0; j < currentAnswer.length; j++) {
                toReturn += Arrays.toString(currentAnswer[i]) + "\n";
            }

            toReturn += "\n\n";
        }

        return toReturn;
    }
}
