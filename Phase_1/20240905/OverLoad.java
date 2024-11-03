public class OverLoad {
    public static void main(String[] args) {
        // double d[] = { 10.0, 20.0, 15.83, 15.84, 23.3, 30, 12.5, 7.8, 33.33, 5.0, 6.6 };
        // A01 a = new A01(d, 0);
        // double max = a.max(d);
        // System.out.println(max);

        String name[] = { "是", "什么", "啊", "是米饭", "仙人" };
        A02 a2 = new A02();
        System.out.println(a2.find(name, "是米饭"));
    }
}



class Person {

    int age;
    String name;
    
    Person(int age, String name) {
        this.age = age;
        this.name = name;
    }
    
    boolean Compare(int age,String name) {
        
        if (age != this.age) {
            System.out.println("NO");
            return false;
        }
        else {
            if (name != this.name) {
                System.out.println("NO");
                return false;
            }
            else {
                System.out.println("YES");
                return true;
            }
        }
    }
}


class A01 {

    double d[];
    double maxnum;

    A01(double d[], double maxnum) {
        this.d = d;
        this.maxnum = maxnum;
    }

    double max(double[] d) {
        if (d.length != 0) {
            maxnum = d[0];
            for (int i = 0; i < d.length; i++) {
                if (maxnum < d[i]) {
                    maxnum = d[i];
                }
            }
            return maxnum;
        } else {
            return 0;
        }
    }
}

class A02 {

    int find(String d[],String findnum) {
        if (d.length != 0) {
            for (int i = 0; i < d.length; i++) {
                if (findnum == d[i]) {
                    return i;
                }
            }
        }

        return -1;
    }
    
}







