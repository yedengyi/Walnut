public class Algorithm {
    public static void main(String args[] ){
            int [] s = {1,2,2,5,8,2};
            int [] m = quickSort(s,0,s.length-1);
            for(int i=0;i<m.length;i++){
                System.out.println(m[i]);
            }
            int fkey = commonSearch(m,8);
            System.out.println("the result:"+fkey);
    }

    public static int [] quickSort(int[]arr, int low,int high){
        if(arr.length == 0 || arr == null || low > high){
            return arr;
        }

        int i = low;
        int j = high;
        int key = arr[low];
        int temp;
        while(i < j){
            while(key <= arr[j] && i<j ){
                j--;
            }
            while(key >= arr[i] && i<j){
                i++;
            }
            if(i < j){
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        arr[low] = arr[i];
        arr[i] = key;
        quickSort(arr,low,j-1);
        quickSort(arr,i+1,high);
        return arr;
    }

    public static int commonSearch(int[] arr,int key){
        if(arr==null || arr.length==0){
            return -1;
        }

        int i=0;
        int j=arr.length;
        int mind;
        while(i<j){
            mind = (i+j)/2;
            if(key<arr[mind]){
                j=mind-1;
            }else if(key>arr[mind]){
                i=mind+1;
            }else if(key == arr[mind]){
                return mind;
            }
        }
        return -1;
    }

    public static int[] pick(int []arr){

        if(arr.length==0 || arr==null){
            return arr;
        }

        int index,temp;
        for(int i=0; i<arr.length; i++){
            index = i;
            for(int j=i; j<arr.length; j++){
                if(arr[j]<arr[index]){
                    index = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }

        return arr;
    }

    public static int[] bubble(int[] str){
        if(str.length == 0){
            return str;
        }
        int len = str.length;
        int temp = 0;
        for(int i=0;i<len-1;i++){
            for(int j=0;j<len-1-i;j++){
                if(str[j+1]<str[j]){
                    temp = str[j+1];
                    str[j+1] = str[j];
                    str[j] = temp;
                }
            }
        }
        return str;
    }
}
