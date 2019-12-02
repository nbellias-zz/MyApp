/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.util.List;

/**
 *
 * @author nmpellias
 */
public interface IDao<T> {
    public List<T> getAll();
    public T getById(String id);
    public T save(T t);
    public T delete(T t);
    public T update(T t, String[] params);
}


