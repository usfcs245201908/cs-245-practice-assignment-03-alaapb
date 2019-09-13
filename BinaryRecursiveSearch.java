public class BinaryRecursiveSearch implements Practice03Search{

    public String searchName() {
        return "Binary Search";
    }

    public int search(int [] arr, int target) {
        int start = 0;
        int end = arr.length-1;
        return search(arr, target, start, end);
    }

    public int search(int [] arr, int target, int start, int end) {

        if(end >= 1) {
            int mid = end/2;
            if(arr[mid] == target) {
                return mid;
            }else if(arr[mid] > target) {
                return search(arr, target, start, mid - 1);
            }else if(arr[mid] < target) {
                return search(arr, target, mid + 1, end);
            }
        }

        return 0;
    }
}
