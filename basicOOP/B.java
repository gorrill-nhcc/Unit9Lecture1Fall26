package basicOOP;

/*
we use the extends keyword to extend a class
because B extends A -> B is a A
Because B is a A -> it has all of the stuff that A has
Descendant class only have direct access to public or protected members
This practice enforces encapsulation
*/

public class B extends A{

    private double bDouble;

    public B(){
        super(1, "itsaB");
    }

    public B(int aInt, String aString){
        super(aInt, aString);
    }

    public void doubleTheDoubleMakeInt(){
        super.setAInt((int)Math.ceil(Math.pow(bDouble, 2)));
    }

}
