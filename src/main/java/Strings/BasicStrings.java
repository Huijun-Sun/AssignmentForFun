package Strings;

import com.sun.deploy.util.StringUtils;

public class BasicStrings {
    /*public static void main(String []args)
    {
        System.out.println((char)('A'+('z'-'a')));
    }*/

    public String flipConcat(String string1, String string2) {
        return string2+string1;
    }

    public char getChar(String string, int index) {
        //string.charAt()
        return string.charAt(index);

    }

    public String iCantSee(String string) {
        return string.replaceAll("(?s)."," ");
    }

    public String loudAndClear(String string) {
        return string.toUpperCase();
    }

    public String reverseCase(String string) {
        char []value=string.toCharArray();
        for(int i=0;i<string.length();i++)
        {
            /*if(value[i]>='a'&&value[i]<='z')*/
            if(Character.isLowerCase(value[i]))
            {
                //System.out.println(value[i]);
                value[i]= Character.toUpperCase(value[i]);
                //System.out.println(value[i]);
            }
            else if(Character.isUpperCase(value[i]))
            {
                value[i]= Character.toLowerCase(value[i]);
            }
        }
        return String.valueOf(value);
    }

    public String oneAtATime(String string1, String string2) {
        StringBuilder sb=new StringBuilder();
        int i=0, j=0;
        while(i<string1.length()||j<string2.length())
        {
            if(i<string1.length())
            {
                sb.append(string1.charAt(i));
            }
            if(j<string2.length())
            {
                sb.append(string2.charAt(j));
            }
            i++;
            j++;
        }
        return sb.toString();
    }
}
