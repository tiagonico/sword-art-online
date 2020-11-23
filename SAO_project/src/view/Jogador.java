// 
// Decompiled by Procyon v0.5.36
// 

package view;

import java.io.Serializable;

public class Jogador implements Serializable
{
    private static final long serialVersionUID = 1L;
    String nome;
    Status status;
    Inventario inventario;
    Abilidade[] abilidades;
    int andar;
    int andarMax;
    String personagem;
    
    public Jogador(final String nome, final int hpMax, final int mpMax, final int estamina, final int agilidade, final int forca) {
        this.status = new Status(hpMax, mpMax, estamina, agilidade, forca, 1, 0, 0);
        this.nome = nome;
        this.andar = 1;
        this.andarMax = 1;
        this.inventario = new Inventario();
        this.inventario.qtdBombaFum = 1;
        this.inventario.qtdPotMana = 1;
        this.inventario.qtdPotVida = 1;
    }
    
    public void colocaAbilidade() {
        this.abilidades = new Abilidade[3];
        final Abilidade skill1 = new Abilidade("Corte transversal", 10, 0, 0, 0, 90);
        final Abilidade skill2 = new Abilidade("Redemoinho", 20, 0, 10, 0, 80);
        final Abilidade skill3 = new Abilidade("Golpe Rel\u00e2mpago", 40, 0, 30, 0, 70);
        this.abilidades[0] = skill1;
        this.abilidades[1] = skill2;
        this.abilidades[2] = skill3;
    }
    
    public boolean passouDeLevel() {
        if (this.status.exp >= 100 && this.status.level == 1) {
            final Status status = this.status;
            ++status.level;
            final Status status2 = this.status;
            status2.exp -= 100;
            return true;
        }
        if (this.status.exp >= 200 && this.status.level == 2) {
            final Status status3 = this.status;
            ++status3.level;
            final Status status4 = this.status;
            status4.exp -= 200;
            return true;
        }
        if (this.status.exp >= 350 && this.status.level == 3) {
            final Status status5 = this.status;
            ++status5.level;
            final Status status6 = this.status;
            status6.exp -= 350;
            return true;
        }
        if (this.status.exp >= 500 && this.status.level == 4) {
            final Status status7 = this.status;
            ++status7.level;
            final Status status8 = this.status;
            status8.exp -= 500;
            return true;
        }
        if (this.status.exp >= 700 && this.status.level == 5) {
            final Status status9 = this.status;
            ++status9.level;
            final Status status10 = this.status;
            status10.exp -= 700;
            return true;
        }
        if (this.status.exp >= 1000 && this.status.level == 6) {
            final Status status11 = this.status;
            ++status11.level;
            final Status status12 = this.status;
            status12.exp -= 1000;
            return true;
        }
        if (this.status.exp >= 1500 && this.status.level == 7) {
            final Status status13 = this.status;
            ++status13.level;
            final Status status14 = this.status;
            status14.exp -= 1500;
            return true;
        }
        if (this.status.exp >= 2500 && this.status.level == 8) {
            final Status status15 = this.status;
            ++status15.level;
            final Status status16 = this.status;
            status16.exp -= 2500;
            return true;
        }
        if (this.status.exp >= 4000 && this.status.level == 9) {
            final Status status17 = this.status;
            ++status17.level;
            final Status status18 = this.status;
            status18.exp -= 4000;
            return true;
        }
        return false;
    }
    
    public int xpParaProxLevel() {
        if (this.status.level == 1) {
            return 100 - this.status.exp;
        }
        if (this.status.level == 2) {
            return 200 - this.status.exp;
        }
        if (this.status.level == 3) {
            return 350 - this.status.exp;
        }
        if (this.status.level == 4) {
            return 500 - this.status.exp;
        }
        if (this.status.level == 5) {
            return 700 - this.status.exp;
        }
        if (this.status.level == 6) {
            return 1000 - this.status.exp;
        }
        if (this.status.level == 7) {
            return 1500 - this.status.exp;
        }
        if (this.status.level == 8) {
            return 2500 - this.status.exp;
        }
        if (this.status.level == 9) {
            return 4000 - this.status.exp;
        }
        return 0;
    }
}
