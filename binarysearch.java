public class binarysearch {
public static int BinarySearch(int[] numbers, int key) {
        int start = 0;
        int end = numbers.length - 1;

        while(start <= end){
          int mid = (start + end) / 2;

            if(numbers[mid] == key){
                return mid;
            }
            if(numbers[mid] < key){
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return - 1;
    }
    public static void main (String [] args){
        int [] numbers = {-1,0,3,5,9,12};
        int key = 9;

        System.out.println("Index For Key Is: " + BinarySearch(numbers, key));
    }
}