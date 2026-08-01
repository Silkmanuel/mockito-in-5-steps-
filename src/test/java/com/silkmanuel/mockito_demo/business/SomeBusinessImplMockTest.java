package com.silkmanuel.mockito_demo.business;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class SomeBusinessImplMockTest {
    @Test
    void findTheGreatestFromAllData_basicScenario(){
        DataService mockDataService = mock(DataService.class);
        when(mockDataService.retrieveAllData()).thenReturn(new int[]{25, 15, 5});
        SomeBusinessImpl businessImpl = new SomeBusinessImpl(mockDataService);
        int result = businessImpl.findTheGreatestFromAllData();
        Assertions.assertEquals(25, result);
    }
    
    @Test
    void findTheGreatestFromAllData_withOneValue(){
        DataService mockDataService = mock(DataService.class);
        when(mockDataService.retrieveAllData()).thenReturn(new int[]{35});
        SomeBusinessImpl businessImpl = new SomeBusinessImpl(mockDataService);
        int result = businessImpl.findTheGreatestFromAllData();
        Assertions.assertEquals(35, result);
    }

}

