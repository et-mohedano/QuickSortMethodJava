/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metododrecursividadquicksort;

/**
 *
 * @author EFRA
 */
public class MetododRecursividadQuickSort {
    
    int[] quick(int[]arr, int inicio, int fin){
        if (inicio < fin) {
            int pivote = arr[inicio];
            int menor = inicio + 1, mayor = fin;
            while (menor <= mayor) {                
                while(menor<=fin && arr[menor]<pivote){
                    menor++;
                }
                while(mayor>inicio && arr[mayor]>pivote){
                    mayor--;
                }
                if (menor<=mayor) {
                    int aux = arr[menor];
                    arr[menor] = arr[mayor];
                    arr[mayor] = aux;
                }
            }
            if (mayor>inicio) {
                int aux = arr[inicio];
                arr[inicio] = arr[mayor];
                arr[mayor] = aux;
            }
            quick(arr, inicio, mayor-1);
            quick(arr, mayor+1, fin);
        }
        return arr;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        int arr[] = {23, 0, 12, 34, 1, 89};
        MetododRecursividadQuickSort q = new MetododRecursividadQuickSort();
        arr = q.quick(arr, 0, arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    
}
