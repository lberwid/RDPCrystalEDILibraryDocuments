package RDPCrystalEDILibrary;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import RDPCrystalEDILibrary.*;public class SummaryDisplay {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setElement (java.lang.String value){ try { javonetHandle.set("Element",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getElement (){ try { return  (java.lang.String) javonetHandle.get("Element");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setRule (java.lang.String value){ try { javonetHandle.set("Rule",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getRule (){ try { return  (java.lang.String) javonetHandle.get("Rule");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }public SummaryDisplay (java.lang.String element,java.lang.String rule){ try {  javonetHandle = Javonet.New("SummaryDisplay",element,rule);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public SummaryDisplay(NObject handle) {this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}