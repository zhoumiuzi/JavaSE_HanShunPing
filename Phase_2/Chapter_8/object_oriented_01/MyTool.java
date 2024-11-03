/**
 * @Author: zhouMiuzi
 * @CreateTime: 2024-11-03
 * @Description: 用来学习idea的使用
 * @Version: 1.0
 */


public class MyTool {
    public void bubble(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }


    public static void main(String[] args){
        MyTool mt=new MyTool();
        int arr[]={20,15,33,55,21,34,55,58,23};
        mt.bubble(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"  ");
        }
    }


}
