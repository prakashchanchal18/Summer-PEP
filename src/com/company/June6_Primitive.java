package com.company;

import java.util.Scanner;

public class June6_Primitive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

/*        Data Type	Default Value (for fields)
          byte	0
          short	0
          int	0
          long	0L
          float	0.0f
          double	0.0d
          char	'\u0000'
          String (or any object)	null
          boolean	false
 */

        // 1. byte : -128 to 127
        byte b = sc.nextByte();
        System.out.println(b);

        // 2. short :  -32,768 to 32,767
        short s = sc.nextShort();
        System.out.println(s);

        // 3. int : -2^31 to  2^31 - 1
        int i = sc.nextInt();
        System.out.println(i);

        // 4. long : -2^63 to 2^63 - 1
        long l = sc.nextLong();
        System.out.println(l);

        // 5. float : 6 decimal digits
        float f = sc.nextFloat();
        System.out.println(f);

        // 6. double : 15 decimal digits
        double d = sc.nextDouble();
        System.out.println(d);

        // 7. boolean: true and false
        boolean b0 = sc.nextBoolean();
        System.out.println(b0);

        // 8. char : '\u0000' (or 0) to '\uffff' (or 65,535)
        char c = sc.next().charAt(0);
        System.out.println(c);
    }
}
