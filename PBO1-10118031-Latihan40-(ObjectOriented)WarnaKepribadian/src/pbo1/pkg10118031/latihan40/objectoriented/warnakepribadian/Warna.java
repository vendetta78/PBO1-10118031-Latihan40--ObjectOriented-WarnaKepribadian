package pbo1.pkg10118031.latihan40.objectoriented.warnakepribadian;

import java.util.Scanner;

/**
 *
 * @author Vendetta 
 * NAMA : RIZKI ARIA PUTRA 
 * KELAS : PBO1 
 * NIM : 10118031
 * Deskripsi Program : Program ini berisi program untuk menampilkan Warna Kepribadian
 */
public class Warna {

    public static final String RESET = "\33[0m";
    public static final String BLACK = "\33[30m";
    public static final String RED = "\33[31m";
    public static final String GREEN = "\33[32m";
    public static final String YELLOW = "\33[33m";
    public static final String BLUE2 = "\33[34m";
    public static final String PURPLE = "\33[35m";
    public static final String CYAN = "\33[36m";
    public static final String WHITE = "\33[37m";
    public static final String BLUE = "\33[34m";
    public static final String RED_BACKGROUND = "\33[41m";
    public static final String GREEN_BACKGROUND = "\33[42m";
    public static final String YELLOW_BACKGROUND = "\33[43m";
    public static final String BLUE_BACKGROUND = "\33[44m";
    public static final String PURPLE_BACKGROUND = "\33[45m";

    public String warnaMu;
    public String namaMu;

    public void ioWarnaMu() {
        Scanner scn = new Scanner(System.in);
        System.out.print(BLACK + "PILIH WARNA FAVORITMU : ");

        System.out.println(RED + "YUK " + GREEN + ("CEK ") + YELLOW
                + ("KEPRIBADIANMU ") + BLUE2 + ("DARI ") + PURPLE
                + ("WARNA ") + BLUE + ("FAVORITMU\n") + RESET);

        System.out.println(RED_BACKGROUND + WHITE + "\tMERAH\t\t");
        System.out.println(GREEN_BACKGROUND + WHITE + "\tHIJAU\t\t");
        System.out.println(YELLOW_BACKGROUND + WHITE + "\tKUNING\t\t");
        System.out.println(BLUE_BACKGROUND + WHITE + "\tBIRU\t\t");
        System.out.println(PURPLE_BACKGROUND + WHITE + "\tUNGU\t\t\n" + RESET);

        System.out.print(BLACK + "PILIH WARNA FAVORITMU : ");
        warnaMu = scn.next();
        System.out.print(BLACK + "NAMA KAMU : ");
        namaMu = scn.next();

        System.out.println("\n====HASIL TEST KEPRIBADIAN "
                + namaMu.toUpperCase() + "====");

        String warna = warnaMu.toUpperCase();

        System.out.print("Warna Favoritmu adalah");
        switch (warna) {
            case "MERAH":
                System.out.print(RED + " MERAH \n" + RESET);
                System.out.println("1. Periang,\n"
                        + "2. Pemberani,\n"
                        + "3. Berani mengambil risiko dalam setiap langkah,\n"
                        + "4. Menyukai tantangan,\n"
                        + "5. Kurang sabar,\n"
                        + "6. Dapat menahan marah namun jika sudah tahap puncak "
                        + "toleransi, kemarahannya akan sulit dikontrol,\n"
                        + "7. Memiliki energi kehangatan dan cinta."
                );
                break;
            case "HIJAU":
                System.out.print(GREEN + " HIJAU \n" + RESET);
                System.out.println("1. Romantis,\n"
                        + "2. Menyukai hal yang berbau alami dan keindahan,\n"
                        + "3. Teguh pada prinsip,\n"
                        + "4. Menginginkan kesempurnaan,\n"
                        + "5. Mudah cemburu,\n"
                        + "6. Mudah merasa iri,\n"
                        + "7. Menjunjung tinggi suatu nilai toleransi dan "
                        + "kepercayaan."
                );
                break;
            case "KUNING":
                System.out.print(YELLOW + " KUNING \n" + RESET);
                System.out.println("1. Optimis,\n"
                        + "2. Suka bergaul,\n"
                        + "3. Periang,\n"
                        + "4. Senang menolong,\n"
                        + "5. Lincah dan aktif,\n"
                        + "6. Tidak suka meremehkan kekurangan orang lain,\n"
                        + "7. Loyal,\n"
                        + "8. Hangat,\n"
                        + "9. Meskipun karakternya optimis dan idealis,"
                        + "seringkali goyah dan tidak stabil,\n"
                        + "10. Cenderung penakut."
                );
                break;
            case "BIRU":
                System.out.print(BLUE + " BIRU \n" + RESET);
                System.out.println("1. Menyenangkan,\n"
                        + "2. Bijaksana,\n"
                        + "3. Pembawaan diri tenang saat menghadapi masalah,\n"
                        + "4. Dinamis,\n"
                        + "5. Senang berbagi,\n"
                        + "6. Bersahabat,\n"
                        + "7. Tidak terlalu suka menjadi sorotan banyak orang,\n"
                        + "8. Menyembunyikan perasaan karena karakternya yang cenderung"
                        + "mencari jalan damai."
                );
                break;
            case "UNGU":
                System.out.print(PURPLE + " UNGU \n" + RESET);
                System.out.println("1. Optimis,\n"
                        + "2. TIdak pernah ragu,\n"
                        + "3. Menurutnya pasangan yang ideal adalah yang "
                        + "memiliki mental yang kuat,\n"
                        + "4. Memiliki ambisi yang besar,\n"
                        + "5. Memiliki empati yang besar,\n"
                        + "6. Memiliki sisi misterius sebab seringkali menutupi "
                        + "perasaannya,\n"
                        + "7. Terkadang bersikap keras kepala dan angkuh."
                );
                break;
            default:
                System.out.println(" EITSS.. Belum Terdefinisikan");
                break;

        }
    }
}
