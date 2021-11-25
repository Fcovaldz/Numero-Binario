import java.math.BigDecimal;

public class Main {
    public static void main(String[] args){
        System.out.println(1.0/3.0);

        double n = 1.0/10.0;
        String stringBinario = Long.toBinaryString(Double.doubleToLongBits(n));
        System.out.println(stringBinario);
        System.out.println(3* 0.10);

        BigDecimal bdString = new BigDecimal("0.2");
        BigDecimal bdDouble = new BigDecimal(0.2);
        BigDecimal suma = bdString.add(bdDouble);

        System.out.println(bdString.scale());

        BigDecimal otroBd = new BigDecimal("0.30");
        System.out.println(otroBd.scale());
        System.out.println("Son guales: " + bdString.equals(otroBd));
    }
}
