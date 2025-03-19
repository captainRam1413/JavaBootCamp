public class NoOfColorBox {
    public static void main(String[] args) {
        System.out.println(coloredCells(3));
    }

    public static long coloredCells(int n) {
        int count =0;
        // int jump =4;
        // while(n>1)
        // {
        //     count = count+jump;
        //     jump+=4;
        //     n--;
        // }
        System.out.println();
        System.out.println(n);
        int nn = n-1;
        System.out.println(nn);
        float temp = nn/2;
        System.out.println(temp);
        temp = n*temp;
        System.out.println(temp);
        temp *=4;
        System.out.println(temp);        
        return (int)temp+1;
    }
}
