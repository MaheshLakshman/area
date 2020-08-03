class Rectangle
{
    private int length;

    private int bredth;

    protected void getLength(int length)
    {
        this.length = length;
        System.out.println("The length is: "+ this.length);
    } 

    protected void getBredth(int bredth)
    {
        this.bredth = bredth;
        System.out.println("The bredth is: "+ this.bredth);
    }

    protected int calc()
    {
        return this.length * this.bredth;
    }
}

class Test extends Rectangle
{
    public static void main(String args[])
    {
        Rectangle rect = new Rectangle();
        rect.getLength(6);
        rect.getBredth(10);
        System.out.println("The Are of rectangle is: "+rect.calc());
    }
}