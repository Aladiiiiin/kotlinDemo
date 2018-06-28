package reference;

public class Test {
    public static void changeA(MyObject a){
        a.setA("dsafdsa");
    }


    public static void main(String args[]){
        MyObject b = new MyObject();
        changeA(b);
        System.out.println(b.getA());
    }




}
