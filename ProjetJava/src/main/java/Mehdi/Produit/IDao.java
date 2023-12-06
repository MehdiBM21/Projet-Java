package Mehdi.Produit;

import java.util.List;

public interface IDao<T> {
    public void add(T obj);
    public void delete(int id);
    public T getById(int id);
    //public List<T> getByKeyword(String keyword);
    public List<T> getAll();

}
