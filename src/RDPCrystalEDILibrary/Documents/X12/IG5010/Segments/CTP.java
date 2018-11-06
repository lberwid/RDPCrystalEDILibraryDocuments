package RDPCrystalEDILibrary.Documents.X12.IG5010.Segments;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import RDPCrystalEDILibrary.Documents.*;
import RDPCrystalEDILibrary.Documents.X12.IG5010.Segments.*;
import RDPCrystalEDILibrary.*;public class CTP extends DocumentSegment {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setClassOfTradeCode (java.lang.String value){ try { javonetHandle.set("ClassOfTradeCode",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getClassOfTradeCode (){ try { return  (java.lang.String) javonetHandle.get("ClassOfTradeCode");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setPriceIdentifierCode (java.lang.String value){ try { javonetHandle.set("PriceIdentifierCode",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getPriceIdentifierCode (){ try { return  (java.lang.String) javonetHandle.get("PriceIdentifierCode");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setUnitPrice (java.lang.String value){ try { javonetHandle.set("UnitPrice",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getUnitPrice (){ try { return  (java.lang.String) javonetHandle.get("UnitPrice");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setQuantity (java.lang.String value){ try { javonetHandle.set("Quantity",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getQuantity (){ try { return  (java.lang.String) javonetHandle.get("Quantity");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setCompositeUnitOfMeasure (CompositeUnitOfMeasure value){ try { javonetHandle.set("CompositeUnitOfMeasure",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public CompositeUnitOfMeasure getCompositeUnitOfMeasure (){ try { return new CompositeUnitOfMeasure((NObject)javonetHandle.get("CompositeUnitOfMeasure"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setPriceMultiplierQualifier (java.lang.String value){ try { javonetHandle.set("PriceMultiplierQualifier",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getPriceMultiplierQualifier (){ try { return  (java.lang.String) javonetHandle.get("PriceMultiplierQualifier");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setMultiplier (java.lang.String value){ try { javonetHandle.set("Multiplier",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getMultiplier (){ try { return  (java.lang.String) javonetHandle.get("Multiplier");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setMonetaryAmount (java.lang.String value){ try { javonetHandle.set("MonetaryAmount",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getMonetaryAmount (){ try { return  (java.lang.String) javonetHandle.get("MonetaryAmount");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setBasisOfUnitPriceCode (java.lang.String value){ try { javonetHandle.set("BasisOfUnitPriceCode",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getBasisOfUnitPriceCode (){ try { return  (java.lang.String) javonetHandle.get("BasisOfUnitPriceCode");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setConditionValue (java.lang.String value){ try { javonetHandle.set("ConditionValue",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getConditionValue (){ try { return  (java.lang.String) javonetHandle.get("ConditionValue");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setMultiplePriceQuantity (java.lang.String value){ try { javonetHandle.set("MultiplePriceQuantity",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getMultiplePriceQuantity (){ try { return  (java.lang.String) javonetHandle.get("MultiplePriceQuantity");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }public CTP (){  super((NObject) null); try {  javonetHandle = Javonet.New("CTP"); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public CTP(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
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