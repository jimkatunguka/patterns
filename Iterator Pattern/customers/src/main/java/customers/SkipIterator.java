package customers;

import java.util.Iterator;
import java.util.List;

public class SkipIterator<Customer> implements Iterator<Customer> {
    private List<Customer> list;
    private int position;

    public SkipIterator (List<Customer> list){
        this.list = list;
        this.position = 0;
    }

    @Override
    public boolean hasNext() {
        return position < list.size()-1;
    }

    @Override
    public Customer next() {
        Customer cust = list.get(position);
        position +=2;
        return cust;
    }
}
