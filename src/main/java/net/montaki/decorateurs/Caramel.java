package net.montaki.decorateurs;

import net.montaki.composants.Boisson;

public class Caramel extends Decorateur {

    public Caramel(Boisson boisson) {
        super(boisson);
    }

    @Override
    public double cout() {
        return 1.5 + boisson.cout();
    }

    @Override
    public String getDescription() {
        return boisson.getDescription() + ", Au caramel";
    }
}
