package RDPCrystalEDILibrary;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import RDPCrystalEDILibrary.*;
import jio.System.Collections.ObjectModel.*;public class DataElements extends Collection<DataElement> {protected NObject javonetHandle; public DataElements (){  super((NObject) null); try {  javonetHandle = Javonet.New("DataElements"); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public DataElements(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public void Add (java.lang.String elementValue){ try { javonetHandle.invoke("Add",elementValue);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void Add (java.lang.Integer elementValue){ try { javonetHandle.invoke("Add",elementValue);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void Add (java.lang.Double elementValue){ try { javonetHandle.invoke("Add",elementValue);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void Add (java.math.BigDecimal elementValue){ try { javonetHandle.invoke("Add",elementValue);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void Add (java.lang.Float elementValue){ try { javonetHandle.invoke("Add",elementValue);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void Add (java.lang.Byte elementValue){ try { javonetHandle.invoke("Add",elementValue);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void Add (java.lang.Character elementValue){ try { javonetHandle.invoke("Add",elementValue);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void Add (java.lang.String[] elementValues){ try { javonetHandle.invoke("Add",new Object[] {elementValues});} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void Add (java.lang.String elementValue,java.lang.String description){ try { javonetHandle.invoke("Add",elementValue,description);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void Add (java.lang.String elementValue,java.lang.Integer elementNumber){ try { javonetHandle.invoke("Add",elementValue,elementNumber);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void Add (java.lang.String elementValue,java.lang.Integer min,java.lang.Integer max){ try { javonetHandle.invoke("Add",elementValue,min,max);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void Add (java.lang.String elementValue,java.lang.Integer elementNumber,java.lang.String description){ try { javonetHandle.invoke("Add",elementValue,elementNumber,description);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void Add (java.lang.String elementValue,java.lang.Integer elementNumber,java.lang.Integer minLength,java.lang.Integer maxLength,java.lang.String description){ try { javonetHandle.invoke("Add",elementValue,elementNumber,minLength,maxLength,description);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void Add (java.lang.String elementName,java.lang.Integer elementNumber,Usage usage,java.lang.String[] acceptedValues){ try { javonetHandle.invoke("Add",elementName,elementNumber,NEnum.fromJavaEnum(usage),new Object[] {acceptedValues});} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void Add (java.lang.String elementName,java.lang.Integer elementNumber,Usage usage,java.lang.Boolean uniqueValueOnRepetition,java.lang.String[] acceptedValues){ try { javonetHandle.invoke("Add",elementName,elementNumber,NEnum.fromJavaEnum(usage),uniqueValueOnRepetition,new Object[] {acceptedValues});} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}