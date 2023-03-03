package entita;

import entita.enums.TipoClasse;
import entita.enums.TipoRazza;
import entita.interfacce.Classe;
import entita.interfacce.Razza;

public class Giocatore extends Personaggio implements Razza, Classe {
    private TipoRazza razza;
    private TipoClasse classe;
    private int livello_exp = 0;
    private int exp = 0;

    public Giocatore(String nome, TipoRazza razza, TipoClasse classe) {
        super(nome);
        this.razza = razza;
        this.classe = classe;
    }

    @Override
    public void settaValoriClasse(TipoClasse classe) {
        for (int i=0; i<super.specialita.length; i++)
            switch (classe) {
                case LADRO -> super.specialita[i] += ladro[i];
                case MAGO -> super.specialita[i] += mago[i];
                case GUERRIERO -> super.specialita[i] += guerriero[i];
                case BARBARO -> super.specialita[i] += barbaro[i];
                case DRUIDO -> super.specialita[i] += druido[i];
                case CHIERICO -> super.specialita[i] += chierico[i];
            }

//        super.hp_max =
    }

    @Override
    public void settaValoriRazza(TipoRazza razza) {

    }
}