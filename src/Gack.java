/**
 * Created by hjh on 2017-04-05.
 */
class Gack{
    public static void main(String args[]){
        int a = 10;
        int b = 9;

        int add = a+b;
        int sub = a-b;
        int mult = a*b;
        int div = a/b;
        int mod = a%b;

        System.out.println("두수의 합은? :" +add);
        System.out.println("두수의 차는? :" +sub);
        System.out.println("두수의 곱은? :" +mult);
        System.out.println("두수의 나눗셈은? :" +div);
        System.out.println("두수를 나눈 나머지는? :" +mod);
    }
}