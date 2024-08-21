package org.example;

public class PortoGrande extends BasePorto {

    @Override
    protected boolean atracarBarco(Barco b){
        if (b.getTamanho() >= 10) {
            return super.atracarBarco(b);
        } else {
            return false;
        }
    }
}
