package RDPCrystalEDILibrary;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import RDPCrystalEDILibrary.*;public class RuleDisplay {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setPosition (java.lang.String value){ try { javonetHandle.set("Position",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getPosition (){ try { return  (java.lang.String) javonetHandle.get("Position");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setRule (java.lang.String value){ try { javonetHandle.set("Rule",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getRule (){ try { return  (java.lang.String) javonetHandle.get("Rule");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }public RuleDisplay (java.lang.String position,java.lang.String rule){ try {  javonetHandle = Javonet.New("RuleDisplay",position,rule);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public RuleDisplay(NObject handle) {this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}