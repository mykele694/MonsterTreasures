package entita.interfacce;

import entita.enums.TipoRazza;

public interface Razza {
    //forza, destrezza, costituzione, intelligenza, saggezza, carisma
    int[] nano = new int[]{0, 0, 2, 0, 0, 0};
    int[] elfo = new int[]{0, 2, 0, 0, 0, 0};
    int[] gnomo = new int[]{0, 0, 0, 2, 0, 0};
    int[] umano = new int[]{0, 0, 0, 0, 1, 0};
    int[] mezzo_demone = new int[]{0, 0, 0, 1, 0, 2};
    int[] saiyan = new int[]{3, 0, 0, 0, 0, 0};

    void settaValoriRazza(TipoRazza razza);
}