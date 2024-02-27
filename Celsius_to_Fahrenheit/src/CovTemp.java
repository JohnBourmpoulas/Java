import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CovTemp extends JFrame {
    private JPanel row1;
    private JLabel celsius_Label;
    private JTextField celsius;

    private JPanel row2;
    private JButton calculate;
    private JButton reset;

    private JPanel row3;
    private JLabel fahr_Label;
    private JTextField fahr;

    public CovTemp(){
        super("Celsius to Fahrenheit");

        row1 = new JPanel();
        celsius_Label = new JLabel("Enter Temperature in Celsius:", JLabel.RIGHT);
        celsius = new JTextField(15);

        row2 = new JPanel();
        calculate = new JButton("Calculate");
        reset = new JButton("Reset Values");

        row3 = new JPanel();
        fahr_Label = new JLabel("Temperature in fahrenheit:", JLabel.RIGHT);
        fahr = new JTextField(15);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);

        Container pane = getContentPane();
        GridLayout layout = new GridLayout(3,1);
        pane.setLayout(layout);

        FlowLayout flayout = new FlowLayout();
        row1.setLayout(flayout);
        row1.add(celsius_Label);
        row1.add(celsius);
        pane.add(row1);     

        row2.add(calculate);
        row2.add(reset);
        pane.add(row2);

        row3.add(fahr_Label);
        row3.add(fahr);
        pane.add(row3);

        setContentPane(pane);
        pack();

        calculate.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                double cel = Double.parseDouble(celsius.getText());
                double far = 1.8*cel+32.;
                fahr.setText(Double.toString(far));
            }
        });

        reset.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                celsius.setText(null);
                fahr.setText(null);
            }
        });
    }

}