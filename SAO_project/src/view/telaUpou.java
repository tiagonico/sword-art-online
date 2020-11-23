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
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;
import java.awt.Font;
import java.awt.Component;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.LayoutManager;
import java.awt.Container;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.JPanel;
import javax.swing.JFrame;

public class telaUpou extends JFrame
{
    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    
    public telaUpou(final Jogador jogador) {
        this.setDefaultCloseOperation(3);
        this.setBounds(400, 200, 621, 398);
        (this.contentPane = new JPanel()).setBorder(new EmptyBorder(5, 5, 5, 5));
        this.setContentPane(this.contentPane);
        this.contentPane.setLayout(null);
        final JLabel imagem = new JLabel("New label");
        imagem.setBounds(0, 0, 605, 359);
        final ImageIcon imgUpou = new ImageIcon(telaCombate.class.getResource("/imagens/levelup.png"));
        final Image img = imgUpou.getImage().getScaledInstance(imagem.getWidth(), imagem.getHeight(), 1);
        imagem.setIcon(new ImageIcon(img));
        this.contentPane.add(imagem);
        final JLabel lblVocPassouPara = new JLabel("Voc\u00ea passou para o n\u00edvel: " + jogador.status.level);
        lblVocPassouPara.setFont(new Font("Tahoma", 0, 14));
        lblVocPassouPara.setBounds(205, 136, 175, 23);
        this.contentPane.add(lblVocPassouPara);
        final JRadioButton agilidade = new JRadioButton("Agilidade");
        agilidade.setBounds(28, 205, 109, 23);
        this.contentPane.add(agilidade);
        final JRadioButton estamina = new JRadioButton("Estamina");
        estamina.setBounds(28, 231, 109, 23);
        this.contentPane.add(estamina);
        final JRadioButton forca = new JRadioButton("For\u00e7a");
        forca.setBounds(28, 257, 109, 23);
        this.contentPane.add(forca);
        final ButtonGroup bg = new ButtonGroup();
        bg.add(agilidade);
        bg.add(forca);
        bg.add(estamina);
        final JLabel lblEscolhaUmAtributo = new JLabel("Escolha um atributo para aumentar o seu valor:");
        lblEscolhaUmAtributo.setBounds(28, 179, 334, 14);
        this.contentPane.add(lblEscolhaUmAtributo);
        final JButton btnConfirmar = new JButton("Confirmar");
        btnConfirmar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                if (!forca.isSelected() && !estamina.isSelected() && !agilidade.isSelected()) {
                    JOptionPane.showMessageDialog(null, "Selecione a seu b\u00f4nus primeiro.");
                }
                else {
                    if (forca.isSelected()) {
                        final Status status = jogador.status;
                        status.forca += 5;
                    }
                    else if (estamina.isSelected()) {
                        final Status status2 = jogador.status;
                        status2.estamina += 5;
                        final Status status3 = jogador.status;
                        status3.hpMax += 5;
                    }
                    else if (agilidade.isSelected()) {
                        final Status status4 = jogador.status;
                        status4.agilidade += 5;
                    }
                    jogador.status.hp = jogador.status.hpMax;
                    jogador.status.mp = jogador.status.mpMax;
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
                    telaUpou.this.dispose();
                }
            }
        });
        btnConfirmar.setBounds(236, 291, 109, 23);
        this.contentPane.add(btnConfirmar);
        this.contentPane.setComponentZOrder(imagem, 2);
        this.contentPane.setComponentZOrder(lblEscolhaUmAtributo, 1);
        this.contentPane.setComponentZOrder(lblVocPassouPara, 1);
        this.contentPane.setComponentZOrder(agilidade, 1);
        this.contentPane.setComponentZOrder(forca, 1);
        this.contentPane.setComponentZOrder(btnConfirmar, 1);
        this.contentPane.setComponentZOrder(estamina, 1);
    }
}
