package customers;

import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class FilterIterator<T> implements Iterator<T> {
    private List<T> list;
    private Predicate<T> predicate;
    private int position;

    public  FilterIterator(List<T> list, Predicate<T> predicate){
        this.list = list;
        this.predicate = predicate;
        this.position = 0;
    }

    @Override
    public boolean hasNext() {
        int tempPosition = position;
        while(tempPosition<list.size()){
            T object = list.get(tempPosition);
            if(predicate.test(object)){
                return true;
            }
            else{
                tempPosition++;
            }
        }
        return false;
    }

    @Override
    public T next() {
        int tempPosition = position;
        while(tempPosition<list.size()){
            T object = list.get(tempPosition);
            if(predicate.test(object)){
                position = tempPosition+1;
                return object;
            }
            else{
                tempPosition++;
            }
        }
        return null;
    }

    @Override
    public void remove() {

    }
}