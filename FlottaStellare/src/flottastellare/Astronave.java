/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package flottastellare;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author paolucci.sara
 */
public class Astronave {
    private int stato;
    private String nome;
    private ArrayList <Membro> membri = new ArrayList();
    private ArrayList <Modulo> moduli = new ArrayList();
    
    Random random = new Random();
    
    public Astronave(String n){
        this.nome = n;
        this.stato = 100;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void alieniAbordo(){
        stato -= 20;
        int i = random.nextInt(membri.size());
        membri.get(i).setSalute(20);
    }
    
    public void aggiungiMembro(Membro m){
        if(m != null && membri.contains(m) == false){
            membri.add(m);
        }
    }
    
    public void eliminaMembro(Membro m){
        if(m != null && membri.contains(m) == true){
            membri.remove(m);
        }
    }
    
    public void aggiungiModulo(Modulo m){
        if(m != null && moduli.contains(m) == false){
            moduli.add(m);
        }
    }
    
    public void eliminaModulo(Modulo m){
        if(m != null && moduli.contains(m) == true){
            moduli.remove(m);
        }
    }
}
