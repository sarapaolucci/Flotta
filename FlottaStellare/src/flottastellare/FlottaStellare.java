/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package flottastellare;

/**
 *
 * @author paolucci.sara
 */
public class FlottaStellare {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Flotta f = new Flotta();
        Astronave a1 = new Astronave("Biennio");
        Astronave a2 = new Astronave("Triennio");
        Astronave a3 = new Astronave("3Q");
        f.aggiungiAstronave(a1);
        f.aggiungiAstronave(a2);
        Membro m1 = new Membro("Annalisa", Ruoli.SOLDATO);
        Membro m2 = new Membro("Gabriella", Ruoli.PILOTA);
        Membro m3 = new Membro("Valeria", Ruoli.INGEGNERE);
        Membro m4 = new Membro("Daniela", Ruoli.MEDICO);
        Membro m5 = new Membro("Lilla", Ruoli.INGEGNERE);
        Membro m6 = new Membro("Antonio", Ruoli.SOLDATO);
        Membro m7 = new Membro("Roberta", Ruoli.CUOCO);
        Membro m8 = new Membro("Milena", Ruoli.MEDICO);
        
        Membro m9 = new Membro("Tommaso", Ruoli.PILOTA);
        Membro m10 = new Membro("Filippo", Ruoli.INGEGNERE);
        Membro m11 = new Membro("Manuele", Ruoli.SOLDATO);
        Membro m12 = new Membro("Marta", Ruoli.CUOCO);
        
        Membro m13 = new Membro("Engi", Ruoli.SOLDATO);
        Membro m14 = new Membro("Elana", Ruoli.PILOTA);
        Membro m15 = new Membro("Sarap", Ruoli.CUOCO);
        
        a1.aggiungiMembro(m1);
        a1.aggiungiMembro(m2);
        a1.aggiungiMembro(m3);
        a1.aggiungiMembro(m4);
        a1.aggiungiMembro(m5);
        a1.aggiungiMembro(m6);
        a1.aggiungiMembro(m7);
        a1.aggiungiMembro(m8);
        
        a2.aggiungiMembro(m9);
        a2.aggiungiMembro(m10);
        a2.aggiungiMembro(m11);
        a2.aggiungiMembro(m12);
        
        a3.aggiungiMembro(m13);
        a3.aggiungiMembro(m14);
        a3.aggiungiMembro(m15);
    }
    
}
