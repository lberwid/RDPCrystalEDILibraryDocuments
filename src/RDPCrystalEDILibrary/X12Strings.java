package RDPCrystalEDILibrary;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import RDPCrystalEDILibrary.*;public class X12Strings {protected NObject javonetHandle; /**
	 * GetFiled
	 */
            public static java.lang.String getST (){ try { return  (java.lang.String) Javonet.getType("X12Strings").get("ST");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetFiled
	 */
            public static void setST (java.lang.String param){ try { Javonet.getType("X12Strings").set("ST",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public static java.lang.String getSE (){ try { return  (java.lang.String) Javonet.getType("X12Strings").get("SE");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetFiled
	 */
            public static void setSE (java.lang.String param){ try { Javonet.getType("X12Strings").set("SE",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public static java.lang.String getISA (){ try { return  (java.lang.String) Javonet.getType("X12Strings").get("ISA");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetFiled
	 */
            public static void setISA (java.lang.String param){ try { Javonet.getType("X12Strings").set("ISA",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public static java.lang.String getIEA (){ try { return  (java.lang.String) Javonet.getType("X12Strings").get("IEA");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetFiled
	 */
            public static void setIEA (java.lang.String param){ try { Javonet.getType("X12Strings").set("IEA",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public static java.lang.String getGE (){ try { return  (java.lang.String) Javonet.getType("X12Strings").get("GE");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetFiled
	 */
            public static void setGE (java.lang.String param){ try { Javonet.getType("X12Strings").set("GE",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public static java.lang.String getGS (){ try { return  (java.lang.String) Javonet.getType("X12Strings").get("GS");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetFiled
	 */
            public static void setGS (java.lang.String param){ try { Javonet.getType("X12Strings").set("GS",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public static java.lang.String getHL (){ try { return  (java.lang.String) Javonet.getType("X12Strings").get("HL");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetFiled
	 */
            public static void setHL (java.lang.String param){ try { Javonet.getType("X12Strings").set("HL",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}