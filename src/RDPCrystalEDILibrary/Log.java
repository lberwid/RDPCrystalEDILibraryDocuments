package RDPCrystalEDILibrary;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import RDPCrystalEDILibrary.*;
import jio.System.Collections.ObjectModel.*;public class Log {protected NObject javonetHandle; /**
	 * GetProperty
	 */
            public static ReadOnlyCollection<java.lang.String> getEntries (){ try { return new ReadOnlyCollection<java.lang.String>((NObject)Javonet.getType("Log").get("Entries"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public static void Clear (){ try { Javonet.getType("Log").invoke("Clear");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}