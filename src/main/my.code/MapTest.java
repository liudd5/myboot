import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest {

    public static  void main(String[] args){
        List arrayList = new ArrayList();
        Map tempMap = new HashMap();
        for (long i=1;i<100000000;i++){
            if(i%1000000l==0){
                System.out.println("第:"+i+"次 = " + i);
                arrayList.add(tempMap);
                tempMap = new HashMap();
            }
            tempMap.put(i,i);
        }
        System.out.print("结束");
        System.out.print(arrayList);
    }


}
