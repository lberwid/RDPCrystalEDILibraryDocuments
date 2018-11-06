package RDPCrystalEDILibrary.Documents.X12.IG5010.Segments;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import RDPCrystalEDILibrary.Documents.*;
import RDPCrystalEDILibrary.Documents.X12.IG5010.Segments.*;
import RDPCrystalEDILibrary.*;public class HSD extends DocumentSegment {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setQuantityQualifier (java.lang.String value){ try { javonetHandle.set("QuantityQualifier",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getQuantityQualifier (){ try { return  (java.lang.String) javonetHandle.get("QuantityQualifier");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setQuantity (java.lang.String value){ try { javonetHandle.set("Quantity",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getQuantity (){ try { return  (java.lang.String) javonetHandle.get("Quantity");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setUnitOrBasisForMeasurementCode (java.lang.String value){ try { javonetHandle.set("UnitOrBasisForMeasurementCode",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getUnitOrBasisForMeasurementCode (){ try { return  (java.lang.String) javonetHandle.get("UnitOrBasisForMeasurementCode");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setSampleSelectionModulus (java.lang.String value){ try { javonetHandle.set("SampleSelectionModulus",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getSampleSelectionModulus (){ try { return  (java.lang.String) javonetHandle.get("SampleSelectionModulus");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setTimePeriodQualifier (java.lang.String value){ try { javonetHandle.set("TimePeriodQualifier",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getTimePeriodQualifier (){ try { return  (java.lang.String) javonetHandle.get("TimePeriodQualifier");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setNumberOfPeriods (java.lang.String value){ try { javonetHandle.set("NumberOfPeriods",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getNumberOfPeriods (){ try { return  (java.lang.String) javonetHandle.get("NumberOfPeriods");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setShipDeliveryOrCalendarPatternCode (java.lang.String value){ try { javonetHandle.set("ShipDeliveryOrCalendarPatternCode",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getShipDeliveryOrCalendarPatternCode (){ try { return  (java.lang.String) javonetHandle.get("ShipDeliveryOrCalendarPatternCode");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setShipDeliveryPatternTimeCode (java.lang.String value){ try { javonetHandle.set("ShipDeliveryPatternTimeCode",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getShipDeliveryPatternTimeCode (){ try { return  (java.lang.String) javonetHandle.get("ShipDeliveryPatternTimeCode");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }public HSD (){  super((NObject) null); try {  javonetHandle = Javonet.New("HSD"); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public HSD(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
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