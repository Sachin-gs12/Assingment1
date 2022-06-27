public class printdubString
{
    public static String isdub(String s)
    {
        for(int i=0;i<s.length();i++)
        {
            for(int j=i+1;j<s.length();j++)
            {
                if(s.charAt(i)==s.charAt(j))
                {
                    return "true";
                }
            }
        }
        return "false";
    }
    public static void main(String args[]) {
      System.out.println(isdub("gslabs"));
    }
}

