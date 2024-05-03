public class App {

    public static void insertionsort (int [] arra) {
        int n= arra.length; 
        for (int i=1; i<n; i++){
            int key= arra[i];
            int j= 1 -1;


            while (j >= 0 && arra[j]>key) {
                arra[j+1]= arra[j];
                j--;
            }

            arra[j+1]=key;
        }
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Hello world, metodo de ordenamiento por insercion ");

        int [] arra= {12,11,13,5,6} ;

        System.out.println("Arreglo original ");
        for (int num : arra) {
            System.out.println(num +" ");

        }

        System.out.println();

        System.out.println("===============================================");
        insertionsort (arra);

        System.out.println("Arreglo ordenado");
        for (int num: arra) {
            System.out.println(num + " ");
        }
        
    }
}
