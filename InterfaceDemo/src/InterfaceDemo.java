interface Writer
{
    public abstract void write();
}
class Pen implements Writer
{
    public void write()
    {
        System.out.println("I am a Pen");
    }
}
class Pencil implements Writer
{
    public void write()
    {
        System.out.println("I am a Pencil");
    }
}
class Kit
{
    public void doSomething(Writer p)
    {
        p.write();
    }
}
public class InterfaceDemo
{
    public static void main(String[] args)
    {
        Kit k = new Kit();
        Writer p = new Pen();
        Writer pc = new Pencil();
        k.doSomething(p);
    }
}
