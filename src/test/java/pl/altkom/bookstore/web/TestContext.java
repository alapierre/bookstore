/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.altkom.bookstore.web;

import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;

/**
 *
 * @author Adrian Lapierre <adrian@soft-project.pl>
 */
@ContextConfiguration("/bookstore-web-core.xml")
public class TestContext extends AbstractTransactionalJUnit4SpringContextTests{
    
    @Test
    public void test() {
        System.out.println("!!!");
    }
    
}
