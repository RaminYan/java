package com.sutao.interfaces.defaults;

public interface Company {
    default String getName() {
        return "defaults Company";
    }
}
