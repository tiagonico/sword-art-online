// 
// Decompiled by Procyon v0.5.36
// 

package view;

import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

public class Inventario implements Serializable
{
    private static final long serialVersionUID = 1L;
    Item arma;
    Item armadura;
    List<Item> listaArmas;
    List<Item> listaArmaduras;
    List<Item> bancoArmas;
    List<Item> bancoArmaduras;
    int qtdPotVida;
    int qtdPotMana;
    int qtdBombaFum;
    
    public void adicionaArmas() {
        (this.bancoArmas = new ArrayList<Item>()).add(new Item("Giant Sword", "", 0, 5, 0, 500));
        this.bancoArmas.add(new Item("Katana", "", 0, 3, 5, 700));
        this.bancoArmas.add(new Item("Longsword", "", 0, 3, 0, 300));
        this.bancoArmas.add(new Item("Magic Longsword", "", 5, 10, 5, 2500));
        this.bancoArmas.add(new Item("Rapier", "", 0, 5, 10, 2000));
        this.bancoArmas.add(new Item("Sabre", "", 0, 7, 0, 800));
        this.bancoArmas.add(new Item("Sai", "", 0, 7, 10, 1500));
        this.bancoArmas.add(new Item("Scimitar", "", 5, 8, 0, 1200));
        this.bancoArmas.add(new Item("Serpent Sword", "", 0, 10, 0, 1500));
        this.bancoArmas.add(new Item("Spike Sword", "", 0, 15, 0, 2300));
        this.bancoArmas.add(new Item("Two Handed Sword", "", 0, 20, 0, 3000));
        this.bancoArmas.add(new Item("Warlord Sword", "", 10, 30, 10, 10000));
    }
    
    public void adicionaArmaduras() {
        (this.bancoArmaduras = new ArrayList<Item>()).add(new Item("Brass Armor", "", 10, 0, 0, 700));
        this.bancoArmaduras.add(new Item("Blue Robe", "", 5, 0, 15, 1500));
        this.bancoArmaduras.add(new Item("Chain Armor", "", 5, 0, 0, 300));
        this.bancoArmaduras.add(new Item("Crown Armor", "", 10, 0, 2, 1000));
        this.bancoArmaduras.add(new Item("Dark Armor", "", 15, 0, 0, 1200));
        this.bancoArmaduras.add(new Item("Doublet", "", 8, 0, 0, 600));
        this.bancoArmaduras.add(new Item("Dragon Scale Mail", "", 20, 5, 5, 10000));
        this.bancoArmaduras.add(new Item("Golden Armor", "", 12, 0, 0, 1000));
        this.bancoArmaduras.add(new Item("Magic Plate Armor", "", 20, 0, 10, 10000));
        this.bancoArmaduras.add(new Item("Noble Armor", "", 17, 0, 0, 1500));
        this.bancoArmaduras.add(new Item("Plate Armor", "", 11, 0, 0, 900));
        this.bancoArmaduras.add(new Item("Scale Armor", "", 8, 0, 0, 600));
    }
}
