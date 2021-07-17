package customers;

import java.util.*;

public class AgeIterator implements Iterator<Customer> {
    private final Iterator<Customer> customerIterator;

    public AgeIterator(List<Customer> list){
        List<Customer> list1 = new ArrayList<>(list);
        Collections.sort(list1, Comparator.comparing(Customer::getAge));
        customerIterator = list1.iterator();
    }

    public Iterator<Customer> iterator(){
        return  this;
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
