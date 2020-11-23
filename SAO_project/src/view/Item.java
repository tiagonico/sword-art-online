// 
// Decompiled by Procyon v0.5.36
// 

package view;

import java.io.Serializable;

public class Item implements Serializable
{
    private static final long serialVersionUID = 1L;
    String nome;
    String detalhe;
    int addEstamina;
    int addForca;
    int addAgility;
    int preco;
    
    public Item(final String nome, final String detalhe, final int addEstamina, final int addForca, final int addAgility, final int preco) {
        this.nome = nome;
        this.detalhe = detalhe;
        this.addEstamina = addEstamina;
        this.addForca = addForca;
        this.addAgility = addAgility;
        this.preco = preco;
    }
}
