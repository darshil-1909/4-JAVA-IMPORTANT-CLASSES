public class In{

    public static void main(String[] args) {
        In i = new In();
        In.Test t = i.new Test();
        t.use();
        
    }


    class Test{

    void use(){
        int a = 9;

        if (a % 2 == 0) {
            System.out.println("This num is even :" + a);
        } else {
            System.out.println("This num is odd :" + a);
        }
        }

    }
}