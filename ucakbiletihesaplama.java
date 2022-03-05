import java.util.Scanner;
public class ucakbiletihesaplama {
    public static void main(String[] args) {
        int distance, age, choose;
        Scanner input = new Scanner(System.in);

        System.out.print("Mesafeyi km türünden yazınız : ");
        distance = input.nextInt();
        if (distance > 0) {

            System.out.print("Yaşınızı giriniz : ");
            age = input.nextInt();
            if ((age > 0) && (age < 130)) {

                System.out.print("Yolculuk tipini seçiniz");
                choose = input.nextInt();

                double tutar = distance * 0.1;


                if (choose == 1) {
                    if (age < 12) {
                        double aindirim = tutar * 0.5;
                        System.out.print("Toplam Tutar : " + aindirim);

                    } else if (age > 65) {
                        double bindirim = tutar * 0.7;
                        System.out.print("Toplam Tutar : " + bindirim);

                    } else if ((age>=12)&& (age<=24)) {
                        double cindirim = tutar * 0.9;
                        System.out.print("Toplam Tutar : " + cindirim);
                    }else{
                        System.out.print("Toplam Tutar : " + tutar);
                    }

                } else if (choose == 2) {
                    double itutar = tutar * 0.8 * 2;
                    if (age < 12) {
                        double aindirim = itutar * 0.5;
                        System.out.print("Toplam Tutar : " + aindirim);

                    } else if (age > 65) {
                        double bindirim = itutar * 0.7;
                        System.out.print("Toplam Tutar : " + bindirim);

                    } else if ((age>=12)&& (age<=24)) {
                        double cindirim = itutar * 0.9;
                        System.out.print("Toplam Tutar : " + cindirim);
                    }else{
                        System.out.print("Toplam Tutar : " + itutar);
                    }
                } else {
                    System.out.println("YOlculuk tipini 1 veya 2 olarak seçmelisiniz");
                }
            }else{
                System.out.println("saçma bir yaş değeri girdiniz");
            }

            } else {
                System.out.println("0dan büyük bir mesafe seçmelisiniz");
            }
        }
    }

