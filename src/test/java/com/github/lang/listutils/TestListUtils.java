package com.github.lang.listutils;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

import com.github.lang.listutils.ListUtils;

public class TestListUtils {

    @Test
    public void testIsAnyNull() {

        List<String> list = new ArrayList<String>();
        list.add(null);
        list.add("asd");
        list.add("fgh");
        list.add(null);

        assertTrue(ListUtils.isAnyNull(list));

        // removing null elements
        list.removeIf((e) -> (e == null));
        assertFalse(ListUtils.isAnyNull(list));
    }

    @Test
    public void testIsAllNull() {

        List<String> list = new ArrayList<String>();
        list.add(null);
        list.add("asd");
        list.add("fgh");
        list.add(null);

        assertFalse(ListUtils.isAllNull(list));

        // removing non null elements
        list.removeIf((e) -> (e != null));
        assertTrue(ListUtils.isAllNull(list));
    }

    @Test
    public void testRemoveAllNull() {

        List<String> list = new ArrayList<String>();
        list.add("asd");
        list.add("fgh");

        assertFalse(ListUtils.removeAllNull(list));
        assertEquals(list.size(), 2);

        list.add(0, null);
        list.add(null);
        list.add("jkl");

        assertTrue(ListUtils.removeAllNull(list));
        assertEquals(list.size(), 3);
    }
}
