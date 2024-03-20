package travel;

public class HotelService {
    Hotel[] rooms = new Hotel[10]; 

    void tambah(Hotel h) {
        boolean isFull = false;
     for (int i = 0; i < rooms.length; i++) {
        isFull = rooms[i] != null;
         if (rooms[i] == null) {
             rooms[i] = h;
             break;
         }else{
                isFull = true;
         }
     }

        if (isFull) {
            System.out.println("Data sudah penuh!");
        }
    }

    void tampilAll() {
        for (Hotel h : rooms) {
            if (h != null) {
                System.out.println("Nama: " + h.nama);
                System.out.println("Kota: " + h.kota);
                System.out.println("Harga: " + h.harga);
                System.out.println("Bintang: " + Double.toString(h.bintang));
                System.out.println("--------------------");
            }
        }
    }

    void selectionSort(String filterBy) {
        if (filterBy == "harga") {
            for (int i = 0; i < rooms.length - 1; i++) {
                int idxMin = i;
                for (int j = i + 1; j < rooms.length; j++) {
                    if (rooms[j].harga < rooms[idxMin].harga) {
                        idxMin = j;
                    }
                }
                Hotel temp = rooms[idxMin];
                rooms[idxMin] = rooms[i];
                rooms[i] = temp;
            }
        } else if (filterBy == "bintang") {
            for (int i = 0; i < rooms.length - 1; i++) {
                int idxMin = i;
                for (int j = i + 1; j < rooms.length; j++) {
                    if (rooms[j].bintang < rooms[idxMin].bintang) {
                        idxMin = j;
                    }
                }
            }
        }
    }

    void bubbleSort(String filterBy) {
        if (filterBy == "harga") {
            for (int i = 0; i < rooms.length - 1; i++) {
                for (int j = 1; j < rooms.length - i; j++) {
                    if (rooms[j].harga < rooms[j - 1].harga) {
                        Hotel temp = rooms[j];
                        rooms[j] = rooms[j - 1];
                        rooms[j - 1] = temp;
                    }
                }
            }
        } else if (filterBy == "bintang") {
            for (int i = 0; i < rooms.length - 1; i++) {
                for (int j = 1; j < rooms.length - i; j++) {
                    if (rooms[j].bintang > rooms[j - 1].bintang) {
                        Hotel temp = rooms[j];
                        rooms[j] = rooms[j - 1];
                        rooms[j - 1] = temp;
                    }
                }
            }
        }
    }


    public static void main(String[] args) {
        
        HotelService hs = new HotelService();

        hs.tambah(new Hotel("Hotel B", "Jakarta", 2000000, 4.0));
        hs.tambah(new Hotel("Hotel C", "Jakarta", 3000000, 3.5));
        hs.tambah(new Hotel("Hotel F", "Jakarta", 6000000, 2.0));
        hs.tambah(new Hotel("Hotel D", "Jakarta", 4000000, 3.0));
        hs.tambah(new Hotel("Hotel A", "Jakarta", 1000000, 4.5));
        hs.tambah(new Hotel("Hotel J", "Jakarta", 10000000, 0.0));
        hs.tambah(new Hotel("Hotel E", "Jakarta", 5000000, 2.5));
        hs.tambah(new Hotel("Hotel G", "Jakarta", 7000000, 1.5));
        hs.tambah(new Hotel("Hotel I", "Jakarta", 9000000, 0.5));
        hs.tambah(new Hotel("Hotel H", "Jakarta", 8000000, 1.0));

        hs.tampilAll();

        System.out.println("Setelah diurutkan by harga");

        hs.selectionSort("harga");
        hs.tampilAll();

        System.out.println("Setelah diurutkan by bintang");

        hs.selectionSort("bintang");
        hs.tampilAll();


    }
}
    