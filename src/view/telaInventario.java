// 
// Decompiled by Procyon v0.5.36
// 

package view;

import javax.swing.JOptionPane;
import java.awt.Image;
import java.util.Iterator;
import java.util.List;
import javax.swing.AbstractButton;
import javax.swing.JRadioButton;
import java.util.ArrayList;
import javax.swing.ButtonGroup;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.Icon;
import java.awt.Component;
import javax.swing.JTabbedPane;
import java.awt.LayoutManager;
import java.awt.Container;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.JPanel;
import javax.swing.JFrame;

public class telaInventario extends JFrame
{
    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    Celula armaSelecionada;
    Celula armaduraSelecionada;
    
    public telaInventario(final Jogador jogador) {
        this.armaSelecionada = null;
        this.armaduraSelecionada = null;
        this.setDefaultCloseOperation(3);
        this.setBounds(400, 200, 621, 398);
        (this.contentPane = new JPanel()).setBorder(new EmptyBorder(5, 5, 5, 5));
        this.setContentPane(this.contentPane);
        this.contentPane.setLayout(null);
        final JTabbedPane tabbedPane = new JTabbedPane(1);
        tabbedPane.setBounds(0, 0, 605, 359);
        this.contentPane.add(tabbedPane);
        final JPanel panelEquipados = new JPanel();
        tabbedPane.addTab("Equipado", null, panelEquipados, null);
        panelEquipados.setLayout(null);
        final JLabel lblPersonagem = new JLabel(jogador.nome);
        lblPersonagem.setBounds(100, 80, 46, 14);
        panelEquipados.add(lblPersonagem);
        final JLabel imagemPersonagem = new JLabel("New label");
        imagemPersonagem.setBounds(51, 105, 133, 133);
        final ImageIcon imgPersonagem = new ImageIcon(telaInventario.class.getResource("/imagens/" + jogador.personagem + ".png"));
        final Image img = imgPersonagem.getImage().getScaledInstance(imagemPersonagem.getWidth(), imagemPersonagem.getHeight(), 1);
        imagemPersonagem.setIcon(new ImageIcon(img));
        panelEquipados.add(imagemPersonagem);
        final JLabel lblArma = new JLabel(jogador.inventario.arma.nome);
        lblArma.setBounds(380, 21, 148, 14);
        panelEquipados.add(lblArma);
        final JLabel lblArmadura = new JLabel(jogador.inventario.armadura.nome);
        lblArmadura.setBounds(380, 164, 174, 14);
        panelEquipados.add(lblArmadura);
        final JLabel imagemArma = new JLabel("");
        imagemArma.setBounds(380, 45, 101, 96);
        final ImageIcon imgArma = new ImageIcon(telaInventario.class.getResource("/armas/" + jogador.inventario.arma.nome + ".png"));
        final Image img2 = imgArma.getImage().getScaledInstance(imagemArma.getWidth(), imagemArma.getHeight(), 1);
        imagemArma.setIcon(new ImageIcon(img2));
        panelEquipados.add(imagemArma);
        final JLabel imagemArmadura = new JLabel("");
        imagemArmadura.setBounds(380, 192, 101, 96);
        final ImageIcon imgArmadura = new ImageIcon(telaInventario.class.getResource("/armadura/" + jogador.inventario.armadura.nome + ".png"));
        final Image img3 = imgArmadura.getImage().getScaledInstance(imagemArmadura.getWidth(), imagemArmadura.getHeight(), 1);
        imagemArmadura.setIcon(new ImageIcon(img3));
        panelEquipados.add(imagemArmadura);
        final JButton btnVoltar = new JButton("Voltar");
        btnVoltar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                telaInventario.this.dispose();
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
        btnVoltar.setBounds(74, 272, 89, 23);
        panelEquipados.add(btnVoltar);
        final JPanel panelArmas = new JPanel();
        tabbedPane.addTab("Armas", null, panelArmas, null);
        panelArmas.setLayout(null);
        final JPanel panelArmaduras = new JPanel();
        tabbedPane.addTab("Armaduras", null, panelArmaduras, null);
        panelArmaduras.setLayout(null);
        final JLabel imagemFundo2 = new JLabel("New label");
        imagemFundo2.setBounds(0, 0, 600, 331);
        final JLabel imagemFundo3 = new JLabel("New label");
        imagemFundo3.setBounds(0, 0, 600, 331);
        final JLabel imagemFundo4 = new JLabel("New label");
        imagemFundo4.setBounds(0, 0, 600, 331);
        final ImageIcon imgFundo = new ImageIcon(telaInventario.class.getResource("/imagens/inventario.png"));
        final Image img4 = imgFundo.getImage().getScaledInstance(imagemFundo4.getWidth(), imagemFundo4.getHeight(), 1);
        imagemFundo4.setIcon(new ImageIcon(img4));
        imagemFundo2.setIcon(new ImageIcon(img4));
        imagemFundo3.setIcon(new ImageIcon(img4));
        panelEquipados.add(imagemFundo4);
        panelArmas.add(imagemFundo2);
        panelArmaduras.add(imagemFundo3);
        final ButtonGroup bgArma = new ButtonGroup();
        final ButtonGroup bgArmadura = new ButtonGroup();
        int aux = 0;
        int aux2 = 0;
        final JLabel lblNome = new JLabel("");
        lblNome.setBounds(350, 41, 143, 14);
        panelArmas.add(lblNome);
        final JLabel imagem = new JLabel("");
        imagem.setBounds(308, 85, 137, 125);
        panelArmas.add(imagem);
        final JLabel lblEstamina = new JLabel("");
        lblEstamina.setBounds(455, 85, 46, 14);
        panelArmas.add(lblEstamina);
        final JLabel lblForca = new JLabel("");
        lblForca.setBounds(455, 110, 46, 14);
        panelArmas.add(lblForca);
        final JLabel lblAgilidade = new JLabel("");
        lblAgilidade.setBounds(455, 135, 46, 14);
        panelArmas.add(lblAgilidade);
        final JLabel lblEquipamentos = new JLabel("Equipamentos:");
        lblEquipamentos.setBounds(33, 20, 122, 14);
        panelArmas.add(lblEquipamentos);
        final JLabel lblNome2 = new JLabel("");
        lblNome2.setBounds(350, 41, 143, 14);
        panelArmaduras.add(lblNome2);
        final JLabel imagem2 = new JLabel("");
        imagem2.setBounds(308, 85, 137, 125);
        panelArmaduras.add(imagem2);
        final JLabel lblEstamina2 = new JLabel("");
        lblEstamina2.setBounds(455, 85, 46, 14);
        panelArmaduras.add(lblEstamina2);
        final JLabel lblForca2 = new JLabel("");
        lblForca2.setBounds(455, 110, 46, 14);
        panelArmaduras.add(lblForca2);
        final JLabel lblAgilidade2 = new JLabel("");
        lblAgilidade2.setBounds(455, 135, 46, 14);
        panelArmaduras.add(lblAgilidade2);
        final JLabel lblEquipamentos2 = new JLabel("Equipamentos:");
        lblEquipamentos2.setBounds(33, 20, 122, 14);
        panelArmaduras.add(lblEquipamentos2);
        panelArmas.setComponentZOrder(imagemFundo2, 2);
        panelArmaduras.setComponentZOrder(imagemFundo3, 2);
        panelArmas.setComponentZOrder(imagem, 1);
        panelArmaduras.setComponentZOrder(imagem2, 1);
        panelArmas.setComponentZOrder(lblAgilidade, 1);
        panelArmaduras.setComponentZOrder(lblAgilidade2, 1);
        panelArmas.setComponentZOrder(lblEquipamentos, 1);
        panelArmaduras.setComponentZOrder(lblEquipamentos2, 1);
        panelArmas.setComponentZOrder(lblEstamina, 1);
        panelArmaduras.setComponentZOrder(lblEstamina2, 1);
        panelArmas.setComponentZOrder(lblForca, 1);
        panelArmaduras.setComponentZOrder(lblForca2, 1);
        panelArmas.setComponentZOrder(lblNome, 1);
        panelArmaduras.setComponentZOrder(lblNome2, 1);
        final List<Celula> listaCelulaArma = new ArrayList<Celula>();
        final List<Celula> listaCelulaArmadura = new ArrayList<Celula>();
        for (final Item i : jogador.inventario.listaArmas) {
            final JRadioButton button = new JRadioButton(i.nome);
            button.setBounds(23, 50 + aux, 200, 23);
            panelArmas.add(button);
            panelArmas.setComponentZOrder(button, 1);
            bgArma.add(button);
            aux += 22;
            listaCelulaArma.add(new Celula(button, i));
        }
        for (final Item i : jogador.inventario.listaArmaduras) {
            final JRadioButton button = new JRadioButton(i.nome);
            button.setBounds(23, 50 + aux2, 200, 23);
            panelArmaduras.add(button);
            panelArmaduras.setComponentZOrder(button, 1);
            bgArmadura.add(button);
            aux2 += 22;
            listaCelulaArmadura.add(new Celula(button, i));
        }
        final JButton btnSelecionar = new JButton("Selecionar");
        btnSelecionar.setBounds(290, 247, 117, 23);
        panelArmas.add(btnSelecionar);
        final JButton btnSelecionar2 = new JButton("Selecionar");
        btnSelecionar2.setBounds(290, 247, 117, 23);
        panelArmaduras.add(btnSelecionar2);
        btnSelecionar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                for (final Celula c : listaCelulaArma) {
                    if (c.button.isSelected()) {
                        lblNome.setText(c.item.nome);
                        lblAgilidade.setText("AGI: " + c.item.addAgility);
                        lblEstamina.setText("EST: " + c.item.addEstamina);
                        lblForca.setText("FOR: " + c.item.addForca);
                        final ImageIcon imgItem = new ImageIcon(telaCombate.class.getResource("/armas/" + c.item.nome + ".png"));
                        final Image img = imgItem.getImage().getScaledInstance(imagem.getWidth(), imagem.getHeight(), 1);
                        imagem.setIcon(new ImageIcon(img));
                        panelArmas.add(imagem);
                        panelArmas.setComponentZOrder(imagem, 1);
                        telaInventario.this.armaSelecionada = c;
                    }
                }
            }
        });
        btnSelecionar2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                for (final Celula c : listaCelulaArmadura) {
                    if (c.button.isSelected()) {
                        lblNome2.setText(c.item.nome);
                        lblAgilidade2.setText("AGI: " + c.item.addAgility);
                        lblEstamina2.setText("EST: " + c.item.addEstamina);
                        lblForca2.setText("FOR: " + c.item.addForca);
                        final ImageIcon imgItem = new ImageIcon(telaCombate.class.getResource("/armadura/" + c.item.nome + ".png"));
                        final Image img = imgItem.getImage().getScaledInstance(imagem2.getWidth(), imagem2.getHeight(), 1);
                        imagem2.setIcon(new ImageIcon(img));
                        panelArmaduras.add(imagem2);
                        panelArmaduras.setComponentZOrder(imagem2, 1);
                        telaInventario.this.armaduraSelecionada = c;
                    }
                }
            }
        });
        final JButton btnEquipar = new JButton("Equipar");
        btnEquipar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                if (telaInventario.this.armaSelecionada != null) {
                    JOptionPane.showMessageDialog(null, String.valueOf(telaInventario.this.armaSelecionada.item.nome) + " foi equipado!");
                    jogador.inventario.arma = telaInventario.this.armaSelecionada.item;
                    final ImageIcon imgArma = new ImageIcon(telaInventario.class.getResource("/armas/" + jogador.inventario.arma.nome + ".png"));
                    final Image img = imgArma.getImage().getScaledInstance(imagemArma.getWidth(), imagemArma.getHeight(), 1);
                    imagemArma.setIcon(new ImageIcon(img));
                    panelEquipados.add(imagemArma);
                    panelEquipados.setComponentZOrder(imagemArma, 1);
                }
            }
        });
        btnEquipar.setBounds(434, 247, 89, 23);
        panelArmas.add(btnEquipar);
        final JButton btnEquipar2 = new JButton("Equipar");
        btnEquipar2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                JOptionPane.showMessageDialog(null, String.valueOf(telaInventario.this.armaduraSelecionada.item.nome) + " foi equipado!");
                jogador.inventario.armadura = telaInventario.this.armaduraSelecionada.item;
                final ImageIcon imgArmadura = new ImageIcon(telaInventario.class.getResource("/armadura/" + jogador.inventario.armadura.nome + ".png"));
                final Image img = imgArmadura.getImage().getScaledInstance(imagemArmadura.getWidth(), imagemArmadura.getHeight(), 1);
                imagemArmadura.setIcon(new ImageIcon(img));
                panelEquipados.add(imagemArmadura);
                panelEquipados.setComponentZOrder(imagemArmadura, 1);
            }
        });
        btnEquipar2.setBounds(434, 247, 89, 23);
        panelArmaduras.add(btnEquipar2);
        panelArmas.setComponentZOrder(btnEquipar, 1);
        panelArmaduras.setComponentZOrder(btnEquipar2, 1);
        panelArmas.setComponentZOrder(btnSelecionar, 1);
        panelArmaduras.setComponentZOrder(btnSelecionar2, 1);
        panelEquipados.setComponentZOrder(imagemFundo4, 2);
        panelEquipados.setComponentZOrder(imagemArmadura, 1);
        panelEquipados.setComponentZOrder(imagemArma, 1);
        panelEquipados.setComponentZOrder(imagemPersonagem, 1);
        panelEquipados.setComponentZOrder(lblPersonagem, 1);
        panelEquipados.setComponentZOrder(lblArma, 1);
        panelEquipados.setComponentZOrder(lblArmadura, 1);
        panelEquipados.setComponentZOrder(btnVoltar, 1);
    }
}
