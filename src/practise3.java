import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Emma on 2018/8/4.
 */
public class practise3 {
    public static void main(String[] args) {
        Map<Integer, List<Integer>> map1 = new HashMap<Integer, List<Integer>>();
        List<Integer> list_sort=new ArrayList<Integer>();
        List<Integer> list1 = new ArrayList<Integer>();

        System.out.println("随机生成50个小于100的数,分别为:" );
        for (int i = 0; i < 50; i++) {
            int num = (int) ((Math.random()) * 101);
            list1.add(num);
            System.out.print(num+",");
        }

        System.out.println();
        System.out.println("Map中的数据为:");



    }



}






