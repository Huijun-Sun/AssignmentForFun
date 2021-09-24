package Collections;

import java.util.ArrayList;

public class ArrayLists {

    public ArrayList<Integer> addShit(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        list1.addAll(list2);
        return list1;
    }

    public Integer addShitTogether(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        int sum= list1.stream().mapToInt(v -> v).sum();
        sum+=list2.stream().mapToInt(v->v).sum();
        return sum;
    }

    public ArrayList<Integer> removeAll(ArrayList<Integer> original, Integer toRemove) {
        original.stream().filter(v->(v==toRemove));
        return original;
    }

    public boolean happyList(ArrayList<String> original) {
        boolean flag=true;
        String pre=null;
        for(String s:original)
        {
            if(s==null)
            {
                flag=false;
                break;
            }
            if(pre!=null)
            {
                boolean happyElement=false;
                for(int i=0;i<pre.length();i++)
                {
                    if(s.contains(String.valueOf(pre.charAt(i))))
                    {
                        happyElement=true;
                        break;
                    }
                }
                if(!happyElement)
                {
                    flag=false;
                    break;
                }
            }
            pre=s;
        }
        return flag;
    }
}
