// 
// Decompiled by Procyon v0.5.36
// 

package view;

import java.awt.Image;
import java.awt.EventQueue;
import java.io.OutputStream;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.AbstractButton;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.Font;
import java.awt.Color;
import java.awt.Component;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.LayoutManager;
import java.awt.Container;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JFrame;

public class telaInicial extends JFrame
{
    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField textFieldNome;
    
    public telaInicial(final Jogador jogador) {
        this.setDefaultCloseOperation(3);
        this.setBounds(400, 200, 619, 404);
        (this.contentPane = new JPanel()).setBorder(new EmptyBorder(5, 5, 5, 5));
        this.setContentPane(this.contentPane);
        this.contentPane.setLayout(null);
        final JLabel imagem = new JLabel("New label");
        imagem.setBounds(0, 0, 603, 365);
        final ImageIcon imgInic = new ImageIcon(telaCombate.class.getResource("/imagens/telainicial.png"));
        final Image img = imgInic.getImage().getScaledInstance(imagem.getWidth(), imagem.getHeight(), 1);
        imagem.setIcon(new ImageIcon(img));
        this.contentPane.add(imagem);
        final JLabel lblBemVindoAo = new JLabel("Bem vindo ao mundo de Sword Art Online");
        lblBemVindoAo.setForeground(Color.WHITE);
        lblBemVindoAo.setFont(new Font("Lucida Handwriting", 0, 15));
        lblBemVindoAo.setBounds(109, 11, 404, 33);
        this.contentPane.add(lblBemVindoAo);
        final JLabel lblDigiteOSeu = new JLabel("Digite o seu nome:");
        lblDigiteOSeu.setForeground(Color.BLACK);
        lblDigiteOSeu.setBounds(10, 111, 121, 26);
        this.contentPane.add(lblDigiteOSeu);
        (this.textFieldNome = new JTextField()).setBounds(142, 114, 226, 20);
        this.contentPane.add(this.textFieldNome);
        this.textFieldNome.setColumns(10);
        final ButtonGroup bg = new ButtonGroup();
        final ButtonGroup bg2 = new ButtonGroup();
        final JRadioButton rdbtnTank = new JRadioButton("Tank (+10 estamina, +0 for\u00e7a, +0 agilidade)");
        rdbtnTank.setForeground(Color.BLACK);
        rdbtnTank.setBounds(10, 181, 284, 23);
        this.contentPane.add(rdbtnTank);
        final JRadioButton rdbtnLutador = new JRadioButton("Lutador (+5 stamina, +5 for\u00e7a, +0 agilidade)");
        rdbtnLutador.setForeground(Color.BLACK);
        rdbtnLutador.setBounds(10, 207, 284, 23);
        this.contentPane.add(rdbtnLutador);
        final JRadioButton rdbtnBeserker = new JRadioButton("Beserker (+0 stamina, +5 for\u00e7a, +5 agilidade)");
        rdbtnBeserker.setForeground(Color.BLACK);
        rdbtnBeserker.setBounds(10, 232, 284, 23);
        this.contentPane.add(rdbtnBeserker);
        bg.add(rdbtnTank);
        bg.add(rdbtnLutador);
        bg.add(rdbtnBeserker);
        final JRadioButton rdbtnLeafa = new JRadioButton("Leafa");
        rdbtnLeafa.setBounds(434, 232, 121, 23);
        this.contentPane.add(rdbtnLeafa);
        final JRadioButton rdbtnKirito = new JRadioButton("Kirito");
        rdbtnKirito.setBounds(434, 207, 121, 23);
        this.contentPane.add(rdbtnKirito);
        final JRadioButton rdbtnAsuna = new JRadioButton("Asuna");
        rdbtnAsuna.setBounds(434, 181, 121, 23);
        this.contentPane.add(rdbtnAsuna);
        final JRadioButton rdbtnYuuki = new JRadioButton("Yuuki");
        rdbtnYuuki.setBounds(434, 258, 121, 23);
        this.contentPane.add(rdbtnYuuki);
        bg2.add(rdbtnAsuna);
        bg2.add(rdbtnKirito);
        bg2.add(rdbtnLeafa);
        bg2.add(rdbtnYuuki);
        final JButton btnConfirmar = new JButton("Confirmar");
        btnConfirmar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                if (telaInicial.this.textFieldNome.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Digite o seu nome primeiro.");
                }
                else if (!rdbtnTank.isSelected() && !rdbtnLutador.isSelected() && !rdbtnBeserker.isSelected()) {
                    JOptionPane.showMessageDialog(null, "Selecione a sua classe primeiro.");
                }
                else if (!rdbtnAsuna.isSelected() && !rdbtnKirito.isSelected() && !rdbtnLeafa.isSelected() && !rdbtnYuuki.isSelected()) {
                    JOptionPane.showMessageDialog(null, "Selecione seu personagem primeiro.");
                }
                else {
                    jogador.nome = telaInicial.this.textFieldNome.getText();
                    if (rdbtnTank.isSelected()) {
                        jogador.status.estamina = 10;
                        final Status status = jogador.status;
                        status.hpMax += 10;
                        final Status status2 = jogador.status;
                        status2.hp += 10;
                    }
                    else if (rdbtnLutador.isSelected()) {
                        jogador.status.forca = 5;
                        jogador.status.estamina = 5;
                        final Status status3 = jogador.status;
                        status3.hpMax += 5;
                        final Status status4 = jogador.status;
                        status4.hp += 5;
                    }
                    else if (rdbtnBeserker.isSelected()) {
                        jogador.status.forca = 5;
                        jogador.status.agilidade = 5;
                    }
                    if (rdbtnAsuna.isSelected()) {
                        jogador.personagem = "Asuna";
                    }
                    else if (rdbtnKirito.isSelected()) {
                        jogador.personagem = "Kirito";
                    }
                    else if (rdbtnLeafa.isSelected()) {
                        jogador.personagem = "Leafa";
                    }
                    else if (rdbtnYuuki.isSelected()) {
                        jogador.personagem = "Yuuki";
                    }
                    jogador.status.gold = 10000;
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
                    telaInicial.this.dispose();
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
        btnConfirmar.setBounds(226, 296, 143, 23);
        this.contentPane.add(btnConfirmar);
        final JLabel lblEscolhaSuaClasse = new JLabel("Escolha sua classe:");
        lblEscolhaSuaClasse.setForeground(Color.BLACK);
        lblEscolhaSuaClasse.setBounds(10, 160, 205, 14);
        final JLabel lblEscolhaSeuPersonagem = new JLabel("Escolha seu personagem:");
        lblEscolhaSeuPersonagem.setForeground(Color.BLACK);
        lblEscolhaSeuPersonagem.setBounds(434, 160, 159, 14);
        this.contentPane.add(lblEscolhaSeuPersonagem);
        this.contentPane.add(lblEscolhaSuaClasse);
        this.contentPane.setComponentZOrder(imagem, 2);
        this.contentPane.setComponentZOrder(btnConfirmar, 1);
        this.contentPane.setComponentZOrder(lblBemVindoAo, 1);
        this.contentPane.setComponentZOrder(lblDigiteOSeu, 1);
        this.contentPane.setComponentZOrder(lblEscolhaSuaClasse, 1);
        this.contentPane.setComponentZOrder(rdbtnBeserker, 1);
        this.contentPane.setComponentZOrder(rdbtnLutador, 1);
        this.contentPane.setComponentZOrder(rdbtnTank, 1);
        this.contentPane.setComponentZOrder(rdbtnAsuna, 1);
        this.contentPane.setComponentZOrder(rdbtnKirito, 1);
        this.contentPane.setComponentZOrder(rdbtnLeafa, 1);
        this.contentPane.setComponentZOrder(rdbtnYuuki, 1);
        this.contentPane.setComponentZOrder(lblEscolhaSeuPersonagem, 1);
        this.contentPane.setComponentZOrder(this.textFieldNome, 1);
    }
}
