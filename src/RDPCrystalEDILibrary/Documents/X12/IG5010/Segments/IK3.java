package RDPCrystalEDILibrary.Documents.X12.IG5010.Segments;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import RDPCrystalEDILibrary.Documents.*;
import RDPCrystalEDILibrary.Documents.X12.IG5010.Segments.*;
import RDPCrystalEDILibrary.*;public class IK3 extends DocumentSegment {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setSegmentIDCode (java.lang.String value){ try { javonetHandle.set("SegmentIDCode",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getSegmentIDCode (){ try { return  (java.lang.String) javonetHandle.get("SegmentIDCode");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setSegmentPositionInTransactionSet (java.lang.String value){ try { javonetHandle.set("SegmentPositionInTransactionSet",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getSegmentPositionInTransactionSet (){ try { return  (java.lang.String) javonetHandle.get("SegmentPositionInTransactionSet");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setLoopIdentifierCode (java.lang.String value){ try { javonetHandle.set("LoopIdentifierCode",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getLoopIdentifierCode (){ try { return  (java.lang.String) javonetHandle.get("LoopIdentifierCode");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setImplementationSegmentSyntaxErrorCode (java.lang.String value){ try { javonetHandle.set("ImplementationSegmentSyntaxErrorCode",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getImplementationSegmentSyntaxErrorCode (){ try { return  (java.lang.String) javonetHandle.get("ImplementationSegmentSyntaxErrorCode");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }public IK3 (){  super((NObject) null); try {  javonetHandle = Javonet.New("IK3"); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public IK3(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public void Write (WriteArguments w){ try { javonetHandle.invoke("Write",w);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void Load (LightWeightSegment segment){ try { javonetHandle.invoke("Load",segment);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}