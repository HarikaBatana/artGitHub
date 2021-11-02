package doubts;

class A {
   A(){ 
       this(5);
       System.out.println("hell world");
   }
    A(int i){
       System.out.println("hell world x2");
}
}
class B extends A{
B(int i){
       System.out.println("WHY oh WHY");
   }
   B(){ 
       super(3);
       System.out.println("Helo dont smile");
   }
}
class SuperConst{
    public static void main(String[] args) {
       B b1 = new B(10);
       B b2 =new B();
   }
}
