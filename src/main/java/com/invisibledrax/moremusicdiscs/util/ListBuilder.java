package com.invisibledrax.moremusicdiscs.util;

import java.util.ArrayList;
import java.util.List;

public class ListBuilder<T> {
    private List<T> list;

    public ListBuilder() {
        list = new ArrayList<>();
    }

    private ListBuilder(List<T> list) {
        this.list = list;
    }

    public ListBuilder add(T obj) {
        list.add(obj);
        return new ListBuilder(list);
    }

    public List<T> build() {
        return list;
    }

}
