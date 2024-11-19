package componentesneww;

import javax.swing.*;

public class ComponentesNeww extends JFrame {
    private String[] lista = {"Bueno", "Malo", "Regular"};
    private JTextArea textArea = new JTextArea();
    private ButtonGroup botonGrupo1 = new ButtonGroup();
    private JRadioButton radio1 = new JRadioButton();
    private JRadioButton radio2 = new JRadioButton();
    private JCheckBox check1 = new JCheckBox();
    private JCheckBox check2 = new JCheckBox();
    private JComboBox combolista = new JComboBox(lista);

    public ComponentesNeww() {
        setTitle("Copiar Pegar");
        setSize(350, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public void AddComponentes(JPanel panel1) {
        textArea.setBounds(10, 20, 360, 100); 
        panel1.add(textArea);

        botonGrupo1.add(radio1);
        botonGrupo1.add(radio2);

        radio1.setBounds(10, 130, 100, 30);
        radio1.setText("Radio 1");
        panel1.add(radio1);

        radio2.setBounds(120, 130, 100, 30);
        radio2.setText("Radio 2");
        panel1.add(radio2);

        check1.setBounds(10, 170, 100, 30);
        check1.setText("Check 1");
        panel1.add(check1);

        check2.setBounds(120, 170, 100, 30);
        check2.setText("Check 2");
        panel1.add(check2);

        combolista.setBounds(10, 210, 150, 30);
        combolista.addItem("Excelente");
        combolista.addItem("Malisimo");
        panel1.add(combolista);
    }

    public static void main(String[] args) {
        ComponentesNeww ventana = new ComponentesNeww();

        JPanel panel1 = new JPanel();
        panel1.setLayout(null);
        ventana.getContentPane().add(panel1);

        ventana.AddComponentes(panel1);
        ventana.setVisible(true);
    }
}