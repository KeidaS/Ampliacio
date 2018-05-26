package ex12015;

import javax.swing.event.TableModelListener;
import java.util.ArrayList;

public class StudentsTable extends AbstractTableModel {

    @Override
    public TableModelListener addTableModeListener(TableModelListener tableModelListener) {
        return null;
    }

    @Override
    public ArrayList getColumnClass(int i) {
        return new ArrayList<Student>(i);
    }

    @Override
    public String getColumnName(int i) {
        Group group = new Group();
        return group.getStudent(i).getName();
    }

    @Override
    public boolean isCellEditable(int x, int y) {
        return true;
    }

    @Override
    public TableModelListener removeTableListener(TableModelListener tableModelListener) {
        return null;
    }

    @Override
    public void setValueAt(int x, int y, Object o) {
        Group group = new Group();
        if (o instanceof String ) {
            group.addStudent((Student) o);
        }
    }
}
