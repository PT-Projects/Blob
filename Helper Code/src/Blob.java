/*<listing chapter="5" number="3">*/

/**
 * Class that solves problem of counting abnormal cells.
 *  @author Koffman and Wolfgang
 **/
public class Blob implements GridColors  {

    /** The grid */
    private TwoDimGrid grid;

    /** Constructors */
    public Blob(TwoDimGrid grid) {
        this.grid = grid;
    }

    /**
     * Finds the number of cells in the blob at (x,y).
     * @pre Abnormal cells are in ABNORMAL color;
     *      Other cells are in BACKGROUND color.
     * @post All cells in the blob are in the TEMPORARY color.
     * @param row The row-coordinate of a blob cell
     * @param col The col-coordinate of a blob cell
     * @return The number of cells in the blob that contains (x, y)
     */
    public int countCells(int row, int col) {
        int result = 0;
        boolean start = false;

        if (grid.getColor(row,col) != GridColors.BACKGROUND){
            start = true;
        }

        if (start) {
            for (int x = 0; x < grid.getNCols(); x++) {
                for (int y = 0; y < grid.getNRows(); y++) {
                    if (row - 1 == x && col - 1 == y || row - 1 == x && col == y || row - 1 == x && col + 1 == y || row == x && col - 1 == y || row == x && col == y || row == x && col + 1 == y || row + 1 == x && col - 1 == y || row + 1 == x && col == y || row + 1 == x && col + 1 == y) {
                        if (grid.getColor(x, y) == GridColors.ABNORMAL) {
                            grid.recolor(x, y, GridColors.TEMPORARY);
                            result++;
                            result += countCells(x, y);
                        }
                    }
                }
            }
        }

        return result;
    }
    
    public void restore() {
        grid.recolor(TEMPORARY, ABNORMAL);
    }

}
