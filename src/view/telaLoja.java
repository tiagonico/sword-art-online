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
import java.awt.Color;
import javax.swing.Icon;
import java.awt.Component;
import javax.swing.JTabbedPane;
import javax.swing.ImageIcon;
import java.awt.LayoutManager;
import java.awt.Container;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JFrame;

public class telaLoja extends JFrame
{
    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    JPanel lojaPotions;
    JLabel lblGold;
    
    public telaLoja(final Jogador jogador) {
        this.lojaPotions = new JPanel();
        this.setDefaultCloseOperation(3);
        this.setBounds(400, 200, 621, 398);
        (this.contentPane = new JPanel()).setBorder(new EmptyBorder(5, 5, 5, 5));
        this.setContentPane(this.contentPane);
        this.contentPane.setLayout(null);
        final ImageIcon imgLoja = new ImageIcon(telaCombate.class.getResource("/imagens/loja.png"));
        final JTabbedPane tabbedPane = new JTabbedPane(1);
        tabbedPane.setBounds(0, 0, 605, 359);
        this.contentPane.add(tabbedPane);
        tabbedPane.addTab("Potions", null, this.lojaPotions, null);
        this.lojaPotions.setLayout(null);
        final JLabel imagemLoja = new JLabel("Potions");
        imagemLoja.setBounds(0, 0, 600, 331);
        this.lojaPotions.add(imagemLoja);
        final Image img = imgLoja.getImage().getScaledInstance(imagemLoja.getWidth(), imagemLoja.getHeight(), 1);
        imagemLoja.setIcon(new ImageIcon(img));
        final JLabel lblBemVindo = new JLabel("Bem vindo \u00e0 loja, o que deseja comprar?");
        lblBemVindo.setBounds(177, 86, 250, 17);
        this.lojaPotions.add(lblBemVindo);
        lblBemVindo.setForeground(Color.WHITE);
        lblBemVindo.setFont(new Font("Tahoma", 0, 14));
        (this.lblGold = new JLabel("Gold: $ " + jogador.status.gold)).setBounds(85, 165, 100, 19);
        this.lojaPotions.add(this.lblGold);
        this.lblGold.setForeground(Color.WHITE);
        this.lblGold.setFont(new Font("Tahoma", 0, 15));
        final JButton btnPooDeVida = new JButton("Po\u00e7\u00e3o de Vida ($ 50)");
        btnPooDeVida.setBounds(194, 131, 198, 23);
        this.lojaPotions.add(btnPooDeVida);
        btnPooDeVida.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                if (jogador.inventario.qtdPotVida >= 5) {
                    JOptionPane.showMessageDialog(null, "Voc\u00ea n\u00e3o pode ter mais que 5 potions de vida.");
                }
                else if (jogador.status.gold >= 50) {
                    final Status status = jogador.status;
                    status.gold -= 50;
                    final Inventario inventario = jogador.inventario;
                    ++inventario.qtdPotVida;
                    JOptionPane.showMessageDialog(null, "Voc\u00ea comprou uma Po\u00e7\u00e3o de Vida.");
                    telaLoja.this.lblGold.setText("Gold: $ " + jogador.status.gold);
                }
                else {
                    JOptionPane.showMessageDialog(null, "Voc\u00ea n\u00e3o tem dinheiro suficiente.");
                }
            }
        });
        final JButton btnPooDeMana = new JButton("Po\u00e7\u00e3o de Mana ($ 30)");
        btnPooDeMana.setBounds(194, 165, 198, 23);
        this.lojaPotions.add(btnPooDeMana);
        btnPooDeMana.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                if (jogador.inventario.qtdPotMana >= 5) {
                    JOptionPane.showMessageDialog(null, "Voc\u00ea n\u00e3o pode ter mais que 5 potions de mana.");
                }
                else if (jogador.status.gold >= 30) {
                    final Status status = jogador.status;
                    status.gold -= 30;
                    final Inventario inventario = jogador.inventario;
                    ++inventario.qtdPotMana;
                    JOptionPane.showMessageDialog(null, "Voc\u00ea comprou uma Po\u00e7\u00e3o de Mana.");
                    telaLoja.this.lblGold.setText("Gold: $ " + jogador.status.gold);
                }
                else {
                    JOptionPane.showMessageDialog(null, "Voc\u00ea n\u00e3o tem dinheiro suficiente.");
                }
            }
        });
        final JButton btnBombaDeFumaa = new JButton("Bomba de Fuma\u00e7a ($ 100)");
        btnBombaDeFumaa.setBounds(194, 199, 198, 23);
        this.lojaPotions.add(btnBombaDeFumaa);
        btnBombaDeFumaa.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                if (jogador.inventario.qtdBombaFum >= 3) {
                    JOptionPane.showMessageDialog(null, "Voc\u00ea n\u00e3o pode ter mais que 3 bombas de fuma\u00e7a.");
                }
                else if (jogador.status.gold >= 100) {
                    final Status status = jogador.status;
                    status.gold -= 100;
                    final Inventario inventario = jogador.inventario;
                    ++inventario.qtdBombaFum;
                    JOptionPane.showMessageDialog(null, "Voc\u00ea comprou uma Bomba de fuma\u00e7a.");
                    telaLoja.this.lblGold.setText("Gold: $ " + jogador.status.gold);
                }
                else {
                    JOptionPane.showMessageDialog(null, "Voc\u00ea n\u00e3o tem dinheiro suficiente.");
                }
            }
        });
        final JButton btnVoltar = new JButton("Voltar");
        btnVoltar.setBounds(85, 259, 82, 23);
        this.lojaPotions.add(btnVoltar);
        btnVoltar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                telaLoja.this.dispose();
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
        this.lojaPotions.setComponentZOrder(imagemLoja, 2);
        this.lojaPotions.setComponentZOrder(btnPooDeMana, 1);
        this.lojaPotions.setComponentZOrder(btnBombaDeFumaa, 1);
        this.lojaPotions.setComponentZOrder(btnVoltar, 1);
        this.lojaPotions.setComponentZOrder(btnPooDeVida, 1);
        this.lojaPotions.setComponentZOrder(lblBemVindo, 1);
        this.lojaPotions.setComponentZOrder(this.lblGold, 1);
        final JPanel lojaArma = new JPanel();
        tabbedPane.addTab("Armas", null, lojaArma, null);
        lojaArma.setLayout(null);
        final JLabel imagemFundoArma = new JLabel("New label");
        imagemFundoArma.setBounds(0, 0, 600, 331);
        final ImageIcon imgFundo = new ImageIcon(telaLoja.class.getResource("/imagens/loja.png"));
        final Image img2 = imgFundo.getImage().getScaledInstance(imagemFundoArma.getWidth(), imagemFundoArma.getHeight(), 1);
        imagemFundoArma.setIcon(new ImageIcon(img2));
        lojaArma.add(imagemFundoArma);
        final JLabel imagemArma1 = new JLabel("New label");
        imagemArma1.setBounds(89, 91, 117, 114);
        final JLabel lblNomeArma1 = new JLabel("New label");
        lblNomeArma1.setBounds(100, 55, 100, 14);
        lblNomeArma1.setForeground(Color.WHITE);
        final JLabel lblEstaminaArma1 = new JLabel("New label");
        lblEstaminaArma1.setBounds(43, 239, 46, 14);
        lblEstaminaArma1.setForeground(Color.WHITE);
        final JLabel lblForcaArma1 = new JLabel("New label");
        lblForcaArma1.setBounds(43, 264, 46, 14);
        lblForcaArma1.setForeground(Color.WHITE);
        final JLabel lblAgilidadeArma1 = new JLabel("New label");
        lblAgilidadeArma1.setBounds(43, 288, 46, 14);
        lblAgilidadeArma1.setForeground(Color.WHITE);
        final JLabel lblPrecoArma1 = new JLabel("New label");
        lblPrecoArma1.setBounds(160, 239, 100, 14);
        lblPrecoArma1.setForeground(Color.WHITE);
        final JButton btnComprarArma1 = new JButton("Comprar");
        btnComprarArma1.setBounds(155, 282, 89, 23);
        final JLabel imagemArma2 = new JLabel("New label");
        imagemArma2.setBounds(393, 91, 117, 114);
        final JButton btnComprarArma2 = new JButton("Comprar");
        btnComprarArma2.setBounds(459, 282, 89, 23);
        final JLabel lblPrecoArma2 = new JLabel("New label");
        lblPrecoArma2.setBounds(460, 239, 100, 14);
        lblPrecoArma2.setForeground(Color.WHITE);
        final JLabel lblEstaminaArma2 = new JLabel("New label");
        lblEstaminaArma2.setBounds(347, 239, 46, 14);
        lblEstaminaArma2.setForeground(Color.WHITE);
        final JLabel lblForcaArma2 = new JLabel("New label");
        lblForcaArma2.setBounds(347, 264, 46, 14);
        lblForcaArma2.setForeground(Color.WHITE);
        final JLabel lblAgilidadeArma2 = new JLabel("New label");
        lblAgilidadeArma2.setBounds(347, 288, 46, 14);
        lblAgilidadeArma2.setForeground(Color.WHITE);
        final JLabel lblNomeArma2 = new JLabel("New label");
        lblNomeArma2.setBounds(418, 55, 100, 14);
        lblNomeArma2.setForeground(Color.WHITE);
        if (jogador.andar == 1) {
            this.colocaArmaArmadura(1, jogador.inventario.bancoArmas.get(0), lblNomeArma1, lblPrecoArma1, imagemArma1, lblEstaminaArma1, lblForcaArma1, lblAgilidadeArma1, btnComprarArma1, lojaArma, jogador);
            this.colocaArmaArmadura(1, jogador.inventario.bancoArmas.get(1), lblNomeArma2, lblPrecoArma2, imagemArma2, lblEstaminaArma2, lblForcaArma2, lblAgilidadeArma2, btnComprarArma2, lojaArma, jogador);
        }
        else if (jogador.andar == 2) {
            this.colocaArmaArmadura(1, jogador.inventario.bancoArmas.get(1), lblNomeArma1, lblPrecoArma1, imagemArma1, lblEstaminaArma1, lblForcaArma1, lblAgilidadeArma1, btnComprarArma1, lojaArma, jogador);
            this.colocaArmaArmadura(1, jogador.inventario.bancoArmas.get(2), lblNomeArma2, lblPrecoArma2, imagemArma2, lblEstaminaArma2, lblForcaArma2, lblAgilidadeArma2, btnComprarArma2, lojaArma, jogador);
        }
        else if (jogador.andar == 3) {
            this.colocaArmaArmadura(1, jogador.inventario.bancoArmas.get(2), lblNomeArma1, lblPrecoArma1, imagemArma1, lblEstaminaArma1, lblForcaArma1, lblAgilidadeArma1, btnComprarArma1, lojaArma, jogador);
            this.colocaArmaArmadura(1, jogador.inventario.bancoArmas.get(3), lblNomeArma2, lblPrecoArma2, imagemArma2, lblEstaminaArma2, lblForcaArma2, lblAgilidadeArma2, btnComprarArma2, lojaArma, jogador);
        }
        else if (jogador.andar == 4) {
            this.colocaArmaArmadura(1, jogador.inventario.bancoArmas.get(3), lblNomeArma1, lblPrecoArma1, imagemArma1, lblEstaminaArma1, lblForcaArma1, lblAgilidadeArma1, btnComprarArma1, lojaArma, jogador);
            this.colocaArmaArmadura(1, jogador.inventario.bancoArmas.get(4), lblNomeArma2, lblPrecoArma2, imagemArma2, lblEstaminaArma2, lblForcaArma2, lblAgilidadeArma2, btnComprarArma2, lojaArma, jogador);
        }
        else if (jogador.andar == 5) {
            this.colocaArmaArmadura(1, jogador.inventario.bancoArmas.get(4), lblNomeArma1, lblPrecoArma1, imagemArma1, lblEstaminaArma1, lblForcaArma1, lblAgilidadeArma1, btnComprarArma1, lojaArma, jogador);
            this.colocaArmaArmadura(1, jogador.inventario.bancoArmas.get(5), lblNomeArma2, lblPrecoArma2, imagemArma2, lblEstaminaArma2, lblForcaArma2, lblAgilidadeArma2, btnComprarArma2, lojaArma, jogador);
        }
        else if (jogador.andar == 6) {
            this.colocaArmaArmadura(1, jogador.inventario.bancoArmas.get(6), lblNomeArma1, lblPrecoArma1, imagemArma1, lblEstaminaArma1, lblForcaArma1, lblAgilidadeArma1, btnComprarArma1, lojaArma, jogador);
            this.colocaArmaArmadura(1, jogador.inventario.bancoArmas.get(7), lblNomeArma2, lblPrecoArma2, imagemArma2, lblEstaminaArma2, lblForcaArma2, lblAgilidadeArma2, btnComprarArma2, lojaArma, jogador);
        }
        else if (jogador.andar == 7) {
            this.colocaArmaArmadura(1, jogador.inventario.bancoArmas.get(8), lblNomeArma1, lblPrecoArma1, imagemArma1, lblEstaminaArma1, lblForcaArma1, lblAgilidadeArma1, btnComprarArma1, lojaArma, jogador);
            this.colocaArmaArmadura(1, jogador.inventario.bancoArmas.get(9), lblNomeArma2, lblPrecoArma2, imagemArma2, lblEstaminaArma2, lblForcaArma2, lblAgilidadeArma2, btnComprarArma2, lojaArma, jogador);
        }
        else if (jogador.andar == 8) {
            this.colocaArmaArmadura(1, jogador.inventario.bancoArmas.get(9), lblNomeArma1, lblPrecoArma1, imagemArma1, lblEstaminaArma1, lblForcaArma1, lblAgilidadeArma1, btnComprarArma1, lojaArma, jogador);
            this.colocaArmaArmadura(1, jogador.inventario.bancoArmas.get(10), lblNomeArma2, lblPrecoArma2, imagemArma2, lblEstaminaArma2, lblForcaArma2, lblAgilidadeArma2, btnComprarArma2, lojaArma, jogador);
        }
        else if (jogador.andar == 9) {
            this.colocaArmaArmadura(1, jogador.inventario.bancoArmas.get(10), lblNomeArma1, lblPrecoArma1, imagemArma1, lblEstaminaArma1, lblForcaArma1, lblAgilidadeArma1, btnComprarArma1, lojaArma, jogador);
            this.colocaArmaArmadura(1, jogador.inventario.bancoArmas.get(11), lblNomeArma2, lblPrecoArma2, imagemArma2, lblEstaminaArma2, lblForcaArma2, lblAgilidadeArma2, btnComprarArma2, lojaArma, jogador);
        }
        else if (jogador.andar == 10) {
            this.colocaArmaArmadura(1, jogador.inventario.bancoArmas.get(11), lblNomeArma1, lblPrecoArma1, imagemArma1, lblEstaminaArma1, lblForcaArma1, lblAgilidadeArma1, btnComprarArma1, lojaArma, jogador);
            this.colocaArmaArmadura(1, jogador.inventario.bancoArmas.get(12), lblNomeArma2, lblPrecoArma2, imagemArma2, lblEstaminaArma2, lblForcaArma2, lblAgilidadeArma2, btnComprarArma2, lojaArma, jogador);
        }
        final JPanel lojaArmadura = new JPanel();
        tabbedPane.addTab("Armaduras", null, lojaArmadura, null);
        lojaArmadura.setLayout(null);
        final JLabel imagemFundoArmadura = new JLabel("New label");
        imagemFundoArmadura.setBounds(0, 0, 600, 331);
        imagemFundoArmadura.setIcon(new ImageIcon(img2));
        lojaArmadura.add(imagemFundoArmadura);
        final JButton btnComprarArmadura2 = new JButton("Comprar");
        btnComprarArmadura2.setBounds(459, 282, 89, 23);
        final JLabel lblPrecoArmadura2 = new JLabel("New label");
        lblPrecoArmadura2.setBounds(460, 239, 100, 14);
        lblPrecoArmadura2.setForeground(Color.WHITE);
        final JLabel imagemArmadura2 = new JLabel("New label");
        imagemArmadura2.setBounds(392, 91, 117, 114);
        final JLabel lblNomeArmadura2 = new JLabel("New label");
        lblNomeArmadura2.setBounds(417, 55, 200, 14);
        lblNomeArmadura2.setForeground(Color.WHITE);
        final JLabel lblNomeArmadura3 = new JLabel("New label");
        lblNomeArmadura3.setBounds(113, 55, 200, 14);
        lblNomeArmadura3.setForeground(Color.WHITE);
        final JLabel imagemArmadura3 = new JLabel("New label");
        imagemArmadura3.setBounds(88, 91, 117, 114);
        final JLabel lblEstaminaArmadura1 = new JLabel("New label");
        lblEstaminaArmadura1.setBounds(43, 239, 46, 14);
        lblEstaminaArmadura1.setForeground(Color.WHITE);
        final JLabel lblForcaArmadura1 = new JLabel("New label");
        lblForcaArmadura1.setBounds(43, 264, 46, 14);
        lblForcaArmadura1.setForeground(Color.WHITE);
        final JLabel lblAgilidadeArmadura1 = new JLabel("New label");
        lblAgilidadeArmadura1.setBounds(43, 288, 46, 14);
        lblAgilidadeArmadura1.setForeground(Color.WHITE);
        final JButton btnComprarArmadura3 = new JButton("Comprar");
        btnComprarArmadura3.setBounds(155, 282, 89, 23);
        final JLabel lblPrecoArmadura3 = new JLabel("New label");
        lblPrecoArmadura3.setBounds(160, 239, 100, 14);
        lblPrecoArmadura3.setForeground(Color.WHITE);
        final JLabel lblEstaminaArmadura2 = new JLabel("New label");
        lblEstaminaArmadura2.setBounds(347, 239, 46, 14);
        lblEstaminaArmadura2.setForeground(Color.WHITE);
        final JLabel lblForcaArmadura2 = new JLabel("New label");
        lblForcaArmadura2.setBounds(347, 264, 46, 14);
        lblForcaArmadura2.setForeground(Color.WHITE);
        final JLabel lblAgilidadeArmadura2 = new JLabel("New label");
        lblAgilidadeArmadura2.setBounds(347, 288, 46, 14);
        lblAgilidadeArmadura2.setForeground(Color.WHITE);
        if (jogador.andar == 1) {
            this.colocaArmaArmadura(2, jogador.inventario.bancoArmaduras.get(0), lblNomeArmadura3, lblPrecoArmadura3, imagemArmadura3, lblEstaminaArmadura1, lblForcaArmadura1, lblAgilidadeArmadura1, btnComprarArmadura3, lojaArmadura, jogador);
            this.colocaArmaArmadura(2, jogador.inventario.bancoArmaduras.get(1), lblNomeArmadura2, lblPrecoArmadura2, imagemArmadura2, lblEstaminaArmadura2, lblForcaArmadura2, lblAgilidadeArmadura2, btnComprarArmadura2, lojaArmadura, jogador);
        }
        else if (jogador.andar == 2) {
            this.colocaArmaArmadura(2, jogador.inventario.bancoArmaduras.get(1), lblNomeArmadura3, lblPrecoArmadura3, imagemArmadura3, lblEstaminaArmadura1, lblForcaArmadura1, lblAgilidadeArmadura1, btnComprarArmadura3, lojaArmadura, jogador);
            this.colocaArmaArmadura(2, jogador.inventario.bancoArmaduras.get(2), lblNomeArmadura2, lblPrecoArmadura2, imagemArmadura2, lblEstaminaArmadura2, lblForcaArmadura2, lblAgilidadeArmadura2, btnComprarArmadura2, lojaArmadura, jogador);
        }
        else if (jogador.andar == 3) {
            this.colocaArmaArmadura(2, jogador.inventario.bancoArmaduras.get(2), lblNomeArmadura3, lblPrecoArmadura3, imagemArmadura3, lblEstaminaArmadura1, lblForcaArmadura1, lblAgilidadeArmadura1, btnComprarArmadura3, lojaArmadura, jogador);
            this.colocaArmaArmadura(2, jogador.inventario.bancoArmaduras.get(3), lblNomeArmadura2, lblPrecoArmadura2, imagemArmadura2, lblEstaminaArmadura2, lblForcaArmadura2, lblAgilidadeArmadura2, btnComprarArmadura2, lojaArmadura, jogador);
        }
        else if (jogador.andar == 4) {
            this.colocaArmaArmadura(2, jogador.inventario.bancoArmaduras.get(3), lblNomeArmadura3, lblPrecoArmadura3, imagemArmadura3, lblEstaminaArmadura1, lblForcaArmadura1, lblAgilidadeArmadura1, btnComprarArmadura3, lojaArmadura, jogador);
            this.colocaArmaArmadura(2, jogador.inventario.bancoArmaduras.get(4), lblNomeArmadura2, lblPrecoArmadura2, imagemArmadura2, lblEstaminaArmadura2, lblForcaArmadura2, lblAgilidadeArmadura2, btnComprarArmadura2, lojaArmadura, jogador);
        }
        else if (jogador.andar == 5) {
            this.colocaArmaArmadura(2, jogador.inventario.bancoArmaduras.get(5), lblNomeArmadura3, lblPrecoArmadura3, imagemArmadura3, lblEstaminaArmadura1, lblForcaArmadura1, lblAgilidadeArmadura1, btnComprarArmadura3, lojaArmadura, jogador);
            this.colocaArmaArmadura(2, jogador.inventario.bancoArmaduras.get(6), lblNomeArmadura2, lblPrecoArmadura2, imagemArmadura2, lblEstaminaArmadura2, lblForcaArmadura2, lblAgilidadeArmadura2, btnComprarArmadura2, lojaArmadura, jogador);
        }
        else if (jogador.andar == 6) {
            this.colocaArmaArmadura(2, jogador.inventario.bancoArmaduras.get(7), lblNomeArmadura3, lblPrecoArmadura3, imagemArmadura3, lblEstaminaArmadura1, lblForcaArmadura1, lblAgilidadeArmadura1, btnComprarArmadura3, lojaArmadura, jogador);
            this.colocaArmaArmadura(2, jogador.inventario.bancoArmaduras.get(8), lblNomeArmadura2, lblPrecoArmadura2, imagemArmadura2, lblEstaminaArmadura2, lblForcaArmadura2, lblAgilidadeArmadura2, btnComprarArmadura2, lojaArmadura, jogador);
        }
        else if (jogador.andar == 7) {
            this.colocaArmaArmadura(2, jogador.inventario.bancoArmaduras.get(8), lblNomeArmadura3, lblPrecoArmadura3, imagemArmadura3, lblEstaminaArmadura1, lblForcaArmadura1, lblAgilidadeArmadura1, btnComprarArmadura3, lojaArmadura, jogador);
            this.colocaArmaArmadura(2, jogador.inventario.bancoArmaduras.get(9), lblNomeArmadura2, lblPrecoArmadura2, imagemArmadura2, lblEstaminaArmadura2, lblForcaArmadura2, lblAgilidadeArmadura2, btnComprarArmadura2, lojaArmadura, jogador);
        }
        else if (jogador.andar == 8) {
            this.colocaArmaArmadura(2, jogador.inventario.bancoArmaduras.get(9), lblNomeArmadura3, lblPrecoArmadura3, imagemArmadura3, lblEstaminaArmadura1, lblForcaArmadura1, lblAgilidadeArmadura1, btnComprarArmadura3, lojaArmadura, jogador);
            this.colocaArmaArmadura(2, jogador.inventario.bancoArmaduras.get(10), lblNomeArmadura2, lblPrecoArmadura2, imagemArmadura2, lblEstaminaArmadura2, lblForcaArmadura2, lblAgilidadeArmadura2, btnComprarArmadura2, lojaArmadura, jogador);
        }
        else if (jogador.andar == 9) {
            this.colocaArmaArmadura(2, jogador.inventario.bancoArmaduras.get(10), lblNomeArmadura3, lblPrecoArmadura3, imagemArmadura3, lblEstaminaArmadura1, lblForcaArmadura1, lblAgilidadeArmadura1, btnComprarArmadura3, lojaArmadura, jogador);
            this.colocaArmaArmadura(2, jogador.inventario.bancoArmaduras.get(11), lblNomeArmadura2, lblPrecoArmadura2, imagemArmadura2, lblEstaminaArmadura2, lblForcaArmadura2, lblAgilidadeArmadura2, btnComprarArmadura2, lojaArmadura, jogador);
        }
        else if (jogador.andar == 10) {
            this.colocaArmaArmadura(2, jogador.inventario.bancoArmaduras.get(11), lblNomeArmadura3, lblPrecoArmadura3, imagemArmadura3, lblEstaminaArmadura1, lblForcaArmadura1, lblAgilidadeArmadura1, btnComprarArmadura3, lojaArmadura, jogador);
            this.colocaArmaArmadura(2, jogador.inventario.bancoArmaduras.get(12), lblNomeArmadura2, lblPrecoArmadura2, imagemArmadura2, lblEstaminaArmadura2, lblForcaArmadura2, lblAgilidadeArmadura2, btnComprarArmadura2, lojaArmadura, jogador);
        }
        lojaArma.setComponentZOrder(imagemFundoArma, 2);
        lojaArma.setComponentZOrder(imagemArma1, 1);
        lojaArma.setComponentZOrder(imagemArma2, 1);
        lojaArma.setComponentZOrder(lblAgilidadeArma1, 1);
        lojaArma.setComponentZOrder(lblAgilidadeArma2, 1);
        lojaArma.setComponentZOrder(lblForcaArma1, 1);
        lojaArma.setComponentZOrder(lblForcaArma2, 1);
        lojaArma.setComponentZOrder(lblEstaminaArma1, 1);
        lojaArma.setComponentZOrder(lblEstaminaArma2, 1);
        lojaArma.setComponentZOrder(lblPrecoArma1, 1);
        lojaArma.setComponentZOrder(lblPrecoArma2, 1);
        lojaArma.setComponentZOrder(lblNomeArma1, 1);
        lojaArma.setComponentZOrder(lblNomeArma2, 1);
        lojaArma.setComponentZOrder(btnComprarArma1, 1);
        lojaArma.setComponentZOrder(btnComprarArma2, 1);
        lojaArmadura.setComponentZOrder(imagemFundoArmadura, 2);
        lojaArmadura.setComponentZOrder(imagemArmadura3, 1);
        lojaArmadura.setComponentZOrder(imagemArmadura2, 1);
        lojaArmadura.setComponentZOrder(lblAgilidadeArmadura1, 1);
        lojaArmadura.setComponentZOrder(lblAgilidadeArmadura2, 1);
        lojaArmadura.setComponentZOrder(lblForcaArmadura1, 1);
        lojaArmadura.setComponentZOrder(lblForcaArmadura2, 1);
        lojaArmadura.setComponentZOrder(lblEstaminaArmadura1, 1);
        lojaArmadura.setComponentZOrder(lblEstaminaArmadura2, 1);
        lojaArmadura.setComponentZOrder(lblPrecoArmadura3, 1);
        lojaArmadura.setComponentZOrder(lblPrecoArmadura2, 1);
        lojaArmadura.setComponentZOrder(lblNomeArmadura3, 1);
        lojaArmadura.setComponentZOrder(lblNomeArmadura2, 1);
        lojaArmadura.setComponentZOrder(btnComprarArmadura3, 1);
        lojaArmadura.setComponentZOrder(btnComprarArmadura2, 1);
    }
    
    void colocaArmaArmadura(final int i, final Item item, final JLabel lblnome, final JLabel lblpreco, final JLabel imagem, final JLabel lblEstamina, final JLabel lblForca, final JLabel lblAgilidade, final JButton btnComprar, final JPanel panel, final Jogador jogador) {
        lblnome.setText(item.nome);
        lblpreco.setText("Pre\u00e7o: $ " + item.preco);
        lblAgilidade.setText("AGI: " + item.addAgility);
        lblEstamina.setText("EST: " + item.addEstamina);
        lblForca.setText("FOR: " + item.addForca);
        ImageIcon imgArma;
        if (i == 1) {
            imgArma = new ImageIcon(telaLoja.class.getResource("/armas/" + item.nome + ".png"));
        }
        else {
            imgArma = new ImageIcon(telaLoja.class.getResource("/armadura/" + item.nome + ".png"));
        }
        final Image img = imgArma.getImage().getScaledInstance(imagem.getWidth(), imagem.getHeight(), 1);
        imagem.setIcon(new ImageIcon(img));
        btnComprar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                if (jogador.status.gold >= item.preco) {
                    final Status status = jogador.status;
                    status.gold -= item.preco;
                    if (i == 1) {
                        jogador.inventario.listaArmas.add(item);
                    }
                    else {
                        jogador.inventario.listaArmaduras.add(item);
                    }
                    telaLoja.this.lblGold.setText("Gold: $ " + jogador.status.gold);
                    telaLoja.this.lojaPotions.setComponentZOrder(telaLoja.this.lblGold, 1);
                    JOptionPane.showMessageDialog(null, "Voc\u00ea comprou " + item.nome + ".");
                }
                else {
                    JOptionPane.showMessageDialog(null, "Voc\u00ea n\u00e3o tem dinheiro suficiente.");
                }
            }
        });
        panel.add(lblAgilidade);
        panel.add(lblEstamina);
        panel.add(lblForca);
        panel.add(lblnome);
        panel.add(lblpreco);
        panel.add(btnComprar);
        panel.add(imagem);
    }
}
