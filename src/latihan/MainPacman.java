import java.util.Scanner;
public class MainPacman {
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        Pacman p = new Pacman();
        int makananX = (int) Math.ceil(Math.random()*10), makananY = (int) Math.ceil(Math.random()*10);
        int banyakLangkah = 100;
        int banyakMakanan = 15;
        p.setPosisiX(2);
        p.setPosisiY(2);
        p.setSisaLangkah(banyakLangkah);
        for(int i=1;i<=10;i++){
                for(int j=1;j<=10;j++){
                    while(makananY==1||makananY==10||makananX==1||makananX==10||(makananY==3&&(makananX==2||makananX==6||makananX==7||makananX==8||makananX==9))||(makananY==5&&(makananX==2||makananX==6))||(makananY==6&&(makananX==6||makananX==7||makananX==8||makananX==9))||(makananY==7&&(makananX==8)||(makananY==8&&(makananX==4||makananX==5))||(makananY==9&&(makananX==5||makananX==6)))){
                        makananX = (int) Math.ceil(Math.random()*10);makananY = (int) Math.ceil(Math.random()*10);
                    }
                    if(i==1||i==10||j==1||j==10||(i==3&&(j==2||j==6||j==7||j==8||j==9))||(i==5&&(j==2||j==6))||(i==6&&(j==6||j==7||j==8||j==9))||(i==7&&(j==8)||(i==8&&(j==4||j==5))||(i==9&&(j==5||j==6))))
                        System.out.print("#");
                    else if(i==2&&j==2)
                        System.out.print("@");
                    else if(i==makananY&&j==makananX)
                        System.out.print(".");
                    else
                        System.out.print(" ");
                }
                System.out.println();
            }
        while(p.getSisaLangkah()>0){
            System.out.println("Masukkan arah : ");
            String arah = in.next();
            p.getPosisiX(arah);
            p.getPosisiY(arah);
            for(int i=1;i<=10;i++){
                for(int j=1;j<=10;j++){
                    if(p.getPosisiY(arah)==1||p.getPosisiY(arah)==10||p.getPosisiX(arah)==1||p.getPosisiX(arah)==10||(p.getPosisiY(arah)==3&&(p.getPosisiX(arah)==2||p.getPosisiX(arah)==6||p.getPosisiX(arah)==7||p.getPosisiX(arah)==8||p.getPosisiX(arah)==9))||(p.getPosisiY(arah)==5&&(p.getPosisiX(arah)==2||p.getPosisiX(arah)==6))||(p.getPosisiY(arah)==6&&(p.getPosisiX(arah)==6||p.getPosisiX(arah)==7||p.getPosisiX(arah)==8||p.getPosisiX(arah)==9))||(p.getPosisiY(arah)==7&&(p.getPosisiX(arah)==8)||(p.getPosisiY(arah)==8&&(p.getPosisiX(arah)==4||p.getPosisiX(arah)==5))||(p.getPosisiY(arah)==9&&(p.getPosisiX(arah)==5||p.getPosisiX(arah)==6))))
                        arah = "q";
                    while(makananY==1||makananY==10||makananX==1||makananX==10||(makananY==3&&(makananX==2||makananX==6||makananX==7||makananX==8||makananX==9))||(makananY==5&&(makananX==2||makananX==6))||(makananY==6&&(makananX==6||makananX==7||makananX==8||makananX==9))||(makananY==7&&(makananX==8)||(makananY==8&&(makananX==4||makananX==5))||(makananY==9&&(makananX==5||makananX==6)))){
                        makananX = (int) Math.ceil(Math.random()*10);makananY = (int) Math.ceil(Math.random()*10);
                    }
                    if(makananX==p.getPosisiX(arah)&&makananY==p.getPosisiY(arah)){
                        makananX = (int) Math.ceil(Math.random()*10);makananY = (int) Math.ceil(Math.random()*10);banyakMakanan=banyakMakanan-1;p.poinBaru();
                    }
                    if(i==1||i==10||j==1||j==10||(i==3&&(j==2||j==6||j==7||j==8||j==9))||(i==5&&(j==2||j==6))||(i==6&&(j==6||j==7||j==8||j==9))||(i==7&&(j==8)||(i==8&&(j==4||j==5))||(i==9&&(j==5||j==6))))
                        System.out.print("#");
                    else if(i==p.getPosisiY(arah)&&j==p.getPosisiX(arah))
                        System.out.print("@");                
                    else if(i==makananY&&j==makananX&&banyakMakanan!=0)
                        System.out.print(".");
                    else
                        System.out.print(" ");
                }
                System.out.println();
            }
            p.getPosisiBaruX(arah);
            p.getPosisiBaruY(arah);
            p.getSisaLangkahBaru(arah);
            System.out.println("Sisa Langkah Anda : "+p.getSisaLangkah());
            System.out.println("Sisa Makanan : "+banyakMakanan);
            System.out.println("Poin Anda Saat Ini : "+p.getPoin());
            if(banyakMakanan==0){
                System.out.println("YOU WIN");
                System.out.println("Total Poin Anda : "+p.getPoin());break;
            }
            if(p.getSisaLangkah()==0){
                System.out.println("YOU LOOSE");
            }
        }
    }
}