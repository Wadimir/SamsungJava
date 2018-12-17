package ua.com.samsungitschool;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ListExtensionTest {
    private List<Integer> list;
    private IListDeleteByFilter extension;

    @Before
    public void setUp() throws Exception {
        list = new ArrayList<>();
        extension = Main.createListExtension();
    }

    @Test
    public void testCreated() throws Exception {
        assertNotNull(list);
        assertNotNull(extension);
    }

    @Test
    public void testEmptyList() throws Exception {
        list = extension.deleteFromList(list, 0);
        assertEquals(list, new ArrayList<Integer>());
    }

    @Test
    public void testRemoveTheSameKey() throws Exception {
        for (int i = 0; i <= 20; i++) {
            list.add(20);
        }
        list = extension.deleteFromList(list, 20);
        assertEquals(new ArrayList<Integer>(), list);
        list.clear();
    }

    @Test
    public void testRemoveRandomKey() throws Exception {
        list.add(1);
        list.add(1);
        list.add(3);
        list.add(-10);
        list.add(5);
        list.add(50);
        list.add(-10);
        list.add(3);

        ArrayList<Integer> secondList = new ArrayList<>();
        secondList.add(1);
        secondList.add(1);
        secondList.add(3);
        secondList.add(5);
        secondList.add(50);
        secondList.add(3);
        list = extension.deleteFromList(list, -10);
        assertEquals(secondList, list);

        secondList.remove(0);
        secondList.remove(0);
        list = extension.deleteFromList(list, 1);

        assertEquals(secondList, list);
        list.clear();
        secondList = null;
    }

    @Test
    public void testRemoveNeighbors() throws Exception {
        list.add(10);
        list.add(-20);
        list.add(-20);
        list.add(15);
        list.add(17);
        list.add(90);
        list.add(5363);
        list.add(35647);

        ArrayList<Integer> secondList = new ArrayList<>();
        secondList.add(10);
        secondList.add(15);
        secondList.add(17);
        secondList.add(90);
        secondList.add(5363);
        secondList.add(35647);

        list = extension.deleteFromList(list, -20);
        assertEquals(secondList, list);
        list.clear();
        secondList = null;
    }

    @Test
    public void testBadFilter() throws Exception {
        list.add(10);
        list.add(15);
        list.add(17);
        list.add(90);
        list.add(5363);
        list.add(35647);

        ArrayList<Integer> secondList = new ArrayList<>();
        secondList.add(10);
        secondList.add(15);
        secondList.add(17);
        secondList.add(90);
        secondList.add(5363);
        secondList.add(35647);

        list = extension.deleteFromList(list, -20);
        assertEquals(secondList, list);
        list.clear();
        secondList = null;
    }


    @After
    public void tearDown() throws Exception {
        list = null;
        extension = null;
    }
}