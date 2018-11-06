package jio.System.Collections.Generic;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import jio.System.Collections.Generic.*;public class HashSet<T> {public NObject javonetHandle; public HashSet (){ try {  javonetHandle = Javonet.New("HashSet");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public HashSet (java.lang.Integer capacity){ try {  javonetHandle = Javonet.New("HashSet",capacity);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public HashSet (IEqualityComparer<T> comparer){ try {  javonetHandle = Javonet.New("HashSet",comparer);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public HashSet (IEnumerable<T> collection){ try {  javonetHandle = Javonet.New("HashSet",collection);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public HashSet (IEnumerable<T> collection,IEqualityComparer<T> comparer){ try {  javonetHandle = Javonet.New("HashSet",collection,comparer);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public HashSet (java.lang.Integer capacity,IEqualityComparer<T> comparer){ try {  javonetHandle = Javonet.New("HashSet",capacity,comparer);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public HashSet(NObject handle) {this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}