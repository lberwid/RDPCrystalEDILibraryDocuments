package RDPCrystalEDILibrary.Rules;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import RDPCrystalEDILibrary.Rules.*;
import RDPCrystalEDILibrary.*;public class ErrorNode extends Node {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setMessageString (java.lang.String value){ try { javonetHandle.set("MessageString",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getMessageString (){ try { return  (java.lang.String) javonetHandle.get("MessageString");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setEDIMessage (EDIValidationMessage value){ try { javonetHandle.set("EDIMessage",NEnum.fromJavaEnum(value));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public EDIValidationMessage getEDIMessage (){ try { return EDIValidationMessage.valueOf(((NEnum) javonetHandle.get("EDIMessage")).getValueName());} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }public ErrorNode (java.lang.String text,java.lang.Integer depth){  super((NObject) null); try {  javonetHandle = Javonet.New("ErrorNode",text,depth); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public ErrorNode(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public java.lang.String ToRuleString (){ try { return  (java.lang.String) javonetHandle.invoke("ToRuleString");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}