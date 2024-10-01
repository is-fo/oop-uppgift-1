package växthotellet;

import växthotellet.växt.Växt;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class GreenestGUI extends JFrame {

    private JLabel displayPlantDetails;
    private JComboBox<Växt> växtJComboBox;

    public GreenestGUI(ArrayList<Växt> växter) {
        setFrame();
        setVäxtJComboBox(växter);
        setDisplayPlantDetails();
        add(växtJComboBox, BorderLayout.NORTH);
        add(displayPlantDetails, BorderLayout.CENTER);

        setVisible(true);
    }

    private void setFrame() {
        setTitle("Greenest Växthotell");
        setSize(600,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(10, 10));
        setLocation(new Point(800, 400));
    }

    private void setVäxtJComboBox(ArrayList<Växt> växter) {
        växtJComboBox = new JComboBox<>();

        for (Växt växt : växter) {
            växtJComboBox.addItem(växt);
        }
        växtJComboBox.setFont(new Font("Arial", Font.BOLD, 15));
        växtJComboBox.setPreferredSize(new Dimension(300, 30));
        växtJComboBox.addActionListener(new växtComboBoxListener());
    }

    private void setDisplayPlantDetails() {
        displayPlantDetails = new JLabel("Välj en växt");
        displayPlantDetails.setFont(new Font("Consolas", Font.PLAIN, 20));
        displayPlantDetails.setHorizontalAlignment(SwingConstants.CENTER);
    }

    private class växtComboBoxListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            Växt currentVäxt = (Växt) växtJComboBox.getSelectedItem();
            if (currentVäxt != null) {
                displayPlantDetails.setText(currentVäxt.getDetails());
            }
        }
    }

}
