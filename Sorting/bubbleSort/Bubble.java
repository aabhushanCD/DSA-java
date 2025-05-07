class Bubble{
  public void bubble(int[] array){
    int n = array.length;
    for(int i = 0; i < n - 1; i++){
      int temp = 0;
      boolean swap = false;
      for(int j = 0; j< n - i -1; j++){
          if(array[j] > array[j+1]){
            temp = array[j];
            array[j] = array[j+1];
            array[j+1] = temp;
            swap = true;
          }   
      }
      if(!swap){
        break;
      }
    }
    for(int i = 0; i < n; i++){
      System.out.print(array[i] + ", ");
    }
  }

  public static void main(String[] args) {
    int[] array = new int[] {454,23,53,5,6};
  Bubble b = new Bubble();
  b.bubble(array);

  }
}