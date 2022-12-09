package com.mycompany.paradoxentertainment;

public class BigliettoFeriale extends Biglietto {
    float prezzoBase = 6.0F;
    
    public BigliettoFeriale(boolean isVIP, boolean isCategoriaProtetta, Proiezione proiezione) {
        super(isVIP, isCategoriaProtetta, proiezione);
        this.prezzoTot = prezzoBase;
        if(isVIP)
            prezzoTot += 1.0;
        if(isCategoriaProtetta)
            prezzoTot -= 2.0;
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return " - Costo: " + prezzoTot;
    }
}
