public class MainTest {
    public static void main(String[] args) {

        System.out.println("=== MANUSIA ===");

        Manusia m1 = new Manusia("Minji", "111", true, true);
        System.out.println(m1 + "\n");

        Manusia m2 = new Manusia("Hanni", "222", false, true);
        System.out.println(m2 + "\n");

        Manusia m3 = new Manusia("Danielle", "333", false, false);
        System.out.println(m3 + "\n");


        System.out.println("=== MAHASISWA FILKOM ===");

        MahasiswaFILKOM mf1 = new MahasiswaFILKOM(
                "225150200111001", 2.7, "Haerin", "444", false, false);
        System.out.println(mf1 + "\n");

        MahasiswaFILKOM mf2 = new MahasiswaFILKOM(
                "225150400111002", 3.2, "Hyein", "555", false, false);
        System.out.println(mf2 + "\n");

        MahasiswaFILKOM mf3 = new MahasiswaFILKOM(
                "225150300111003", 3.9, "Minji", "666", false, false);
        System.out.println(mf3 + "\n");

        System.out.println("=== PEKERJA ===");

        Pekerja p1 = new Pekerja(
                3000, 2024, 1, 1, 2,
                "Hanni", "777", false, true);
        System.out.println(p1 + "\n");

        Pekerja p2 = new Pekerja(
                4000, 2017, 1, 1, 0,
                "Danielle", "888", false, true);
        System.out.println(p2 + "\n");

        Pekerja p3 = new Pekerja(
                5000, 2006, 1, 1, 10,
                "Haerin", "999", false, true);
        System.out.println(p3 + "\n");


        System.out.println("=== MANAGER ===");

        Manager mgr = new Manager(
                "Creative", 7500, 2011, 1, 1, 3,
                "Hyein", "1010", false, true);
        System.out.println(mgr);
    }
}