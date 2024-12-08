/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package device;
import javax.swing.table.AbstractTableModel;
import java.util.List;
/**
 *
 * @author denia
 */
public class ModelAbstract extends AbstractTableModel{
    private final String[] columnNames = {"Brand", "Model", "Tip Alimentare", "Putere", "Pornire", "Latime Taiere", "Culoare", "Pret", "Garantie", "Categorie"};
    private final List<MasinaTunsIarba> grassCutters;

    public ModelAbstract(List<MasinaTunsIarba> grassCutters) {
        this.grassCutters = grassCutters;
    }

    @Override
    public int getRowCount() {
        return grassCutters.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        MasinaTunsIarba grassCutter = grassCutters.get(rowIndex);
        switch (columnIndex) {
            case 0: return grassCutter.getBrand();
            case 1: return grassCutter.getModel();
            case 2: return grassCutter.getTipAlimentare();
            case 3: return grassCutter.getPutereMotor();
            case 4: return grassCutter.getTipPornire();
            case 5: return grassCutter.getLatimeTaiere();
            case 6: return grassCutter.getCuloare();
            case 7: return grassCutter.getPret();
            case 8: return grassCutter.getGarantie();
            case 9: return grassCutter.getCategorie();
            default: return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }
}

