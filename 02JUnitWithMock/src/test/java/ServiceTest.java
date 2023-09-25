import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.manu.Repository;
import com.manu.Service;

@ExtendWith(MockitoExtension.class)
public class ServiceTest {
	@Mock
	private Repository repo;

	@InjectMocks
	private Service service;

	@Test
	public void testSuccess() {
		try {
			when(repo.getData()).thenReturn(Arrays.asList("A", "B", "Raghu", "12345", "1234"));
		} catch (SQLException e) {
			e.printStackTrace();
		}

		List<String> actual = service.getDataByLen();
		assertNotNull(actual);
		assertEquals(3, actual.size());
	}

	@Test
	public void testException() {
		try {
			when(repo.getData()).thenThrow(new SQLException("CONNECTION ISSUE"));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		// Test using JUnit
		List<String> actual = service.getDataByLen();
		assertNotNull(actual);
		assertEquals(0, actual.size());

	}
}
