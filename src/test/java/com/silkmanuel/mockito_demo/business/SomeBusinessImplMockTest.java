package com.silkmanuel.mockito_demo.business;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class SomeBusinessImplMockTest {
    @Mock
    private DataService dataServiceMock;
    @InjectMocks
    private SomeBusinessImpl businessImpl;

    @Test
    void findTheGreatestFromAllData_basicScenario(){
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[]{25, 15, 5});
        Assertions.assertEquals(25, businessImpl.findTheGreatestFromAllData());
    }
    
    @Test
    void findTheGreatestFromAllData_withOneValue(){
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[]{35});
        Assertions.assertEquals(35, businessImpl.findTheGreatestFromAllData());
    }

    @Test
    void findTheGreatestFromAllData_emptyArray(){
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[]{});
        Assertions.assertEquals(Integer.MIN_VALUE, businessImpl.findTheGreatestFromAllData());
    }

}

