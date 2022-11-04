// 
// Decompiled by Procyon v0.5.36
// 

package view;

import javax.swing.JRadioButton;
import java.io.Serializable;

public class Celula implements Serializable
{
    private static final long serialVersionUID = 1L;
    JRadioButton button;
    Item item;
    
    public Celula(final JRadioButton button, final Item item) {
        this.button = button;
        this.item = item;
    }
}
