/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Miriam
 */
public class Radio {
    
    boolean pornit=false;
    int volum=0;
    String[] listaPosturi = {"Virgin Radio", "Radio ZU", "Chill FM", "Guerilla","Rock FM"};
    int volumMaxim;
    int postCurent=0;
    Radio (int maxvol){
        this.volumMaxim=maxvol;
    }
    public String porneste(){
        this.pornit=true;
        this.volum=1;
        return "Am pornit radioul, asculti "+this.listaPosturi[postCurent];
    }
    public String opreste(){
        this.pornit=false;
        this.volum=0;
        return "Am oprit radioul.";
    }
    public String daMaiTare(int nrTrepte){
        if(this.pornit==false)
        {
            return "Radioul este oprit, nu poti da mai tare";}
        else
            if(this.volum>(volumMaxim-nrTrepte)){
            return "Volumul este deja la maxim";}
            else{
            this.volum+=nrTrepte;
        return "Am dat la volumul "+this.volum;}
        
            
        }
        
    
    public String daMaiTare(){
       return this.daMaiTare(1);
            
    }
    public String daMaiIncet(int nrTrepte){
        if(this.pornit==false)
        {return "Radioul este oprit, nu poti da mai incet";}
        else
            if(this.volum<(0+nrTrepte)){
return "Volumul este deja la minim";
        }
else{
this.volum-=nrTrepte;
        return "Am dat la volumul "+this.volum;}
        
            
    }
    public String daMaiIncet(){
        return this.daMaiIncet(1);
    }
    
    public String postUrmator(){
        if(this.pornit==false){
            return "Radioul este oprit, nu putem schimba canalele";
        }else
        if(postCurent<listaPosturi.length-1){
            this.postCurent++;
            return "Asculti "+this.listaPosturi[postCurent];
        }
        else{
            this.postCurent=0;
            return "Asculti "+this.listaPosturi[postCurent];
        
        }
    }
    public String postPrecedent(){
        if(this.pornit==false){
            return "Radioul este oprit, nu putem schimba canalele";
        }else
        if(postCurent>0){
            this.postCurent--;
            return "Asculti "+this.listaPosturi[postCurent];
        }
        else{
            this.postCurent=listaPosturi.length-1;
            return "Asculti "+this.listaPosturi[postCurent];
        
        }
    }
    public String stare(){
        if(this.pornit==false){
            return "Radioul este oprit";
        }
        else{
            return "Radioul este dat pe "+ this.listaPosturi[postCurent] + " la volumul "+ this.volum;
        }
    }
    
}
