interface abc{
    public void show();
    public void add();
    static void print(){
        System.out.println("print function");

    }
}
class xyz implements abc{
     public void add(){
     System.out.println("print function");
     }
     public void show(){
         System.out.println("show function");
     }
    }
    public class test11{
        public static void main (String args[]){
            xyz xy=new xyz ();
            xy.add();
        }
    }     
