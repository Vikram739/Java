class Base
{
    void base()
    {
	System.out.println("I am from Base  class");
    }
}
class Derived extends Base
{
    void derived()
    {
        
	System.out.println("I am from Derived class");
    }
}
class singleinherit
{
    public static void main(String args[])
    {
   	Derived d1=new Derived();
	d1.base();
        d1.derived();
    }
}
