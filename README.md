CodeGuide
principles or guidance for writing good code that OOP student can apply.
*****
###In public class use accessor methods
do not write a class like this
```
public class Student {
    public String name;
    public long id;
    ...
}

``
The data field (these attributes) can access directly. So that it's hard to maintain the value of variable, enforce invariants. And it's not `Encapsulation`. Public class shold always be the private field, setting *the attributes to be private*, use *public accessor (getters) methods* to get the value of each attribute, and *public mutator (setters) methods* to set each attribute.

```
public class Student {
    //attributes
    private String name;
    private long id;

    //construstor
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

``
Reference: [Effective Java Chapter 4 Item:14](http://www.ebooksbucket.com/uploads/itprogramming/java/Effective_Java_2nd_Edition.pdf), Joshua Bloch, Second Edition.

###use interfaces only for defination type



