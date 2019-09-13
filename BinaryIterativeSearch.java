public class BinaryIterativeSearch implements Practice03Search{

    public String searchName() {
        return "Binary Search";
    }

    public int search(int [] arr, int target) {
        boolean found = false;
        int start = 0;
        int mid = (arr.length-1)/2;
        int end = arr.length-1;
        while(found == false && end > start) {
            if(arr[mid] == target) {
                return mid;
            }else if(arr[mid] > target) {
                end = mid;
                mid = end/2;
            }else if(arr[mid] < target) {
                start = mid;
                int temp = end - start;
                mid = temp/2;
            }
        }
        return -1;
    }
}
