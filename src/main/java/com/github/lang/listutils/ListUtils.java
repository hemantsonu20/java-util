/**
 *   Copyright 2016 Pratapi Hemant Patel
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *   
 */

package com.github.lang.listutils;

import java.util.List;
import java.util.Objects;

public class ListUtils {

    /**
     * returns true if list contains a null object
     */
    public static <E> boolean isAnyNull(List<E> list) {

        return list.stream().anyMatch(Objects::isNull);
    }

    /**
     * returns true if list contains only null objects ie all objects in the
     * list are null.
     */
    public static <E> boolean isAllNull(List<E> list) {

        return list.stream().allMatch(Objects::isNull);
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
