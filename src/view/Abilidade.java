// 
// Decompiled by Procyon v0.5.36
// 

package view;

import java.io.Serializable;

public class Abilidade implements Serializable
{
    private static final long serialVersionUID = 1L;
    String nome;
    String detalhe;
    int dano;
    int cura;
    int custoMp;
    int info;
    int prob;
    
    public Abilidade(final String nome, final int dano, final int cura, final int custoMp, final int info, final int prob) {
        this.nome = nome;
        this.dano = dano;
        this.cura = cura;
        this.custoMp = custoMp;
        this.info = info;
        this.prob = prob;
    }
}
