package Pattern;

public class Pattern {
    public static void main(String[] args) {
        // pattern01(5);
        // pattern02(5);
        // pattern03(5);
        // pattern04(5);
        // pattern05(5);
        // pattern06(5);
        // pattern07(5);
        // pattern08(5);
        // pattern10(5);
        pattern22(5);
    }

    public static void pattern02(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern01(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern03(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print((j + 1) + " ");
            }
            System.out.println();
        }
    }

    public static void pattern04(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static void pattern05(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern06(int n) {
        for (int i = n; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void pattern07(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void pattern08(int n) {
        for (int i = n; i >= 0; i--) {
            for (int j = 0; j <= n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            for (int j = 0; j <= n - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void pattern09(int n) {
        for (int i = n; i >= 0; i--) {
            for (int j = 0; j <= n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            for (int j = 0; j <= n - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
        for (int i = n; i >= 0; i--) {
            for (int j = 0; j <= n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            for (int j = 0; j <= n - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void pattern10(int n) {
        for (int i = 0; i <= 2 * n - 1; i++) {
            int s = i;
            if (s > n) {
                s = 2 * n - i;
            }
            for (int j = 0; j < s; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern11(int n) {
        boolean b = true;
        boolean b1 = false;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if (b) {
                    System.out.print("1 ");
                    b = !b;
                } else {
                    System.out.print("0 ");
                    b = !b;
                }
            }
            if (b1) {
                b = true;
                b1 = !b1;
            } else {
                b = false;
                b1 = !b1;
            }

            System.out.println();
        }
    }

    public static void pattern12(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(j + 1);
            }
            for (int j = 0; j < (2 * n) - (2 * (i + 1)); j++) {
                System.out.print("_");
            }
            for (int j = i; j >= 0; j--) {
                System.out.print(j + 1);
            }
            System.out.println();
        }
    }

    public static void pattern13(int n) {
        int count = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((count++) + " ");
            }
            System.out.println();
        }
    }

    public static void pattern14(int n) {
        // int count =1;
        for (int i = 0; i < n; i++) {
            for (char j = 'A'; j <= 'A' + i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void pattern15(int n) {

        for (int i = n; i > 0; i--) {
            for (char j = 'A'; j < 'A' + i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void pattern16(int n) {

        for (int i = 0; i < n; i++) {
            char temp = (char) ('A' + i);
            for (int j = 0; j <= i; j++) {

                System.out.print(temp + " ");
            }
            System.out.println();
        }
    }

    public static void pattern17(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            char ch = 'A';
            int breack = (2 * i - 1) / 2;
            for (int j = 0; j < 2 * i + 1; j++) {
                if (j <= breack) {
                    System.out.print("" + ch++);
                } else {
                    System.out.print("" + ch--);
                }
            }
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void pattern18(int n) {
        for (int i = 0; i < n; i++) {
            for (char j = (char) ('E'-i); j <='E'; j++) {
                
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }

    public static void pattern19(int n)
    {
        for (int i = n; i >=0; i--) {
            for (int j = i; j >=0; j--) {
                System.out.print("*");
            }
            for (int j = 0; j < (2*n)-(2*i); j++) {
                System.out.print(" ");
            }
            for (int j = i; j >=0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i <=n; i++) {
            for (int j = i; j >=0; j--) {
                System.out.print("*");
            }
            for (int j = 0; j < (2*n)-(2*i); j++) {
                System.out.print(" ");
            }
            for (int j = i; j >=0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern20(int n )
    {
        for (int i = 0; i <= 2 * n - 1; i++) {
            int s = i;
            if (s > n) {
                s = 2 * n - i;
            }
            for (int j = 0; j < s; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < (2*n)-(2*s); j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < s; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern21(int n)
    {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i ==0|| j == 0|| i==n-1 || j == n-1) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void pattern22(int n)
    {
        for (int i = 0; i < 2*n-1; i++) {
            for (int j = 0; j < 2*n-1; j++) {
                int top = i;
                int left = j;
                int right = (2*n-2)-j;
                int down = (2*n-2)-i;
                System.out.print(" "+(n-Math.min(Math.min(top, down), Math.min(left, right))));
            }
            System.out.println();
        }
    }
}
