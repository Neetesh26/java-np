class newf{
    public static void main(String []args){
        Demo d1 =new demo();
        d1.fun1();
    }
}

class Demo{
    int x;
 private static int y;
 void fun1(){
    y =3;
    System.out.println(y);
 }
}