package net.montaki.decorateurs;

import net.montaki.composants.Boisson;

public abstract class Decorateur extends Boisson{
    protected Boisson boisson;

    public Decorateur(Boisson boisson) {
        this.boisson = boisson;
    }

    @Override
    public abstract String getDescription();
}