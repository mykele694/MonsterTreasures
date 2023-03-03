package entita.interfacce;

import entita.enums.TipoClasse;

public interface Classe {
    //forza, destrezza, costituzione, intelligenza, saggezza, carisma, hp (da aggiungere agli hp_max)
    int[] ladro = new int[]{0, 2, 0, 0, 0, 2, 8};
    int[] mago = new int[]{0, 0, 0, 2, 2, 0, 6};
    int[] guerriero = new int[]{2, 0, 2, 0, 0, 0, 10};
    int[] barbaro = new int[]{2, 0, 2, 0, 0, 0, 12};
    int[] druido = new int[]{0, 0, 0, 2, 2, 0, 8};
    int[] chierico = new int[]{0, 0, 0, 0, 2, 2, 8};

    void settaValoriClasse(TipoClasse classe);
}