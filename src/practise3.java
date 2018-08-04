import java.util.*;

/**
 * Created by Emma on 2018/8/4.
 */
public class practise3 {
    public static void main(String[] args) {
        Map<Integer, List<Integer>> map1 = new HashMap<Integer, List<Integer>>();
        List<Integer> list1 = new ArrayList<Integer>();

        System.out.println("随机生成50个小于100的数,分别为:" );
        for (int i = 0; i < 50; i++) {
            int num = (int) ((Math.random()) * 101);
            list1.add(num);
            System.out.print(num+",");
        }

        for(int j=1;j<10;j++){
            int key=j;
            List<Integer> list_sort=new ArrayList<Integer>();
            for(int i = 0 ; i < list1.size() ; i++) {
                if(j==(int)list1.get(i)/10){
                    list_sort.add(list1.get(i));
                }
            }
            map1.put(key,list_sort);
        }

        System.out.println();
        System.out.print("Map中的数据为:");
        for(Integer key:map1.keySet()){
            List<Integer> list3=map1.get(key);
            System.out.print(key+"=>"+list3+",");
        }

        for(Integer key:map1.keySet()){
            List<Integer> list3=map1.get(key);
            Collections.sort(list3);
            map1.put(key,list3);
        }
        System.out.println();
        System.out.print("排序后Map的数据为:");

        for(Integer key:map1.keySet()){
            List<Integer> list3=map1.get(key);
            System.out.print(key+"=>"+list3+",");
        }






    }



}






