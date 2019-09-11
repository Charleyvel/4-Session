public class WhileLoop {
    public static void main(String[] args){
        boolean expression = true;
        int counter = 0;
        while (expression) //pretest loop
        {
            int integerInsideWhile= 10;
            counter++;

            if (counter == 5) //explicitely leave the loop
            {
               break;
            }
        }
        System.out.println("We are done with the loop and the counter is: "+counter);
    }
}

