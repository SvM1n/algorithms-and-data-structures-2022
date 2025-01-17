package DZ1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EX1 extends JFrame{
    private JPanel panel1;
    private JButton ACMilanButton;
    private JButton realMadridButton;
    private JLabel lastScoreLabel;
    private JLabel resLabel;
    private JLabel winLabel;

    private int mil = 0, rea = 0;

    private  EX1(){
        setContentPane(panel1);
        setSize(430, 100);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        ACMilanButton.addActionListener(e->{
            mil++;
            upd("AC Milan");
        });
        realMadridButton.addActionListener(e->{
            rea++;
            upd("Real Madrid");
        });
    }

    private void upd(String last){
        lastScoreLabel.setText("Last Score: " + last);
        resLabel.setText("Result: " + mil + " X " + rea);
        String w = "DRAW";
        if(mil > rea)
            w = "AC Milan";
        else if (rea > mil)
            w = "Real Madrid";
        winLabel.setText("Winner: " + w);
    }

    public static void main(String[] args) {
        new EX1();
    }
}
