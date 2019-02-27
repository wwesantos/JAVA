class RecursiveQueue<E> {
    private E e;
    private RecursiveQueue<E> next;

    public void add(E toAdd){
        if (toAdd == null){
            return;
        }else if (e == null) {
            e = toAdd;
            System.out.println(toAdd + " added with success");
        }else if (next == null){
            next = new RecursiveQueue<E>();
            next.add(toAdd);
        }else{
            next.add(toAdd);
        }
        return;
    }

    public void printFirst(){
        if (e == null){
            return;
        }
        System.out.println("First: " + e);
    }

    public void printLast(){
        if (e == null){
            return;
        }

        if(next == null){
            System.out.println("Last: " + e);
        }else{
            next.printLast();
        }
    }

    public void printAll(){
        if(e == null){
            return;
        }else{
            System.out.println(e);
        }

        if(next != null){
            next.printAll();
        }
    }

    public void printAllDesc(){
        
        if(next != null){
            next.printAllDesc();
        }

        if(e == null){
            return;
        }else{
            System.out.println(e);
        }
    }

    public boolean get(){
        if (e != null){
            if(next == null){
                System.out.println("Get: " + e);
                e = null;
                return true;
            }else if(next.get()){
                next = null;
            }
        }
        return false;
    }
}