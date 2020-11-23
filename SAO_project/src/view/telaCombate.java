// 
// Decompiled by Procyon v0.5.36
// 

package view;

import java.util.Random;
import java.awt.Image;
import java.awt.EventQueue;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JProgressBar;
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

public class telaCombate extends JFrame
{
    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    
    public telaCombate(final Jogador jogador, final boolean boss) {
        this.setDefaultCloseOperation(3);
        this.setBounds(400, 200, 621, 398);
        (this.contentPane = new JPanel()).setBorder(new EmptyBorder(5, 5, 5, 5));
        this.setContentPane(this.contentPane);
        this.contentPane.setLayout(null);
        final Monstro m1 = new Monstro(jogador.andar, boss);
        final JLabel imagemBatalha = new JLabel("New label");
        imagemBatalha.setBounds(0, 0, 605, 359);
        final ImageIcon imgBatalha = new ImageIcon(telaCombate.class.getResource("/imagens/batalha.png"));
        final Image img2 = imgBatalha.getImage().getScaledInstance(imagemBatalha.getWidth(), imagemBatalha.getHeight(), 1);
        imagemBatalha.setIcon(new ImageIcon(img2));
        this.contentPane.add(imagemBatalha);
        final JLabel imagem1 = new JLabel("New label");
        imagem1.setBounds(33, 43, 84, 81);
        final ImageIcon imgKirito = new ImageIcon(telaCombate.class.getResource("/imagens/" + jogador.personagem + ".png"));
        final Image img3 = imgKirito.getImage().getScaledInstance(imagem1.getWidth(), imagem1.getHeight(), 1);
        imagem1.setIcon(new ImageIcon(img3));
        this.contentPane.add(imagem1);
        final JLabel imagem2 = new JLabel();
        imagem2.setBounds(227, 43, 84, 81);
        final ImageIcon imgMonstro = new ImageIcon(telaCombate.class.getResource("/imagens/" + m1.nome + ".png"));
        final Image imgTiago = imgMonstro.getImage().getScaledInstance(imagem2.getWidth(), imagem2.getHeight(), 1);
        imagem2.setIcon(new ImageIcon(imgTiago));
        this.contentPane.add(imagem2);
        final JLabel nomeJogador = new JLabel(jogador.nome);
        nomeJogador.setForeground(Color.WHITE);
        nomeJogador.setHorizontalAlignment(0);
        nomeJogador.setBounds(10, 11, 78, 14);
        this.contentPane.add(nomeJogador);
        final JLabel levelJogador = new JLabel("Level: " + jogador.status.level);
        levelJogador.setForeground(Color.WHITE);
        levelJogador.setBounds(98, 11, 46, 14);
        this.contentPane.add(levelJogador);
        final JLabel nomeMonstro = new JLabel(m1.nome);
        nomeMonstro.setForeground(Color.WHITE);
        nomeMonstro.setHorizontalAlignment(0);
        nomeMonstro.setBounds(227, 11, 84, 14);
        this.contentPane.add(nomeMonstro);
        final JLabel levelMonstro = new JLabel("Level: " + m1.status.level);
        levelMonstro.setForeground(Color.WHITE);
        levelMonstro.setBounds(314, 11, 46, 14);
        this.contentPane.add(levelMonstro);
        final JLabel fodase = new JLabel("Informa\u00e7\u00f5es de combate:");
        fodase.setForeground(Color.WHITE);
        fodase.setBounds(390, 76, 148, 14);
        this.contentPane.add(fodase);
        final JLabel info = new JLabel("");
        info.setForeground(Color.WHITE);
        info.setBounds(366, 101, 183, 23);
        this.contentPane.add(info);
        final JLabel info2 = new JLabel("");
        info2.setForeground(Color.WHITE);
        info2.setBounds(366, 124, 172, 23);
        this.contentPane.add(info2);
        final JLabel hpJogador = new JLabel("HP: " + jogador.status.hp);
        hpJogador.setForeground(Color.WHITE);
        hpJogador.setBounds(33, 155, 60, 14);
        this.contentPane.add(hpJogador);
        final JLabel mpJogador = new JLabel("MP: " + jogador.status.mp);
        mpJogador.setForeground(Color.WHITE);
        mpJogador.setBounds(33, 174, 60, 14);
        this.contentPane.add(mpJogador);
        final JLabel hpMonstro = new JLabel("HP: " + m1.status.hp);
        hpMonstro.setForeground(Color.WHITE);
        hpMonstro.setBounds(227, 155, 68, 14);
        this.contentPane.add(hpMonstro);
        final JLabel lblHabilidades = new JLabel("Habilidades:");
        lblHabilidades.setForeground(Color.WHITE);
        lblHabilidades.setBounds(33, 199, 111, 14);
        this.contentPane.add(lblHabilidades);
        final JLabel lblItens = new JLabel("Itens: ");
        lblItens.setForeground(Color.WHITE);
        lblItens.setBounds(314, 199, 60, 14);
        this.contentPane.add(lblItens);
        final JProgressBar progressBarHpJogador = new JProgressBar();
        progressBarHpJogador.setBounds(98, 155, 84, 14);
        this.contentPane.add(progressBarHpJogador);
        progressBarHpJogador.setMinimum(0);
        progressBarHpJogador.setMaximum(jogador.status.hpMax);
        progressBarHpJogador.setStringPainted(false);
        progressBarHpJogador.setValue(jogador.status.hp);
        progressBarHpJogador.setForeground(Color.RED);
        final JProgressBar progressBarMpJogador = new JProgressBar();
        progressBarMpJogador.setBounds(98, 174, 84, 14);
        this.contentPane.add(progressBarMpJogador);
        progressBarMpJogador.setMinimum(0);
        progressBarMpJogador.setMaximum(jogador.status.mpMax);
        progressBarMpJogador.setStringPainted(false);
        progressBarMpJogador.setValue(jogador.status.mp);
        progressBarMpJogador.setForeground(Color.BLUE);
        final JProgressBar progressBarHpMonstro = new JProgressBar();
        progressBarHpMonstro.setBounds(290, 155, 84, 14);
        this.contentPane.add(progressBarHpMonstro);
        progressBarHpMonstro.setMinimum(0);
        progressBarHpMonstro.setMaximum(m1.status.hpMax);
        progressBarHpMonstro.setStringPainted(false);
        progressBarHpMonstro.setValue(m1.status.hp);
        progressBarHpMonstro.setForeground(Color.red);
        final ActionListener actlSkill1 = new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                telaCombate.this.batalha(0, boss, jogador, m1, info, info2, hpJogador, mpJogador, hpMonstro, progressBarHpJogador, progressBarMpJogador, progressBarHpMonstro);
            }
        };
        final ActionListener actlSkill2 = new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                telaCombate.this.batalha(1, boss, jogador, m1, info, info2, hpJogador, mpJogador, hpMonstro, progressBarHpJogador, progressBarMpJogador, progressBarHpMonstro);
            }
        };
        final ActionListener actlSkill3 = new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                telaCombate.this.batalha(2, boss, jogador, m1, info, info2, hpJogador, mpJogador, hpMonstro, progressBarHpJogador, progressBarMpJogador, progressBarHpMonstro);
            }
        };
        final JButton skill1 = new JButton(jogador.abilidades[0].nome + " MP: " + jogador.abilidades[0].custoMp);
        skill1.addActionListener(actlSkill1);
        skill1.setHorizontalAlignment(2);
        skill1.setBounds(28, 224, 228, 23);
        this.contentPane.add(skill1);
        final JButton skill2 = new JButton(String.valueOf(jogador.abilidades[1].nome) + " MP: " + jogador.abilidades[1].custoMp);
        skill2.addActionListener(actlSkill2);
        skill2.setHorizontalAlignment(2);
        skill2.setBounds(28, 252, 228, 23);
        this.contentPane.add(skill2);
        final JButton skill3 = new JButton(String.valueOf(jogador.abilidades[2].nome) + " MP: " + jogador.abilidades[2].custoMp);
        skill3.addActionListener(actlSkill3);
        skill3.setHorizontalAlignment(2);
        skill3.setBounds(28, 280, 228, 23);
        this.contentPane.add(skill3);
        final JButton btnNewButton = new JButton("Po\u00e7\u00e3o de vida (" + jogador.inventario.qtdPotVida + ")");
        btnNewButton.setHorizontalAlignment(2);
        btnNewButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                if (jogador.status.hp != jogador.status.hpMax) {
                    if (jogador.inventario.qtdPotVida > 0) {
                        progressBarHpJogador.setValue(jogador.status.hpMax);
                        hpJogador.setText("HP: " + (jogador.status.hpMax + jogador.inventario.arma.addEstamina + jogador.inventario.armadura.addEstamina));
                        jogador.status.hp = jogador.status.hpMax + jogador.inventario.arma.addEstamina + jogador.inventario.armadura.addEstamina;
                        final Inventario inventario = jogador.inventario;
                        --inventario.qtdPotVida;
                        JOptionPane.showMessageDialog(null, "Seus pontos de vida foram restaurados.");
                        btnNewButton.setText("Po\u00e7\u00e3o de vida (" + jogador.inventario.qtdPotVida + ")");
                    }
                    else {
                        JOptionPane.showMessageDialog(null, "Suas po\u00e7\u00f5es de vida esgotaram.");
                    }
                }
                else {
                    JOptionPane.showMessageDialog(null, "Seu HP est\u00e1 cheio.");
                }
            }
        });
        btnNewButton.setBounds(304, 224, 234, 23);
        this.contentPane.add(btnNewButton);
        final JButton btnNewButton_1 = new JButton("Po\u00e7\u00e3o de mana (" + jogador.inventario.qtdPotMana + ")");
        btnNewButton_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                if (jogador.status.mp != jogador.status.mpMax) {
                    if (jogador.inventario.qtdPotMana > 0) {
                        progressBarMpJogador.setValue(jogador.status.mpMax);
                        mpJogador.setText("MP: " + jogador.status.mpMax);
                        jogador.status.mp = jogador.status.mpMax;
                        final Inventario inventario = jogador.inventario;
                        --inventario.qtdPotMana;
                        JOptionPane.showMessageDialog(null, "Seus pontos de mana foram restaurados.");
                        btnNewButton_1.setText("Po\u00e7\u00e3o de mana (" + jogador.inventario.qtdPotMana + ")");
                    }
                    else {
                        JOptionPane.showMessageDialog(null, "Suas po\u00e7\u00f5es de mana esgotaram.");
                    }
                }
                else {
                    JOptionPane.showMessageDialog(null, "Seu MP est\u00e1 cheio.");
                }
            }
        });
        btnNewButton_1.setHorizontalAlignment(2);
        btnNewButton_1.setBounds(304, 252, 234, 23);
        this.contentPane.add(btnNewButton_1);
        final JButton btnNewButton_2 = new JButton("Bombas de fuma\u00e7a (" + jogador.inventario.qtdBombaFum + ")");
        btnNewButton_2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                if (jogador.inventario.qtdBombaFum > 0) {
                    if (!boss) {
                        final Inventario inventario = jogador.inventario;
                        --inventario.qtdBombaFum;
                        JOptionPane.showMessageDialog(null, "Voc\u00ea usou uma bomba de fuma\u00e7a e fugiu.");
                        telaCombate.this.dispose();
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
                        JOptionPane.showMessageDialog(null, "Voc\u00ea tenta fugir, mas o " + m1.nome + " dissipou a fuma\u00e7a.");
                    }
                }
                else {
                    JOptionPane.showMessageDialog(null, "Suas bombas de fuma\u00e7a esgotaram.");
                }
            }
        });
        btnNewButton_2.setHorizontalAlignment(2);
        btnNewButton_2.setBounds(304, 280, 234, 23);
        this.contentPane.add(btnNewButton_2);
        this.contentPane.setComponentZOrder(imagemBatalha, 2);
        this.contentPane.setComponentZOrder(btnNewButton, 1);
        this.contentPane.setComponentZOrder(btnNewButton_1, 1);
        this.contentPane.setComponentZOrder(btnNewButton_2, 1);
        this.contentPane.setComponentZOrder(lblHabilidades, 1);
        this.contentPane.setComponentZOrder(hpJogador, 1);
        this.contentPane.setComponentZOrder(hpMonstro, 1);
        this.contentPane.setComponentZOrder(lblItens, 1);
        this.contentPane.setComponentZOrder(mpJogador, 1);
        this.contentPane.setComponentZOrder(fodase, 1);
        this.contentPane.setComponentZOrder(levelJogador, 1);
        this.contentPane.setComponentZOrder(imagem1, 1);
        this.contentPane.setComponentZOrder(imagem2, 1);
        this.contentPane.setComponentZOrder(skill1, 1);
        this.contentPane.setComponentZOrder(skill2, 1);
        this.contentPane.setComponentZOrder(skill3, 1);
        this.contentPane.setComponentZOrder(info, 1);
        this.contentPane.setComponentZOrder(info2, 1);
        this.contentPane.setComponentZOrder(nomeJogador, 1);
        this.contentPane.setComponentZOrder(nomeMonstro, 1);
        this.contentPane.setComponentZOrder(progressBarHpJogador, 1);
        this.contentPane.setComponentZOrder(progressBarHpMonstro, 1);
        this.contentPane.setComponentZOrder(progressBarMpJogador, 1);
    }
    
    void batalha(final int i, final boolean boss, final Jogador jogador, final Monstro m1, final JLabel info, final JLabel info2, final JLabel hpJogador, final JLabel mpJogador, final JLabel hpMonstro, final JProgressBar progressBarHpJogador, final JProgressBar progressBarMpJogador, final JProgressBar progressBarHpMonstro) {
        final Random aleat = new Random(System.currentTimeMillis());
        if (jogador.status.mp >= jogador.abilidades[i].custoMp) {
            if (aleat.nextInt(100) >= jogador.abilidades[i].prob) {
                info.setText(String.valueOf(jogador.nome) + " errou o ataque");
            }
            else {
                final Status status = m1.status;
                status.hp -= jogador.abilidades[i].dano + jogador.status.forca + jogador.inventario.arma.addForca + jogador.inventario.armadura.addForca;
                final Status status2 = jogador.status;
                status2.mp -= jogador.abilidades[i].custoMp;
                info.setText(String.valueOf(m1.nome) + " perdeu " + (jogador.abilidades[i].dano + jogador.status.forca + jogador.inventario.arma.addForca + jogador.inventario.armadura.addForca) + " de vida");
                progressBarHpMonstro.setValue(m1.status.hp);
                progressBarMpJogador.setValue(jogador.status.mp);
            }
            if (m1.status.hp <= 0) {
                progressBarHpMonstro.setValue(0);
                hpMonstro.setText("HP: 0");
                mpJogador.setText("MP: " + jogador.status.mp);
                info.setText(String.valueOf(m1.nome) + " morreu");
                info2.setText("");
                JOptionPane.showMessageDialog(null, "Parabens, voc\u00ea ganhou " + m1.status.exp + " XP e " + m1.status.gold + " Gold!!!");
                final Status status3 = jogador.status;
                status3.exp += m1.status.exp;
                final Status status4 = jogador.status;
                status4.gold += m1.status.gold;
                if (boss) {
                    if (jogador.andar == 10) {
                        JOptionPane.showMessageDialog(null, "Voc\u00ea derrotou o boss e COMPLETOU O JOGO!!");
                        this.dispose();
                        EventQueue.invokeLater(new Runnable() {
                            @Override
                            public void run() {
                                try {
                                    final telaFinal frame = new telaFinal(jogador);
                                    frame.setVisible(true);
                                }
                                catch (Exception e) {
                                    e.printStackTrace();
                                }
                            }
                        });
                    }
                    else {
                        JOptionPane.showMessageDialog(null, "Voc\u00ea derrotou o boss e liberou o pr\u00f3ximo andar!!");
                        ++jogador.andarMax;
                    }
                }
                if (jogador.passouDeLevel() && (jogador.andar != 10 || !boss)) {
                    final Status status5 = jogador.status;
                    status5.hpMax += 5;
                    final Status status6 = jogador.status;
                    status6.mpMax += 5;
                    JOptionPane.showMessageDialog(null, "Voc\u00ea subiu de nivel!!");
                    this.dispose();
                    EventQueue.invokeLater(new Runnable() {
                        @Override
                        public void run() {
                            try {
                                final telaUpou frame2 = new telaUpou(jogador);
                                frame2.setVisible(true);
                            }
                            catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    });
                }
                else if (jogador.andar != 10 || !boss) {
                    this.dispose();
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
            else {
                if (aleat.nextInt(100) >= m1.abilidades.prob) {
                    info2.setText(String.valueOf(m1.nome) + " errou o ataque");
                }
                else {
                    final Status status7 = jogador.status;
                    status7.hp -= m1.abilidades.dano;
                    info2.setText(String.valueOf(jogador.nome) + " perdeu " + m1.abilidades.dano + " de vida");
                    progressBarHpJogador.setValue(jogador.status.hp);
                }
                if (jogador.status.hp <= 0) {
                    progressBarHpJogador.setValue(0);
                    JOptionPane.showMessageDialog(null, "Voc\u00ea morreu, GAME OVER.");
                    this.dispose();
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
                hpMonstro.setText("HP: " + m1.status.hp);
                hpJogador.setText("HP: " + jogador.status.hp);
                final Status status8 = jogador.status;
                status8.mp += jogador.status.agilidade + jogador.inventario.arma.addAgility + jogador.inventario.armadura.addAgility;
                if (jogador.status.mp > jogador.status.mpMax) {
                    jogador.status.mp = jogador.status.mpMax;
                }
                mpJogador.setText("MP: " + jogador.status.mp);
            }
        }
        else {
            JOptionPane.showMessageDialog(null, "Voc\u00ea n\u00e3o possui mana para usar " + jogador.abilidades[i].nome);
        }
    }
}
