package device;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InterfatzaGrafica {
    private JFrame frame;
    private JTextField pretMinimField;
    private JTextField garantieMinimaField;
    private JTextArea aparateTextArea;
    private JTextArea aspiratoareUscateTextArea;
    private JTextArea aspiratoareUmedeTextArea;
    private JButton filtraButton;

    private Aparat[] aparate;
    private AspiratorUscat[] aspiratoareUscate;
    private AspiratorUmed[] aspiratoareUmede;

    public InterfatzaGrafica() {
        initData();
        initComponents();
    }

    private void initData() {
        aparate = new Aparat[]{
            new Aparat("Samsung", "ModelX", 1200.0f, (byte) 2, "Electrocasnice"),
            new Aparat("LG", "CleanPro", 1500.0f, (byte) 3, "Electrocasnice"),
            new Aparat("Philips", "DustAway", 900.0f, (byte) 1, "Electrocasnice")
        };

        aspiratoareUscate = new AspiratorUscat[]{
            new AspiratorUscat("Samsung", "DryClean", 1200.0f, (byte) 2, "AspiratorUscat", (byte) 200, 2.0f, true),
            new AspiratorUscat("LG", "DustHunter", 1400.0f, (byte) 3, "AspiratorUscat", (byte) 220, 3.5f, false)
        };

        aspiratoareUmede = new AspiratorUmed[]{
            new AspiratorUmed("Samsung", "WetClean", 1500.0f, (byte) 3, "AspiratorUmed", (byte) 200, 2.0f, true, true, 2.5f),
            new AspiratorUmed("LG", "AquaForce", 1600.0f, (byte) 3, "AspiratorUmed", (byte) 220, 3.5f, true, true, 3.0f)
        };
    }

    private void initComponents() {
        frame = new JFrame("Interfață Grafică - Filtrare Dispozitive");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setLayout(new GridLayout(4, 1));

        // Panou pentru filtrare
        JPanel filterPanel = new JPanel();
        filterPanel.setLayout(new FlowLayout());

        pretMinimField = new JTextField(5);
        garantieMinimaField = new JTextField(5);
        filtraButton = new JButton("Filtrează Dispozitive");

        filterPanel.add(new JLabel("Preț minim:"));
        filterPanel.add(pretMinimField);
        filterPanel.add(new JLabel("Garanție minimă:"));
        filterPanel.add(garantieMinimaField);
        filterPanel.add(filtraButton);
        frame.add(filterPanel);

        // Panou pentru afișarea aparatelor
        aparateTextArea = new JTextArea(10, 70);
        aparateTextArea.setEditable(false);
        frame.add(new JScrollPane(aparateTextArea));

        // Panou pentru afișarea aspiratoarelor uscate
        aspiratoareUscateTextArea = new JTextArea(10, 70);
        aspiratoareUscateTextArea.setEditable(false);
        frame.add(new JScrollPane(aspiratoareUscateTextArea));

        // Panou pentru afișarea aspiratoarelor umede
        aspiratoareUmedeTextArea = new JTextArea(10, 70);
        aspiratoareUmedeTextArea.setEditable(false);
        frame.add(new JScrollPane(aspiratoareUmedeTextArea));

        // Adăugarea ascultătorului pentru butonul de filtrare
        filtraButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                filtraDispozitive();
            }
        });

        frame.setVisible(true);
    }

    private void filtraDispozitive() {
        float pretMinim = 0;
        byte garantieMinima = 0;

        try {
            pretMinim = Float.parseFloat(pretMinimField.getText());
            garantieMinima = Byte.parseByte(garantieMinimaField.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(frame, "Introduceți valori numerice valide.");
            return;
        }

        aparateTextArea.setText("Aparate care îndeplinesc condițiile:\n");
        for (Aparat aparat : aparate) {
            if (aparat.getPret() > pretMinim && aparat.getGarantie() >= garantieMinima) {
                aparateTextArea.append(aparat + "\n");
            }
        }

        aspiratoareUscateTextArea.setText("Aspiratoare uscate care îndeplinesc condițiile:\n");
        for (AspiratorUscat aspirator : aspiratoareUscate) {
            if (aspirator.getPutereAspirare() > 200 && aspirator.isAreFiltruHEPA()) {
                aspiratoareUscateTextArea.append(aspirator + "\n");
            }
        }

        aspiratoareUmedeTextArea.setText("Aspiratoare umede care îndeplinesc condițiile:\n");
        for (AspiratorUmed aspirator : aspiratoareUmede) {
            if (aspirator.getCapacitateApa() >= 3 && aspirator.getAreFunctieUscare()) {
                aspiratoareUmedeTextArea.append(aspirator + "\n");
            }
        }
    }

    public static void main(String[] args) {
        new InterfatzaGrafica();
    }
}

