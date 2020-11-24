package task5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class Strings
{
    public static void main(String[] args)
    {
           List<String> list=new ArrayList();
           list.add("Rajesh");
           list.add("Ramesh");
           list.add("Seetha");
           list.add("Ravi");
           list.add("Anitha");
           list.add("Sarika");
           Collections.sort(list);
           System.out.println(list);
           System.out.println(Collections.binarySearch(list,"Ravi"));
           Collections.reverse(list);
           System.out.println(list);
           Collections.swap(list,2,4);
           System.out.println(list);
           List<String> list2=new ArrayList();
           list2.add("Rajesh");
           list2.add("Rajesh");
           list2.add("Rajesh");
           list2.add("Rajesh");
           list2.add("Rajesh");
           list2.add("Rajesh");
           Collections.fill(list2,"Raju");
           System.out.println(list2);
           Collections.copy(list2,list);
           System.out.println(list2);
           Collections.shuffle(list2);
           System.out.println(list2);
           System.out.println(Collections.min(list));
           System.out.println(Collections.max(list));
           Collections.rotate(list, -3);
           System.out.println(list);
           list.add("Rajesh");
           list.add("Rajesh");
           Collections.replaceAll(list, "Rajesh", "Rajesh Padmanabhuni");
           System.out.println(list);
           List subList=new ArrayList();
           subList.add("Rajesh Padmanabhuni");
           subList.add("Rajesh Padmanabhuni");
           subList.add("Rajesh Padmanabhuni");
           System.out.println(subList);
           System.out.println(Collections.indexOfSubList(list, subList));
           System.out.println(Collections.lastIndexOfSubList(list, subList));
           System.out.println(Collections.frequency(list, "Rajesh Padmanabhuni"));
           System.out.println(Collections.disjoint(list,list2));
           Collections.addAll(list, "Kanna","Mahesh");
           System.out.println(list);
           Collection<String> unmodifiableList = Collections.unmodifiableCollection(list);
           list.add("Rani");
           list.remove(0);
           System.out.println(unmodifiableList);
           Collection<String> unmodifiableCollection = Collections.unmodifiableCollection(list);
           list.add("Usha");
           list.remove(0);
           System.out.println(unmodifiableCollection);
           Collection<String> synchronizedCollection = Collections.synchronizedCollection(list);
           System.out.println(synchronizedCollection);
           Collection<String> synchronizedList = Collections.synchronizedList(list);
           System.out.println(synchronizedList);
           System.out.println(unmodifiableCollection);
           Collection<String> checkedCollection = Collections.checkedCollection(list,String.class);
           System.out.println(checkedCollection);
           Collection<String> checkedList = Collections.checkedList(list,String.class);
           System.out.println(checkedList);
           System.out.println(Collections.emptyList());
           String str="rajesh";
           System.out.println(Collections.singletonList(str));
           System.out.println(Collections.nCopies(5, "HCL"));
           
           
           SortedSet<String> set=new TreeSet();
           set.add("India");
           set.add("Australia");
           set.add("South Africa");
           Collection<String> unmodifiableSet = Collections.unmodifiableSet(set);
           set.remove("Australia");
           set.add("America");
           System.out.println(unmodifiableSet);
           Collection<String> unmodifiableSortedSet = Collections.unmodifiableSortedSet(set);
           set.remove("America");
           set.add("Europe");
           System.out.println(unmodifiableSortedSet);
           Collection<String> synchronizedSet = Collections.synchronizedSet(set);
           System.out.println(synchronizedSet);
           Collection<String> synchronizedSortedSet = Collections.synchronizedSortedSet(set);
           System.out.println(synchronizedSet);
           Collection<String> checkedSet = Collections.checkedSet(set,String.class);
           System.out.println(checkedSet);
           Collection<String> checkedSortedSet= Collections.checkedSortedSet(set,String.class);
           System.out.println(checkedSortedSet);
           System.out.println(Collections.emptySet());
           
           
           SortedMap<Integer,String> map=new TreeMap();
           map.put(1, "Red");
           map.put(1, "Blue"); 
           map.put(1, "Green");
           Map<Integer,String> unmodifiableMap = Collections.unmodifiableMap(map);
           map.remove(2);
           map.put(2,"Yellow");
           System.out.println(unmodifiableMap);
           Map<Integer,String> unmodifiableSortedMap = Collections.unmodifiableSortedMap(map);
           map.remove(1);
           map.put(1,"Blue");
           System.out.println(unmodifiableSortedMap);
           Map<Integer,String> synchronizedMap = Collections.synchronizedMap(map);
           System.out.println(synchronizedMap);
           Map<Integer,String> synchronizedSortedMap = Collections.synchronizedSortedMap(map);
           System.out.println(synchronizedMap);
           Map<Integer,String> checkedMap = Collections.checkedMap(map,Integer.class,String.class);
           System.out.println(checkedMap);
           Map<Integer,String> checkedSortedMap = Collections.checkedSortedMap(map,Integer.class,String.class);
           System.out.println(checkedMap);
           System.out.println(Collections.emptyMap());
           System.out.println(Collections.singletonMap(str,1));
           
          
           Iterator<String> Itr = Collections.emptyIterator();  
             while(Itr.hasNext()){  
                  System.out.println(Itr.next());  
             }  
             System.out.println("Iterator list is empty.");         
           
           
           
          
           
           
    }

 

}
 