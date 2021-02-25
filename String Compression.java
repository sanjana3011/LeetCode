class Solution {
    public int compress(char[] chars) {
        int i=0;
        int j=0;
        int n=chars.length;
        while(i<n && j<n){
            int count=1;
            while(j+1<n && chars[j]==chars[j+1])
            {
                count++;
                j++;
            }
            if(count==1) { chars[i]=chars[j]; i++; j++; }
            else{
                chars[i]=chars[j];
                int len=(int)(Math.log10(count)+1);
                while(len>0)
                {
                    chars[++i]=Character.forDigit((int)(count/(Math.pow(10.0,len-1))), 10);
                    count=(int)(count%(Math.pow(10.0,len-1)));
                    len--;
                }
                i++;
                j++;
            }
                
        }
        
        return i;
    }
}