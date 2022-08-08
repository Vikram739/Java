class Bank
{
int getroi() { return 0; }
}
class SBI extends Bank
{
int getroi() { return 7; }
}
class ICICI extends Bank
{
int getroi() { return 9; }
}
class AXIS extends Bank
{
int getroi() { return 6; }
}
class P171
{
public static void main(String args[])
{
SBI s = new SBI();
ICICI i = new ICICI();
AXIS a = new AXIS();
System.out.println("SBI rate of interest: "+s.getroi());
System.out.println("ICICI rate of interest: "+i.getroi());
System.out.println("AXIS rate of interest: "+a.getroi());
}
}
