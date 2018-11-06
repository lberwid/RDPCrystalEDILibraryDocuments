package RDPCrystalEDILibrary.Documents.X12.IG5010.Segments;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import RDPCrystalEDILibrary.Documents.*;
import RDPCrystalEDILibrary.Documents.X12.IG5010.Segments.*;public class PositionInSegment extends CompositeElement {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setElementPositionInSegment (java.lang.String value){ try { javonetHandle.set("ElementPositionInSegment",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getElementPositionInSegment (){ try { return  (java.lang.String) javonetHandle.get("ElementPositionInSegment");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setComponentDataElementPositionInComposite (java.lang.String value){ try { javonetHandle.set("ComponentDataElementPositionInComposite",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getComponentDataElementPositionInComposite (){ try { return  (java.lang.String) javonetHandle.get("ComponentDataElementPositionInComposite");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setRepeatingDataElementPosition (java.lang.String value){ try { javonetHandle.set("RepeatingDataElementPosition",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getRepeatingDataElementPosition (){ try { return  (java.lang.String) javonetHandle.get("RepeatingDataElementPosition");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }public PositionInSegment (){  super((NObject) null); try {  javonetHandle = Javonet.New("PositionInSegment"); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public PositionInSegment(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public java.lang.String GetString (java.lang.Character compElemSep){ try { return  (java.lang.String) javonetHandle.invoke("GetString",compElemSep);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}