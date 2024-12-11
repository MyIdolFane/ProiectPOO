package device;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class InterfatzaGrafica {
    private List<Aparat> aparate;

    public InterfatzaGrafica() {
        // Inițializare listă de aparate
        aparate = new ArrayList<>();
        aparate.add(new Aparat("Samsung", "ModelX", 1200.0f, (byte) 2, "Electrocasnice"));
        aparate.add(new Aparat("LG", "CleanPro", 1500.0f, (byte) 3, "Electrocasnice"));
        aparate.add(new Aparat("Philips", "DustAway", 900.0f, (byte) 1, "Electrocasnice"));
        aparate.add(new Aparat("Bosch", "AquaPlus", 1100.0f, (byte) 2, "Electrocasnice"));
        aparate.add(new Aparat("Dyson", "CycloneV10", 2500.0f, (byte) 5, "Premium"));
        aparate.add(new Aparat("Rowenta", "AirForce", 800.0f, (byte) 1, "Electrocasnice"));

        // Crearea interfeței grafice
        createGUI();
    }

    private void createGUI() {
        JFrame frame = new JFrame("Aparate GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        frame.setLayout(new BorderLayout());

        // Panou pentru introducerea condițiilor
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(3, 2, 10, 10));

        JLabel pretLabel = new JLabel("Preț maxim:");
        JTextField pretField = new JTextField();
        JLabel garantieLabel = new JLabel("Garanție minimă:");
        JTextField garantieField = new JTextField();
        JLabel categorieLabel = new JLabel("Categorie:");
        JTextField categorieField = new JTextField();

        inputPanel.add(pretLabel);
        inputPanel.add(pretField);
        inputPanel.add(garantieLabel);
        inputPanel.add(garantieField);
        inputPanel.add(categorieLabel);
        inputPanel.add(categorieField);

        // Zonă pentru afișarea rezultatelor
        JTextArea resultArea = new JTextArea();
        resultArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(resultArea);

        // Buton pentru filtrare
        JButton filterButton = new JButton("Filtrează");
        filterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Citire condiții din GUI
                try {
                    float pretMaxim = Float.parseFloat(pretField.getText());
                    byte garantieMinima = Byte.parseByte(garantieField.getText());
                    String categorie = categorieField.getText().trim();

                    // Filtrare și afișare
                    List<Aparat> filtrate = filtreazaAparate(pretMaxim, garantieMinima, categorie);
                    resultArea.setText("");
                    if (filtrate.isEmpty()) {
                        resultArea.append("Nu s-au găsit aparate care să corespundă criteriilor.\n");
                    } else {
                        for (Aparat aparat : filtrate) {
                            resultArea.append(aparat.toString() + "\n");
                        }
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Vă rugăm să introduceți valori valide pentru preț și garanție.", "Eroare", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // Adăugare componente la frame
        frame.add(inputPanel, BorderLayout.NORTH);
        frame.add(scrollPane, BorderLayout.CENTER);
        frame.add(filterButton, BorderLayout.SOUTH);

        frame.setVisible(true);
    }

    private List<Aparat> filtreazaAparate(float pretMaxim, byte garantieMinima, String categorie) {
        List<Aparat> result = new ArrayList<>();
        for (Aparat aparat : aparate) {
            if (aparat.getPret() <= pretMaxim &&
                aparat.getGarantie() >= garantieMinima &&
                aparat.getCategorie().equalsIgnoreCase(categorie)) {
                result.add(aparat);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        new InterfatzaGrafica();
    }
}
