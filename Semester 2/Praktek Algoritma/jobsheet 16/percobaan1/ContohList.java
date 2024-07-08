package percobaan1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class ContohList{
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<Integer>();
        l.add(1);
        l.add(2);
        l.add(3);
    

        System.out.println("isi List l : "+l.toString());
        l.add(4);
        l.remove(0);
        System.out.println("isi List l : "+l.toString());

        LinkedList<String> names = new LinkedList<>();
        names.add("Nouren");
        names.add("Akhleena");
        names.add("Shannum");
        names.add("Uwais");
        names.add("A;-Qarni");
        names.push("mei mei");

        System.out.println("isi List names : "+names.toString());
        names.set(0, "mu-Kids");
        System.out.printf("Elemen 0: %s, total element: %s, element terakhir: %s", names.get(0), names.size(), names.get(names.size()-1));

    }

}