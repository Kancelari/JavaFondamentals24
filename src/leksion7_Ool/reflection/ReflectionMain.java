package leksion7_Ool.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionMain {

    public static void main(String[] args) {
        try {
            Class c1 = Class.forName(Animal.class.getName());
            System.out.println("Class name: " + Animal.class.getName());
            Constructor con1 = c1.getConstructor(String.class, String.class, int.class);
            Animal a1=(Animal) con1.newInstance("gjitare","tropike",2);
            Method getType = c1.getDeclaredMethod("getType");
            String type=(String)getType.invoke(a1);
            System.out.println("Type is: " + type);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}
