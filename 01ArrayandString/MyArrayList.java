class MyArrayList<T> {

    private final int INITIAL_CAPACITY = 10;
    private Object[] array = {};
    private int arrayLength;
    private int arraySize;

    public MyArrayList(){

        this.array = new Object[this.INITIAL_CAPACITY];
        this.arrayLength = this.array.length;
        this.arraySize = 0;

    }

    public MyArrayList(int capacity){

        this.array = new Object[capacity];
        this.arrayLength = this.array.length;
        this.arraySize = 0;

    }

    @SuppressWarnings("unchecked")
    public T get(int index){

        if (0 > index || index >= this.arrayLength){

            throw new ArrayIndexOutOfBoundsException();

        }else{

            return (T)array[index];

        }

    }

    public void set(int index, T item){

        /* Recursive way
        if(index >= this.arrayLength){

            this.upsize();
            this.set(index, item);
            return;

        }else if(index < 0){

            throw new ArrayIndexOutOfBoundsException();

        }
        this.arrayLength = this.array.length;
        */

        if(0 > index || index >= this.arrayLength){

            throw new ArrayIndexOutOfBoundsException();

        }else{

            this.array[index] = item;
            this.arraySize++;

        }
        
    }

    public void add(T item){

        if(this.arraySize == this.arrayLength){

            resize();

        }

        this.array[this.arraySize++] = item;

    }

    public void remove(int index){

        if(0 > index || index >= this.arrayLength){

            throw new ArrayIndexOutOfBoundsException();

        }else{

            this.array[index] = null;
            this.arraySize--;

        }

    }

    @SuppressWarnings("unchecked")
    public void remove(T item){

        for(int i = 0; i < this.arrayLength; i++){

            
            if(((T)this.array[i]).equals(item)){

                this.array[i] = null;

            }

        }

    }

    /* 2019. 03. 06 upsize → resize */
    public void resize(){

        Object[] newArray = new Object[this.arrayLength * 2];
        for(int i = 0; i < this.arrayLength; i++){

            newArray[i] = this.array[i];

        }

        this.array = newArray;
        this.arrayLength = this.array.length;

    }

    public int getSize(){

        return this.arraySize;

    }

    public int getLength(){

        return this.arrayLength;

    }

    @SuppressWarnings("unchecked")
    public String toString(){

        String s = "";
        for(T t : (T[])this.array){
            
            if(t == null){

                s +=  " , ";

            }else{

                s += t.toString() + ", ";

            }
            

        }

        return s;

    }

}