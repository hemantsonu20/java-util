package com.hemant.lang.listutils;

import java.util.List;

public class ListUtils {

    /**
     * returns true if list contains a null object
     */
    public static <E> boolean isAnyNull(List<E> list) {

        return list.parallelStream().anyMatch((e) -> (null == e));
    }

    /**
     * returns true if list contains only null objects ie all objects in the
     * list are null.
     */
    public static <E> boolean isAllNull(List<E> list) {

        return list.parallelStream().allMatch((e) -> (null == e));
    }

    /**
     * Removes all the null objects from the list
     * 
     * @return true if any object is removed
     */
    public static <E> boolean removeAllNull(List<E> list) {

        return list.removeIf((e) -> (null == e));
    }
}
