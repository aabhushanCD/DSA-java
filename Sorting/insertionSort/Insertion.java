
public class Insertion {
    public void insertion(int[] array){
      int n = array.length;
      int[] sorted = new int[n];
      int i,key, j;
      for(i = 0; i< n; i++){
          key = array[i];
          j = i - 1;


          while(j>=0 && array[j]> key){
            array[j+1] = array[j];
            j = j - 1;
          }
          array[j+1] =  key;
      }
      for(int t = 0; t < n; t++){
        System.out.print(array[t] + " " );
      }      
    }
  public static void main(String[] args) {
    int[] array = new int[] {398,34,32,34,667,8,9};
    Insertion i = new Insertion();
    i.insertion(array);
  }
  
}
