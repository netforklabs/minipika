package com.poseidon.framework.sql;

import com.poseidon.framework.config.Config;

import java.util.HashMap;
import java.util.Map;

/**
 * Create by 2BKeyboard on 2019/12/11 12:06
 */
public class SQLBuilderFactory {

    private static SQLBuilderFactory factory;
    private final Map<String, SQLBuilder> values;
    private final String path = Config.getInstance().getPte();

    public SQLBuilderFactory() {
        values = new HashMap<>(); // initial
    }

    public static SQLBuilderFactory getFactory() {
        if (factory == null) {
            factory = new SQLBuilderFactory();
        }
        return factory;
    }

    public SQLBuilder getBuilder(String name) {
        return values.get(name);
    }

}