public class MyInteger {
    private int value;
    public MyInteger(int value){
        this.value=value;
    }
    public int getValue(){
        return value;
    }
    public boolean isEven(int value){
        return (value%2==0);
    }
    public boolean isOdd(int value){
        return (value %2==1);
    }
    public boolean isPrime(int value){
        int counter=0;
        for (int i=1;i<value;i++){
            if (value%i==0)
                counter++;
        }
        return (value==0);
    }
    public static boolean isEven(MyInteger myInteger){
        return (myInteger.value %2==0);
    }
    public static boolean isOdd(MyInteger myInteger){
        return (myInteger.value%2==1);
    }
    public static boolean isPrime(MyInteger myInteger){
        int counter=0;
        for (int i=1;i<myInteger.value;i++){
            if (myInteger.value%i==0)
                counter++;
        }
        return (counter==0);
    }
    public boolean equals(int value){
        return (this.value==value);
    }
    public static boolean equals(MyInteger myInteger,int value){
        return (myInteger.value==value);
    }
    public static int parseInt(String str){
        double digit=-1;
        int res=0;
        for (int i=0;i<str.length();i++){
            if (str.charAt(i) <= '9'& str.charAt(i)>='0') {
            digit = ((str.charAt(i) -'0')*(int)(Math.pow(10,(str.length()-i-1))));
            }
            res+=digit;
        }
        return res;
    }
    public static void main(String[] args) {
        int num =parseInt("3224");
        System.out.println(num);

    }
}
