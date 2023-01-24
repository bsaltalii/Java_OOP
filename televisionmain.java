import java.util.Scanner;

public class televisionmain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        television tv = new television();
        int islem=-1;

        while (islem != 5) {
            System.out.println(" 1-TV AÇ  \n 2-KANAL DEĞİŞTİR \n 3-SES SEVİYESİ AYARLA \n 4-TV KAPAT \n 5-UYGULAMADAN ÇIK");
            System.out.print("Yapmak istediğiniz işlemi seçiniz : ");
            islem = scanner.nextInt();

            switch (islem) {
                case 1:
                    tv.ac();
                    break;
                case 2:
                    if (tv.acik){
                        System.out.print("Kanal sayısı giriniz (0-500) : ");
                        tv.setKanal(scanner.nextInt());
                        break;
                    }else
                        System.out.println("Lütfen önce televizyonu açınız..");
                    break;
                case 3:
                    if (tv.acik){
                        System.out.print("Ses seviyesi giriniz (0-20) : ");
                        tv.setsesSeviyesi(scanner.nextInt());
                        break;
                    }else
                        System.out.println("Lütfen önce televizyonu açınız..");
                    break;
                case 4:
                    if (tv.acik)
                        tv.kapat();
                    else
                        System.out.println("Televizyon zaten kapalı!");
                    break;
            }
            if (islem!=4 && tv.acik){
                tv.goster();
            }
            System.out.println();
        }
    }
}
