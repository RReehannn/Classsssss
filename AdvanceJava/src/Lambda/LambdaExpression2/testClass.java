package Lambda.LambdaExpression2;

public class testClass {
    public static void main(String[] args) {

        SumInter sumInter = (a, b) -> a + b;


        System.out.println(sumInter.sum(2,15));
        System.out.println(sumInter.sum(8,8));

        LengthInter lengthInter = str -> str.length();
        System.out.println("Length of the String is: "+lengthInter.getLength("RehanShakeel"));
    }
}
