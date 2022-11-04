// 
// Decompiled by Procyon v0.5.36
// 

package view;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.io.FileNotFoundException;
import javax.swing.JOptionPane;
import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.border.EmptyBorder;
import javax.swing.JPanel;
import javax.swing.JFrame;

public class telaCarregarJogo extends JFrame
{
    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    
    public telaCarregarJogo(final Jogador jogador) {
        this.setDefaultCloseOperation(3);
        this.setBounds(400, 200, 621, 398);
        (this.contentPane = new JPanel()).setBorder(new EmptyBorder(5, 5, 5, 5));
        this.setContentPane(this.contentPane);
        this.contentPane.setLayout(null);
        final JButton newGame = new JButton("Novo Jogo");
        newGame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                telaCarregarJogo.this.dispose();
                EventQueue.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            final telaInicial frame = new telaInicial(jogador);
                            frame.setVisible(true);
                        }
                        catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                });
            }
        });
        newGame.setBounds(201, 130, 184, 42);
        this.contentPane.add(newGame);
        final JButton loadGame = new JButton("Carregar Jogo");
        loadGame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                try {
                    final FileInputStream arquivoLeitura = new FileInputStream("data.dat");
                    final ObjectInputStream objLeitura = new ObjectInputStream(arquivoLeitura);
                    final Jogador jogador1 = (Jogador)objLeitura.readObject();
                    objLeitura.close();
                    arquivoLeitura.close();
                    telaCarregarJogo.this.dispose();
                    EventQueue.invokeLater(new Runnable() {
                        @Override
                        public void run() {
                            try {
                                final telaCidade frame = new telaCidade(jogador1);
                                frame.setVisible(true);
                            }
                            catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    });
                }
                catch (FileNotFoundException e3) {
                    JOptionPane.showMessageDialog(null, "N\u00e3o h\u00e1 jogo salvo.");
                    telaCarregarJogo.this.dispose();
                    EventQueue.invokeLater(new Runnable() {
                        @Override
                        public void run() {
                            try {
                                final telaInicial frame = new telaInicial(jogador);
                                frame.setVisible(true);
                            }
                            catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    });
                }
                catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        });
        loadGame.setBounds(201, 183, 184, 47);
        this.contentPane.add(loadGame);
        final JLabel imagem = new JLabel("New label");
        imagem.setBounds(0, 0, 605, 359);
        final ImageIcon imgIcon = new ImageIcon(telaCarregarJogo.class.getResource("/imagens/swordartonline.png"));
        final Image img = imgIcon.getImage().getScaledInstance(imagem.getWidth(), imagem.getHeight(), 1);
        imagem.setIcon(new ImageIcon(img));
        this.contentPane.add(imagem);
        this.contentPane.setComponentZOrder(imagem, 2);
        this.contentPane.setComponentZOrder(loadGame, 1);
        this.contentPane.setComponentZOrder(newGame, 1);
    }
}
