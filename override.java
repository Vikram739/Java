class Animal
{
    void move()
    {
	System.out.println("I am from super class");
    }
}
class Dog extends Animal
{
    void move()
    {
        super;
	System.out.println("I am from sub class");
    }
}
class override1
{
    public static void main(String args[])
    {
   	Dog d1=new Dog();
	d1.move();
    }
}
