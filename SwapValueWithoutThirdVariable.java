
public class SwapValueWithoutThirdVariable
{
    public static void swapWithoutThirdVar(int a,int b){
        System.out.println("Before Swap");
        System.out.println("value of a = "+a+" value of b = "+b);
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("After Swap");
        System.out.println("value of a = "+a+" value of b = "+b);
    }
	public static void main(String[] args) {
		swapWithoutThirdVar(12,34);
	}
}
