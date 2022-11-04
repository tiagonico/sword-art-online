// 
// Decompiled by Procyon v0.5.36
// 

package view;

import java.awt.EventQueue;
import java.util.ArrayList;

public class Programa
{
    public static void main(final String[] args) {
        final Jogador jogador = new Jogador(null, 100, 100, 0, 0, 0);
        jogador.colocaAbilidade();
        (jogador.inventario.listaArmas = new ArrayList<Item>()).add(new Item("Broadsword", "", 0, 0, 0, 0));
        jogador.inventario.arma = new Item("Broadsword", "", 0, 0, 0, 0);
        (jogador.inventario.listaArmaduras = new ArrayList<Item>()).add(new Item("Armadura de couro", "", 0, 0, 0, 0));
        jogador.inventario.armadura = new Item("Armadura de couro", "", 0, 0, 0, 0);
        jogador.inventario.adicionaArmaduras();
        jogador.inventario.adicionaArmas();
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
}
