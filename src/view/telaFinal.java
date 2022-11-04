// 
// Decompiled by Procyon v0.5.36
// 

package view;

import java.awt.Image;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Component;
import javax.swing.Icon;
import java.awt.LayoutManager;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Container;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.JPanel;
import javax.swing.JFrame;

public class telaFinal extends JFrame
{
    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    
    public telaFinal(final Jogador jogador) {
        this.setDefaultCloseOperation(3);
        this.setBounds(400, 200, 621, 398);
        (this.contentPane = new JPanel()).setBorder(new EmptyBorder(5, 5, 5, 5));
        this.setContentPane(this.contentPane);
        final JLabel imagem = new JLabel("New label");
        imagem.setBounds(0, 5, 605, 354);
        final ImageIcon imgInic = new ImageIcon(telaCombate.class.getResource("/imagens/imagemFinal.png"));
        final Image img = imgInic.getImage().getScaledInstance(imagem.getWidth(), imagem.getHeight(), 1);
        this.contentPane.setLayout(null);
        imagem.setIcon(new ImageIcon(img));
        this.contentPane.add(imagem);
        final JLabel lblNewLabel = new JLabel("Desenvolvedor: Tiago Silva Nicolau");
        lblNewLabel.setForeground(Color.CYAN);
        lblNewLabel.setBounds(10, 334, 333, 14);
        this.contentPane.add(lblNewLabel);
        final JButton btnMenuPrincipal = new JButton("Menu Principal");
        btnMenuPrincipal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                telaFinal.this.dispose();
                EventQueue.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            final telaCarregarJogo frame = new telaCarregarJogo(jogador);
                            frame.setVisible(true);
                        }
                        catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                });
            }
        });
        btnMenuPrincipal.setBounds(117, 260, 144, 23);
        this.contentPane.add(btnMenuPrincipal);
        final JButton btnSairDoJogo = new JButton("Sair do Jogo");
        btnSairDoJogo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                telaFinal.this.dispose();
                System.exit(0);
            }
        });
        btnSairDoJogo.setBounds(304, 260, 144, 23);
        this.contentPane.add(btnSairDoJogo);
        this.contentPane.setComponentZOrder(imagem, 2);
        this.contentPane.setComponentZOrder(btnMenuPrincipal, 1);
        this.contentPane.setComponentZOrder(btnSairDoJogo, 1);
        this.contentPane.setComponentZOrder(lblNewLabel, 1);
    }
}
