package DansDilemma;

import java.util.ArrayList;
import java.util.HashMap;

public class DansDilemma {

    public Integer dilemmaOfTwo(Double input1, Double input2) {
        HashMap<Double, Integer> map=new HashMap<>();
        map.put(input1+input2, 0);
        map.put(input1*input2, 0);
        map.put(input1-input2, 0);
        map.put(input2-input1, 0);
        if(input2!=0)
            map.put(input1/input2, 0);
        if(input1!=0)
            map.put(input2/input1, 0);
        int res=0;
        for(Double key:map.keySet())
        {
            res++;
        }
        return res;
    }

    public Integer dilemmaOfThree(Double input1, Double input2, Double input3) {
        HashMap<Double, Integer> map=new HashMap<>();
        map.put(input1+input2, 0);
        map.put(input1*input2, 0);
        map.put(input1-input2, 0);
        map.put(input2-input1, 0);


        map.put(input1+input3, 0);
        map.put(input1*input3, 0);
        map.put(input1-input3, 0);
        map.put(input3-input1, 0);


        map.put(input3+input2, 0);
        map.put(input3*input2, 0);
        map.put(input3-input2, 0);
        map.put(input2-input3, 0);

        if(input1!=0) {
            map.put(input2 / input1, 0);
            map.put(input3 / input1, 0);
        }
        if(input2!=0) {
            map.put(input3 / input2, 0);
            map.put(input1 / input2, 0);
        }
        if(input3!=0) {
            map.put(input2 / input3, 0);
            map.put(input1 / input3, 0);
        }

        int res=0;
        for(Double key:map.keySet())
        {
            res++;
        }
        return res;
    }

    public Integer dilemmaOfN(Double... args){
        HashMap<Double, Integer> map=new HashMap<>();
        for(int i=0; i<args.length;i++)
        {
            for (int j=i+1;j<args.length;j++)
            {
                Double arg=args[i];
                Double a=args[j];
                map.put(arg+a, 0);
                map.put(arg*a, 0);
                map.put(arg-a, 0);
                map.put(a-arg, 0);
                if(arg!=0)
                    map.put(a/arg, 0);
                if(a!=0)
                    map.put(arg/a, 0);
            }
        }
        int res=0;
        for(Double key:map.keySet())
        {
            res++;
        }
        return res;
    }
}
