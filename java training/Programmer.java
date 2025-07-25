class Programmer {
    float salary=40000;
    public void showe(String name){
        System.out.println("hi welcome" +name);
    }
}
class Programmmer extends Programmer{
    int bonus=10000;
    public static void main(String[] args){
        Programmmer p=new Programmmer();
        p.showe("Raj");
        System.out.println("Pragrammer salary is:" +p.salary);
        System.out.println("bonus of pragrammer is:"+p.bonus);
    }
}