public class StringToInt {
    public static void main(String[] args) {
        System.out.println(myAtoi("-91283472332"));
        
    }

    public static int myAtoi(String s) {
        int val =0;
        boolean ispos = true;
        int i =0;
        String valS = "";
        
        for(char ch : s.toCharArray())
        {
            if(ch == '-' && ispos && valS.length()<=0){
                ispos = false;
            }
            else if(ch == ' ')
            {
                continue;
            }
            else if(ch>= '0' && ch<='9')
            {
                valS +=""+ch;
            }
            else if(!(ch>= '0' && ch<='9'))
            {
                break;
            }
            
        }
        // val = Integer.parseInt(valS);
        System.out.println("vals : "+valS);
        if (valS.length()<=0) {
            return 0;
        }
        if (!ispos) {
            val =(int) Long.parseLong("-"+valS);
        }
        else
        {
            val =(int) Long.parseLong(valS);
        }
        if (val > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }
        return val;
    }
}
