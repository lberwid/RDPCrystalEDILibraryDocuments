package RDPCrystalEDILibrary.Documents.X12.IG5010.Segments;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import RDPCrystalEDILibrary.Documents.*;
import RDPCrystalEDILibrary.Documents.X12.IG5010.Segments.*;
import RDPCrystalEDILibrary.*;public class SV1 extends DocumentSegment {protected NObject javonetHandle; /**
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
            public void setFacilityCodeValue (java.lang.String value){ try { javonetHandle.set("FacilityCodeValue",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getFacilityCodeValue (){ try { return  (java.lang.String) javonetHandle.get("FacilityCodeValue");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setServiceTypeCode (java.lang.String value){ try { javonetHandle.set("ServiceTypeCode",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getServiceTypeCode (){ try { return  (java.lang.String) javonetHandle.get("ServiceTypeCode");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setCompositeDiagnosticCodePointer (CompositeDiagnosticCodePointer value){ try { javonetHandle.set("CompositeDiagnosticCodePointer",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public CompositeDiagnosticCodePointer getCompositeDiagnosticCodePointer (){ try { return new CompositeDiagnosticCodePointer((NObject)javonetHandle.get("CompositeDiagnosticCodePointer"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setMonetaryAmount2 (java.lang.String value){ try { javonetHandle.set("MonetaryAmount2",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getMonetaryAmount2 (){ try { return  (java.lang.String) javonetHandle.get("MonetaryAmount2");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setYesNoConditionOrResponseCode1 (java.lang.String value){ try { javonetHandle.set("YesNoConditionOrResponseCode1",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getYesNoConditionOrResponseCode1 (){ try { return  (java.lang.String) javonetHandle.get("YesNoConditionOrResponseCode1");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setMultipleProcedureCode (java.lang.String value){ try { javonetHandle.set("MultipleProcedureCode",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getMultipleProcedureCode (){ try { return  (java.lang.String) javonetHandle.get("MultipleProcedureCode");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setYesNoConditionOrResponseCode2 (java.lang.String value){ try { javonetHandle.set("YesNoConditionOrResponseCode2",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getYesNoConditionOrResponseCode2 (){ try { return  (java.lang.String) javonetHandle.get("YesNoConditionOrResponseCode2");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setYesNoConditionOrResponseCode3 (java.lang.String value){ try { javonetHandle.set("YesNoConditionOrResponseCode3",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getYesNoConditionOrResponseCode3 (){ try { return  (java.lang.String) javonetHandle.get("YesNoConditionOrResponseCode3");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setReviewCode (java.lang.String value){ try { javonetHandle.set("ReviewCode",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getReviewCode (){ try { return  (java.lang.String) javonetHandle.get("ReviewCode");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setNationalOrLocalAssignedReviewValue (java.lang.String value){ try { javonetHandle.set("NationalOrLocalAssignedReviewValue",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getNationalOrLocalAssignedReviewValue (){ try { return  (java.lang.String) javonetHandle.get("NationalOrLocalAssignedReviewValue");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setCopayStatusCode (java.lang.String value){ try { javonetHandle.set("CopayStatusCode",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getCopayStatusCode (){ try { return  (java.lang.String) javonetHandle.get("CopayStatusCode");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setHealthCareProfessionalShortageAreaCode (java.lang.String value){ try { javonetHandle.set("HealthCareProfessionalShortageAreaCode",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getHealthCareProfessionalShortageAreaCode (){ try { return  (java.lang.String) javonetHandle.get("HealthCareProfessionalShortageAreaCode");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setReferenceIdentification (java.lang.String value){ try { javonetHandle.set("ReferenceIdentification",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getReferenceIdentification (){ try { return  (java.lang.String) javonetHandle.get("ReferenceIdentification");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setPostalCode (java.lang.String value){ try { javonetHandle.set("PostalCode",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getPostalCode (){ try { return  (java.lang.String) javonetHandle.get("PostalCode");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setMonetaryAmount3 (java.lang.String value){ try { javonetHandle.set("MonetaryAmount3",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getMonetaryAmount3 (){ try { return  (java.lang.String) javonetHandle.get("MonetaryAmount3");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setLevelOfCareCode (java.lang.String value){ try { javonetHandle.set("LevelOfCareCode",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getLevelOfCareCode (){ try { return  (java.lang.String) javonetHandle.get("LevelOfCareCode");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setProviderAgreementCode (java.lang.String value){ try { javonetHandle.set("ProviderAgreementCode",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getProviderAgreementCode (){ try { return  (java.lang.String) javonetHandle.get("ProviderAgreementCode");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }public SV1 (){  super((NObject) null); try {  javonetHandle = Javonet.New("SV1"); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public SV1(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
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