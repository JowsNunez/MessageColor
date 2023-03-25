
package io.github.jowsnunez.tests;


import io.github.jowsnunez.messagecolor.enums.Color;
import io.github.jowsnunez.messagecolor.MessageColor;
import io.github.jowsnunez.messagecolor.MessageColorBuilder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import io.github.jowsnunez.messagecolor.IMessageColor;

/**
 *
 * @author Jows Nunez
 */
public class Tests {


    @Test
    @DisplayName("Not Equals Message")
    @Order(1)
    public void notEquals(){
        IMessageColor  c = new MessageColorBuilder();
        IMessageColor  builder = new MessageColorBuilder();
        
       MessageColor msg = c.messageColor(Color.BLUE, "Hello world").build();
       MessageColor msg1 = builder.messageColor(Color.RED, "Hello world").build();
        Assertions.assertNotEquals(msg1, msg);
       
    }
    
    @Test
    @DisplayName("Equals Message")
    @Order(2)
    public void equals(){
       IMessageColor  c = new MessageColorBuilder();
       MessageColor msg = c.messageColor(Color.BLUE, "Hello world").build();
       MessageColor msg1 = c.messageColor(Color.RED, "Hello world").build();
       Assertions.assertEquals(msg1, msg);
       
    }
    
    
    
}
