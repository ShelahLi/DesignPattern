package bupt.lth;

//适配者实现目标接口，把适配者的方法名改为sort和search
public class OperationAdapter implements ScoreOperation {
    private QuickSort sortObj;
    private BinarySearch searchObj;
    public OperationAdapter(){
        sortObj = new QuickSort();
        searchObj = new BinarySearch();

    }
    public int[] sort(int[] array) {
        return sortObj.quickSort(array);
    }

    public int search(int[] array, int key) {
        return searchObj.binartSearch(array, key);
    }
}
