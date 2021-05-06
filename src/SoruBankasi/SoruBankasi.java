package SoruBankasi;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

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
                yeniSoruAra();
            }

            private void yeniSoruAra() {
                container = getContentPane();
                container.removeAll();
                yeniPanel = new JPanel(null);
                yeniPanel.setSize(400, 490);
                yeniPanel.setBounds(0, 0, 400, 490);
                yeniPanel.setBackground(Color.white);
                String[] secenekler = {"Ürün Numarasına Göre Ara", "Ürün İsmine Göre Ara", "Ürün Türüne Göre Ara", "Ürün Fiyatına Göre Ara", "Ürün Miktarına Göre Ara"};
                final JComboBox aramaSecenekleri = new JComboBox(secenekler);
                aramaSecenekleri.setSize(250, 25);
                aramaSecenekleri.setBounds(10, 10, 250, 25);
                yeniPanel.add(aramaSecenekleri);
                JButton sec = new JButton("Seç");
                sec.setSize(70, 25);
                sec.setBounds(270, 10, 70, 25);
                sec.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        switch (aramaSecenekleri.getSelectedIndex()) {
                            case 0:
                                icerikListeleme("Ürün numarasını giriniz: ", "urunNumarasi");
                                break;
                            case 1:
                                icerikListeleme("Ürün ismini giriniz: ", "urunIsmi");
                                break;
                            case 2:
                                icerikListeleme("Ürün türünü giriniz: ", "urunTuru");
                                break;
                            case 3:
                                icerikListeleme("Ürün fiyatını giriniz: ", "urunFiyati");
                                break;
                            case 4:
                                icerikListeleme("Ürün miktarını giriniz: ", "urunMiktari");
                                break;
                        }
                    }
                });
                yeniPanel.add(sec);
                container.add(yeniPanel);
                invalidate();
                repaint();
            }

            public void icerikListeleme(String mesaj, final String sutun) {

                container = getContentPane();

                container.removeAll();

              /*  icerikArama(mesaj);


                guncelleSec.addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent e) {
                        try {
                            listelemeYap("SELECT * FROM stokProje WHERE " + sutun + "= \"" + txtGuncelle.getText() + "\"");
                        } catch (SQLException ex) {
                            JOptionPane.showConfirmDialog(null, "Bağlantı Başarısız", "Mysql Bağlantısı", JOptionPane.PLAIN_MESSAGE);

                        }
                    }
                }
                );*/

                yeniPanel = new JPanel(null);

                yeniPanel.setSize(400, 490);

                yeniPanel.setBounds(0, 0, 400, 490);

                yeniPanel.setBackground(Color.white);

                container.add(yeniPanel);

                invalidate();

                repaint();


            }
        });
    }

    public static void main(String[] args) {
        SoruBankasi banka = new SoruBankasi();
        banka.setVisible(true);

    }
}

