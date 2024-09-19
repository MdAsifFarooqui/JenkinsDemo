public class SearchelementInArray {
    static boolean isFound(int arr[],int index,int key){
        if(index==arr.length)return false;
        if(arr[index]==key)return true;
        return isFound(arr, index+1, key);
    }
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
        System.out.println(isFound(arr,0,50)?"Found":"Not Found");
    }
}