public class Strings
{
    public static void main(Strings[] args)
    {
        String s1= "hi";
        String s2= "Hi";
        String s3 = new String("Hi");
        String s4 = "Hi";
        boolean stringAreTheSame = s1 == s2;
        boolean sTwoAndThreeAreTheSame = s2 == s3;
        boolean sTwoAndFourAreTheSame = s2 == s4;

        System.out.println("s1 is the same as s2: " +stringAreTheSame);
        System.out.println("s2 is the same as s3: " +sTwoAndThreeAreTheSame);
        System.out.println("s2 is the same as s4: " +sTwoAndFourAreTheSame);

        System.out.println("My strings are: " + s1 + " " + s2 + " " +s3);

        boolean correctComparison = s1.equals(s3);
        System.out.println("s1 is the same as s3: " +correctComparison);
    }
}
