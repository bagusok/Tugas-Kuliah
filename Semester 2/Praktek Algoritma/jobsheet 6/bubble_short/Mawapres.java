package bubble_short;

public class Mawapres {
    Mahasiswa[] listMMhs = new Mahasiswa[5];    
    int idx;

    void tambah(Mahasiswa m){
        if(idx < listMMhs.length){
            listMMhs[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh!");
        }
    }

    void tampil(){
        for(Mahasiswa m : listMMhs){
            m.tampil();
            System.out.println("--------------------");
        }
    }

    void bubbleSort(){
        for(int i = 0; i < listMMhs.length-1; i++){
            for(int j = 1; j < listMMhs.length-i; j++){
                if(listMMhs[j].ipk > listMMhs[j-1].ipk){
                    Mahasiswa temp = listMMhs[j];
                    listMMhs[j] = listMMhs[j-1];
                    listMMhs[j-1] = temp;
                }
            }
        }
    }

    void selectionSort() {
        for(int i = 0; i < listMMhs.length-1; i++){
            int idxMin = i;
            for(int j = i+1; j < listMMhs.length; j++){
                if(listMMhs[j].ipk < listMMhs[idxMin].ipk){
                    idxMin = j;
                }
            }
            Mahasiswa temp = listMMhs[idxMin];
            listMMhs[idxMin] = listMMhs[i];
            listMMhs[i] = temp;
        }
    }

    void insertionSort(String sortBy) {

        if (sortBy == "desc") {
            for (int i = 1; i < listMMhs.length; i++) {
                Mahasiswa temp = listMMhs[i];
                int j = i;
                while (j > 0 && listMMhs[j - 1].ipk < temp.ipk) {
                  listMMhs[j] = listMMhs[j - 1];
                  j--;
                }
                listMMhs[j] = temp;
              }
        }else{
            for(int i = 1; i < listMMhs.length; i++){
                Mahasiswa temp = listMMhs[i];
                int j = i;
                while(j > 0 && listMMhs[j-1].ipk > temp.ipk){
                    listMMhs[j] = listMMhs[j-1];
                    j--;
                }
                listMMhs[j] = temp;
            }
        }
    }

    public static void main(String[] args) {
        Mawapres list = new Mawapres();

        Mahasiswa m1 = new Mahasiswa("Ridwan", 2018, 3.9);
        Mahasiswa m2 = new Mahasiswa("Ardi", 2018, 3.8);
        Mahasiswa m3 = new Mahasiswa("Ani", 2018, 3.7);
        Mahasiswa m4 = new Mahasiswa("Dina", 2018, 3.6);
        Mahasiswa m5 = new Mahasiswa("Rudi", 2018, 3.5);

        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);

        System.out.println("Data Mahasiswa sebelum sorting");
        list.tampil();

        System.out.println("=================================");
        System.out.println("=================================");

        System.out.println("Data Mahasiswa setelah sorting");
        // list.bubbleSort();
        // list.selectionSort();
        list.insertionSort("desc");
        list.tampil();
    }
}
