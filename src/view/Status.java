// 
// Decompiled by Procyon v0.5.36
// 

package view;

import java.io.Serializable;

public class Status implements Serializable
{
    private static final long serialVersionUID = 1L;
    int hpMax;
    int mpMax;
    int hp;
    int mp;
    int level;
    int exp;
    int estamina;
    int agilidade;
    int forca;
    int gold;
    
    public Status(final int hpMax, final int mpMax, final int estamina, final int agilidade, final int forca, final int level, final int exp, final int gold) {
        this.hpMax = hpMax;
        this.mpMax = mpMax;
        this.estamina = estamina;
        this.agilidade = agilidade;
        this.forca = forca;
        this.hp = hpMax;
        this.mp = mpMax;
        this.level = level;
        this.exp = exp;
        this.gold = gold;
    }
}
