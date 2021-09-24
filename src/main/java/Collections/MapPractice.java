package Collections;

import javafx.beans.binding.ObjectExpression;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class MapPractice {

    public Object findValueOf(Map map, Object key) {
        return map.get(key);
    }

    public Object[] findKeysOf(Map map, Object value) {
        List<Object> o=new ArrayList<>();
        for(Object key:map.keySet())
        {
            if(map.get(key).equals(value))
            {
               o.add(key);
            }
        }
        return o.toArray();
    }

    public Map<Integer, Integer> fibonacciTree(int size) {
        //lets follow the test case then ignore the first number 0 of sequence
        Map<Integer, Integer> map=new TreeMap<>();
        int[] value=new int[size+1];
        for(int i=1;i<=size;i++)
        {
            if(i==1)
            {
                value[0]=0;
                value[1]=1;
                map.put(i,value[i]);
            }
            else
            {
                value[i]=value[i-1]+value[i-2];
                map.put(i,value[i]);
            }
        }
        return map;
    }

    public Map<Integer, Integer> crazySpiral(Integer first, Integer second, Integer size) {
        Map<Integer, Integer> map=new TreeMap<>();
        int i=1;
        if(size>0)
        {
            map.put(i,first);
        }
        i++;
        if(size>1)
        {
            map.put(i,second);
        }
        i++;
        for(;i<=size;i++)
        {
            second=first+ second;
            first=second-first;
            map.put(i, second);
        }
        return map;
    }
}
