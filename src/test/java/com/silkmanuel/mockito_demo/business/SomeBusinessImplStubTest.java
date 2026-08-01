package com.silkmanuel.mockito_demo.business;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assertions.*;

public class SomeBusinessImplStubTest {
    @Test
    void findTheGreatestFromAllData_basicScenario(){
        SomeBusinessImpl businessImpl = new SomeBusinessImpl(new DataServiceStub1());
        int result = businessImpl.findTheGreatestFromAllData();
        Assertions.assertEquals(25, result);
    }
    
    @Test
    void findTheGreatestFromAllData_withOneValue(){
        SomeBusinessImpl businessImpl = new SomeBusinessImpl(new DataServiceStub2());
        int result = businessImpl.findTheGreatestFromAllData();
        Assertions.assertEquals(35, result);
    }
}

class DataServiceStub1 implements DataService {
    @Override
    public int[] retrieveAllData() {
        return new int[]{25, 15, 5};
    }
}

class DataServiceStub2 implements DataService {
    @Override
    public int[] retrieveAllData() {
        return new int[]{35};
    }
}
