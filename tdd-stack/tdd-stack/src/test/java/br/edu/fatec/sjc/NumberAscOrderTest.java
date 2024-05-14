package br.edu.fatec.sjc;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class NumberAscOrderTest {

    @Mock
    private CustomStack<Double> customStack;

    private NumberAscOrder<Double> numberAscOrder;

    @BeforeEach
    public void setUp() {
        numberAscOrder = new NumberAscOrder<>(customStack);
    }

    @Test
    public void testSortWithRandomNumbers() throws StackEmptyException, StackFullException {
        List<Double> randomNumbers = generateRandomNumbers(6);

        when(customStack.getElements()).thenReturn(randomNumbers);
        when(customStack.size()).thenReturn(randomNumbers.size());
        when(customStack.isEmpty()).thenReturn(false);

        List<Double> sortedList = numberAscOrder.sort();

        assertTrue(isSortedInAscendingOrder(sortedList));
    }

    @Test
    public void testSortWithEmptyList() {
        when(customStack.isEmpty()).thenReturn(true);

        // Verify that sort() throws StackEmptyException
        assertThrows(StackEmptyException.class, numberAscOrder::sort);
    }

    private List<Double> generateRandomNumbers(int count) {
        Random random = new Random();
        List<Double> randomNumbers = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            randomNumbers.add(random.nextDouble());
        }
        return randomNumbers;
    }

    private boolean isSortedInAscendingOrder(List<Double> numbers) {
        for (int i = 0; i < numbers.size() - 1; i++) {
            if (numbers.get(i) > numbers.get(i + 1)) {
                return false;
            }
        }
        return true;
    }
}
