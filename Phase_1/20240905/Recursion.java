public class Recursion {
    public static void main(String[] args) {
        // T t = new T();
        // t.test(5);
        // int j = t.factorial(5);
        // System.out.println(j);
        // int febo = t.fibonacci(5);
        // System.out.println(febo);
        // int mon = t.monkey(10);
        // System.out.println(mon);

        // int[][] migong = new int[8][7];
        // for (int i = 0; i < 8; i++) {
        //     for (int j = 0; j < 7; j++) {
        //         if (i == 0 || i == 7) {
        //             migong[i][j] = 1;
        //         } else {
        //             if (j == 0 || j == 6) {
        //                 migong[i][j] = 1;
        //             }
        //         }
        //     }
        // }
        // migong[3][1] = 1;
        // migong[3][2] = 1;
        // migong[2][2] = 1;

        // T t = new T();
        // boolean situ = t.findWay(migong, 1, 1);
        // System.out.println(situ);
        // //老鼠的初始位置为[1][1]，出口的位置为[6][5]
        // //状态码，0初始通路，1墙，2通路，3死路
        // //也就是migong[6][5]=2时找到通路
        // //确定找路策略：下-右-上-左

        // for (int i = 0; i < 8; i++) {
        //     for (int j = 0; j < 7; j++) {
        //         System.out.print(migong[i][j] + "\t");
        //     }
        //     System.out.println();
        // }

        Hanota hanota = new Hanota();
        hanota.move(5, 'a', 'b', 'c');
    
    
    }
}


class T {

    public boolean findWay(int[][] map, int i, int j) {

        if (map[6][5] == 2) {
            return true;
        } else if (map[i][j] == 0) {
            map[i][j] = 2;
            if (findWay(map, i + 1, j)) {
                System.out.print("[" + i + "]" + "[" + j + "] <-");
                return true;
            } else if (findWay(map, i, j + 1)) {
                System.out.print("[" + i + "]" + "[" + j + "] <-");
                return true;
            } else if (findWay(map, i - 1, j)) {
                System.out.print("[" + i + "]" + "[" + j + "] <-");
                return true;
            } else if (findWay(map, i, j - 1)) {
                System.out.print("[" + i + "]" + "[" + j + "] <-");
                return true;
            } else {
                map[i][j] = 3;
                return false;
            }
        } else {
            // map[i][j] = 3;
            return false;
        }

    }

}

class Hanota {
    
    public void move(int num, char a, char b, char c) {
        for (int i = 0; i < num; i++) {
            if (num == 1) {
                System.out.println(a + "->" + c);
            } else {
                //如果有多个盘，可以看成两个，最下面的和上面的所有盘
                //这个操作就是利用c，把a上面的所有盘移到b，剩下一个在a这
                move(num - 1, a, c, b);
                System.out.println(a + "->" + c);
                move(num - 1, b, a, c);
            }
        }
    }

}



// class T {
//     public void test(int n) {
//         if (n > 2) {
//             test(n - 1);
//         } else {
//             System.out.println("n = " + n);
//         }
//     }
    
//     public int factorial(int n) {
//         if (n == 1) {
//             return 1;
//         } else {
//             return factorial(n - 1) * n;
//         }
//     }
    
//     //返回斐波那契数
//     //斐波那契数是从第三个开始，每一个都是两个的和
//     public int fibonacci(int n) {
//         if (n == 1 || n == 2) {
//             return 1;
//         } else {
//             return fibonacci(n - 1) + fibonacci(n - 2);
//         }
//     }

//     public int monkey(int n) {
//         if (n == 1) {
//             return 1;
//         } else {
//             return (monkey(n - 1) + 1) * 2;
//         }
//     }
// }


