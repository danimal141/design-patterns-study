/**
 * Created by hideaki on 9/27/15.
 */
public class NameRepository implements Container {

    public String names[] = {"Robert" , "John" ,"Julie" , "Lora"};

    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator {
        int index = 0;

        @Override
        public boolean hasNext() {
            return index < names.length ? true : false;
        }

        @Override
        public Object next() {

            if (hasNext()){
                return names[index++];
            }
            return null;
        }
    }

}
