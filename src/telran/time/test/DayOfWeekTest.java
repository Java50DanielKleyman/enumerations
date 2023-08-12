package telran.time.test;

import static org.junit.jupiter.api.Assertions.*;

import java.time.DayOfWeek;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import telran.time.TypeDisplay;

class DayOfWeekTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	@Disabled
	void test() {
		assertEquals(0, getOrdinalDayOfWeek(DayOfWeek.MONDAY));
		assertEquals("MONDAY", getNameDayOfWeek(DayOfWeek.MONDAY));
	}

	private int getOrdinalDayOfWeek(DayOfWeek day) {
		return day.ordinal();
	}
	private String getNameDayOfWeek(DayOfWeek day) {
		return day.name();
	}
	@Test
	void displayNameTest() {
		assertEquals("Fri", DayOfWeek.FRI.displayName(TypeDisplay.SHORT));
		assertEquals("Friday", DayOfWeek.FRI.displayName(TypeDisplay.FULL));
	}
	@Test
	void displayValueTest() {
		assertEquals(5, DayOfWeek.FRI.getValue());
	}
	@Test
	void plusDaysTest() {
		assertEquals(DayOfWeek.SAT, DayOfWeek.FRI.plusDays(22));
	}
	@Test
	void minusDaysTest() {
		assertEquals(DayOfWeek.THU, DayOfWeek.FRI.plusDays(22));
	}
	@Test
	void betweenTest() {
		assertEquals(1, DayOfWeek.FRI.between(DayOfWeek.SAT));
		assertEquals(6, DayOfWeek.FRI.between(DayOfWeek.THU));
	}
}
