package mergeShort;

import java.util.Scanner;

public class Pencarian {
    Buku listBk[] = new Buku[5];
    int idx;

    void tambah(Buku bk) {
        if (idx < listBk.length) {
            listBk[idx] = bk;
            idx++;
        } else {
            System.out.println("Data sudah penuh!");
        }
    }

    public int findSeqSearch(String cari) {
       int posisi = -1;

        for (int i = 0; i < listBk.length; i++) {
            if (listBk[i].kodeBuku.equals(cari)) {
                posisi = i;
                break;
            }
        }

        return posisi;

    }

    public int findBinarySearch(String cari, int left, int right) {
        int mid;
        if (right >= left) {
          mid = (left + right) / 2;
          // Membandingkan String dengan metode compareTo()
          if (listBk[mid].kodeBuku.compareTo(cari) == 0) {
            return mid;
          } else if (listBk[mid].kodeBuku.compareTo(cari) > 0) {
            return findBinarySearch(cari, left, mid - 1);
          } else {
            return findBinarySearch(cari, mid + 1, right);
          }
        }
        return -1;
      }

    public int findSeqSearchByJudul(String cari) {
        int foundIndex = -1;
        boolean multipleFound = false;
      
        for (int i = 0; i < listBk.length; i++) {
          if (listBk[i].judulBuku.equals(cari)) {
            if (foundIndex == -1) {
              foundIndex = i;
            } else {
              multipleFound = true;
              break; 
            }
          }
        }
      
        if (multipleFound) {
          System.out.println("Buku " + cari + " ada lebih dari satu di index berikut:");
          for (int i = 0; i < listBk.length; i++) {
            if (listBk[i].judulBuku.equals(cari)) {
              System.out.print(i + " ");
            }
          }
          System.out.println();
        } else if (foundIndex == -1) {
          System.out.println("Buku " + cari + " tidak ditemukan");
        } else {
          System.out.println("Buku " + cari + " ditemukan di index " + foundIndex);
        }
      
        return foundIndex;
      }
      
     public int findBinarySearchByJudul(String cari, int left, int right) {
        int foundIndex = -1;
      
        while (left <= right) {
          int mid = (left + right) / 2;
      
          if (listBk[mid].judulBuku.compareTo(cari) == 0) {
            foundIndex = mid;
            int temp = mid - 1;
      
            while (temp >= left && listBk[temp].judulBuku.equals(cari)) {
              foundIndex = temp;
              temp--;
            }

      
            break;
          } else if (listBk[mid].judulBuku.compareTo(cari) > 0) {
            right = mid - 1;
          } else {
            left = mid + 1;
          }
        }
      
        if (foundIndex == -1) {
          System.out.println("Buku " + cari + " tidak ditemukan");
        } else if (listBk[foundIndex].judulBuku.equals(cari)) {
          System.out.println("Buku " + cari + " ditemukan di index " + foundIndex);
        } else {
          System.out.println("Judul yang cocok tidak ditemukan (mungkin ada duplikat dengan judul berbeda)");
        }
      
        return foundIndex;
      }
      
  

    public void tampilPosisi(String x, int pos) {
        if (pos != -1) {
            System.out.println("data : " + x + " ditemukan pada indeks ke-" + pos);
        } else {
            System.out.println("data " + x + " tidak ditemukan");
        }
    }

    public void tampilData(String x, int pos) {
        if (pos != -1) {
            listBk[pos].tampilDataBuku();
        } else {
            System.out.println("data " + x + " tidak ditemukan");
        }
    }


    public void mergeSort(Buku[] data) {
        sort(data, 0, data.length - 1);
      }
      
      public void sort(Buku[] data, int left, int right) {
        if (left < right) {
          int middle = (left + right) / 2;
          sort(data, left, middle);
          sort(data, middle + 1, right);
          merge(data, left, middle, right);
        }
      }
      
      public void merge(Buku[] data, int left, int middle, int right) {
        // Create temporary array to hold sorted elements
        Buku[] temp = new Buku[data.length];
      
        // Copy data to temporary array
        for (int i = left; i <= right; i++) {
          temp[i] = data[i];
        }
      
        int a = left;
        int b = middle + 1;
        int c = left;
      
        while (a <= middle && b <= right) {
          // Compare elements based on kodeBuku using compareTo()
          if (data[a].judulBuku.compareTo(data[b].judulBuku) <= 0) {
            data[c] = temp[a];
            a++;
          } else {
            data[c] = temp[b];
            b++;
          }
          c++;
        }
      
        // Copy remaining elements from temporary array
        int s = middle - a;
        for (int i = 0; i <= s; i++) {
          data[c + i] = temp[a + i];
        }
      }

    public static void main(String[] args) {

        Pencarian pencarian = new Pencarian();

        pencarian.tambah(new Buku("20210", "Habis Gelap Terbitlah Terang", 2019, "Andi", 10));
        pencarian.tambah(new Buku("20212", "Dilan", 2019, "Andi", 10));
        pencarian.tambah(new Buku("20215", "Pemrograman Java", 2019, "Andi", 10));
        pencarian.tambah(new Buku("20214", "Pemrograman Javascript", 2019, "Andi", 10));
        pencarian.tambah(new Buku("20211", "Pemrograman Java", 2019, "Andi", 10));

        pencarian.mergeSort(pencarian.listBk);
        
        // tampilkan data setelah sort
        for (int i = 0; i < pencarian.listBk.length; i++) {
            System.out.println("Judul: " + pencarian.listBk[i].judulBuku);
        }

        // search By judul buku
        System.out.println("===== Sequencial Search ======");
        int pos = pencarian.findSeqSearchByJudul("Pemrograman Java");
        pencarian.tampilPosisi("Pemrograman Java", pos);
        pencarian.tampilData("Pemrograman Java", pos);

        System.out.println("===== Binary Search =====");
        pos = pencarian.findBinarySearchByJudul("Pemrograman Java", 0, pencarian.listBk.length - 1);
        pencarian.tampilPosisi("Pemrograman Java", pos);
        pencarian.tampilData("Pemrograman Java", pos);

    
        // // search By kode buku
        // System.out.println("===== Sequencial Search ======");
        // int pos = pencarian.findSeqSearch("20215");
        // pencarian.tampilPosisi("20215", pos);
        // pencarian.tampilData("20215", pos);

        // System.out.println("===== Binary Search =====");
        // pos = pencarian.findBinarySearch("20215", 0, pencarian.listBk.length - 1);
        // pencarian.tampilPosisi("20215", pos);
        // pencarian.tampilData("20215", pos);

    }
}
