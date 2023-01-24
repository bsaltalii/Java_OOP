public class television {

    private int kanal;
    private int sesSeviyesi;
    boolean acik;

    public void ac(){
        System.out.println("Televizyon açılıyor...");
        acik=true;
    }
    public void setsesSeviyesi(int sesSeviyesi) {
        if (acik && sesSeviyesi>0 && sesSeviyesi<20)
            this.sesSeviyesi = sesSeviyesi;
        else
            System.out.println("Lütfen 0-20 arasında bir ses seviyesi giriniz..");
    }
    public void setKanal(int kanal){
        if (acik && kanal<500&&kanal>0)
            this.kanal=kanal;
        else
            System.out.println("Lütfen 0-500 arasında bir kanal giriniz..");
    }
    public void kapat(){
        System.out.println("Televizyon kapanıyor..");
        acik=false;
    }
    public void goster(){
        System.out.println("Kanal : "+kanal+" Ses seviyesi : "+sesSeviyesi+ " Açık mı : " + (acik ? "açık" : "kapalı"));
    }
}
