package com.company.CollectionDemo;
import java.util.*;
public class Maximum {
    static int firstMaximum(List<Integer> list)
    {
        return Collections.max(list);
    }
    static List twoMaximum(List<Integer> list)
    {
        Collections.sort(list, Collections.reverseOrder());

        List newList=list.subList(0,2);

        return newList;
    }
    static List maximum(List<Integer> list,int k)
    {
        Collections.sort(list, Collections.reverseOrder());

        List newList=list.subList(0,k);

        return newList;
    }
    public static void main(String ar[])
    {
        List list=new ArrayList();
        list.add(10000);
        list.add(202);
        list.add(50);
        list.add(40);
        list.add(400);
        list.add(45);

        System.out.println(twoMaximum(list));
        System.out.println(maximum(list,4));

    }
}
