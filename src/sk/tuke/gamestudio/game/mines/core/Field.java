package sk.tuke.gamestudio.game.mines.core;

public class Field {
    private final int rowCount;
    private final int columnCount;
    private final int mineCount;

    private int openCount;

    private FieldState state;

    private final Tile[][] tiles; //pole poli



    public Field(int rowCount, int columnCount, int mineCount) {
        this.rowCount = rowCount;
        this.columnCount = columnCount;
        this.mineCount = mineCount;
        tiles = new Tile[rowCount][columnCount]; //vytvara prazdne pole
        generate();

    }

    private void generate() {
        generateMines();
        fillWithClues();

    }

    private void fillWithClues() {
    }
    private void generateMines() {
    }

    public int getRowCount() {
        return rowCount;
    }

    public int getColumnCount() {
        return columnCount;
    }

    public int getMineCount() {
        return mineCount;
    }

    public FieldState getState() {
        return state;
    }
    public Tile getTile(int row, int column){
        return tiles[row][column];
    }
}
