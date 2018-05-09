/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutorialspoint.interceptor;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.interceptor.Interceptors;

/**
 *
 * @author tiago.lucas
 */
@Interceptors({BusinessInterceptor.class})
@Stateless
public class LibrarySessionInterceptors implements LibrarySessionInterceptorsRemote {

    List<String> bookShelf;
    
    public LibrarySessionInterceptors(){
        bookShelf = new ArrayList<String>();
    }
    
    @Override
    public void addBooks(String bookName) {
        bookShelf.add(bookName);
    }
    
    @Override
    public List getBooks() {
        return bookShelf;
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
