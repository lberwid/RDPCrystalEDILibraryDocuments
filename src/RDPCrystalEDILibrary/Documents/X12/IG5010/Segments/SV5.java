package RDPCrystalEDILibrary.Documents.X12.IG5010.Segments;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import RDPCrystalEDILibrary.Documents.*;
import RDPCrystalEDILibrary.Documents.X12.IG5010.Segments.*;
import RDPCrystalEDILibrary.*;public class SV5 extends DocumentSegment {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setCompositeMedicalProcedureIdentifier (CompositeMedicalProcedureIdentifier value){ try { javonetHandle.set("CompositeMedicalProcedureIdentifier",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public CompositeMedicalProcedureIdentifier getCompositeMedicalProcedureIdentifier (){ try { return new CompositeMedicalProcedureIdentifier((NObject)javonetHandle.get("CompositeMedicalProcedureIdentifier"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setUnitOrBasisForMeasurementCode (java.lang.String value){ try { javonetHandle.set("UnitOrBasisForMeasurementCode",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getUnitOrBasisForMeasurementCode (){ try { return  (java.lang.String) javonetHandle.get("UnitOrBasisForMeasurementCode");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setQuantity (java.lang.String value){ try { javonetHandle.set("Quantity",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getQuantity (){ try { return  (java.lang.String) javonetHandle.get("Quantity");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setMonetaryAmount1 (java.lang.String value){ try { javonetHandle.set("MonetaryAmount1",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getMonetaryAmount1 (){ try { return  (java.lang.String) javonetHandle.get("MonetaryAmount1");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setMonetaryAmount2 (java.lang.String value){ try { javonetHandle.set("MonetaryAmount2",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getMonetaryAmount2 (){ try { return  (java.lang.String) javonetHandle.get("MonetaryAmount2");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setFrequencyCode (java.lang.String value){ try { javonetHandle.set("FrequencyCode",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getFrequencyCode (){ try { return  (java.lang.String) javonetHandle.get("FrequencyCode");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setPrognosisCode (java.lang.String value){ try { javonetHandle.set("PrognosisCode",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getPrognosisCode (){ try { return  (java.lang.String) javonetHandle.get("PrognosisCode");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }public SV5 (){  super((NObject) null); try {  javonetHandle = Javonet.New("SV5"); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public SV5(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
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