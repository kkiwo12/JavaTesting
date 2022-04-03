import java.util.Scanner;
public class activity3no3 {
    public static void main(String[] args) {
        Scanner numthree = new Scanner(System.in);
        System.out.print("Enter an Integer Number:    ");
        int z = numthree.nextInt();
        int a=z%10;
        int bb=z/1000;
        int aa=bb%1000;
        int c=z/1000;
        String qw[]={" ","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Ninteen"};
        String ww[]={" ","Ten","Twenty","Thirty","Fourty","Fifty","Sixty","Seventy","Eighty","Ninety"};
        String hd=" Hundred ";
        String th=" Thousand ";
        if (z<10000){
            System.out.println("You entered a four digit number. \nThe number is "+(z)+"The number in words: "+qw[c]+th+qw[aa]+hd+" "+ww[aa]+" "+qw[a]);
        }

    }
}