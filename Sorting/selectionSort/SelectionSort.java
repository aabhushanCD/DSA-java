
public class SelectionSort {

      public void Selection(int [] array){
      int n = array.length;
      
      for(int i = 0; i< n - 1; i++){
        int minIndex = i;
          for(int j = i + 1; j<n; j++){
          if(array[j] < array[minIndex]){
            minIndex = j;
          }
      }
    int temp = array[i];
    array[i]= array[minIndex];
    array[minIndex] = temp;
  
    }
    for(int i = 0; i<n; i++){
      System.out.print(array[i] + ", ");
    }
}
public static void main(String[] args) {
  SelectionSort S = new SelectionSort();
  int[] array = new int[]{2,4,35,7};
  
S.Selection(array);
}
}
