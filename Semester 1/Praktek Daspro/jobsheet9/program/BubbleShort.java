class BubbleShort {
    
    public static void print(String s) {
        System.out.print(s);
    }
    
    public static void main(String[] args) {
        int[] a = {2, 4, 5, 3, 1};
        
        
        int dummy = 0;
        
        for(int i = 0; i<a.length; i++) {
            
            for (int j = 1; j<(a.length - i); j++) {
                if (a[j-1] > a[j]){
                    dummy = a[j-1];
                    a[j-1] = a[j];
                    a[j] = dummy;
                }
                // print(a[i] + " " + a[j] + "\n");
                
            }
            
        }
        
        for(int b: a) {
            System.out.print(b);
        }
    }
}