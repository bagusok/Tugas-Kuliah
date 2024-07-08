package percobaan1;

import java.util.Scanner;

public class GraphModification {
    int vertex;
    DLL list[];

    GraphModification(int vertex) {
        this.vertex = vertex;
        list = new DLL[vertex];
        for (int i = 0; i < vertex; i++) {
            list[i] = new DLL();
        }
    }

    void addEdge(int source, int destination, int jarak) {
        // Directed
        list[source].addFirst(destination, jarak);
        // Undirected (optional)
        // list[destination].addFirst(source, jarak);
    }

    void degree(int asal) throws Exception {
        int totalIn = 0, totalOut = 0;

        // InDegree
        for (int i = 0; i < vertex; i++) {
            for (int j = 0; j < list[i].size(); j++) {
                if (list[i].get(j) == asal) {
                    ++totalOut;
                }
            }
        }

        // OutDegree
        int k = list[asal].size();
        totalIn = k;

        System.out.println("Indegree dari Gedung  " + (char) ('A' + asal) + " : " + totalIn);
        System.out.println("Outdegree dari Gedung " + (char) ('A' + asal) + " : " + totalOut);
        System.out.println("Degree dari Gedung " + (char) ('A' + asal) + " : " + (totalIn + totalOut));
    }

    void removeEdge(int source, int destination) throws Exception {
        list[source].remove(destination);
    }

    void printGraph() throws Exception {
        for (int i = 0; i < vertex; i++) {
            if (list[i].size() > 0) {
                System.out.print("Gedung " + (char) ('A' + i) + " terhubung dengan: ");
                for (int j = 0; j < list[i].size(); j++) {
                    System.out.print((char) ('A' + list[i].get(j)) + " (" + list[i].getJarak(j) + "m), ");
                }
                System.out.println("");
            }
        }
        System.out.println("");
    }

    boolean isPathExist(int source, int destination) {
        boolean[] visited = new boolean[vertex];
        return dfs(source, destination, visited);
    }

    private boolean dfs(int current, int destination, boolean[] visited) {
        visited[current] = true;

        if (current == destination) {
            return true;
        }

        for (int i = 0; i < list[current].size(); i++) {
            int neighbor = list[current].get(i);
            if (!visited[neighbor]) {
                if (dfs(neighbor, destination, visited)) {
                    return true;
                }
            }
        }
        return false;
    }
    

    void updateJarak(int source, int destination, int newJarak) throws Exception {
        for (int i = 0; i < list[source].size(); i++) {
            if (list[source].get(i) == destination) {
                list[source].setJarak(i, newJarak);
                return;
            }
        }
        throw new Exception("Edge tidak ditemukan.");
    }

    void hitungEdge() {
        int totalEdge = 0;
        for (int i = 0; i < vertex; i++) {
            totalEdge += list[i].size();
        }
        // Jika graph undirected, hitungan edge harus dibagi dua
        System.out.println("Total edge: " + totalEdge);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GraphModification graph = new GraphModification(6);
        boolean exit = false;

        while (!exit) {
            System.out.println("\nMenu Program:");
            System.out.println("1. Add Edge");
            System.out.println("2. Remove Edge");
            System.out.println("3. Degree");
            System.out.println("4. Print Graph");
            System.out.println("5. Check Edge Existence");
            System.out.println("6. Update Jarak");
            System.out.println("7. Hitung Edge");
            System.out.println("8. Exit");
            System.out.print("Pilih menu (1-7): ");

            int choice = scanner.nextInt();
            int source, destination, jarak, newJarak;

            switch (choice) {
                case 1:
                    System.out.print("Masukkan source vertex (0-5): ");
                    source = scanner.nextInt();
                    System.out.print("Masukkan destination vertex (0-5): ");
                    destination = scanner.nextInt();
                    System.out.print("Masukkan jarak: ");
                    jarak = scanner.nextInt();
                    graph.addEdge(source, destination, jarak);
                    break;
                case 2:
                    System.out.print("Masukkan source vertex (0-5): ");
                    source = scanner.nextInt();
                    System.out.print("Masukkan destination vertex (0-5): ");
                    destination = scanner.nextInt();
                    try {
                        graph.removeEdge(source, destination);
                    } catch (Exception e) {
                        System.out.println("Edge tidak ditemukan.");
                    }
                    break;
                case 3:
                    System.out.print("Masukkan vertex untuk diperiksa degree-nya (0-5): ");
                    source = scanner.nextInt();
                    try {
                        graph.degree(source);
                    } catch (Exception e) {
                        System.out.println("Vertex tidak valid.");
                    }
                    break;
                case 4:
                    try {
                        graph.printGraph();
                    } catch (Exception e) {
                        System.out.println("Error dalam mencetak graph.");
                    }
                    break;
                case 5:
                    System.out.print("Masukkan source vertex (0-5): ");
                    source = scanner.nextInt();
                    System.out.print("Masukkan destination vertex (0-5): ");
                    destination = scanner.nextInt();
                    boolean pathExists = graph.isPathExist(source, destination);
                    System.out.println("Apakah ada jalur dari " + (char) ('A' + source) + " ke " + (char) ('A' + destination) + ": " + pathExists);
                    break;
                case 6:
                    System.out.print("Masukkan source vertex (0-5): ");
                    source = scanner.nextInt();
                    System.out.print("Masukkan destination vertex (0-5): ");
                    destination = scanner.nextInt();
                    System.out.print("Masukkan jarak baru: ");
                    newJarak = scanner.nextInt();
                    try {
                        graph.updateJarak(source, destination, newJarak);
                    } catch (Exception e) {
                        System.out.println("Update jarak gagal: " + e.getMessage());
                    }
                    break;
                case 7:
                    graph.hitungEdge();
                    break;
                case 8:
                    exit = true;
                    System.out.println("Program berakhir.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih 1-7.");
            }
        }

        scanner.close();
    }
}
