package com.silkmanuel.mockito_demo.list;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ListTest {

    @Test
    void simpleTest() {
        List mockList = mock(List.class); 
        when(mockList.size()).thenReturn(3);
        assertEquals(3, mockList.size());
    }

    @Test
    void multipleReturns() {
        List mockList = mock(List.class); 
        when(mockList.size()).thenReturn(1).thenReturn(2).thenReturn(3);
        assertEquals(1, mockList.size());
        assertEquals(2, mockList.size());
        assertEquals(3, mockList.size());
        assertEquals(3, mockList.size());
    }

    @Test
    void specificParameters() {
        List mockList = mock(List.class); 
        when(mockList.get(0)).thenReturn("SomeString").thenReturn("Item 2").thenReturn("Item 3");
        assertEquals("SomeString", mockList.get(0));
        assertEquals(null, mockList.get(1));
    }
    
    @Test
    void genericParameters() {
        List mockList = mock(List.class); 
        when(mockList.get(Mockito.anyInt())).thenReturn("SomeOtherString");
        assertEquals("SomeOtherString", mockList.get(0));
        assertEquals("SomeOtherString", mockList.get(1));
    }
}
