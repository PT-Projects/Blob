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
        int result;
       
        //...
        
        return 0;
    }
    
    public void restore() {
        grid.recolor(TEMPORARY, ABNORMAL);
    }


}
