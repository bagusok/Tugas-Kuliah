package percobaan1;

public class GrapMatriks {
    int vertex;
    int[][] matriks;

    public GrapMatriks(int vertex) {
        this.vertex = vertex;
        matriks = new int[vertex][vertex];
    }

    void makeEdge(int asal, int tujuan, int jarak) {
        matriks[asal][tujuan] = jarak;
        
    }

    void removeEdge(int asal, int tujuan) {
        matriks[asal][tujuan] = -1;
    }

    void printGraph() throws Exception {
        for (int i = 0; i < vertex; i++) {
           System.out.println("Gedung " + (char) ('A' + i) + ": ");
            for (int j = 0; j < vertex; j++) {
                if (matriks[i][j] != -1) {
                    System.out.println("Gedung " + (char) ('A' + j) + " Jarak: " + matriks[i][j] + " meter");
                }
            }
            System.out.println(" ");
        }
        System.out.println(" ");
    }

    int calculateInDegree(int vertex) {
        int inDegree = 0;
        for (int i = 0; i < this.vertex; i++) {
            if (matriks[i][vertex] != -1) {
                inDegree++;
            }
        }
        return inDegree;
    }

    int calculateOutDegree(int vertex) {
        int outDegree = 0;
        for (int i = 0; i < this.vertex; i++) {
            if (matriks[vertex][i] != -1) {
                outDegree++;
            }
        }
        return outDegree;
    }
    int calculateTotalDegree(int vertex) {
        return calculateInDegree(vertex) + calculateOutDegree(vertex);
    }


    void printDegrees() {
        for (int i = 0; i < vertex; i++) {
            int inDegree = calculateInDegree(i);
            int outDegree = calculateOutDegree(i);
            System.out.println("Gedung " + (char) ('A' + i) + " -> InDegree: " + inDegree + ", OutDegree: " + outDegree + ", Total Degree: " + (inDegree + outDegree));
        }
    }

    public static void main(String[] args) {
        try {
            int vertex = 4;
            GrapMatriks graph = new GrapMatriks(vertex);
            graph.makeEdge(0, 1, 50);
            graph.makeEdge(1, 0, 60);
            graph.makeEdge(1, 2, 70);
            graph.makeEdge(2, 1, 80);
            graph.makeEdge(2, 3, 40);
            graph.makeEdge(3, 0, 90);
            graph.printGraph();
            System.out.println("Hasil setelah penghapusan edge");
            graph.removeEdge(2,1);
            graph.printGraph();

            graph.printDegrees();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
