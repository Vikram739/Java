class Base1
{
    void base()
    {
	System.out.println("I am from Base class");
    }
}
class Derived1 extends Base
{
    void derived1()
    {
        
	System.out.println("I am from Derived class");
    }
}
class Derived2 extends Derived1
{
    void derived2()
    {
        
	System.out.println("I am from another  Derived class");
    }
}
class multilevelinherit
{
    public static void main(String args[])
    {
   	Derived2 d1=new Derived2();
	d1.base();
        d1.derived1();
	d1.derived2();
    }
}
