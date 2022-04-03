import java.util.Scanner;
public class Testing {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an Integer Number:    ");
        int numInput = scan.nextInt();
        int thousandsPlace = numInput / 1000;
        int hundredsPlace = (numInput - thousandsPlace * 1000) / 100;
        int tensPlace = (numInput - ((thousandsPlace * 1000) + (hundredsPlace * 100))) / 10;
        int onesPlace = numInput - ((thousandsPlace * 1000) + (hundredsPlace * 100) + (tensPlace * 10));
        String qw[]={" ","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Ninteen"};
        String ww[]={" ","Ten","Twenty","Thirty","Fourty","Fifty","Sixty","Seventy","Eighty","Ninety"};
        String hd=" Hundred ";
        String th=" Thousand ";
        if (numInput<10000){
            System.out.println("You entered a four digit number. \nThe number is "+(numInput)+"The number in words: "+qw[thousandsPlace]+th+qw[hundredsPlace]+hd+" "+ww[tensPlace]+" "+qw[onesPlace]);
        }

    }
}