package com.pbo.sesi9.no1;

/**
 *
 * @author jembar
 */
public class Mahasiswa<A,B,C>{
    private A nim;
    private B name;
    private C clas;

    public A getNim(){
        return nim;
    }

    public void setNim(A nim){
        this.nim=nim;
    }

    public B getName(){
        return this.name;
    }

    public void setName(B name){
        this.name=name;
    }

    public C getClas(){
        return clas;
    }

    public void setClas(C clas){
        this.clas=clas;
    } 
    
}
    

