public class Object {

    public static void main(String[] args) {
        int n = 5;
        Febo febo = new Febo();
        

    
}


}

class Febo {
    
    public int deal(int n) {
        
        int num = 0;
        if (n == 0) {
            return 0;
        }
        else if (n == 1) {
            return 1;
        } else {
            return deal(n-2) + deal(n - 1);
        }
    }

}