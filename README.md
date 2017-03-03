#CodeGuide
=====
principles or guidance for writing good code that OOP student can apply.
=====
###In public class use accessor methods
While creating a class, do not write a class like this
```
public class Student {
    public String name;
    public long id;
    ...
}

```
The data field (these attributes) can access directly. So that it's hard to maintain the value of variable, enforce invariants. And it's not `Encapsulation`. Public class should always be the private field, setting **the attributes to be private**, use **public accessor (getters) methods** to get the value of each attribute, and *public mutator (setters) methods* to set each attribute.

```
public class Student {
    //attributes
    private String name;
    private long id;

    //constructor
    ...

    //accessor method for name
    public String getName() {
        return this.name;
    }

    //accessor method for id
    public long getId() {
        return this.id;
    }

    //mutator method for name
    public void setName( String newName ) {
        this.name = newName;
    }

    //mutator method for id
    public void setId( long newId ) {
        this.id = newId;
    }

}

```

Exercise: [Student class](https://github.com/aommoaGitHub/codeguide/blob/master/src/codeguide/Student.java)

Reference: [Effective Java Chapter 4 Item:14](http://www.ebooksbucket.com/uploads/itprogramming/java/Effective_Java_2nd_Edition.pdf), Joshua Bloch, Second Edition.

=====
###Use interfaces only for definition type
Interface class is used to **type** classes. The classes which implement the same interface are the same type. From the code below, it's interface which group classes that have shape such as triangular, square, circle, rectangle, etc.
```
public interface Shape {
    public boolean contains(Point P);
    public double perimeter(Point[] points);
}
```
Which classes implement Shape interface, it means you can invoke contain(Point p) that tell this shape has point at p(x,y) or not, and perimeter(Point[] points) tell this shape's perimeter.
So it's inappropriate to use the interface in another purpose.
Constant interface is interface that have no method, have only constant variable. Such the code below
```
Public interface AtomConstant {
  static final double ELECTRON_MASS = 9.10938356e-31;
  static final double ELECTRON_CHARGE = -1.60217662e-19;
  static final double PROTON_MASS = 1.6726219e-27;
  static final double PROTON_CHARGE = 1.60217662e-19;
}
```
Imagine that you have 'A' class implement AtomConstant and you have 'B' class extends the 'A' class. So both A and B can use constants in AtomConstant although only A has to use these constants. This makes confusing and pollute name spaces in memory.

Exercise: [Triangular](https://github.com/aommoaGitHub/codeguide/blob/master/src/codeguide/Triangular.java) class implements [Shape](https://github.com/aommoaGitHub/codeguide/blob/master/src/codeguide/Shape.java) interface and [Point](https://github.com/aommoaGitHub/codeguide/blob/master/src/codeguide/Point.java) class is used.

Reference: [Effective Java Chapter 4 Item:19](http://www.ebooksbucket.com/uploads/itprogramming/java/Effective_Java_2nd_Edition.pdf), Joshua Bloch, Second Edition.
