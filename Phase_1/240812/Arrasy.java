public class Arrasy {

    public static void main(String[] args) {

        // int[] arr = { 11, 22, 33, 44, 55, 66 };
        // int[] arr2 = new int[arr.length];

        // for (int i = arr.length - 1; i >= 0; i--) {
        //     arr2[arr.length - 1 - i] = arr[i];
        // }
        // arr = arr2;
        // System.out.println("Array:");
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.println(arr[i]);
        // }

        MyTool myTool = new MyTool();
        Person person = new Person();
        person.age = 10;
        person.name = "Lyu";
        Person p2 = myTool.CopyPerson(person);
        System.out.println(person);
        System.out.println(p2);


    }

}

class Person {
    String name;
    int age;
}


class MyTool {
    
    //编写一个方法，可以复制一个Person对象，返回复制的对象。
    public Person CopyPerson(Person person) {
        Person p2 = new Person();
        p2.age = person.age;
        p2.name = person.name;
        System.out.println(p2);
        return p2;

    }

}