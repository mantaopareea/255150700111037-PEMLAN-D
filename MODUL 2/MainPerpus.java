public class MainPerpus {
    public static void main(String[] args) {

        // Penulis
        Penulis p1 = new Penulis("Ahmad", "Indonesia");
        Penulis p2 = new Penulis("Siti", "Malaysia");
        Penulis p3 = new Penulis("John", "USA");

        Buku buku1 = new Buku("Belajar Java", 2023, p1, "Buku ini menjelaskan dasar pemrograman java untuk pemula secara mudah dan praktis");
        Buku buku2 = new Buku("Belajar Java", 2023, p1, "Buku ini menjelaskan dasar pemrograman java untuk pemula secara mudah dan praktis");

        buku1.display();

        double hasil = buku1.cekKesamaan(buku2);
        System.out.println("Tingkat kesamaan: " + hasil + "%");       
        Buku bukuCopy = buku1.copy();

        System.out.println("\nData buku hasil copy:");
        bukuCopy.display();

        // ================== TEKNOLOGI ==================
        Kategori teknologi = new Kategori("Teknologi",
                new Buku("Teknologi 1", 2021, p1,
                        "Buku ini membahas perkembangan teknologi komputer dan penerapannya dalam kehidupan manusia modern"),
                new Buku("Teknologi 2", 2022, p1,
                        "Penjelasan mengenai sistem informasi jaringan komputer dan teknologi digital masa kini"),
                new Buku("Teknologi 3", 2023, p1,
                        "Materi dasar pemrograman komputer untuk mahasiswa yang baru belajar teknologi informasi"),
                new Buku("Teknologi 4", 2024, p1,
                        "Pembahasan tentang keamanan sistem jaringan komputer serta perlindungan data digital"),
                new Buku("Teknologi 5", 2025, p1,
                        "Inovasi teknologi terbaru yang membantu manusia dalam berbagai bidang pekerjaan")
        );

        // ================== FILSAFAT ==================
        Kategori filsafat = new Kategori("Filsafat",
                new Buku("Filsafat 1", 2016, p2,
                        "Buku ini membahas pemikiran para filsuf klasik tentang makna kehidupan manusia"),
                new Buku("Filsafat 2", 2017, p2,
                        "Penjelasan konsep etika moral dan nilai kehidupan dalam sudut pandang filsafat"),
                new Buku("Filsafat 3", 2018, p2,
                        "Pembahasan mengenai logika berpikir manusia dalam memahami berbagai fenomena kehidupan"),
                new Buku("Filsafat 4", 2019, p2,
                        "Kajian tentang filsafat ilmu serta hubungan antara ilmu pengetahuan dan kebenaran"),
                new Buku("Filsafat 5", 2020, p2,
                        "Pemikiran modern mengenai eksistensi manusia dalam kehidupan sosial masyarakat")
        );

        // ================== SEJARAH ==================
        Kategori sejarah = new Kategori("Sejarah",
                new Buku("Sejarah 1", 2011, p3,
                        "Buku ini menceritakan perkembangan peradaban manusia dari masa kuno hingga modern"),
                new Buku("Sejarah 2", 2012, p3,
                        "Penjelasan tentang berbagai peristiwa penting yang membentuk sejarah dunia"),
                new Buku("Sejarah 3", 2013, p3,
                        "Kisah perjuangan bangsa dalam mempertahankan kemerdekaan dari penjajahan asing"),
                new Buku("Sejarah 4", 2014, p3,
                        "Pembahasan mengenai tokoh tokoh penting yang mempengaruhi perjalanan sejarah"),
                new Buku("Sejarah 5", 2015, p3,
                        "Perjalanan perkembangan budaya dan masyarakat dalam catatan sejarah dunia")
        );

        // ================== AGAMA ==================
        Kategori agama = new Kategori("Agama",
                new Buku("Agama 1", 2006, p1,
                        "Buku ini membahas nilai nilai moral dan spiritual dalam kehidupan manusia"),
                new Buku("Agama 2", 2007, p1,
                        "Penjelasan mengenai ajaran agama tentang kebaikan dan hubungan manusia dengan Tuhan"),
                new Buku("Agama 3", 2008, p1,
                        "Pembelajaran tentang pentingnya toleransi dan kehidupan damai antar umat beragama"),
                new Buku("Agama 4", 2009, p1,
                        "Kajian mendalam mengenai ajaran agama dalam membentuk karakter manusia"),
                new Buku("Agama 5", 2010, p1,
                        "Penjelasan mengenai nilai nilai spiritual yang membimbing kehidupan manusia")
        );

        // ================== PSIKOLOGI ==================
        Kategori psikologi = new Kategori("Psikologi",
                new Buku("Psikologi 1", 2018, p2,
                        "Buku ini membahas perilaku manusia serta proses berpikir dalam kehidupan sehari hari"),
                new Buku("Psikologi 2", 2019, p2,
                        "Penjelasan mengenai perkembangan kepribadian manusia dari masa anak hingga dewasa"),
                new Buku("Psikologi 3", 2020, p2,
                        "Pembahasan tentang emosi motivasi dan pengaruh lingkungan terhadap perilaku manusia"),
                new Buku("Psikologi 4", 2021, p2,
                        "Kajian mengenai kesehatan mental serta cara menjaga keseimbangan pikiran"),
                new Buku("Psikologi 5", 2022, p2,
                        "Penjelasan tentang hubungan sosial manusia dalam kehidupan masyarakat modern")
        );


        // ================== POLITIK ==================
        Kategori politik = new Kategori("Politik",
                new Buku("Politik 1", 2013, p3,
                        "Buku ini membahas sistem pemerintahan dan proses pengambilan keputusan politik"),
                new Buku("Politik 2", 2014, p3,
                        "Penjelasan mengenai peran partai politik dalam sistem demokrasi modern"),
                new Buku("Politik 3", 2015, p3,
                        "Kajian tentang hubungan kekuasaan politik dengan masyarakat dan negara"),
                new Buku("Politik 4", 2016, p3,
                        "Pembahasan mengenai kebijakan publik serta dampaknya bagi kehidupan masyarakat"),
                new Buku("Politik 5", 2017, p3,
                        "Penjelasan mengenai dinamika politik global dalam hubungan antar negara")
        );

        // ================== FIKSI ==================
        Kategori fiksi = new Kategori("Fiksi",
                new Buku("Fiksi 1", 2021, p1,
                        "Cerita petualangan seorang pemuda yang mencari makna kehidupan di dunia"),
                new Buku("Fiksi 2", 2022, p2,
                        "Kisah persahabatan yang menghadapi berbagai rintangan dalam perjalanan hidup"),
                new Buku("Fiksi 3", 2023, p3,
                        "Cerita misteri yang penuh teka teki dan rahasia masa lalu"),
                new Buku("Fiksi 4", 2024, p1,
                        "Novel romantis tentang cinta pengorbanan dan harapan masa depan"),
                new Buku("Fiksi 5", 2025, p2,
                        "Cerita fantasi mengenai dunia lain dengan makhluk dan petualangan menegangkan")
        );


        teknologi.display();
        filsafat.display();
        sejarah.display();
        agama.display();
        psikologi.display();
        politik.display();
        fiksi.display();
    }
}