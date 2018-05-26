package ex12015;

public abstract class AbstractTableModel implements TableModel{
    private int rowCount;
    private int columnCount;
    public int getRowCount() {
        return this.rowCount;
    }
    public int getColumnCount() {
        return this.columnCount;
    }
    public Object getValue(int x, int y) {
        return null;
    }
}
