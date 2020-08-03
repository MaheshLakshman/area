# Area of a Rectangle

Area = Length * Breadth

###### Program
```java
class Rectangle
{
    private int length;

    private int breadth;

    protected void getLength(int length)
    {
        this.length = length;
        System.out.println("The length is: "+ this.length);
    } 

    protected void getBreadth(int breadth)
    {
        this.breadth = breadth;
        System.out.println("The breadth is: "+ this.breadth);
    }

    protected int calc()
    {
        return this.length * this.breadth;
    }
}

class Test extends Rectangle
{
    public static void main(String args[])
    {
        Rectangle rect = new Rectangle();
        rect.getLength(6);
        rect.getBreadth(10);
        System.out.println("The Area of rectangle is: "+rect.calc());
    }
}
```
#### Compile java program

javac ClassName.java


#### Run java Program

java ClassName


### Response

>compile java program : javac Test.java

>run java program : java Test

```java
The length is: 6
The breadth is: 10
The Area of rectangle is: 60
```


