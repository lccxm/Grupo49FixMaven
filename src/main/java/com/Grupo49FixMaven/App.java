package com.Grupo49FixMaven;

import java.io.IOException;
g
public class App {

    public static void main(String[] args) throws IOException {
        new Veiculo("IMHAHSHHSJHSJHA", "Gol", "vermelha", "LUXO");
        PersistenciaVeiculos pv = new PersistenciaVeiculos();
        pv.carregaVeiculos();
        pv.persisteVeiculos();

    }
}
