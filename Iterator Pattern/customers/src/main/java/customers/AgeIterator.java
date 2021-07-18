package customers;

import java.util.*;

public class AgeIterator implements Iterator<Customer> {
    private final Iterator<Customer> customerIterator;
    private final List<Customer> list;

    public AgeIterator(List<Customer> list){
        this.list = new ArrayList<>(list);
        this.list.sort(Comparator.comparing(Customer::getAge));
        customerIterator = this.list.iterator();
    }

    @Override
    public boolean hasNext() {
        return customerIterator.hasNext();
    }

    @Override
    public Customer next() {
        return (Customer) customerIterator.next();
    }

    @Override
    public void remove(){
        customerIterator.remove();
    }
}
