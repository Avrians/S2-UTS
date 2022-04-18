import java.util.ArrayList;
import java.util.Scanner;

import model.modelIG;

public class Instagram{

    public static void menu () {
            System.out.println("Menu Utama ");
            System.out.println("1. Like Postingan ");
            System.out.println("2. Tambahkan Komentar");
            System.out.println("3. Share to ");
            System.out.println("4. Postingan disimpan");
            System.out.println("5. Kirim Pesan");
            System.out.println("6. Exit");
            System.out.println("Pilih perintah : ");
    }
    public static  void main(String[] args) {

        modelIG[] post = new modelIG[3];
        post[0] = new modelIG();
        post[0].profile = "(>-<)";
        post[0].Username = "@arduino.cc";
        post[0].postingan = "foto 1";
        post[0].Caption="Sayembara Membuat Poster :)";
        post[0].pesan = "mau ikut dong";
        post[0].like =0;
        post[0].printpost();

        ArrayList Isikomen = new ArrayList<>();
        post[0].komentar= Isikomen;
        post[0].IsiKomentar("aku sedang uts");



        post[1] = new modelIG();
        post[1].profile = "(_))";
        post[1].Username = "@Avrians313";
        post[1].postingan = "foto 2";
        post[1].pesan = "jalan-jalan mulu";
        post[1].Caption="Jalan-jalan bersama Ayang";
        post[1].like =0;
        post[1].printpost();

        ArrayList Isikomen2 = new ArrayList<>();
        post[1].komentar= Isikomen2;
        post[1].IsiKomentar("jalan jalan mulu");

        System.out.println("INSTAGRAM");
        System.out.println("----------------------------------");
        System.out.println("\nPostingan 1");
        post[0].postKonten();

        System.out.println("\nPostingan 2");
        post[1].postKonten();



        Scanner inputdata = new Scanner(System.in);
        char pilihPost = 0;
        do {
            System.out.print("Pilih Postingan (1, 2): ");
            pilihPost = inputdata.next().charAt(0);
            switch (pilihPost) {
                case '1' ->{
                    post[0].postingan();
                    char pilihperintah = 0;
                    do{
                        menu();
                        
                        pilihperintah = inputdata.next().charAt(0);
                        switch (pilihperintah){
                            case '1' -> {
                                post[0].LikePostingan(1);
                                post[0].postingan();
                            }

                            case '2'->{
                                System.out.println("Tambahkan Komentar : ");
                                Scanner inputkomen = new Scanner(System.in);
                                String komentar = inputkomen.nextLine();
                                post[0].IsiKomentar(komentar);
                                post[0].postingan();
                            }
                            case '3'->{
                                System.out.println("Share to : ");
                                Scanner inputteman = new Scanner(System.in);
                                String namaTeman = inputteman.nextLine();

                                System.out.println("Dikirim ke: "+namaTeman);

                            }
                            case '4' ->{
                                System.out.println("Postingan disimpan");
                            }
                            case '5'->{
                                System.out.println("Direct Message: ");
                                Scanner pesandm = new Scanner(System.in);
                                String pesanig = pesandm.nextLine();

                                System.out.println(pesanig+" terkirim ");
                            }
                            case '6'->{
                                System.exit(3);
                            }
                            default ->{

                            }
                        }
                    }while (pilihperintah !='0');
                }
                case '2' ->{
                    post[1].postingan();
                    
                    char pilihperintah = 0;
                    do{
                        menu();
                        
                        pilihperintah = inputdata.next().charAt(0);
                        switch (pilihperintah){
                            case '1' -> {
                                post[0].LikePostingan(1);
                                post[0].postingan();
                            }

                            case '2'->{
                                System.out.println("Tambahkan Komentar : ");
                                Scanner inputkomen = new Scanner(System.in);
                                String komentar = inputkomen.nextLine();
                                post[0].IsiKomentar(komentar);
                                post[0].postingan();
                            }
                            case '3'->{
                                System.out.println("Share to : ");
                                Scanner inputteman = new Scanner(System.in);
                                String namaTeman = inputteman.nextLine();

                                System.out.println("Dikirim ke: "+namaTeman);

                            }
                            case '4' ->{
                                System.out.println("Postingan disimpan");
                            }
                            case '5'->{
                                System.out.println("Direct Message: ");
                                Scanner pesandm = new Scanner(System.in);
                                String pesanig = pesandm.nextLine();

                                System.out.println(pesanig+" terkirim ");
                            }
                            case '6'->{
                                System.exit(3);
                            }
                            default ->{

                            }
                        }
                    }while (pilihperintah !='0');
                }
                
                case '3' ->{
                    System.exit(3);
                }
            }
        }while (pilihPost != '0');






    }



}
