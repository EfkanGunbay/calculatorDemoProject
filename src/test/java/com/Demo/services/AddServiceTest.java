package com.Demo.services;

import com.Demo.model.Result;
import org.junit.jupiter.api.Test;

public class AddServiceTest {

    @Test
    public void addIntegers() {

        AddService service = new AddService();

        Result result = service.add(2, 3);

        assertEquals(result.getResult(), 5);
    }
}
