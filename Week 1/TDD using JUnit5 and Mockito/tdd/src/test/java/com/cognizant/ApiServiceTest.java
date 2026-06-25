package com.cognizant;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class ApiServiceTest {

    @Test
    void testFetchData() {

        // Create Mock Object
        ExternalApi mockApi = mock(ExternalApi.class);

        // Stub the method
        when(mockApi.getData()).thenReturn("Mock Data");

        // Inject mock into service
        ApiService service = new ApiService(mockApi);

        // Test
        assertEquals("Mock Data", service.fetchData());
    }
}