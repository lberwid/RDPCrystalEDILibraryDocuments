package RDPCrystalEDILibrary.Documents.X12.IG5010.Segments;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import RDPCrystalEDILibrary.Documents.*;
import RDPCrystalEDILibrary.Documents.X12.IG5010.Segments.*;
import RDPCrystalEDILibrary.*;public class CR2 extends DocumentSegment {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setCount (java.lang.String value){ try { javonetHandle.set("Count",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getCount (){ try { return  (java.lang.String) javonetHandle.get("Count");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setQuantity1 (java.lang.String value){ try { javonetHandle.set("Quantity1",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getQuantity1 (){ try { return  (java.lang.String) javonetHandle.get("Quantity1");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setSubluxationLevelCode1 (java.lang.String value){ try { javonetHandle.set("SubluxationLevelCode1",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getSubluxationLevelCode1 (){ try { return  (java.lang.String) javonetHandle.get("SubluxationLevelCode1");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setSubluxationLevelCode2 (java.lang.String value){ try { javonetHandle.set("SubluxationLevelCode2",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getSubluxationLevelCode2 (){ try { return  (java.lang.String) javonetHandle.get("SubluxationLevelCode2");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setUnitOrBasisForMeasurementCode (java.lang.String value){ try { javonetHandle.set("UnitOrBasisForMeasurementCode",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getUnitOrBasisForMeasurementCode (){ try { return  (java.lang.String) javonetHandle.get("UnitOrBasisForMeasurementCode");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setQuantity2 (java.lang.String value){ try { javonetHandle.set("Quantity2",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getQuantity2 (){ try { return  (java.lang.String) javonetHandle.get("Quantity2");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setQuantity3 (java.lang.String value){ try { javonetHandle.set("Quantity3",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getQuantity3 (){ try { return  (java.lang.String) javonetHandle.get("Quantity3");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setNatureOfConditionCode (java.lang.String value){ try { javonetHandle.set("NatureOfConditionCode",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getNatureOfConditionCode (){ try { return  (java.lang.String) javonetHandle.get("NatureOfConditionCode");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setYesNoConditionOrResponseCode1 (java.lang.String value){ try { javonetHandle.set("YesNoConditionOrResponseCode1",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getYesNoConditionOrResponseCode1 (){ try { return  (java.lang.String) javonetHandle.get("YesNoConditionOrResponseCode1");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setDescription1 (java.lang.String value){ try { javonetHandle.set("Description1",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getDescription1 (){ try { return  (java.lang.String) javonetHandle.get("Description1");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setDescription2 (java.lang.String value){ try { javonetHandle.set("Description2",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getDescription2 (){ try { return  (java.lang.String) javonetHandle.get("Description2");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setYesNoConditionOrResponseCode2 (java.lang.String value){ try { javonetHandle.set("YesNoConditionOrResponseCode2",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getYesNoConditionOrResponseCode2 (){ try { return  (java.lang.String) javonetHandle.get("YesNoConditionOrResponseCode2");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }public CR2 (){  super((NObject) null); try {  javonetHandle = Javonet.New("CR2"); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public CR2(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
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