import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ArithmeticOperator {
    public static void main(String[] args) {
        // int num = 0;
        // int money = 100000;
        // while(money>1000)
        // {
        //     if (money > 50000) {
        //         money -= money * 0.05;
        //         num++;
        //     } else {
        //         money -= 1000;
        //         num++;
        //     }
        // }
        // System.out.println(num);

        // int num;
        // Scanner scanner = new Scanner(System.in);
        // while (true) {
        //     num = scanner.nextInt();
        // if (num > 0) {
        //     System.out.println("大于0");
        // }
        // else if (num < 0) {
        //     System.out.println("小于0");
        // }
        // else {
        //     System.out.println("等于0");
        // }
        // }

        //水仙花
        // int num1, num2;
        // Scanner scanner = new Scanner(System.in);
        // num1 = scanner.nextInt();
        // num2 = num1;
        // int add = 0, j;
        // for (int i = 0; i < 3; i++) {
        //     j = num1 % 10;
        //     add += Math.pow(j, 3);
        //     System.out.println(j+" "+add);
        //     num1 /= 10;
        // }
        // if (add == num2) {
        //     System.out.println("是水仙花数");;
        // } else {
        //     System.out.println("不是水仙花");
        // }

        //数组反转
        // int arr[] = new int[5];
        // int arr1[] = new int[5];
        // int temp, m;
        // m = arr.length-1;
        // Scanner scanner = new Scanner(System.in);
        // for (int i = 0; i < arr.length; i++) {
        //     arr[i] = scanner.nextInt();
        //     arr1[i] = arr[i];
        // }
        // System.out.println(Arrays.toString(arr));
        // System.out.println(Arrays.toString(arr1));
        // for (int i = 0; i < (arr.length / 2); i++) {
        //     arr[i] = arr1[m];
        //     arr[m] = arr1[i];
        //     m--;
        // }
        // System.out.println(Arrays.toString(arr1));
        // System.out.println(Arrays.toString(arr));

        //一共包含三个一维数组，但是一维数组们还没开辟数据空间
        // int[][] arr = new int[3][];
        // for (int i = 0; i < 3; i++) {
        //     arr[i] = new int[i + 1];
        //     for (int j = 0; j < arr[i].length; j++) {
        //         arr[i][j] = i + 1;
        //         System.out.println((i + 1) + "行： " + Arrays.toString(arr[i]));
        //     }
        // }
        // for (int i = 0; i < 3; i++) {
        //     System.out.println(Arrays.toString(arr[i]));
        // }
        
        //遍历二维数组
        // int num = 0;
        // int arr[][] = { { 4, 6 }, { 1, 4, 5, 7 }, { -2 } };
        // for (int i = 0; i < arr.length; i++) {
        //     for (int j = 0; j < arr[i].length; j++) {
        //         num += arr[i][j];
        //     }
        // }
        // System.out.println(num);


        //杨辉三角
        // int[][] arr = new int[10][];
        // for (int i = 0; i < arr.length; i++) {
        //     arr[i] = new int[i + 1];
        //     for (int j = 0; j <= i; j++) {
        //         if (j == 0 || j == i) {
        //             arr[i][j] = 1;
        //         } else {
        //             arr[i][j] = arr[i - 1][j] + arr[i - 1][j - 1];
        //         }
        //     }
        // }
        // for (int i = 0; i < arr[i].length; i++) {
        //     System.out.println(Arrays.toString(arr[i]));
        // }


        //类与对象与猫
        // Cat cat1 = new Cat();
        // cat1.name = "小白";
        // cat1.age = 3;
        // cat1.color = "蓝色";
        // Cat cat2 = new Cat();
        // cat2.name = "小花";
        // cat2.age = 100;
        // cat2.color = "三色";
        // System.out.println("cat1: " + cat1.name + " " + cat1.age + " " + cat1.color);
        // System.out.println("cat2: " + cat2.name + " " + cat2.age + " " + cat2.color);




    }
   
}

