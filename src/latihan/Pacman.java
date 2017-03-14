public class Pacman {
    private int posisiX, posisiY, poin, sisaLangkah;
    public void setPosisiX(int posisiX){
        this.posisiX = posisiX;
    }
    public int getPosisiX(String arah){
        if(arah.equalsIgnoreCase("d"))
            return posisiX+1;
        else if(arah.equalsIgnoreCase("a"))
            return posisiX-1;
        else
            return posisiX;
    }
    public void getPosisiBaruX(String arah){
        posisiX=getPosisiX(arah);
    }
    public void setPosisiY(int posisiY){
        this.posisiY = posisiY;
    }
    public int getPosisiY(String arah){
        if(arah.equalsIgnoreCase("w"))
            return posisiY-1;
        else if (arah.equalsIgnoreCase("s"))
            return posisiY+1;
        else
            return posisiY;
    }
    public void getPosisiBaruY(String arah){
        posisiY=getPosisiY(arah);
    }
    public void setPoin(){
        this.poin = 0;
    }
    public int getPoin(){
        return poin;
    }
    public void poinBaru(){
        poin=poin+1;
    }
    public void setSisaLangkah(int sisaLangkah){
        this.sisaLangkah = sisaLangkah;
    }
    public int getSisaLangkah(){
        return sisaLangkah;
    }
    public void getSisaLangkahBaru(String a){
        if(a.equalsIgnoreCase("w")||a.equalsIgnoreCase("s")||a.equalsIgnoreCase("a")||a.equalsIgnoreCase("d"))
            sisaLangkah = sisaLangkah-1;
    }
}