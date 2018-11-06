package RDPCrystalEDILibrary.Documents.X12.IG5010.Segments;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import RDPCrystalEDILibrary.Documents.*;
import RDPCrystalEDILibrary.Documents.X12.IG5010.Segments.*;
import RDPCrystalEDILibrary.*;public class AK9 extends DocumentSegment {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setFunctionalGroupAcknowledgmentCode (java.lang.String value){ try { javonetHandle.set("FunctionalGroupAcknowledgmentCode",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getFunctionalGroupAcknowledgmentCode (){ try { return  (java.lang.String) javonetHandle.get("FunctionalGroupAcknowledgmentCode");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setNumberOfTransactionSetsIncluded (java.lang.String value){ try { javonetHandle.set("NumberOfTransactionSetsIncluded",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getNumberOfTransactionSetsIncluded (){ try { return  (java.lang.String) javonetHandle.get("NumberOfTransactionSetsIncluded");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setNumberOfReceivedTransactionSets (java.lang.String value){ try { javonetHandle.set("NumberOfReceivedTransactionSets",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getNumberOfReceivedTransactionSets (){ try { return  (java.lang.String) javonetHandle.get("NumberOfReceivedTransactionSets");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setNumberOfAcceptedTransactionSets (java.lang.String value){ try { javonetHandle.set("NumberOfAcceptedTransactionSets",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getNumberOfAcceptedTransactionSets (){ try { return  (java.lang.String) javonetHandle.get("NumberOfAcceptedTransactionSets");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setFunctionalGroupSyntaxErrorCode1 (java.lang.String value){ try { javonetHandle.set("FunctionalGroupSyntaxErrorCode1",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getFunctionalGroupSyntaxErrorCode1 (){ try { return  (java.lang.String) javonetHandle.get("FunctionalGroupSyntaxErrorCode1");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setFunctionalGroupSyntaxErrorCode2 (java.lang.String value){ try { javonetHandle.set("FunctionalGroupSyntaxErrorCode2",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getFunctionalGroupSyntaxErrorCode2 (){ try { return  (java.lang.String) javonetHandle.get("FunctionalGroupSyntaxErrorCode2");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setFunctionalGroupSyntaxErrorCode3 (java.lang.String value){ try { javonetHandle.set("FunctionalGroupSyntaxErrorCode3",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getFunctionalGroupSyntaxErrorCode3 (){ try { return  (java.lang.String) javonetHandle.get("FunctionalGroupSyntaxErrorCode3");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setFunctionalGroupSyntaxErrorCode4 (java.lang.String value){ try { javonetHandle.set("FunctionalGroupSyntaxErrorCode4",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getFunctionalGroupSyntaxErrorCode4 (){ try { return  (java.lang.String) javonetHandle.get("FunctionalGroupSyntaxErrorCode4");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setFunctionalGroupSyntaxErrorCode5 (java.lang.String value){ try { javonetHandle.set("FunctionalGroupSyntaxErrorCode5",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getFunctionalGroupSyntaxErrorCode5 (){ try { return  (java.lang.String) javonetHandle.get("FunctionalGroupSyntaxErrorCode5");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }public AK9 (){  super((NObject) null); try {  javonetHandle = Javonet.New("AK9"); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public AK9(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
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