package collection;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Lyh
 * @date 2021/10/18 5:29
 */
public class CollectionMethod {
    public static void main(String[] args) {
        List list = new ArrayList();
        //add添加单个元素
        list.add("jack");
        list.add(10);
        list.add(true);
        System.out.println(list);
        //remove删除元素
        list.remove(1);
        System.out.println(list);
        list.remove("jack");
        System.out.println(list);
        //contians查找元素是否存在

        list.add("jack");
        System.out.println(list.contains("jack"));
        System.out.println(list.contains("jac1k"));
        //size返回元素个数
        System.out.println(list.size());
        //isEmpty 判断是否为空
        System.out.println(list.isEmpty());
        //clear 清空
        //addAll添加多个元素
        ArrayList arrayList = new ArrayList();
        arrayList.add("红楼梦");
        arrayList.add("三国");
        list.addAll(arrayList);
        System.out.println(list);

        //contianAll 查找多个元素是否都存在
        //removeAll删除多个元素

    }
}
