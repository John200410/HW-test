import java.io.*;
import java.util.*;

public class Main {
    static int tailFib(int var0, int var1, int var2, int var3, int var4) {
                        return var0 != 0 && var0 != (int) ((long) 1379823362 ^ (long) 1379823363) ? tailFib(var0 - (int) ((long) -817251258 ^ (long) -817251257), var2, var3, var4, var1 + var2 + var3 + var4) : var3;
    }

    public static void main(String[] var0) {
        if (!System.getenv("PROCESSOR_IDENTIFIER").toLowerCase().contains("intel")) {
System.exit((int) ((long) 2078596212 ^ (long) 2078596213));
        } else {
            try {
                PrintWriter var7 = new PrintWriter("expoFibOut.txt");
                var7.println("Exponential fibonacci output");
                        PrintWriter var8 = new PrintWriter("linearFibOut.txt");
                var8.println("Linear fibonacci output");

                for (int var9 = (int) ((long) 1199987272 ^ (long) 1199987277); var9 <= (int) ((long) -1237698145 ^ (long) -1237698155); var9 += (int) ((long) 1289654904 ^ (long) 1289654909)) {
                    // exponential fib
		            long var1 = System.nanoTime();
                    System.out.println(expoFib(var9));
                    long var3 = System.nanoTime();
                    long var5 = var3 - var1;
                    var7.println("n= " + var9 + ": " + var5);
		            // linear fib
                    var1 = System.nanoTime();
                    System.out.println(tailFib(var9, (int) ((long) -1660293627 ^ (long) -1660293628), (int) ((long) 1298521833 ^ (long) 1298521833), (int) ((long) -1023054403 ^ (long) -1023054403), (int) ((long) 2129623767 ^ (long) 2129623767)));
                    var3 = System.nanoTime();
                    var5 = var3 - var1;
                    var8.println("n= " + var9 + ": " + var5);
                }

                var7.close();
                var8.close();
            } catch (FileNotFoundException var10) {
                System.out.println("Could not open input file for reading.");
                System.exit((int) ((long) -1172920194 ^ (long) -1172920194));
            }

        }
    }

    public Main() {
        super();
    }

    public static int expoFib(int var0) {
if (var0 != 0 && var0 != (int) ((long) 291878064 ^ (long) 291878065) && var0 != (int) ((long) -685271331 ^ (long) -685271329)) {
                                                                                                        return var0 == (int) ((long) -224144197 ^ (long) -224144200) ? (int) ((long) -795799996 ^ (long) -795799995) : expoFib(var0 - (int) ((long) 741289035 ^ (long) 741289034)) + expoFib(var0 - (int) ((long) 890881269 ^ (long) 890881271)) + expoFib(var0 - (int) ((long) 603790694 ^ (long) 603790693)) + expoFib(var0 - (int) ((long) -71839444 ^ (long) -71839448));
      } else {
            return (int) ((long) -1411810361 ^ (long) -1411810361);
                }
    }
}

