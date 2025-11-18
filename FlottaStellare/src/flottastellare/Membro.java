/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package flottastellare;

/**
 *
 * @author paolucci.sara
 */
public class Membro {
    private String nome, ruolo;
    private int salute;
    private Astronave astronave;
    private boolean stato;
    
    public Membro(String n, String r){
        this.nome = n;
        this.ruolo = r;
        this.salute = 100;
        this.stato = true;
    }
    
    public void setAstronave(Astronave a){
        this.astronave = a;
    }
    
    public int getSalute(){
        return this.salute;
    }
    
    public void setStato(boolean s){
        this.stato = s;
    }
    
    public String getAstronave(){
        return this.astronave.getNome();
    }
    
    public void cure(){
        this.salute = 100;
        this.stato = true;
    }
    
    public void alieniAbordo(){
        if(ruolo.equals("ingegnere")){
            salute -= 30;
        }
        else if(ruolo.equals("pilota")){
            salute -= 50;
        }
    }
    
}
