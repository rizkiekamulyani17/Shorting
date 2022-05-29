public class QuickSort {
    private int[] data;
    public void setData(int[] data){this.data = data;}
    private int partition(int start, int end){//strat=left dan end=kanan
        int pivot = this.data[end];
        int i = (start - 1);
        for(int j = start;j<=end-1;j++){
            if (this.data [j] < pivot){
                i++;
                int t = this.data[i];
                this.data[i] = this.data[j];
                this.data[j]=t;
            }
        }
        int t = this.data[i+1];
        this.data[i+1] = this.data[end];
        this.data[end]=t;
        return (i+1);
    }
    public void quickSart(int start,int end){//recurcive
        if(start<end){
            int p = partition(start, end);
            quickSart(start,p-1) ;
            quickSart(p + 1, end);
        }
    }
    public void printArr(int n){
        int i;
        for(i=0;i<n;i++){
            System.out.println(this.data[i]+" ");
        }
    }
    public static void main(String[]args){
        int[] dataArry = {13,18,27,2,19,25};
        int n = dataArry.length ;
        System.out.println("\nBefore sorting array elements are -s");
        QuickSort _myQS = new QuickSort();
        _myQS.setData(dataArry);
        _myQS.printArr(n);
        _myQS.quickSart(0,n-1);
        System.out.println("\nAfter sorting array elements are - " );
        _myQS.printArr(n);
        System.out.println();
    }
}
