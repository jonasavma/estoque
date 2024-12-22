package componentes;


import java.awt.*;
import java.awt.event.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;


public class Relogio1 extends JFrame  {

    private JLabel labelRelogio;

    public Relogio1() {
        super("Relógio");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        labelRelogio = new JLabel();
        labelRelogio.setFont(new Font("Arial", Font.BOLD, 24));
        add(labelRelogio);

        Timer timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed( ActionEvent e ) {
                SimpleDateFormat formato = new SimpleDateFormat("HH:mm:ss");
                labelRelogio.setText(formato.format(new Date()));
            }
        });
        timer.start();

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main( String[] args ) {
        new Relogio1();
    }

}
