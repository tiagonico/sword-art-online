// 
// Decompiled by Procyon v0.5.36
// 

package view;

import java.awt.Image;
import java.awt.EventQueue;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.Component;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.LayoutManager;
import java.awt.Container;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.JPanel;
import javax.swing.JFrame;

public class telaTaberna extends JFrame
{
    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    
    public telaTaberna(final Jogador jogador) {
        this.setDefaultCloseOperation(3);
        this.setBounds(400, 200, 621, 398);
        (this.contentPane = new JPanel()).setBorder(new EmptyBorder(5, 5, 5, 5));
        this.setContentPane(this.contentPane);
        this.contentPane.setLayout(null);
        final JLabel lblNewLabel = new JLabel("Bem vindo \u00e0 taberna. ");
        lblNewLabel.setForeground(Color.WHITE);
        lblNewLabel.setBounds(234, 88, 220, 23);
        this.contentPane.add(lblNewLabel);
        final JLabel imagemTaberna = new JLabel("New label");
        imagemTaberna.setBounds(0, 0, 605, 359);
        final ImageIcon imgTaberna = new ImageIcon(telaCombate.class.getResource("/imagens/taberna.png"));
        final Image img = imgTaberna.getImage().getScaledInstance(imagemTaberna.getWidth(), imagemTaberna.getHeight(), 1);
        imagemTaberna.setIcon(new ImageIcon(img));
        this.contentPane.add(imagemTaberna);
        final JLabel lblGold = new JLabel("Gold: $ " + jogador.status.gold);
        lblGold.setFont(new Font("Tahoma", 0, 14));
        lblGold.setForeground(new Color(255, 255, 255));
        lblGold.setBounds(67, 206, 96, 14);
        this.contentPane.add(lblGold);
        final JButton btnNewButton = new JButton("Descansar $ 50");
        btnNewButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                if (jogador.status.gold >= 50) {
                    jogador.status.hp = jogador.status.hpMax;
                    jogador.status.mp = jogador.status.mpMax;
                    final Status status = jogador.status;
                    status.gold -= 50;
                    lblGold.setText("Gold: $ " + jogador.status.gold);
                    JOptionPane.showMessageDialog(null, "Voc\u00ea recuperou seus pontos de vida e mana!");
                    telaTaberna.this.dispose();
                    EventQueue.invokeLater(new Runnable() {
                        @Override
                        public void run() {
                            try {
                                final telaCidade frame2 = new telaCidade(jogador);
                                frame2.setVisible(true);
                            }
                            catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    });
                }
                else {
                    JOptionPane.showMessageDialog(null, "Voc\u00ea n\u00e3o tem gold suficiente para isso.");
                }
            }
        });
        btnNewButton.setBounds(225, 182, 123, 23);
        this.contentPane.add(btnNewButton);
        final JButton btnVoltar = new JButton("Voltar");
        btnVoltar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                telaTaberna.this.dispose();
                EventQueue.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            final telaCidade frame2 = new telaCidade(jogador);
                            frame2.setVisible(true);
                        }
                        catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                });
            }
        });
        btnVoltar.setBounds(225, 225, 123, 23);
        this.contentPane.add(btnVoltar);
        final JLabel lblAquiVocPoder = new JLabel("Aqui voc\u00ea poder\u00e1 recuperar seus pontos de vida e mana.");
        lblAquiVocPoder.setForeground(Color.WHITE);
        lblAquiVocPoder.setBounds(120, 122, 346, 23);
        this.contentPane.add(lblAquiVocPoder);
        this.contentPane.setComponentZOrder(imagemTaberna, 2);
        this.contentPane.setComponentZOrder(btnNewButton, 1);
        this.contentPane.setComponentZOrder(btnVoltar, 1);
        this.contentPane.setComponentZOrder(lblAquiVocPoder, 1);
        this.contentPane.setComponentZOrder(lblNewLabel, 1);
        this.contentPane.setComponentZOrder(lblGold, 1);
    }
}
