package com.cognizant;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

public class UserServiceTest {

    @Test
    void testRegisterUser() {

        // Create Mock
        NotificationService mockNotification = mock(NotificationService.class);

        // Inject Mock
        UserService service = new UserService(mockNotification);

        // Call method
        service.registerUser("Nishant");

        // Verify interaction
        verify(mockNotification).sendNotification("Welcome Nishant");
    }
}