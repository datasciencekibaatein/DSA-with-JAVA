import java.util.ArrayList;
import java.util.List;

class ArrayListLearn{
    public static void main(String[] args){
        List<Integer> arr = new ArrayList<>();
        arr.add(34);
        arr.add(54);

        arr.add(0,85); //add at the index 0
        System.out.println(arr.get(1)); //get element from array
        System.out.println(arr.set(0,67));// it set the element at given index and returns the old element of that index
        arr.remove(0);//remove the element from given index
        arr.remove(Integer.valueOf(34));// rev
        System.out.println("Size: "+arr.size());// to know the length of array
        System.out.println("is empty: "+arr.isEmpty());//to know is array empty
        System.out.println("Contains: "+arr.contains(54));// contains
        System.out.println("indexOf: "+arr.indexOf(54));
        arr.clear();
        System.out.println(arr);

        List<Integer> arr01 = new ArrayList<>(30); // initialize arraylist with capacity
        List<Integer> arr02 = new ArrayList<>(arr);//copy element from existing collection
        System.out.print(arr02);
    }
}