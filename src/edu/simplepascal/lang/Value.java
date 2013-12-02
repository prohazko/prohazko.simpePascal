package edu.simplepascal.lang;

public class Value {

    public static Value VOID = new Value(0);

    //final Object value;
    String value;


    public Value(String v) {
        this.value = v;
    }

    public Value(Double v){
        this.value = v.toString();
    }

    public Value(Integer v){
       this.value = v.toString();
    }

    public Value(Boolean v){
        this.value = v.toString();
    }


    public static boolean isNumeric(String str)
    {
        try
        {
            Double.parseDouble(str);
        }
        catch(NumberFormatException nfe)
        {
            return false;
        }
        return true;
    }

    public Boolean asBoolean() {
        return Boolean.valueOf(value);
    }

    public Double asDouble() {
        return Double.valueOf(value);
    }

    public Integer asInteger(){
        return Integer.valueOf(value);
    }

    public String asString() {
        return String.valueOf(value);
    }

    public boolean isDouble() {
        return isNumeric(value);
    }

    @Override
    public int hashCode() {

        if(value == null) {
            return 0;
        }

        return this.value.hashCode();
    }

    @Override
    public boolean equals(Object o) {

        if(value == o) {
            return true;
        }

        if(value == null || o == null || o.getClass() != value.getClass()) {
            return false;
        }

        Value that = (Value)o;

        return this.value.equals(that.value);
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}