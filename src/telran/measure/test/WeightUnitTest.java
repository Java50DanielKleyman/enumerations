package telran.measure.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import telran.measure.WeightUnit;

class WeightUnitTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void test() {
		assertEquals(0.001f, WeightUnit.KG.convert(WeightUnit.TN,10), 0.01);
	}

}
