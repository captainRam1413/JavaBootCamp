import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;


public class NumberContainerSys {

    HashMap<Integer, Integer> index_no;
    HashMap<Integer, TreeSet<Integer>> no_index;

    public NumberContainerSys() {
        index_no = new HashMap<>();
        no_index = new HashMap<>();
    }

    public void change(int index, int number) {
        TreeSet<Integer> temp;
        

        if (index_no.containsKey(index)) {
            int num = index_no.get(index);
            temp = no_index.get(num);
            temp.remove(index);
            
            if (temp.size() == 0) {
                no_index.remove(num);
            }
            no_index.replace(num, temp);
            index_no.replace(index, number);
        }
        else{
            index_no.put(index, number);
        }
        if (no_index.get(number) == null) {
            temp = new TreeSet<>();
            temp.add(index);
            no_index.put(number, temp);
        }
        else
        {
            temp = no_index.get(number);
            temp.add(index);
            
            no_index.replace(number, temp);
        }
        
        
        
    }

    public int find(int number) {
        int index = -1;
        if (no_index.containsKey(number)) {
            TreeSet<Integer> temp = no_index.get(number);

            for (int i : temp) {
                index = i;
                break;
            }
        }

        return index;
    }


    public static void main(String[] args) {
        // [[],[75,40],[14],[41],[40],[27,40],[22,14],[85,14],[22,40],[18,34],[92,41],[22,40],[75,40],[59,34],[40],[27,14],[34],[14],[13,34],[40],[18,41]]
        NumberContainerSys nc = new NumberContainerSys();
        nc.change(75, 40);
        System.out.println(nc.find(14));
        System.out.println(nc.find(41));
        System.out.println(nc.find(40));
        nc.change(27, 40);
        nc.change(22, 14);
        nc.change(85, 14);
        nc.change(22, 40);
        nc.change(18, 34);
        nc.change(92, 41);
        nc.change(22, 40);
        nc.change(75, 40);
        nc.change(59, 34);
        System.out.println(nc.find(40));
        nc.change(27, 14);
        System.out.println(nc.find(34));
        System.out.println(nc.find(14));
        nc.change(13, 34);
        System.out.println(nc.find(40));
        nc.change(18, 41);
        
    }
}
