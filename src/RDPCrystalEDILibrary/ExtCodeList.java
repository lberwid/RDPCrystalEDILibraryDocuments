package RDPCrystalEDILibrary;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import RDPCrystalEDILibrary.*;
import jio.System.Collections.Generic.*;public class ExtCodeList {protected NObject javonetHandle; /**
	 * GetFiled
	 */
            public static Dictionary<java.lang.String,CodeList> getExternalCodeLists (){ try { return new Dictionary<java.lang.String,CodeList>((NObject)Javonet.getType("ExtCodeList").get("ExternalCodeLists"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public static void setExternalCodeLists (Dictionary<java.lang.String,CodeList> param){ try { Javonet.getType("ExtCodeList").set("ExternalCodeLists",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}