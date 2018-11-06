package Common;

import com.javonet.Javonet;
import com.javonet.JavonetException;
import com.javonet.api.NObject;
import com.javonet.api.NType;
import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Map;

public class Helper {

    public static Map<Class<?>, String> JavaToDotnetType = new HashMap<Class<?>, String>();

    static {
    JavaToDotnetType.put(java.lang.Boolean.class, "System.Boolean");
    JavaToDotnetType.put(java.lang.String.class, "System.String");
    JavaToDotnetType.put(java.lang.Character.class, "System.Char");
    JavaToDotnetType.put(java.lang.Byte.class, "System.Byte");
    JavaToDotnetType.put(java.lang.Short.class, "System.Int16");
    JavaToDotnetType.put(java.lang.Integer.class, "System.Int32");
    JavaToDotnetType.put(java.lang.Long.class, "System.Int64");
    JavaToDotnetType.put(java.math.BigInteger.class, "System.UInt64");
    JavaToDotnetType.put(java.lang.Float.class, "System.Single");
    JavaToDotnetType.put(java.lang.Double.class, "System.Double");
    JavaToDotnetType.put(java.math.BigDecimal.class, "System.Decimal");
    JavaToDotnetType.put(void.class, "System.Void");
    JavaToDotnetType.put(java.lang.Boolean[].class, "System.Boolean[]");
    JavaToDotnetType.put(java.lang.String[].class, "System.String[]");
    JavaToDotnetType.put(java.lang.Character[].class, "System.Char[]");
    JavaToDotnetType.put(java.lang.Byte[].class, "System.Byte[]");
    JavaToDotnetType.put(java.lang.Short[].class, "System.Int16[]");
    JavaToDotnetType.put(java.lang.Integer[].class, "System.Int32[]");
    JavaToDotnetType.put(java.lang.Long[].class, "System.Int64[]");
    JavaToDotnetType.put(java.math.BigInteger[].class, "System.UInt64[]");
    JavaToDotnetType.put(java.lang.Float[].class, "System.Single[]");
    JavaToDotnetType.put(java.lang.Double[].class, "System.Double[]");
    JavaToDotnetType.put(java.math.BigDecimal[].class, "System.Decimal[]");
    }

    public static <T> T Convert(Object o, Class<T> type) {
        try {

          if(type == NObject.class)
            return (T) o;

          //reference type
          if (o instanceof NObject)
            return (T) Class.forName(type.getName()).getConstructor(NObject.class).newInstance(o);

          //simple type
          return (T) o;
        }
        catch (Exception e){
          e.printStackTrace();
          return null;
        }
    }

    public static <T> NType getGetObjectName(T arg1) throws JavonetException {
        return Javonet.getType(Javonet.getType("JavaImportGenerator.WrapperHelper").invoke("GetObjectName", arg1));
    }

    public static NType getReturnObjectName(Class<?> type) throws JavonetException {
        //convert simple type to dotnet equivalent
        if (JavaToDotnetType.containsKey(type)) {
          return Javonet.getType(JavaToDotnetType.get(type));
        }

        //wrapper type
        return Javonet.getType(type.getName());
    }

    public static <T> T[] ConvertNObjectToDestinationType(NObject[] nObjects, Class<T[]> arrayType) {
        try {
            Class<?> elementType = arrayType.getComponentType();
            T[] newArray = (T[]) Array.newInstance(elementType, nObjects.length);

            for (int i = 0; i < nObjects.length; i++)
                newArray[i] = (T) Class.forName(elementType.getName()).getConstructor(NObject.class).newInstance(nObjects[i]);
            return newArray;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    public static <T> T ConvertToConcreteInterfaceImplementation(NObject nObject) {
        try {
            NType t = nObject.invoke("GetType");
            String fullName = t.get("FullName");
            
            if(Class.forName(fullName) != null)
            	return (T) nObject;
            
            return (T) Class.forName(fullName).getConstructor(NObject.class).newInstance(nObject);
         }
         catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
