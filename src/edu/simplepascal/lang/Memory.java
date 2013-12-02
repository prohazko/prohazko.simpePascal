package edu.simplepascal.lang;

import java.util.HashMap;

public class Memory extends HashMap<String, Value> {

    @Override
    public Value get(Object o) {
        if(!super.containsKey(o)){
            System.err.println("Variable " + o + " undefined, assuming void");
            return super.put(o.toString(), Value.VOID);
        }
        return super.get(o);
    }

    @Override
    public Value put(String name, Value value) {
        if(!super.containsKey(name)){
            System.err.println("Variable " + name + " undefined, assuming assigned value " + value );
            return super.put(name, value);
        }
        return super.put(name, value);
    }

    public Value declare(String name, Value value){

        return super.put(name, value);
    }

}
