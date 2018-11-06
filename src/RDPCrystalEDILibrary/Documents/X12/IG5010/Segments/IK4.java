package RDPCrystalEDILibrary.Documents.X12.IG5010.Segments;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import RDPCrystalEDILibrary.Documents.*;
import RDPCrystalEDILibrary.Documents.X12.IG5010.Segments.*;
import RDPCrystalEDILibrary.*;public class IK4 extends DocumentSegment {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setPositionInSegment (PositionInSegment value){ try { javonetHandle.set("PositionInSegment",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public PositionInSegment getPositionInSegment (){ try { return new PositionInSegment((NObject)javonetHandle.get("PositionInSegment"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setDataElementReferenceNumber (java.lang.String value){ try { javonetHandle.set("DataElementReferenceNumber",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getDataElementReferenceNumber (){ try { return  (java.lang.String) javonetHandle.get("DataElementReferenceNumber");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setImplementationDataElementSyntaxErrorCode (java.lang.String value){ try { javonetHandle.set("ImplementationDataElementSyntaxErrorCode",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getImplementationDataElementSyntaxErrorCode (){ try { return  (java.lang.String) javonetHandle.get("ImplementationDataElementSyntaxErrorCode");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setCopyOfBadDataElement (java.lang.String value){ try { javonetHandle.set("CopyOfBadDataElement",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getCopyOfBadDataElement (){ try { return  (java.lang.String) javonetHandle.get("CopyOfBadDataElement");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }public IK4 (){  super((NObject) null); try {  javonetHandle = Javonet.New("IK4"); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public IK4(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
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