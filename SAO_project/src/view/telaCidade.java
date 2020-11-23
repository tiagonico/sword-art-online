// 
// Decompiled by Procyon v0.5.36
// 

package view;

import java.awt.Image;
import java.io.OutputStream;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import javax.swing.JOptionPane;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import java.awt.Component;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.LayoutManager;
import java.awt.Container;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.JPanel;
import javax.swing.JFrame;

public class telaCidade extends JFrame
{
    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    
    public telaCidade(final Jogador jogador) {
        this.setDefaultCloseOperation(3);
        this.setBounds(400, 200, 621, 398);
        (this.contentPane = new JPanel()).setBorder(new EmptyBorder(5, 5, 5, 5));
        this.setContentPane(this.contentPane);
        this.contentPane.setLayout(null);
        final JLabel imagemCidade = new JLabel("New label");
        imagemCidade.setForeground(Color.WHITE);
        imagemCidade.setBounds(0, 0, 605, 359);
        final ImageIcon imgCidade = new ImageIcon(telaCombate.class.getResource("/imagens/cidade" + jogador.andar + ".png"));
        final Image img = imgCidade.getImage().getScaledInstance(imagemCidade.getWidth(), imagemCidade.getHeight(), 1);
        imagemCidade.setIcon(new ImageIcon(img));
        this.contentPane.add(imagemCidade);
        final JLabel lblBemVindoA = new JLabel("Bem vindo a cidade do andar " + jogador.andar);
        lblBemVindoA.setForeground(Color.WHITE);
        if (jogador.andar == 5) {
            lblBemVindoA.setForeground(Color.BLACK);
        }
        lblBemVindoA.setBounds(22, 34, 199, 14);
        this.contentPane.add(lblBemVindoA);
        this.contentPane.setComponentZOrder(lblBemVindoA, 0);
        final JButton btnInventario = new JButton("Ver invent\u00e1rio");
        btnInventario.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                telaCidade.this.dispose();
                EventQueue.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            final telaInventario frame = new telaInventario(jogador);
                            frame.setVisible(true);
                        }
                        catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                });
            }
        });
        btnInventario.setBounds(34, 97, 147, 23);
        this.contentPane.add(btnInventario);
        final JButton btnNewButton = new JButton("Ir para Loja");
        btnNewButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                telaCidade.this.dispose();
                EventQueue.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            final telaLoja frame2 = new telaLoja(jogador);
                            frame2.setVisible(true);
                        }
                        catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                });
            }
        });
        btnNewButton.setBounds(34, 131, 147, 23);
        this.contentPane.add(btnNewButton);
        final JButton btnNewButton_1 = new JButton("Ver status");
        btnNewButton_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                telaCidade.this.dispose();
                EventQueue.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            final telaStatus frame2 = new telaStatus(jogador);
                            frame2.setVisible(true);
                        }
                        catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                });
            }
        });
        btnNewButton_1.setBounds(34, 165, 147, 23);
        this.contentPane.add(btnNewButton_1);
        final JButton btnNewButton_2 = new JButton("Ir para taberna");
        btnNewButton_2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                telaCidade.this.dispose();
                EventQueue.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            final telaTaberna frame2 = new telaTaberna(jogador);
                            frame2.setVisible(true);
                        }
                        catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                });
            }
        });
        btnNewButton_2.setBounds(34, 199, 147, 23);
        this.contentPane.add(btnNewButton_2);
        final JButton btnNewButton_3 = new JButton("Sair da cidade");
        btnNewButton_3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                telaCidade.this.dispose();
                EventQueue.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            final telaCombate frame2 = new telaCombate(jogador, false);
                            frame2.setVisible(true);
                        }
                        catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                });
            }
        });
        btnNewButton_3.setBounds(34, 233, 147, 23);
        this.contentPane.add(btnNewButton_3);
        final JButton btnNewButton_4 = new JButton("Pr\u00f3ximo andar");
        btnNewButton_4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                if (jogador.andar == jogador.andarMax) {
                    JOptionPane.showMessageDialog(null, "Derrote o boss desse andar primeiro");
                }
                else {
                    final Jogador val$jogador = jogador;
                    ++val$jogador.andar;
                    telaCidade.this.dispose();
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
            }
        });
        btnNewButton_4.setBounds(34, 267, 147, 23);
        this.contentPane.add(btnNewButton_4);
        final JButton btnEnfrentarOBoss = new JButton("Enfrentar o boss");
        btnEnfrentarOBoss.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                if (jogador.andarMax != jogador.andar) {
                    JOptionPane.showMessageDialog(null, "Voc\u00ea j\u00e1 derrotou esse boss.");
                }
                else if (JOptionPane.showConfirmDialog(null, "Tem certeza?") == 0) {
                    telaCidade.this.dispose();
                    EventQueue.invokeLater(new Runnable() {
                        @Override
                        public void run() {
                            try {
                                final telaCombate frame2 = new telaCombate(jogador, true);
                                frame2.setVisible(true);
                            }
                            catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    });
                }
            }
        });
        btnEnfrentarOBoss.setBounds(404, 290, 137, 23);
        this.contentPane.add(btnEnfrentarOBoss);
        final JLabel lblApenasEnfrenteO = new JLabel("Apenas enfrente o boss quando estiver");
        lblApenasEnfrenteO.setForeground(Color.WHITE);
        lblApenasEnfrenteO.setBounds(369, 253, 226, 14);
        this.contentPane.add(lblApenasEnfrenteO);
        final JLabel lblForteOSuficiente = new JLabel("forte o suficiente.");
        lblForteOSuficiente.setForeground(Color.WHITE);
        lblForteOSuficiente.setBounds(369, 271, 199, 14);
        this.contentPane.add(lblForteOSuficiente);
        if (jogador.andar != 1) {
            final JButton AndarAnterior = new JButton("Andar Anterior");
            AndarAnterior.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(final ActionEvent e) {
                    final Jogador val$jogador = jogador;
                    --val$jogador.andar;
                    telaCidade.this.dispose();
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
            AndarAnterior.setBounds(34, 301, 147, 23);
            this.contentPane.add(AndarAnterior);
            this.contentPane.setComponentZOrder(AndarAnterior, 1);
        }
        final JButton btnSalvar = new JButton("Salvar");
        btnSalvar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                try {
                    final FileOutputStream arquivoGrav = new FileOutputStream("data.dat");
                    final ObjectOutputStream objGrav = new ObjectOutputStream(arquivoGrav);
                    objGrav.writeObject(jogador);
                    objGrav.flush();
                    objGrav.close();
                    arquivoGrav.flush();
                    arquivoGrav.close();
                }
                catch (Exception e2) {
                    e2.printStackTrace();
                }
                JOptionPane.showMessageDialog(null, "Seu progresso foi salvo com sucesso.");
            }
        });
        btnSalvar.setBounds(385, 11, 89, 23);
        this.contentPane.add(btnSalvar);
        final JButton btnSairDoJogo = new JButton("Tela inicial");
        btnSairDoJogo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                telaCidade.this.dispose();
                EventQueue.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            final telaCarregarJogo frame2 = new telaCarregarJogo(jogador);
                            frame2.setVisible(true);
                        }
                        catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                });
            }
        });
        btnSairDoJogo.setBounds(484, 11, 111, 23);
        this.contentPane.add(btnSairDoJogo);
        this.contentPane.setComponentZOrder(imagemCidade, 2);
        this.contentPane.setComponentZOrder(btnNewButton, 1);
        this.contentPane.setComponentZOrder(btnNewButton_1, 1);
        this.contentPane.setComponentZOrder(btnNewButton_2, 1);
        this.contentPane.setComponentZOrder(btnNewButton_3, 1);
        this.contentPane.setComponentZOrder(btnNewButton_4, 1);
        this.contentPane.setComponentZOrder(btnEnfrentarOBoss, 1);
        this.contentPane.setComponentZOrder(lblApenasEnfrenteO, 1);
        this.contentPane.setComponentZOrder(lblForteOSuficiente, 1);
        this.contentPane.setComponentZOrder(btnSalvar, 1);
        this.contentPane.setComponentZOrder(btnSairDoJogo, 1);
        this.contentPane.setComponentZOrder(btnInventario, 1);
    }
}
