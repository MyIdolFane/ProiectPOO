package device;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Comparator;

public class InterfatzaGrafica extends JFrame {
    private JTable table;
    private DefaultTableModel tableModel;
    private JComboBox<String> sortComboBox;
    private JTextField pretMinField, pretMaxField;
    private JButton filterButton;

    private Aparat[] aparate = {
            new Aparat("Samsung", "ModelX", 1200.0f, (byte) 2, "Electrocasnice"),
            new Aparat("LG", "CleanPro", 1500.0f, (byte) 3, "Electrocasnice"),
            new Aparat("Philips", "DustAway", 900.0f, (byte) 1, "Electrocasnice"),
            new Aparat("Bosch", "AquaPlus", 1100.0f, (byte) 2, "Electrocasnice"),
            new Aparat("Dyson", "CycloneV10", 2500.0f, (byte) 5, "Premium")
    };

    public InterfatzaGrafica() {
        setTitle("Gestionează Aparate");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Configurare tabel
        String[] columnNames = {"Brand", "Model", "Preț", "Garanție", "Categorie"};
        tableModel = new DefaultTableModel(columnNames, 0);
        table = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(table);

        // Adăugare elemente inițiale în tabel
        for (Aparat aparat : aparate) {
            tableModel.addRow(new Object[]{aparat.getBrand(), aparat.getModel(), aparat.getPret(), aparat.getGarantie(), aparat.getCategorie()});
        }

        // ComboBox pentru sortare
        sortComboBox = new JComboBox<>(new String[]{"Sortează după...", "Preț Crescător", "Preț Descrescător"});
        sortComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sortTable(sortComboBox.getSelectedIndex());
            }
        });

        // Câmpuri pentru filtrare
        pretMinField = new JTextField(5);
        pretMaxField = new JTextField(5);
        filterButton = new JButton("Filtrează");
        filterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                filterTable();
            }
        });

        // Panou pentru sortare și filtrare
        JPanel controlPanel = new JPanel();
        controlPanel.add(new JLabel("Sortare:"));
        controlPanel.add(sortComboBox);
        controlPanel.add(new JLabel("Preț Min:"));
        controlPanel.add(pretMinField);
        controlPanel.add(new JLabel("Preț Max:"));
        controlPanel.add(pretMaxField);
        controlPanel.add(filterButton);

        // Adăugare componente în fereastră
        add(scrollPane, BorderLayout.CENTER);
        add(controlPanel, BorderLayout.SOUTH);
    }

    // Funcție pentru sortare
    private void sortTable(int criteria) {
        Arrays.sort(aparate, new Comparator<Aparat>() {
            @Override
            public int compare(Aparat o1, Aparat o2) {
                if (criteria == 1) { // Preț Crescător
                    return Float.compare(o1.getPret(), o2.getPret());
                } else if (criteria == 2) { // Preț Descrescător
                    return Float.compare(o2.getPret(), o1.getPret());
                }
                return 0;
            }
        });

        refreshTable();
    }

    // Funcție pentru filtrare
    private void filterTable() {
        float pretMin = 0, pretMax = Float.MAX_VALUE;
        try {
            if (!pretMinField.getText().isEmpty()) {
                pretMin = Float.parseFloat(pretMinField.getText());
            }
            if (!pretMaxField.getText().isEmpty()) {
                pretMax = Float.parseFloat(pretMaxField.getText());
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Introduceți valori numerice valide!", "Eroare", JOptionPane.ERROR_MESSAGE);
            return;
        }

        tableModel.setRowCount(0);
        for (Aparat aparat : aparate) {
            if (aparat.getPret() >= pretMin && aparat.getPret() <= pretMax) {
                tableModel.addRow(new Object[]{aparat.getBrand(), aparat.getModel(), aparat.getPret(), aparat.getGarantie(), aparat.getCategorie()});
            }
        }
    }

    // Funcție pentru reîncărcare tabel
    private void refreshTable() {
        tableModel.setRowCount(0);
        for (Aparat aparat : aparate) {
            tableModel.addRow(new Object[]{aparat.getBrand(), aparat.getModel(), aparat.getPret(), aparat.getGarantie(), aparat.getCategorie()});
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new InterfatzaGrafica().setVisible(true);
        });
    }
}
