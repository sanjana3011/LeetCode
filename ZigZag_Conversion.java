class Solution {
    public String convert(String s, int numRows) {
        int N=s.length();
        int row=0;
        int pos;
        String str="";
        if(numRows==1)
        {
            return s;
        }
        while(row<numRows)
        {
            pos=row;
            if(row==0 || row==numRows-1)
            {
                while(pos<N && str.length()<N)
                {
                    str+=s.charAt(pos);
                    pos=pos+ (2*numRows)-2;
                    System.out.println(pos);
                }
            }
            else
            {
                int check=1;
                while(pos<N && str.length()<N)
                {
                    str+=s.charAt(pos);
                    if(check%2!=0)
                    {
                        pos=pos+(2*(numRows-row))-2;
                        System.out.println(pos);
                        check++;
                    }
                    else
                    {
                        pos=pos+(2*row);
                        System.out.println(pos);
                        check++;
                    }
                }
            }
            row++;
        }
        return str;
         
    }
}
