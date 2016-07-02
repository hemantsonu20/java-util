package com.github.lang.stringutils;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.github.lang.stringutils.StringUtils;

public class TestStringUtils {

    @Test
    public void testIsNull() {

        assertTrue(StringUtils.isNull(null));
        assertFalse(StringUtils.isNull(""));
        assertFalse(StringUtils.isNull(" "));
        assertFalse(StringUtils.isNull("hemant"));
    }
    
    @Test
    public void testIsNotNull() {

        assertFalse(StringUtils.isNotNull(null));
        assertTrue(StringUtils.isNotNull(""));
        assertTrue(StringUtils.isNotNull(" "));
        assertTrue(StringUtils.isNotNull("hemant"));
    }

    @SuppressWarnings("all")
    @Test
    public void testIsAnyNull() {

        assertTrue(StringUtils.isAnyNull(null));
        assertTrue(StringUtils.isAnyNull(null, null));
        assertTrue(StringUtils.isAnyNull(null, null, null));
        assertTrue(StringUtils.isAnyNull("", null));
        assertTrue(StringUtils.isAnyNull(null, " "));
        assertTrue(StringUtils.isAnyNull("hemant", null, "patel"));
        assertTrue(StringUtils.isAnyNull("hemant", null, "patel"));
        assertFalse(StringUtils.isAnyNull("hemant", "pratapi", "patel"));
    }

    @SuppressWarnings("all")
    @Test
    public void testIsAllNull() {

        assertTrue(StringUtils.isAllNull(null));
        assertTrue(StringUtils.isAllNull(null, null));
        assertTrue(StringUtils.isAllNull(null, null, null));
        assertFalse(StringUtils.isAllNull(null, "", null));
        assertFalse(StringUtils.isAllNull(null, " "));
        assertFalse(StringUtils.isAllNull("hemant", null, "patel"));
        assertFalse(StringUtils.isAllNull("hemant", null, "patel"));
        assertFalse(StringUtils.isAllNull("hemant", "pratapi", "patel"));
    }
    
    @Test
    public void testIsEmpty() {

        assertTrue(StringUtils.isEmpty(null));
        assertTrue(StringUtils.isEmpty(""));
        assertFalse(StringUtils.isEmpty(" "));
        assertFalse(StringUtils.isEmpty("hemant"));
    }
    
    @Test
    public void testIsNotNotEmpty() {

        assertFalse(StringUtils.isNotEmpty(null));
        assertFalse(StringUtils.isNotEmpty(""));
        assertTrue(StringUtils.isNotEmpty(" "));
        assertTrue(StringUtils.isNotEmpty("hemant"));
    }

    @SuppressWarnings("all")
    @Test
    public void testIsAnyEmpty() {

        assertTrue(StringUtils.isAnyEmpty(null));
        assertTrue(StringUtils.isAnyEmpty(null, null));
        assertTrue(StringUtils.isAnyEmpty(null, null, null));
        assertTrue(StringUtils.isAnyEmpty("", null));
        assertTrue(StringUtils.isAnyEmpty(null, " "));
        assertTrue(StringUtils.isAnyEmpty("hemant", null, "patel"));
        assertTrue(StringUtils.isAnyEmpty("hemant", null, "patel"));
        assertFalse(StringUtils.isAnyEmpty("hemant", "pratapi", "patel"));
    }

    @SuppressWarnings("all")
    @Test
    public void testIsAllEmpty() {

        assertTrue(StringUtils.isAllEmpty(null));
        
        assertTrue(StringUtils.isAllEmpty(null, null));
        assertTrue(StringUtils.isAllEmpty(null, null, null));
        assertTrue(StringUtils.isAllEmpty(null, "", null));
        assertFalse(StringUtils.isAllEmpty(null, " "));
        assertFalse(StringUtils.isAllEmpty("hemant", null, "patel"));
        assertFalse(StringUtils.isAllEmpty("hemant", null, "patel"));
        assertFalse(StringUtils.isAllEmpty("hemant", "pratapi", "patel"));
    }
    
    @Test
    public void testIsBlank() {

        assertTrue(StringUtils.isBlank(null));
        assertTrue(StringUtils.isBlank(""));
        assertTrue(StringUtils.isBlank(" "));
        assertFalse(StringUtils.isBlank("hemant"));
    }
    
    @Test
    public void testIsNotBlank() {

        assertFalse(StringUtils.isNotBlank(null));
        assertFalse(StringUtils.isNotBlank(""));
        assertFalse(StringUtils.isNotBlank(" "));
        assertTrue(StringUtils.isNotBlank("hemant"));
    }

    @SuppressWarnings("all")
    @Test
    public void testIsAnyBlank() {

        assertTrue(StringUtils.isAnyBlank(null));
        assertTrue(StringUtils.isAnyBlank(null, null));
        assertTrue(StringUtils.isAnyBlank(null, null, null));
        assertTrue(StringUtils.isAnyBlank("", null));
        assertTrue(StringUtils.isAnyBlank(null, " "));
        assertTrue(StringUtils.isAnyBlank("hemant", null, "patel"));
        assertTrue(StringUtils.isAnyBlank("hemant", null, "patel"));
        assertFalse(StringUtils.isAnyBlank("hemant", "pratapi", "patel"));
    }

    @SuppressWarnings("all")
    @Test
    public void testIsAllBlank() {

        assertTrue(StringUtils.isAllBlank(null));
        assertTrue(StringUtils.isAllBlank(null, null));
        assertTrue(StringUtils.isAllBlank(null, null, null));
        assertTrue(StringUtils.isAllBlank(null, "", null));
        assertTrue(StringUtils.isAllBlank(null, " "));
        assertFalse(StringUtils.isAllBlank("hemant", null, "patel"));
        assertFalse(StringUtils.isAllBlank("hemant", null, "patel"));
        assertFalse(StringUtils.isAllBlank("hemant", "pratapi", "patel"));
    }

}
