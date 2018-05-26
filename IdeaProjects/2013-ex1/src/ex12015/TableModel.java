package ex12015;

import javax.swing.event.TableModelListener;
import java.util.ArrayList;

public interface TableModel {
    TableModelListener addTableModeListener(TableModelListener tableModelListener);
    ArrayList getColumnClass (int i);
    int getColumnCount();
    String getColumnName(int i);
    int getRowCount();
    Object getValue(int x, int y);
    boolean isCellEditable(int x, int y);
    TableModelListener removeTableListener(TableModelListener tableModelListener);
    void setValueAt(int x, int y, Object o);
}
