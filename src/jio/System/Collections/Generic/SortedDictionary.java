package jio.System.Collections.Generic;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import jio.System.Collections.Generic.*;public class SortedDictionary<TKey,TValue> {public NObject javonetHandle; public SortedDictionary (){ try {  javonetHandle = Javonet.New("SortedDictionary");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public SortedDictionary (IDictionary<TKey,TValue> dictionary){ try {  javonetHandle = Javonet.New("SortedDictionary",dictionary);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public SortedDictionary (IDictionary<TKey,TValue> dictionary,IComparer<TKey> comparer){ try {  javonetHandle = Javonet.New("SortedDictionary",dictionary,comparer);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public SortedDictionary (IComparer<TKey> comparer){ try {  javonetHandle = Javonet.New("SortedDictionary",comparer);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public SortedDictionary(NObject handle) {this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}