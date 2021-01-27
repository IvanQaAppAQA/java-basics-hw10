public class ExampleException {
    public static int rectangleArea(int a, int b) throws IllegalArgumentException {

        if (a<=0 ||b<=0)
     {
         throw new IllegalArgumentException("rectangle side could not be less 0!");
     }
    return  a * b;// TODO put your code here

    }
}


