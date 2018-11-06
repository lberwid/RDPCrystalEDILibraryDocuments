package RDPCrystalEDILibrary.Documents.X12.IG5010.Segments;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import RDPCrystalEDILibrary.Documents.*;
import RDPCrystalEDILibrary.Documents.X12.IG5010.Segments.*;
import RDPCrystalEDILibrary.*;public class SV2 extends DocumentSegment {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setProductOrServiceID (java.lang.String value){ try { javonetHandle.set("ProductOrServiceID",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getProductOrServiceID (){ try { return  (java.lang.String) javonetHandle.get("ProductOrServiceID");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setCompositeMedicalProcedureIdentifier (CompositeMedicalProcedureIdentifier value){ try { javonetHandle.set("CompositeMedicalProcedureIdentifier",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public CompositeMedicalProcedureIdentifier getCompositeMedicalProcedureIdentifier (){ try { return new CompositeMedicalProcedureIdentifier((NObject)javonetHandle.get("CompositeMedicalProcedureIdentifier"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setMonetaryAmount1 (java.lang.String value){ try { javonetHandle.set("MonetaryAmount1",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getMonetaryAmount1 (){ try { return  (java.lang.String) javonetHandle.get("MonetaryAmount1");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
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
            public void setUnitRate (java.lang.String value){ try { javonetHandle.set("UnitRate",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getUnitRate (){ try { return  (java.lang.String) javonetHandle.get("UnitRate");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setMonetaryAmount2 (java.lang.String value){ try { javonetHandle.set("MonetaryAmount2",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getMonetaryAmount2 (){ try { return  (java.lang.String) javonetHandle.get("MonetaryAmount2");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setYesNoConditionOrResponseCode (java.lang.String value){ try { javonetHandle.set("YesNoConditionOrResponseCode",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getYesNoConditionOrResponseCode (){ try { return  (java.lang.String) javonetHandle.get("YesNoConditionOrResponseCode");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setNursingHomeResidentialStatusCode (java.lang.String value){ try { javonetHandle.set("NursingHomeResidentialStatusCode",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getNursingHomeResidentialStatusCode (){ try { return  (java.lang.String) javonetHandle.get("NursingHomeResidentialStatusCode");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setLevelOfCareCode (java.lang.String value){ try { javonetHandle.set("LevelOfCareCode",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getLevelOfCareCode (){ try { return  (java.lang.String) javonetHandle.get("LevelOfCareCode");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }public SV2 (){  super((NObject) null); try {  javonetHandle = Javonet.New("SV2"); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public SV2(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
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