package com.github.lang.stringutils;

public class StringUtils {

    /**
     * Return true if a string is null
     * 
     * <pre>
     * isNull(null)       true
     * isNull("")         false
     * isNull(" ")        false
     * isNull("hemant")   false
     * </pre>
     */
    public static boolean isNull(String string) {

        return (null == string);
    }

    public static boolean isNotNull(String string) {

        return (null != string);
    }

    /**
     * Return true if any string is null
     * 
     * <pre>
     * isAnyNull(null, "hemant")       true
     * isAnyNull("", null)             true
     * isAnyNull(" ", null, "hemant")  true
     * isAnyNull("hemant", "patel")    false
     * isAnyNull(null, null, null)     true
     * </pre>
     */
    public static boolean isAnyNull(String string1, String... strings) {

        if (isNull(string1)) {
            return true;
        }

        // safecheck, if vararg is passed as null
        if (null == strings) {
            return true;
        }

        for (String string : strings) {
            if (isNull(string)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Return true if all strings are null
     * 
     * <pre>
     * isAllNull(null, "hemant")       false
     * isAllNull("", null)             false
     * isAllNull(" ", null, "hemant")  false
     * isAllNull("hemant", "patel")    false
     * isAllNull(null, null, null)     true
     * </pre>
     */
    public static boolean isAllNull(String string1, String... strings) {

        if (isNotNull(string1)) {
            return false;
        }

        // safecheck, if vararg is passed as null
        if (null == strings) {
            return true;
        }

        for (String string : strings) {
            if (isNotNull(string)) {
                return false;
            }
        }
        return true;
    }

    /**
     * Return true if a string is null or empty (of length zero)
     * 
     * <pre>
     * isEmpty(null): true
     * isEmpty(""): true
     * isEmpty(" "): false
     * isEmpty("hemant"): false
     * </pre>
     */
    public static boolean isEmpty(String string) {

        return isNull(string) || string.isEmpty();
    }

    public static boolean isNotEmpty(String string) {

        return !isEmpty(string);
    }

    /**
     * Return true if any string is null or empty (of length zero)
     * 
     * <pre>
     * isAnyEmpty(null, "hemant")       true
     * isAnyEmpty("", null)             true
     * isAnyEmpty(" ", null, "hemant")  true
     * isAnyEmpty("hemant", "patel")    false
     * isAnyEmpty(null, "", null)       true
     * </pre>
     */
    public static boolean isAnyEmpty(String string1, String... strings) {

        if (isEmpty(string1)) {
            return true;
        }

        // safecheck, if vararg is passed as null
        if (null == strings) {
            return true;
        }

        for (String string : strings) {
            if (isEmpty(string)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Return true if all strings are null or empty (of length zero)
     * 
     * <pre>
     * isAllEmpty(null, "hemant")       false
     * isAllEmpty("", null)             true
     * isAllEmpty(" ", null, "hemant")  false
     * isAllEmpty("hemant", "patel")    false
     * isAllEmpty(null, null, null)     true
     * </pre>
     */
    public static boolean isAllEmpty(String string1, String... strings) {

        if (isNotEmpty(string1)) {
            return false;
        }

        // safecheck, if vararg is passed as null
        if (null == strings) {
            return true;
        }

        for (String string : strings) {
            if (isNotEmpty(string)) {
                return false;
            }
        }
        return true;
    }

    /**
     * Return true if a string is null or blank (of length zero after trimming
     * the string)
     * 
     * <pre>
     * isBlank(null): true
     * isBlank(""): true
     * isBlank(" "): true
     * isBlank("hemant"): false
     * </pre>
     */
    public static boolean isBlank(String string) {

        return isNull(string) || isEmpty(string.trim());
    }

    public static boolean isNotBlank(String string) {

        return !isBlank(string);
    }

    /**
     * Return true if any string is null or blank (of length zero after trimming
     * the string)
     * <pre>
     * isAnyBlank(null, "hemant")       true
     * isAnyBlank("", null, " ")        true
     * isAnyBlank(" ", null, "hemant")  true
     * isAnyBlank("hemant", "patel")    false
     * isAnyBlank(null, " ", null)      true
     * </pre>
     */
    public static boolean isAnyBlank(String string1, String... strings) {

        if (isBlank(string1)) {
            return true;
        }

        // safecheck, if vararg is passed as null
        if (null == strings) {
            return true;
        }

        for (String string : strings) {
            if (isBlank(string)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Return true if all strings are null or blank (of length zero after trimming
     * the string)
     * 
     * <pre>
     * isAllBlank(null, "hemant")       false
     * isAllBlank("", null, " ")        true
     * isAllBlank(" ", null, "hemant")  false
     * isAllBlank("hemant", "patel")    false
     * isAllBlank(null, null, null)     true
     * </pre>
     */
    public static boolean isAllBlank(String string1, String... strings) {

        if (isNotBlank(string1)) {
            return false;
        }

        // safecheck, if vararg is passed as null
        if (null == strings) {
            return true;
        }

        for (String string : strings) {
            if (isNotBlank(string)) {
                return false;
            }
        }
        return true;
    }

}
