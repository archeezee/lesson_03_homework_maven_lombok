package de.ait.repositories;

import de.ait.model.User;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class ListUserRepositoryImpTest {

    @Test
    public void testSave() {
        ListUserRepositoryImp userRepository = new ListUserRepositoryImp();
        User user = new User("dimitri", "dimitri.s969@mail.de");
        userRepository.save(user);
        assertEquals(1L, user.getId());
        assertEquals(1, userRepository.findAll().size());
    }

    @Test
    public void testFindAll() {
        ListUserRepositoryImp userRepository = new ListUserRepositoryImp();
        User user1 = new User("Alex", "alex@gmail.com");
        User user2 = new User("John", "john@gmail.com");
        userRepository.save(user1);
        userRepository.save(user2);
        assertEquals(2, userRepository.findAll().size());
    }

    @Test
    public void testFindByID() {
        ListUserRepositoryImp userRepository = new ListUserRepositoryImp();
        User user1 = new User("Alice", "alice@gmail.com");
        User user2 = new User("Bob", "bob@gmail.com");
        userRepository.save(user1);
        userRepository.save(user2);
        assertEquals(user1, userRepository.findByID(1L));
        assertEquals(user2, userRepository.findByID(2L));
        assertNull(userRepository.findByID(3L));
    }


}