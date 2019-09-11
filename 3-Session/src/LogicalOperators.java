public class LogicalOperators
{
    public static void main(Strings[] args)
    {
        // && = AND
        // || = OR
        // ! = NOT
        // ^ = EXCLUSIVE OR = if both true, then it becomes false
        boolean a = false;
        boolean b = false;
        boolean c = true;
        boolean d = true;

        //boolean result = !(((!a && b) || !(c || d)) ^ !(b ^ !a));
                    // This is testing true and true, with Exclusive.
        boolean result = c ^ d;
        System.out.println("The result is: " +result);

        boolean newResult = a | c; //bitwise operator
        System.out.println("The newResult is: " +newResult);
        //bitwise shifts the bits of the numbers
        // | is the bitwise or operator
        int y = 113;
        int z = 211;
        int intResult = y|z;
        System.out.println("The intResult is: " +intResult);
    }
}
