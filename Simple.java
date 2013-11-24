
// ************************************************************
// Simple.java
// Name: Guanyi Fang
// Print a simple message about Java.
// ************************************************************

public class Simple {
    public static void main (String[] args) {
        
        //1. simple          valid, but not good. The initial letter should be capital.
        //2. SimpleProgram   valid, but too long
        //3. 1 Simple        invalid, should not start with a digit
        //4. _Simple_        valid, but not good. Underscore here is meaningless
        //5. *Simple*        invalid, because of the *
        //6. $123_45         valid, but not good. The name is not relate to the program
        //7. Simple!         invalid, because of the !
        
        System.out.println ("Java rocks!!");
    }
}