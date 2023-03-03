package entita;

public abstract class Personaggio {
    protected String nome;
    protected int[] specialita = new int[6];      //forza, destrezza, costituzione, intelligenza, saggezza, carisma
    protected int hp_max;
    protected int hp_attuali;
    //array di oggetti


    protected Personaggio(String nome) {
        this.nome = nome;
    }
}