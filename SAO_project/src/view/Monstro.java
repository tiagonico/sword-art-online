// 
// Decompiled by Procyon v0.5.36
// 

package view;

import java.util.Random;

public class Monstro
{
    String nome;
    Status status;
    Abilidade abilidades;
    
    public Monstro(final String nome, final int hpMax, final int mpMax, final int level, final int exp, final int gold) {
        this.status = new Status(hpMax, mpMax, 0, 0, 0, level, exp, gold);
        this.nome = nome;
    }
    
    public Monstro(final int andar, final boolean boss) {
        final Random r = new Random(System.currentTimeMillis());
        final int aleat = r.nextInt(100);
        if (andar == 1 && !boss) {
            if (aleat >= 0 && aleat <= 50) {
                this.nome = "Slime";
                this.status = new Status(50, 0, 0, 0, 0, 1, 20, 10);
                this.abilidades = new Abilidade("", 5, 0, 0, 0, 90);
            }
            else if (aleat > 50 && aleat <= 100) {
                this.nome = "Goblin";
                this.status = new Status(60, 0, 0, 0, 0, 1, 25, 15);
                this.abilidades = new Abilidade("", 10, 0, 0, 0, 70);
            }
        }
        else if (andar == 1 && boss) {
            this.nome = "Ceifador";
            this.status = new Status(150, 0, 0, 0, 0, 3, 70, 50);
            this.abilidades = new Abilidade("", 20, 0, 0, 0, 80);
        }
        else if (andar == 2 && !boss) {
            if (aleat >= 0 && aleat <= 50) {
                this.nome = "Hobgoblin";
                this.status = new Status(80, 0, 0, 0, 0, 2, 35, 25);
                this.abilidades = new Abilidade("", 20, 0, 0, 0, 60);
            }
            else if (aleat > 50 && aleat <= 100) {
                this.nome = "Goblin";
                this.status = new Status(70, 0, 0, 0, 0, 2, 30, 20);
                this.abilidades = new Abilidade("", 15, 0, 0, 0, 70);
            }
        }
        else if (andar == 2 && boss) {
            this.nome = "Ogro";
            this.status = new Status(200, 0, 0, 0, 0, 4, 150, 100);
            this.abilidades = new Abilidade("", 40, 0, 0, 0, 40);
        }
        else if (andar == 3 && !boss) {
            if (aleat >= 0 && aleat <= 50) {
                this.nome = "Chimera";
                this.status = new Status(80, 0, 0, 0, 0, 3, 45, 30);
                this.abilidades = new Abilidade("", 20, 0, 0, 0, 80);
            }
            else if (aleat > 50 && aleat <= 100) {
                this.nome = "Horror";
                this.status = new Status(40, 0, 0, 0, 0, 3, 50, 35);
                this.abilidades = new Abilidade("", 30, 0, 0, 0, 90);
            }
        }
        else if (andar == 3 && boss) {
            this.nome = "Demon";
            this.status = new Status(350, 0, 0, 0, 0, 5, 300, 200);
            this.abilidades = new Abilidade("", 30, 0, 0, 0, 60);
        }
        else if (andar == 4 && !boss) {
            if (aleat >= 0 && aleat <= 50) {
                this.nome = "Behemoth";
                this.status = new Status(130, 0, 0, 0, 0, 4, 60, 50);
                this.abilidades = new Abilidade("", 15, 0, 0, 0, 80);
            }
            else if (aleat > 50 && aleat <= 100) {
                this.nome = "Crocodilo";
                this.status = new Status(120, 0, 0, 0, 0, 4, 50, 45);
                this.abilidades = new Abilidade("", 10, 0, 0, 0, 90);
            }
        }
        else if (andar == 4 && boss) {
            this.nome = "Guardi\u00e3o";
            this.status = new Status(500, 0, 0, 0, 0, 6, 400, 300);
            this.abilidades = new Abilidade("", 25, 0, 0, 0, 80);
        }
        else if (andar == 5 && !boss) {
            if (aleat >= 0 && aleat <= 50) {
                this.nome = "F\u00eanix";
                this.status = new Status(130, 0, 0, 0, 0, 5, 80, 60);
                this.abilidades = new Abilidade("", 25, 0, 0, 0, 60);
            }
            else if (aleat > 50 && aleat <= 100) {
                this.nome = "Drag\u00e3o Filhote";
                this.status = new Status(100, 0, 0, 0, 0, 5, 70, 55);
                this.abilidades = new Abilidade("", 30, 0, 0, 0, 50);
            }
        }
        else if (andar == 5 && boss) {
            this.nome = "Drag\u00e3o";
            this.status = new Status(1000, 0, 0, 0, 0, 7, 800, 400);
            this.abilidades = new Abilidade("", 60, 0, 0, 0, 20);
        }
        else if (andar == 6 && !boss) {
            if (aleat >= 0 && aleat <= 50) {
                this.nome = "Magus";
                this.status = new Status(120, 0, 0, 0, 0, 6, 85, 65);
                this.abilidades = new Abilidade("", 30, 0, 0, 0, 90);
            }
            else if (aleat > 50 && aleat <= 100) {
                this.nome = "Horror";
                this.status = new Status(80, 0, 0, 0, 0, 6, 90, 60);
                this.abilidades = new Abilidade("", 35, 0, 0, 0, 90);
            }
        }
        else if (andar == 6 && boss) {
            this.nome = "Alien";
            this.status = new Status(300, 0, 0, 0, 0, 8, 800, 400);
            this.abilidades = new Abilidade("", 60, 0, 0, 0, 20);
        }
        else if (andar == 7 && !boss) {
            if (aleat >= 0 && aleat <= 50) {
                this.nome = "Magus";
                this.status = new Status(120, 0, 0, 0, 0, 6, 85, 65);
                this.abilidades = new Abilidade("", 30, 0, 0, 0, 90);
            }
            else if (aleat > 50 && aleat <= 100) {
                this.nome = "Horror";
                this.status = new Status(80, 0, 0, 0, 0, 6, 90, 60);
                this.abilidades = new Abilidade("", 35, 0, 0, 0, 90);
            }
        }
        else if (andar == 7 && boss) {
            this.nome = "Alien";
            this.status = new Status(1, 0, 0, 0, 0, 8, 800, 400);
            this.abilidades = new Abilidade("", 60, 0, 0, 0, 20);
        }
        else if (andar == 8 && !boss) {
            if (aleat >= 0 && aleat <= 50) {
                this.nome = "Magus";
                this.status = new Status(120, 0, 0, 0, 0, 6, 85, 65);
                this.abilidades = new Abilidade("", 30, 0, 0, 0, 90);
            }
            else if (aleat > 50 && aleat <= 100) {
                this.nome = "Horror";
                this.status = new Status(80, 0, 0, 0, 0, 6, 90, 60);
                this.abilidades = new Abilidade("", 35, 0, 0, 0, 90);
            }
        }
        else if (andar == 8 && boss) {
            this.nome = "Alien";
            this.status = new Status(1, 0, 0, 0, 0, 8, 800, 400);
            this.abilidades = new Abilidade("", 60, 0, 0, 0, 20);
        }
        else if (andar == 9 && !boss) {
            if (aleat >= 0 && aleat <= 50) {
                this.nome = "Magus";
                this.status = new Status(120, 0, 0, 0, 0, 6, 85, 65);
                this.abilidades = new Abilidade("", 30, 0, 0, 0, 90);
            }
            else if (aleat > 50 && aleat <= 100) {
                this.nome = "Horror";
                this.status = new Status(80, 0, 0, 0, 0, 6, 90, 60);
                this.abilidades = new Abilidade("", 35, 0, 0, 0, 90);
            }
        }
        else if (andar == 9 && boss) {
            this.nome = "Alien";
            this.status = new Status(1, 0, 0, 0, 0, 8, 800, 400);
            this.abilidades = new Abilidade("", 60, 0, 0, 0, 20);
        }
        else if (andar == 10 && !boss) {
            if (aleat >= 0 && aleat <= 50) {
                this.nome = "Magus";
                this.status = new Status(120, 0, 0, 0, 0, 6, 85, 65);
                this.abilidades = new Abilidade("", 30, 0, 0, 0, 90);
            }
            else if (aleat > 50 && aleat <= 100) {
                this.nome = "Horror";
                this.status = new Status(80, 0, 0, 0, 0, 6, 90, 60);
                this.abilidades = new Abilidade("", 35, 0, 0, 0, 90);
            }
        }
        else if (andar == 10 && boss) {
            this.nome = "Alien";
            this.status = new Status(1, 0, 0, 0, 0, 8, 800, 400);
            this.abilidades = new Abilidade("", 60, 0, 0, 0, 20);
        }
    }
}
