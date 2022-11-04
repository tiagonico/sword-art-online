// 
// Decompiled by Procyon v0.5.36
// 

package view;

import java.awt.Image;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JProgressBar;
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
import javax.swing.JPanel;
import javax.swing.JFrame;

public class telaStatus extends JFrame
{
    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    
    public telaStatus(final Jogador jogador) {
        this.setDefaultCloseOperation(3);
        this.setBounds(400, 200, 621, 398);
        (this.contentPane = new JPanel()).setBorder(new EmptyBorder(5, 5, 5, 5));
        this.setContentPane(this.contentPane);
        this.contentPane.setLayout(null);
        final JLabel imagemStatus = new JLabel("New label");
        imagemStatus.setBounds(0, 0, 605, 359);
        final ImageIcon imgStatus = new ImageIcon(telaCombate.class.getResource("/imagens/parede.png"));
        final Image img = imgStatus.getImage().getScaledInstance(imagemStatus.getWidth(), imagemStatus.getHeight(), 1);
        imagemStatus.setIcon(new ImageIcon(img));
        this.contentPane.add(imagemStatus);
        final JLabel lblStatus = new JLabel("Status:");
        lblStatus.setForeground(Color.RED);
        lblStatus.setFont(new Font("Tahoma", 0, 12));
        lblStatus.setBounds(69, 63, 46, 14);
        this.contentPane.add(lblStatus);
        final JLabel imagem = new JLabel("New label");
        imagem.setBounds(209, 63, 123, 110);
        final ImageIcon imgKirito = new ImageIcon(telaStatus.class.getResource("/imagens/" + jogador.personagem + ".png"));
        final Image img2 = imgKirito.getImage().getScaledInstance(imagem.getWidth(), imagem.getHeight(), 1);
        imagem.setIcon(new ImageIcon(img2));
        this.contentPane.add(imagem);
        final JLabel nome = new JLabel(jogador.nome);
        nome.setHorizontalAlignment(0);
        nome.setForeground(Color.RED);
        nome.setFont(new Font("Tahoma", 0, 14));
        nome.setBounds(209, 38, 123, 14);
        this.contentPane.add(nome);
        final JLabel lblHp = new JLabel("HP: " + (jogador.status.hp + jogador.inventario.armadura.addEstamina + jogador.inventario.arma.addEstamina) + " / " + (jogador.status.hpMax + jogador.inventario.armadura.addEstamina + jogador.inventario.arma.addEstamina));
        lblHp.setForeground(Color.WHITE);
        lblHp.setBounds(69, 88, 123, 14);
        this.contentPane.add(lblHp);
        final JLabel lblMp = new JLabel("MP: " + jogador.status.mp + " / " + jogador.status.mpMax);
        lblMp.setForeground(Color.WHITE);
        lblMp.setBounds(69, 107, 123, 14);
        this.contentPane.add(lblMp);
        final JLabel lblLevel = new JLabel("Level: " + jogador.status.level);
        lblLevel.setForeground(Color.WHITE);
        lblLevel.setBounds(69, 127, 123, 14);
        this.contentPane.add(lblLevel);
        final JLabel lblExp = new JLabel("Exp: " + jogador.status.exp);
        lblExp.setForeground(Color.WHITE);
        lblExp.setBounds(69, 146, 123, 14);
        this.contentPane.add(lblExp);
        final JLabel lblEstamina = new JLabel("Estamina: " + jogador.status.estamina + " + " + (jogador.inventario.armadura.addEstamina + jogador.inventario.arma.addEstamina));
        lblEstamina.setForeground(Color.WHITE);
        lblEstamina.setBounds(69, 251, 123, 14);
        this.contentPane.add(lblEstamina);
        final JLabel lblFora = new JLabel("For\u00e7a: " + jogador.status.forca + " + " + (jogador.inventario.armadura.addForca + jogador.inventario.arma.addForca));
        lblFora.setForeground(Color.WHITE);
        lblFora.setBounds(69, 265, 123, 14);
        this.contentPane.add(lblFora);
        final JLabel lblAgilidade = new JLabel("Agilidade: " + jogador.status.agilidade + " + " + (jogador.inventario.armadura.addAgility + jogador.inventario.arma.addAgility));
        lblAgilidade.setForeground(Color.WHITE);
        lblAgilidade.setBounds(69, 281, 123, 14);
        this.contentPane.add(lblAgilidade);
        final JLabel lblGold = new JLabel("Gold: " + jogador.status.gold);
        lblGold.setForeground(Color.WHITE);
        lblGold.setBounds(69, 306, 66, 14);
        this.contentPane.add(lblGold);
        final JLabel lblExpFalta = new JLabel("Exp p/ lvl " + (jogador.status.level + 1) + " : " + jogador.xpParaProxLevel());
        lblExpFalta.setForeground(Color.WHITE);
        lblExpFalta.setBounds(69, 168, 198, 14);
        this.contentPane.add(lblExpFalta);
        final JProgressBar progressBar = new JProgressBar();
        progressBar.setBounds(69, 193, 103, 14);
        this.contentPane.add(progressBar);
        progressBar.setStringPainted(true);
        progressBar.setBackground(Color.black);
        progressBar.setForeground(Color.WHITE);
        progressBar.setMaximum(0);
        progressBar.setMaximum(jogador.xpParaProxLevel() + jogador.status.exp);
        progressBar.setValue(jogador.status.exp);
        final JButton btnVoltar = new JButton("Voltar");
        btnVoltar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                telaStatus.this.dispose();
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
        btnVoltar.setBounds(243, 302, 89, 23);
        this.contentPane.add(btnVoltar);
        final JLabel lblItens = new JLabel("Itens:");
        lblItens.setForeground(Color.RED);
        lblItens.setFont(new Font("Tahoma", 0, 12));
        lblItens.setBounds(426, 63, 46, 14);
        this.contentPane.add(lblItens);
        final JLabel pocaoDeVida = new JLabel("Po\u00e7\u00e3o de Vida: " + jogador.inventario.qtdPotVida);
        pocaoDeVida.setForeground(Color.WHITE);
        pocaoDeVida.setBounds(426, 88, 123, 14);
        this.contentPane.add(pocaoDeVida);
        final JLabel pocaoDeMana = new JLabel("Po\u00e7\u00e3o de Mana: " + jogador.inventario.qtdPotMana);
        pocaoDeMana.setForeground(Color.WHITE);
        pocaoDeMana.setBounds(426, 111, 123, 14);
        this.contentPane.add(pocaoDeMana);
        final JLabel bombaDeFuma\u00e7a = new JLabel("Bomba de fuma\u00e7a: " + jogador.inventario.qtdBombaFum);
        bombaDeFuma\u00e7a.setForeground(Color.WHITE);
        bombaDeFuma\u00e7a.setBounds(426, 134, 123, 14);
        this.contentPane.add(bombaDeFuma\u00e7a);
        this.contentPane.setComponentZOrder(imagemStatus, 2);
        this.contentPane.setComponentZOrder(pocaoDeMana, 1);
        this.contentPane.setComponentZOrder(pocaoDeVida, 1);
        this.contentPane.setComponentZOrder(bombaDeFuma\u00e7a, 1);
        this.contentPane.setComponentZOrder(lblAgilidade, 1);
        this.contentPane.setComponentZOrder(lblGold, 1);
        this.contentPane.setComponentZOrder(lblEstamina, 1);
        this.contentPane.setComponentZOrder(lblExp, 1);
        this.contentPane.setComponentZOrder(lblFora, 1);
        this.contentPane.setComponentZOrder(lblHp, 1);
        this.contentPane.setComponentZOrder(lblLevel, 1);
        this.contentPane.setComponentZOrder(lblMp, 1);
        this.contentPane.setComponentZOrder(imagem, 1);
        this.contentPane.setComponentZOrder(nome, 1);
        this.contentPane.setComponentZOrder(lblItens, 1);
        this.contentPane.setComponentZOrder(lblStatus, 1);
        this.contentPane.setComponentZOrder(btnVoltar, 1);
        this.contentPane.setComponentZOrder(lblExpFalta, 1);
        this.contentPane.setComponentZOrder(progressBar, 1);
    }
}
