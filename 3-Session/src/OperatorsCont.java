public class OperatorsCont
{
    public static void main(Strings[] args)
    {
        //alternative to write more condensed code
        int x = 10;
        //conditional operator: ?
        // "? means - if this condition is matched, then do this..."
        // ": means - continue or go on..."

        x = (x > 0) ? 100 : (x > -10) ? (x > -3) ? -2 : 6 : -5;

        //we are now adding the below, (adding 100)
        x += (x > 0) ? 100 : -100;
        System.out.print(x);
    }
}
