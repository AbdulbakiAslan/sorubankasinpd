package SoruBankasi;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SoruBankasi extends JFrame {
    private Container container;
    private JMenuBar menuBar;
    private JMenuItem menuSoruEkle;
    private JMenuItem menuSoruSil;
    private JMenuItem menulistele;
    private JMenuItem menuSoruAra;
    private JMenuItem anaSayfa;
    private JComboBox siralamaTuru;
    private JButton secButton;
    private JPanel anaPanel;
    private JPanel yeniPanel;

    private JLabel soruMetni;
    private JLabel soruCevabi;
    private JLabel soruPuani;
    private JLabel soruTuru;


    private JTextArea hoşgeldiniz;
    private JTable tablo;
// ayberk222222

    public SoruBankasi() {
        super("Soru Bankası");

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(700, 500);
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        this.setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);
        menuBar = new JMenuBar();
        this.setJMenuBar(menuBar);
        anaSayfa = new JMenuItem("AnaSayfa");

        menuBar.add(anaSayfa);

        anaSayfa.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //anasayfa();
            }
        });

        menuSoruEkle = new JMenuItem("Yeni Soru");
        menuBar.add(menuSoruEkle);
        menuSoruEkle.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
              //  yeniSoruMenusu();
            }
        });
        menuSoruSil = new JMenuItem("Soru Sil");
        menuBar.add(menuSoruSil);
        menuSoruSil.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
              //  SoruSil();
            }
        });
        menulistele = new JMenuItem("Listele");
        menuBar.add(menulistele);
        menulistele.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
              //  yeniSoruListeleme();
            }
        });
        menuSoruAra = new JMenuItem("Soru Ara");
        menuBar.add(menuSoruAra);
        menuSoruAra.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               // yeniSoruAra();
            }
        });
    }
        public static void main (String[]args){
            SoruBankasi banka = new SoruBankasi();
            banka.setVisible(true);

        }
    }

