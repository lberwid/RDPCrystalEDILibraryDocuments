package RDPCrystalEDILibrary;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import RDPCrystalEDILibrary.*;public class XmlConfigOptions {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setIndent (java.lang.Boolean value){ try { javonetHandle.set("Indent",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Boolean getIndent (){ try { return javonetHandle.get("Indent");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * SetProperty
	 */
            public void setHeaderNode (java.lang.String value){ try { javonetHandle.set("HeaderNode",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getHeaderNode (){ try { return  (java.lang.String) javonetHandle.get("HeaderNode");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setLoopNodeName (java.lang.String value){ try { javonetHandle.set("LoopNodeName",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getLoopNodeName (){ try { return  (java.lang.String) javonetHandle.get("LoopNodeName");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setSegmentNodeName (java.lang.String value){ try { javonetHandle.set("SegmentNodeName",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getSegmentNodeName (){ try { return  (java.lang.String) javonetHandle.get("SegmentNodeName");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setElementNodeName (java.lang.String value){ try { javonetHandle.set("ElementNodeName",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getElementNodeName (){ try { return  (java.lang.String) javonetHandle.get("ElementNodeName");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setCompositeElementNodeName (java.lang.String value){ try { javonetHandle.set("CompositeElementNodeName",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getCompositeElementNodeName (){ try { return  (java.lang.String) javonetHandle.get("CompositeElementNodeName");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }public XmlConfigOptions (){ try {  javonetHandle = Javonet.New("XmlConfigOptions");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public XmlConfigOptions(NObject handle) {this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}