package main.homework7.task1;
import java.util.ArrayList;

public class MyArrayList<T> extends ArrayList<T> {
    @Override
    public int size(){
       System.out.println("Размер списка  :"+super.size());
       return super.size();
    }

    @Override
    public boolean add(T t) {
        System.out.printf("Добавлен объект  %s  в список",t);
        return super.add(t);
    }

    @Override
    public boolean contains(Object o){
        if (o!=null){
            System.out.println("Объект содержится в списке");
        }else{System.out.println("Объект НЕ содержится в списке");}
        return super.contains(o);
    }
    @Override
    public T get(int index){
        T obj=null;
        try{
            obj=super.get(index);
        }catch(IndexOutOfBoundsException out){}
        System.out.printf("Получен объект %s из списка ",obj);
        return obj;
    }
    @Override
    public void add(int index, T element){
        int position;
        if(index<super.size()&&index>=0) {
            position=index;
            System.out.printf("Добавлен объект %s в список на позицию %d%n",element,position);}
        else{
            position=0;
            System.out.printf("Добавлен объект %s в список на позицию %d%n",element,position);
        }
       super.add(index,element);
    }
}
