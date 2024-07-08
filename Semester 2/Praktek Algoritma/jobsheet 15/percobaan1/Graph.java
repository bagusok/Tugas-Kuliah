package percobaan1;

public class Graph {
    int vertex;
    DLL list[];

    Graph(int vertex) {
        this.vertex = vertex;
        list = new DLL[vertex];
        for (int i = 0; i < vertex; i++) {
            list[i] = new DLL();
        }
    }

    void addEdge(int source, int destination, int jarak) {
    //    directed
        list[source].addFirst(destination, jarak);
        // undirected
        // list[destination].addFirst(source, jarak);
        
    }

    void degree(int asal) throws Exception {
        int k, totalIn = 0, totalOut = 0;

        // inDegree
        for (int i = 0; i < vertex; i++) {
           for (int j = 0; j < list[i].size(); j++) {
               if (list[i].get(j) == asal) {
                   ++totalOut;
               }
           }

        //    outDegree
              for (k = 0; k < list[asal].size(); k++) {
               list[asal].get(k);
              }
              totalOut = k;
        }
        System.out.println("Indegree dari Gedung  " + (char) ('A' + asal) + " : " + totalIn);
        System.out.println("Outdegree dari Gedung " + (char) ('A' + asal) + " : " + totalOut);
        System.out.println("degree dari Gedung " + (char) ('A' + asal) + " : " + (totalIn + totalOut));
    }

    void removeEdge(int source, int destination) throws Exception {
        for (int i = 0; i < vertex; i++) {
            if (i == source) {
              list[source].remove(destination);
            }
        }
    }

    void removeAllEdges() {
        for (int i = 0; i < vertex; i++) {
            list[i].clear();
        }
        System.out.println("Graph berhasil dikosongkan");
    }

    void printGraph() throws Exception {
        for (int i = 0; i < vertex; i++) {
            if (list[i].size() > 0) {
                System.out.print("Gedunnf " + (char)  ('A'+ i) + " terhubung dengan: ");
                for (int j = 0; j < list[i].size(); j++) {
                    System.out.println((char) ('A' + list[i].get(j)) + " (" + list[i].getJarak(j) + "m), ");
                }
                System.out.println("");
            }
        }
        System.out.println(" ");
    }

    boolean isPathExist(int source, int destination) {
        boolean[] visited = new boolean[vertex];
        return dfs(source, destination, visited);
    }

    // Metode DFS rekursif untuk mengecek jalur
    private boolean dfs(int current, int destination, boolean[] visited) {
        // Tandai node saat ini sebagai telah dikunjungi
        visited[current] = true;
        
        // Jika kita sudah sampai di tujuan, kembalikan true
        if (current == destination) {
            return true;
        }
        
        // Iterasi melalui tetangga dari node saat ini
        for (int i = 0; i < list[current].size(); i++) {
            int neighbor = list[current].get(i);
            
            // Jika tetangga belum dikunjungi, lakukan DFS pada tetangga tersebut
            if (!visited[neighbor]) {
                if (dfs(neighbor, destination, visited)) {
                    return true;
                }
            }
        }
        
        // Jika semua tetangga sudah dijelajahi dan tidak menemukan tujuan, kembalikan false
        return false;
    }

    public static void main(String[] args) {
        Graph graph = new Graph(6);
        graph.addEdge(0, 1, 50);
        graph.addEdge(0, 2, 100);
        graph.addEdge(1, 3, 70);
        graph.addEdge(2, 3, 40);
        graph.addEdge(3, 4, 60);
        graph.addEdge(4, 5, 80);
        try {
            graph.degree(0);
            graph.printGraph();

            // no 15
            graph.removeEdge(1, 3);
            graph.printGraph();

            System.out.println("Apakah ada jalur dari 2 ke 3: " + graph.isPathExist(2, 3));
            System.out.println("Apakah ada jalur dari 2 ke 5: " + graph.isPathExist(2, 5));
          
        } catch (Exception e) {
            System.out.println(e.getMessage());    
        }
    }
}
