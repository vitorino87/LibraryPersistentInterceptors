/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutorialspoint.interceptor;

import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author tiago.lucas
 */
@Remote
public interface LibrarySessionInterceptorsRemote {
    void addBooks(String bookName);
    List getBooks();
}
